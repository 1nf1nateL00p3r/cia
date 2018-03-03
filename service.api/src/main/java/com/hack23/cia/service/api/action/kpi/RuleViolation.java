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
package com.hack23.cia.service.api.action.kpi;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * The Class RuleViolation.
 */
public final class RuleViolation {

	/** The id. */
	private final String id;
	
	/** The name. */
	private final String name;
	
	/** The resource type. */
	private final ResourceType resourceType;
	
	/** The rule name. */
	private String ruleName;

	/** The rule description. */
	private String ruleDescription;	

	/** The rule group. */
	private String ruleGroup;
	
	/** The status. */
	private Status status = Status.OK;

	/**
	 * Instantiates a new rule violation.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param resourceType
	 *            the resource type
	 * @param ruleName
	 *            the rule name
	 * @param ruleDescription
	 *            the rule description
	 * @param ruleGroup
	 *            the rule group
	 * @param status
	 *            the status
	 */
	public RuleViolation(final String id,final String name,final ResourceType resourceType,final String ruleName, final String ruleDescription, final String ruleGroup, final Status status) {
		super();
		this.id = id;
		this.name = name;
		this.resourceType = resourceType;
		this.ruleName = ruleName;
		this.ruleDescription = ruleDescription;
		this.ruleGroup = ruleGroup;
		this.status = status;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the rule name.
	 *
	 * @return the rule name
	 */
	public String getRuleName() {
		return ruleName;
	}

	/**
	 * Gets the rule description.
	 *
	 * @return the rule description
	 */
	public String getRuleDescription() {
		return ruleDescription;
	}

	/**
	 * Gets the rule group.
	 *
	 * @return the rule group
	 */
	public String getRuleGroup() {
		return ruleGroup;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * Gets the resource type.
	 *
	 * @return the resource type
	 */
	public ResourceType getResourceType() {
		return resourceType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public final boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public final String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	
}
