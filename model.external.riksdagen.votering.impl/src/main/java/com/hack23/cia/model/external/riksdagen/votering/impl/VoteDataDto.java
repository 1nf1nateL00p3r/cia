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
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:40:13 PM CET 
//


package com.hack23.cia.model.external.riksdagen.votering.impl;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import com.hack23.cia.model.common.api.ModelObject;


/**
 * The Class VoteDataDto.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoteDataDto", propOrder = {
    "concern",
    "bankNumber",
    "label",
    "lastName",
    "bornYear",
    "firstName",
    "intressentId",
    "place",
    "gender",
    "fullName",
    "party",
    "issue",
    "rm",
    "vote",
    "ballotType",
    "electoralRegion",
    "electoralRegionNumber",
    "ballotId",
    "voteDate"
})
@Entity(name = "VoteDataDto")
@Table(name = "VOTE_DATA_DTO")
@IdClass(VoteDataDtoId.class)
@Inheritance(strategy = InheritanceType.JOINED)
public class VoteDataDto
    implements Serializable, ModelObject, Equals
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The concern. */
    @XmlElement(name = "avser", required = true)
    @XmlSchemaType(name = "string")
    protected VoteIssueType concern;
    
    /** The bank number. */
    @XmlElement(name = "banknummer", required = true)
    protected String bankNumber;
    
    /** The label. */
    @XmlElement(name = "beteckning", required = true)
    protected String label;
    
    /** The last name. */
    @XmlElement(name = "efternamn", required = true)
    protected String lastName;
    
    /** The born year. */
    @XmlElement(name = "fodd")
    protected int bornYear;
    
    /** The first name. */
    @XmlElement(name = "fornamn", required = true)
    protected String firstName;
    
    /** The intressent id. */
    @XmlElement(name = "intressent_id", required = true)
    protected String intressentId;
    
    /** The place. */
    @XmlElement(name = "iort", required = true)
    protected String place;
    
    /** The gender. */
    @XmlElement(name = "kon", required = true)
    protected String gender;
    
    /** The full name. */
    @XmlElement(name = "namn", required = true)
    protected String fullName;
    
    /** The party. */
    @XmlElement(name = "parti", required = true)
    protected String party;
    
    /** The issue. */
    @XmlElement(name = "punkt", required = true)
    protected String issue;
    
    /** The rm. */
    @XmlElement(required = true)
    protected String rm;
    
    /** The vote. */
    @XmlElement(name = "rost", required = true)
    @XmlSchemaType(name = "string")
    protected VoteDecision vote;
    
    /** The ballot type. */
    @XmlElement(name = "votering", required = true)
    @XmlSchemaType(name = "string")
    protected BallotType ballotType;
    
    /** The electoral region. */
    @XmlElement(name = "valkrets", required = true)
    protected String electoralRegion;
    
    /** The electoral region number. */
    @XmlElement(name = "valkretsnummer", required = true)
    protected BigInteger electoralRegionNumber;
    
    /** The ballot id. */
    @XmlElement(name = "votering_id", required = true)
    protected String ballotId;
    
    /** The vote date. */
    @XmlElement(name = "datum", required = true)
    protected String voteDate;

    /**
	 * Gets the concern.
	 *
	 * @return the concern
	 */
    @Basic
    @Column(name = "CONCERN")
    @Enumerated(EnumType.STRING)
    public VoteIssueType getConcern() {
        return concern;
    }

    /**
	 * Sets the concern.
	 *
	 * @param value the new concern
	 */
    public void setConcern(final VoteIssueType value) {
        this.concern = value;
    }

    /**
	 * Gets the bank number.
	 *
	 * @return the bank number
	 */
    @Basic
    @Column(name = "BANK_NUMBER")
    public String getBankNumber() {
        return bankNumber;
    }

    /**
	 * Sets the bank number.
	 *
	 * @param value the new bank number
	 */
    public void setBankNumber(final String value) {
        this.bankNumber = value;
    }

    /**
	 * Gets the label.
	 *
	 * @return the label
	 */
    @Basic
    @Column(name = "LABEL")
    public String getLabel() {
        return label;
    }

    /**
	 * Sets the label.
	 *
	 * @param value the new label
	 */
    public void setLabel(final String value) {
        this.label = value;
    }

    /**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
    @Basic
    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    /**
	 * Sets the last name.
	 *
	 * @param value the new last name
	 */
    public void setLastName(final String value) {
        this.lastName = value;
    }

    /**
	 * Gets the born year.
	 *
	 * @return the born year
	 */
    @Basic
    @Column(name = "BORN_YEAR", precision = 10, scale = 0)
    public int getBornYear() {
        return bornYear;
    }

    /**
	 * Sets the born year.
	 *
	 * @param value the new born year
	 */
    public void setBornYear(final int value) {
        this.bornYear = value;
    }

    /**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
    @Basic
    @Column(name = "FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }

    /**
	 * Sets the first name.
	 *
	 * @param value the new first name
	 */
    public void setFirstName(final String value) {
        this.firstName = value;
    }

    /**
	 * Gets the intressent id.
	 *
	 * @return the intressent id
	 */
    @Id
    @Column(name = "INTRESSENT_ID")
    public String getIntressentId() {
        return intressentId;
    }

    /**
	 * Sets the intressent id.
	 *
	 * @param value the new intressent id
	 */
    public void setIntressentId(final String value) {
        this.intressentId = value;
    }

    /**
	 * Gets the place.
	 *
	 * @return the place
	 */
    @Basic
    @Column(name = "PLACE")
    public String getPlace() {
        return place;
    }

    /**
	 * Sets the place.
	 *
	 * @param value the new place
	 */
    public void setPlace(final String value) {
        this.place = value;
    }

    /**
	 * Gets the gender.
	 *
	 * @return the gender
	 */
    @Basic
    @Column(name = "GENDER")
    public String getGender() {
        return gender;
    }

    /**
	 * Sets the gender.
	 *
	 * @param value the new gender
	 */
    public void setGender(final String value) {
        this.gender = value;
    }

    /**
	 * Gets the full name.
	 *
	 * @return the full name
	 */
    @Basic
    @Column(name = "FULL_NAME")
    public String getFullName() {
        return fullName;
    }

    /**
	 * Sets the full name.
	 *
	 * @param value the new full name
	 */
    public void setFullName(final String value) {
        this.fullName = value;
    }

    /**
	 * Gets the party.
	 *
	 * @return the party
	 */
    @Basic
    @Column(name = "PARTY")
    public String getParty() {
        return party;
    }

    /**
	 * Sets the party.
	 *
	 * @param value the new party
	 */
    public void setParty(final String value) {
        this.party = value;
    }

    /**
	 * Gets the issue.
	 *
	 * @return the issue
	 */
    @Id
    @Column(name = "ISSUE")
    public String getIssue() {
        return issue;
    }

    /**
	 * Sets the issue.
	 *
	 * @param value the new issue
	 */
    public void setIssue(final String value) {
        this.issue = value;
    }

    /**
	 * Gets the rm.
	 *
	 * @return the rm
	 */
    @Basic
    @Column(name = "RM")
    public String getRm() {
        return rm;
    }

    /**
	 * Sets the rm.
	 *
	 * @param value the new rm
	 */
    public void setRm(final String value) {
        this.rm = value;
    }

    /**
	 * Gets the vote.
	 *
	 * @return the vote
	 */
    @Basic
    @Column(name = "VOTE")
    @Enumerated(EnumType.STRING)
    public VoteDecision getVote() {
        return vote;
    }

    /**
	 * Sets the vote.
	 *
	 * @param value the new vote
	 */
    public void setVote(final VoteDecision value) {
        this.vote = value;
    }

    /**
	 * Gets the ballot type.
	 *
	 * @return the ballot type
	 */
    @Basic
    @Column(name = "BALLOT_TYPE")
    @Enumerated(EnumType.STRING)
    public BallotType getBallotType() {
        return ballotType;
    }

    /**
	 * Sets the ballot type.
	 *
	 * @param value the new ballot type
	 */
    public void setBallotType(final BallotType value) {
        this.ballotType = value;
    }

    /**
	 * Gets the electoral region.
	 *
	 * @return the electoral region
	 */
    @Basic
    @Column(name = "ELECTORAL_REGION")
    public String getElectoralRegion() {
        return electoralRegion;
    }

    /**
	 * Sets the electoral region.
	 *
	 * @param value the new electoral region
	 */
    public void setElectoralRegion(final String value) {
        this.electoralRegion = value;
    }

    /**
	 * Gets the electoral region number.
	 *
	 * @return the electoral region number
	 */
    @Basic
    @Column(name = "ELECTORAL_REGION_NUMBER", precision = 20, scale = 0)
    public BigInteger getElectoralRegionNumber() {
        return electoralRegionNumber;
    }

    /**
	 * Sets the electoral region number.
	 *
	 * @param value the new electoral region number
	 */
    public void setElectoralRegionNumber(final BigInteger value) {
        this.electoralRegionNumber = value;
    }

    /**
	 * Gets the ballot id.
	 *
	 * @return the ballot id
	 */
    @Id
    @Column(name = "BALLOT_ID")
    public String getBallotId() {
        return ballotId;
    }

    /**
	 * Sets the ballot id.
	 *
	 * @param value the new ballot id
	 */
    public void setBallotId(final String value) {
        this.ballotId = value;
    }

    /**
	 * Gets the vote date.
	 *
	 * @return the vote date
	 */
    @Basic
    @Column(name = "VOTE_DATE")
    public String getVoteDate() {
        return voteDate;
    }

    /**
	 * Sets the vote date.
	 *
	 * @param value the new vote date
	 */
    public void setVoteDate(final String value) {
        this.voteDate = value;
    }

    /**
	 * With concern.
	 *
	 * @param value the value
	 * @return the vote data dto
	 */
    public VoteDataDto withConcern(final VoteIssueType value) {
        setConcern(value);
        return this;
    }

    /**
	 * With bank number.
	 *
	 * @param value the value
	 * @return the vote data dto
	 */
    public VoteDataDto withBankNumber(final String value) {
        setBankNumber(value);
        return this;
    }

    /**
	 * With label.
	 *
	 * @param value the value
	 * @return the vote data dto
	 */
    public VoteDataDto withLabel(final String value) {
        setLabel(value);
        return this;
    }

    /**
	 * With last name.
	 *
	 * @param value the value
	 * @return the vote data dto
	 */
    public VoteDataDto withLastName(final String value) {
        setLastName(value);
        return this;
    }

    /**
	 * With born year.
	 *
	 * @param value the value
	 * @return the vote data dto
	 */
    public VoteDataDto withBornYear(final int value) {
        setBornYear(value);
        return this;
    }

    /**
	 * With first name.
	 *
	 * @param value the value
	 * @return the vote data dto
	 */
    public VoteDataDto withFirstName(final String value) {
        setFirstName(value);
        return this;
    }

    /**
	 * With intressent id.
	 *
	 * @param value the value
	 * @return the vote data dto
	 */
    public VoteDataDto withIntressentId(final String value) {
        setIntressentId(value);
        return this;
    }

    /**
	 * With place.
	 *
	 * @param value the value
	 * @return the vote data dto
	 */
    public VoteDataDto withPlace(final String value) {
        setPlace(value);
        return this;
    }

    /**
	 * With gender.
	 *
	 * @param value the value
	 * @return the vote data dto
	 */
    public VoteDataDto withGender(final String value) {
        setGender(value);
        return this;
    }

    /**
	 * With full name.
	 *
	 * @param value the value
	 * @return the vote data dto
	 */
    public VoteDataDto withFullName(final String value) {
        setFullName(value);
        return this;
    }

    /**
	 * With party.
	 *
	 * @param value the value
	 * @return the vote data dto
	 */
    public VoteDataDto withParty(final String value) {
        setParty(value);
        return this;
    }

    /**
	 * With issue.
	 *
	 * @param value the value
	 * @return the vote data dto
	 */
    public VoteDataDto withIssue(final String value) {
        setIssue(value);
        return this;
    }

    /**
	 * With rm.
	 *
	 * @param value the value
	 * @return the vote data dto
	 */
    public VoteDataDto withRm(final String value) {
        setRm(value);
        return this;
    }

    /**
	 * With vote.
	 *
	 * @param value the value
	 * @return the vote data dto
	 */
    public VoteDataDto withVote(final VoteDecision value) {
        setVote(value);
        return this;
    }

    /**
	 * With ballot type.
	 *
	 * @param value the value
	 * @return the vote data dto
	 */
    public VoteDataDto withBallotType(final BallotType value) {
        setBallotType(value);
        return this;
    }

    /**
	 * With electoral region.
	 *
	 * @param value the value
	 * @return the vote data dto
	 */
    public VoteDataDto withElectoralRegion(final String value) {
        setElectoralRegion(value);
        return this;
    }

    /**
	 * With electoral region number.
	 *
	 * @param value the value
	 * @return the vote data dto
	 */
    public VoteDataDto withElectoralRegionNumber(final BigInteger value) {
        setElectoralRegionNumber(value);
        return this;
    }

    /**
	 * With ballot id.
	 *
	 * @param value the value
	 * @return the vote data dto
	 */
    public VoteDataDto withBallotId(final String value) {
        setBallotId(value);
        return this;
    }

    /**
	 * With vote date.
	 *
	 * @param value the value
	 * @return the vote data dto
	 */
    public VoteDataDto withVoteDate(final String value) {
        setVoteDate(value);
        return this;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public final String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}


    /* (non-Javadoc)
     * @see org.jvnet.jaxb2_commons.lang.Equals#equals(org.jvnet.jaxb2_commons.locator.ObjectLocator, org.jvnet.jaxb2_commons.locator.ObjectLocator, java.lang.Object, org.jvnet.jaxb2_commons.lang.EqualsStrategy)
     */
    public boolean equals(final ObjectLocator thisLocator, final ObjectLocator thatLocator, final Object object, final EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VoteDataDto that = ((VoteDataDto) object);
        {
            VoteIssueType lhsConcern;
            lhsConcern = this.getConcern();
            VoteIssueType rhsConcern;
            rhsConcern = that.getConcern();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "concern", lhsConcern), LocatorUtils.property(thatLocator, "concern", rhsConcern), lhsConcern, rhsConcern)) {
                return false;
            }
        }
        {
            String lhsBankNumber;
            lhsBankNumber = this.getBankNumber();
            String rhsBankNumber;
            rhsBankNumber = that.getBankNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bankNumber", lhsBankNumber), LocatorUtils.property(thatLocator, "bankNumber", rhsBankNumber), lhsBankNumber, rhsBankNumber)) {
                return false;
            }
        }
        {
            String lhsLabel;
            lhsLabel = this.getLabel();
            String rhsLabel;
            rhsLabel = that.getLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel)) {
                return false;
            }
        }
        {
            String lhsLastName;
            lhsLastName = this.getLastName();
            String rhsLastName;
            rhsLastName = that.getLastName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastName", lhsLastName), LocatorUtils.property(thatLocator, "lastName", rhsLastName), lhsLastName, rhsLastName)) {
                return false;
            }
        }
        {
            int lhsBornYear;
            lhsBornYear = this.getBornYear();
            int rhsBornYear;
            rhsBornYear = that.getBornYear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bornYear", lhsBornYear), LocatorUtils.property(thatLocator, "bornYear", rhsBornYear), lhsBornYear, rhsBornYear)) {
                return false;
            }
        }
        {
            String lhsFirstName;
            lhsFirstName = this.getFirstName();
            String rhsFirstName;
            rhsFirstName = that.getFirstName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firstName", lhsFirstName), LocatorUtils.property(thatLocator, "firstName", rhsFirstName), lhsFirstName, rhsFirstName)) {
                return false;
            }
        }
        {
            String lhsIntressentId;
            lhsIntressentId = this.getIntressentId();
            String rhsIntressentId;
            rhsIntressentId = that.getIntressentId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intressentId", lhsIntressentId), LocatorUtils.property(thatLocator, "intressentId", rhsIntressentId), lhsIntressentId, rhsIntressentId)) {
                return false;
            }
        }
        {
            String lhsPlace;
            lhsPlace = this.getPlace();
            String rhsPlace;
            rhsPlace = that.getPlace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "place", lhsPlace), LocatorUtils.property(thatLocator, "place", rhsPlace), lhsPlace, rhsPlace)) {
                return false;
            }
        }
        {
            String lhsGender;
            lhsGender = this.getGender();
            String rhsGender;
            rhsGender = that.getGender();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gender", lhsGender), LocatorUtils.property(thatLocator, "gender", rhsGender), lhsGender, rhsGender)) {
                return false;
            }
        }
        {
            String lhsFullName;
            lhsFullName = this.getFullName();
            String rhsFullName;
            rhsFullName = that.getFullName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fullName", lhsFullName), LocatorUtils.property(thatLocator, "fullName", rhsFullName), lhsFullName, rhsFullName)) {
                return false;
            }
        }
        {
            String lhsParty;
            lhsParty = this.getParty();
            String rhsParty;
            rhsParty = that.getParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "party", lhsParty), LocatorUtils.property(thatLocator, "party", rhsParty), lhsParty, rhsParty)) {
                return false;
            }
        }
        {
            String lhsIssue;
            lhsIssue = this.getIssue();
            String rhsIssue;
            rhsIssue = that.getIssue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "issue", lhsIssue), LocatorUtils.property(thatLocator, "issue", rhsIssue), lhsIssue, rhsIssue)) {
                return false;
            }
        }
        {
            String lhsRm;
            lhsRm = this.getRm();
            String rhsRm;
            rhsRm = that.getRm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rm", lhsRm), LocatorUtils.property(thatLocator, "rm", rhsRm), lhsRm, rhsRm)) {
                return false;
            }
        }
        {
            VoteDecision lhsVote;
            lhsVote = this.getVote();
            VoteDecision rhsVote;
            rhsVote = that.getVote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vote", lhsVote), LocatorUtils.property(thatLocator, "vote", rhsVote), lhsVote, rhsVote)) {
                return false;
            }
        }
        {
            BallotType lhsBallotType;
            lhsBallotType = this.getBallotType();
            BallotType rhsBallotType;
            rhsBallotType = that.getBallotType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ballotType", lhsBallotType), LocatorUtils.property(thatLocator, "ballotType", rhsBallotType), lhsBallotType, rhsBallotType)) {
                return false;
            }
        }
        {
            String lhsElectoralRegion;
            lhsElectoralRegion = this.getElectoralRegion();
            String rhsElectoralRegion;
            rhsElectoralRegion = that.getElectoralRegion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "electoralRegion", lhsElectoralRegion), LocatorUtils.property(thatLocator, "electoralRegion", rhsElectoralRegion), lhsElectoralRegion, rhsElectoralRegion)) {
                return false;
            }
        }
        {
            BigInteger lhsElectoralRegionNumber;
            lhsElectoralRegionNumber = this.getElectoralRegionNumber();
            BigInteger rhsElectoralRegionNumber;
            rhsElectoralRegionNumber = that.getElectoralRegionNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "electoralRegionNumber", lhsElectoralRegionNumber), LocatorUtils.property(thatLocator, "electoralRegionNumber", rhsElectoralRegionNumber), lhsElectoralRegionNumber, rhsElectoralRegionNumber)) {
                return false;
            }
        }
        {
            String lhsBallotId;
            lhsBallotId = this.getBallotId();
            String rhsBallotId;
            rhsBallotId = that.getBallotId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ballotId", lhsBallotId), LocatorUtils.property(thatLocator, "ballotId", rhsBallotId), lhsBallotId, rhsBallotId)) {
                return false;
            }
        }
        {
            String lhsVoteDate;
            lhsVoteDate = this.getVoteDate();
            String rhsVoteDate;
            rhsVoteDate = that.getVoteDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "voteDate", lhsVoteDate), LocatorUtils.property(thatLocator, "voteDate", rhsVoteDate), lhsVoteDate, rhsVoteDate)) {
                return false;
            }
        }
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(final Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}