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
package com.hack23.cia.service.external.riksdagen.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hack23.cia.model.external.riksdagen.person.impl.PersonData;
import com.hack23.cia.model.external.riksdagen.personlista.impl.PersonContainerElement;
import com.hack23.cia.model.external.riksdagen.personlista.impl.PersonElement;
import com.hack23.cia.service.external.riksdagen.api.RiksdagenApi;

/**
 * The Class RiksdagenApiImplPersonDetailsTest.
 */
public class RiksdagenApiImplPersonDetailsTest extends
AbstractRiksdagenFunctionalIntegrationTest {

	/** The riksdagen api. */
	@Autowired
	RiksdagenApi riksdagenApi;

	/**
	 * Gets the person mixed test.
	 *
	 * @return the person mixed test
	 * @throws Exception
	 *             the exception
	 */
	@Test
	public void getPersonMixedTest() throws Exception {
		final PersonContainerElement personList = riksdagenApi.getPersonList();
		assertNotNull(personList);
		assertTrue(personList.getPerson().size()>= 1291 );

		final PersonElement person = personList.getPerson().get(0);

		assertNotNull("Missing id : " + person.getLastName(),
				person.getId());

		final PersonData personDetail = riksdagenApi
				.getPerson(person.getId());
		assertNotNull("Missing personDetail : " + person.getLastName(),
				personDetail);
		assertNotNull(
				"Missing personDetail.person : " + person.getLastName(),
				personDetail.getLastName());
		assertNotNull(
				"Missing personDetail.person.id : " + person.getLastName(),
				personDetail.getId());

		assertNotNull(personDetail.getFirstName());
		assertNotNull(personDetail.getLastName());
	}

}
