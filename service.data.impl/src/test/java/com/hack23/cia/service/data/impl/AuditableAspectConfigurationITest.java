/*
 * Copyright 2010 James Pether Sörling
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *	$Id$
 *  $HeadURL$
*/
package com.hack23.cia.service.data.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.apache.commons.lang3.SerializationUtils;
import org.javers.core.Changes;
import org.javers.core.Javers;
import org.javers.core.metamodel.object.CdoSnapshot;
import org.javers.repository.jql.JqlQuery;
import org.javers.repository.jql.QueryBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.hack23.cia.model.internal.application.system.impl.ApplicationSession;
import com.hack23.cia.service.data.api.ApplicationSessionDAO;

/**
 * The Class ApplicationSessionDAOITest.
 */
@Transactional
public class AuditableAspectConfigurationITest extends AbstractServiceDataFunctionalIntegrationTest {

	/** The application session DAO. */
	@Autowired
	private ApplicationSessionDAO applicationSessionDAO;
	
	@Autowired
	private Javers javers;

	/**
	 * Merge test.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Test
	public void auditTest() throws Exception {
		final ApplicationSession applicationSession = createApplicationSession();				
		final ApplicationSession applicationSessionClone = SerializationUtils.clone(applicationSession);
		assertFalse(applicationSession == applicationSessionClone);
		applicationSessionClone.setIpInformation("Changed" + UUID.randomUUID().toString());		
		applicationSessionDAO.merge(applicationSessionClone);
		
	}
	
	/**
	 * Audit find changes test.
	 */
	@Test
	public void AuditFindChangesTest() {
		Optional<ApplicationSession> findFirst = applicationSessionDAO.getAll().stream().findFirst();
		assertTrue(findFirst.isPresent());
		Changes changes = javers.findChanges(QueryBuilder.byInstanceId(findFirst.get().getHjid(), ApplicationSession.class).build());
		
		assertEquals(1, changes.groupByCommit().size());
		assertEquals("anonymousUser",changes.groupByCommit().get(0).getCommit().getAuthor());
	}

	/**
	 * Audit find snapshots test.
	 */
	@Test
	public void AuditFindSnapshotsTest() {
		Optional<ApplicationSession> findFirst = applicationSessionDAO.getAll().stream().findFirst();
		assertTrue(findFirst.isPresent());
		List<CdoSnapshot> snapshots = javers.findSnapshots(QueryBuilder.byInstanceId(findFirst.get().getHjid(), ApplicationSession.class).build());
		
		assertTrue(snapshots.size()> 0);
	}

	
	private ApplicationSession createApplicationSession() {
		final ApplicationSession applicationSession = new ApplicationSession();
		applicationSession.withCreatedDate(new Date()).withIpInformation(UUID.randomUUID().toString()).withLocale("Locale").withSessionId(UUID.randomUUID().toString());
		applicationSessionDAO.persist(applicationSession);
		return applicationSession;
	}

}
