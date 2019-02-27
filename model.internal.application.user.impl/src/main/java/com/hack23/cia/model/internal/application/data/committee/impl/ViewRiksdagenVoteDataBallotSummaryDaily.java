//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.data.committee.impl;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import com.hack23.cia.model.common.api.ModelObject;
import com.hack23.cia.model.common.impl.xml.XmlDateTypeAdapter;


/**
 * <p>Java class for ViewRiksdagenVoteDataBallotSummaryDaily complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewRiksdagenVoteDataBallotSummaryDaily"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vote_date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="avg_born_year" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="total_votes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="yes_votes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="no_votes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="abstain_votes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="absent_votes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="percentage_yes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="percentage_no" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="percentage_absent" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="percentage_abstain" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="number_ballots" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="avg_total_votes" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="approved_ballots" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="avg_yes_votes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="avg_no_votes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="avg_abstain_votes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="avg_absent_votes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="percentage_approved" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="avg_percentage_yes" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="avg_percentage_no" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="avg_percentage_absent" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="avg_percentage_abstain" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="avg_percentage_male" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewRiksdagenVoteDataBallotSummaryDaily", propOrder = {
    "voteDate",
    "avgBornYear",
    "totalVotes",
    "yesVotes",
    "noVotes",
    "abstainVotes",
    "absentVotes",
    "percentageYes",
    "percentageNo",
    "percentageAbsent",
    "percentageAbstain",
    "numberBallots",
    "avgTotalVotes",
    "approvedBallots",
    "avgYesVotes",
    "avgNoVotes",
    "avgAbstainVotes",
    "avgAbsentVotes",
    "percentageApproved",
    "avgPercentageYes",
    "avgPercentageNo",
    "avgPercentageAbsent",
    "avgPercentageAbstain",
    "avgPercentageMale"
})
@Entity(name = "ViewRiksdagenVoteDataBallotSummaryDaily")
@Table(name = "View_Riksdagen_Vote_Data_Ballot_Summary_Daily")
@Inheritance(strategy = InheritanceType.JOINED)
public class ViewRiksdagenVoteDataBallotSummaryDaily
    implements Serializable, ModelObject, Equals
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "vote_date", required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date voteDate;
    @XmlElement(name = "avg_born_year", required = true)
    protected BigDecimal avgBornYear;
    @XmlElement(name = "total_votes", required = true)
    protected BigDecimal totalVotes;
    @XmlElement(name = "yes_votes", required = true)
    protected BigDecimal yesVotes;
    @XmlElement(name = "no_votes", required = true)
    protected BigDecimal noVotes;
    @XmlElement(name = "abstain_votes", required = true)
    protected BigDecimal abstainVotes;
    @XmlElement(name = "absent_votes", required = true)
    protected BigDecimal absentVotes;
    @XmlElement(name = "percentage_yes", required = true)
    protected BigDecimal percentageYes;
    @XmlElement(name = "percentage_no", required = true)
    protected BigDecimal percentageNo;
    @XmlElement(name = "percentage_absent", required = true)
    protected BigDecimal percentageAbsent;
    @XmlElement(name = "percentage_abstain", required = true)
    protected BigDecimal percentageAbstain;
    @XmlElement(name = "number_ballots")
    protected long numberBallots;
    @XmlElement(name = "avg_total_votes")
    protected long avgTotalVotes;
    @XmlElement(name = "approved_ballots")
    protected long approvedBallots;
    @XmlElement(name = "avg_yes_votes", required = true)
    protected BigDecimal avgYesVotes;
    @XmlElement(name = "avg_no_votes", required = true)
    protected BigDecimal avgNoVotes;
    @XmlElement(name = "avg_abstain_votes", required = true)
    protected BigDecimal avgAbstainVotes;
    @XmlElement(name = "avg_absent_votes", required = true)
    protected BigDecimal avgAbsentVotes;
    @XmlElement(name = "percentage_approved", required = true)
    protected BigDecimal percentageApproved;
    @XmlElement(name = "avg_percentage_yes", required = true)
    protected BigDecimal avgPercentageYes;
    @XmlElement(name = "avg_percentage_no", required = true)
    protected BigDecimal avgPercentageNo;
    @XmlElement(name = "avg_percentage_absent", required = true)
    protected BigDecimal avgPercentageAbsent;
    @XmlElement(name = "avg_percentage_abstain", required = true)
    protected BigDecimal avgPercentageAbstain;
    @XmlElement(name = "avg_percentage_male", required = true)
    protected BigDecimal avgPercentageMale;

    /**
     * Gets the value of the voteDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Id
    @Column(name = "VOTE_DATE")
    @Temporal(TemporalType.DATE)
    public Date getVoteDate() {
        return voteDate;
    }

    /**
     * Sets the value of the voteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoteDate(final Date value) {
        this.voteDate = value;
    }

    /**
     * Gets the value of the avgBornYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "AVG_BORN_YEAR", precision = 20, scale = 10)
    public BigDecimal getAvgBornYear() {
        return avgBornYear;
    }

    /**
     * Sets the value of the avgBornYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgBornYear(final BigDecimal value) {
        this.avgBornYear = value;
    }

    /**
     * Gets the value of the totalVotes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "TOTAL_VOTES", precision = 20, scale = 10)
    public BigDecimal getTotalVotes() {
        return totalVotes;
    }

    /**
     * Sets the value of the totalVotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalVotes(final BigDecimal value) {
        this.totalVotes = value;
    }

    /**
     * Gets the value of the yesVotes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "YES_VOTES", precision = 20, scale = 10)
    public BigDecimal getYesVotes() {
        return yesVotes;
    }

    /**
     * Sets the value of the yesVotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYesVotes(final BigDecimal value) {
        this.yesVotes = value;
    }

    /**
     * Gets the value of the noVotes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "NO_VOTES", precision = 20, scale = 10)
    public BigDecimal getNoVotes() {
        return noVotes;
    }

    /**
     * Sets the value of the noVotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNoVotes(final BigDecimal value) {
        this.noVotes = value;
    }

    /**
     * Gets the value of the abstainVotes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "ABSTAIN_VOTES", precision = 20, scale = 10)
    public BigDecimal getAbstainVotes() {
        return abstainVotes;
    }

    /**
     * Sets the value of the abstainVotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAbstainVotes(final BigDecimal value) {
        this.abstainVotes = value;
    }

    /**
     * Gets the value of the absentVotes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "ABSENT_VOTES", precision = 20, scale = 10)
    public BigDecimal getAbsentVotes() {
        return absentVotes;
    }

    /**
     * Sets the value of the absentVotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAbsentVotes(final BigDecimal value) {
        this.absentVotes = value;
    }

    /**
     * Gets the value of the percentageYes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PERCENTAGE_YES", precision = 20, scale = 10)
    public BigDecimal getPercentageYes() {
        return percentageYes;
    }

    /**
     * Sets the value of the percentageYes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageYes(final BigDecimal value) {
        this.percentageYes = value;
    }

    /**
     * Gets the value of the percentageNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PERCENTAGE_NO", precision = 20, scale = 10)
    public BigDecimal getPercentageNo() {
        return percentageNo;
    }

    /**
     * Sets the value of the percentageNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageNo(final BigDecimal value) {
        this.percentageNo = value;
    }

    /**
     * Gets the value of the percentageAbsent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PERCENTAGE_ABSENT", precision = 20, scale = 10)
    public BigDecimal getPercentageAbsent() {
        return percentageAbsent;
    }

    /**
     * Sets the value of the percentageAbsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageAbsent(final BigDecimal value) {
        this.percentageAbsent = value;
    }

    /**
     * Gets the value of the percentageAbstain property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PERCENTAGE_ABSTAIN", precision = 20, scale = 10)
    public BigDecimal getPercentageAbstain() {
        return percentageAbstain;
    }

    /**
     * Sets the value of the percentageAbstain property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageAbstain(final BigDecimal value) {
        this.percentageAbstain = value;
    }

    /**
     * Gets the value of the numberBallots property.
     * 
     */
    @Basic
    @Column(name = "NUMBER_BALLOTS", precision = 20, scale = 0)
    public long getNumberBallots() {
        return numberBallots;
    }

    /**
     * Sets the value of the numberBallots property.
     * 
     */
    public void setNumberBallots(final long value) {
        this.numberBallots = value;
    }

    /**
     * Gets the value of the avgTotalVotes property.
     * 
     */
    @Basic
    @Column(name = "AVG_TOTAL_VOTES", precision = 20, scale = 0)
    public long getAvgTotalVotes() {
        return avgTotalVotes;
    }

    /**
     * Sets the value of the avgTotalVotes property.
     * 
     */
    public void setAvgTotalVotes(final long value) {
        this.avgTotalVotes = value;
    }

    /**
     * Gets the value of the approvedBallots property.
     * 
     */
    @Basic
    @Column(name = "APPROVED_BALLOTS", precision = 20, scale = 0)
    public long getApprovedBallots() {
        return approvedBallots;
    }

    /**
     * Sets the value of the approvedBallots property.
     * 
     */
    public void setApprovedBallots(final long value) {
        this.approvedBallots = value;
    }

    /**
     * Gets the value of the avgYesVotes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "AVG_YES_VOTES", precision = 20, scale = 10)
    public BigDecimal getAvgYesVotes() {
        return avgYesVotes;
    }

    /**
     * Sets the value of the avgYesVotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgYesVotes(final BigDecimal value) {
        this.avgYesVotes = value;
    }

    /**
     * Gets the value of the avgNoVotes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "AVG_NO_VOTES", precision = 20, scale = 10)
    public BigDecimal getAvgNoVotes() {
        return avgNoVotes;
    }

    /**
     * Sets the value of the avgNoVotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgNoVotes(final BigDecimal value) {
        this.avgNoVotes = value;
    }

    /**
     * Gets the value of the avgAbstainVotes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "AVG_ABSTAIN_VOTES", precision = 20, scale = 10)
    public BigDecimal getAvgAbstainVotes() {
        return avgAbstainVotes;
    }

    /**
     * Sets the value of the avgAbstainVotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgAbstainVotes(final BigDecimal value) {
        this.avgAbstainVotes = value;
    }

    /**
     * Gets the value of the avgAbsentVotes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "AVG_ABSENT_VOTES", precision = 20, scale = 10)
    public BigDecimal getAvgAbsentVotes() {
        return avgAbsentVotes;
    }

    /**
     * Sets the value of the avgAbsentVotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgAbsentVotes(final BigDecimal value) {
        this.avgAbsentVotes = value;
    }

    /**
     * Gets the value of the percentageApproved property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PERCENTAGE_APPROVED", precision = 20, scale = 10)
    public BigDecimal getPercentageApproved() {
        return percentageApproved;
    }

    /**
     * Sets the value of the percentageApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageApproved(final BigDecimal value) {
        this.percentageApproved = value;
    }

    /**
     * Gets the value of the avgPercentageYes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "AVG_PERCENTAGE_YES", precision = 20, scale = 10)
    public BigDecimal getAvgPercentageYes() {
        return avgPercentageYes;
    }

    /**
     * Sets the value of the avgPercentageYes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgPercentageYes(final BigDecimal value) {
        this.avgPercentageYes = value;
    }

    /**
     * Gets the value of the avgPercentageNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "AVG_PERCENTAGE_NO", precision = 20, scale = 10)
    public BigDecimal getAvgPercentageNo() {
        return avgPercentageNo;
    }

    /**
     * Sets the value of the avgPercentageNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgPercentageNo(final BigDecimal value) {
        this.avgPercentageNo = value;
    }

    /**
     * Gets the value of the avgPercentageAbsent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "AVG_PERCENTAGE_ABSENT", precision = 20, scale = 10)
    public BigDecimal getAvgPercentageAbsent() {
        return avgPercentageAbsent;
    }

    /**
     * Sets the value of the avgPercentageAbsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgPercentageAbsent(final BigDecimal value) {
        this.avgPercentageAbsent = value;
    }

    /**
     * Gets the value of the avgPercentageAbstain property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "AVG_PERCENTAGE_ABSTAIN", precision = 20, scale = 10)
    public BigDecimal getAvgPercentageAbstain() {
        return avgPercentageAbstain;
    }

    /**
     * Sets the value of the avgPercentageAbstain property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgPercentageAbstain(final BigDecimal value) {
        this.avgPercentageAbstain = value;
    }

    /**
     * Gets the value of the avgPercentageMale property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "AVG_PERCENTAGE_MALE", precision = 20, scale = 10)
    public BigDecimal getAvgPercentageMale() {
        return avgPercentageMale;
    }

    /**
     * Sets the value of the avgPercentageMale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgPercentageMale(final BigDecimal value) {
        this.avgPercentageMale = value;
    }

    public ViewRiksdagenVoteDataBallotSummaryDaily withVoteDate(final Date value) {
        setVoteDate(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryDaily withAvgBornYear(final BigDecimal value) {
        setAvgBornYear(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryDaily withTotalVotes(final BigDecimal value) {
        setTotalVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryDaily withYesVotes(final BigDecimal value) {
        setYesVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryDaily withNoVotes(final BigDecimal value) {
        setNoVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryDaily withAbstainVotes(final BigDecimal value) {
        setAbstainVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryDaily withAbsentVotes(final BigDecimal value) {
        setAbsentVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryDaily withPercentageYes(final BigDecimal value) {
        setPercentageYes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryDaily withPercentageNo(final BigDecimal value) {
        setPercentageNo(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryDaily withPercentageAbsent(final BigDecimal value) {
        setPercentageAbsent(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryDaily withPercentageAbstain(final BigDecimal value) {
        setPercentageAbstain(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryDaily withNumberBallots(final long value) {
        setNumberBallots(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryDaily withAvgTotalVotes(final long value) {
        setAvgTotalVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryDaily withApprovedBallots(final long value) {
        setApprovedBallots(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryDaily withAvgYesVotes(final BigDecimal value) {
        setAvgYesVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryDaily withAvgNoVotes(final BigDecimal value) {
        setAvgNoVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryDaily withAvgAbstainVotes(final BigDecimal value) {
        setAvgAbstainVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryDaily withAvgAbsentVotes(final BigDecimal value) {
        setAvgAbsentVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryDaily withPercentageApproved(final BigDecimal value) {
        setPercentageApproved(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryDaily withAvgPercentageYes(final BigDecimal value) {
        setAvgPercentageYes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryDaily withAvgPercentageNo(final BigDecimal value) {
        setAvgPercentageNo(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryDaily withAvgPercentageAbsent(final BigDecimal value) {
        setAvgPercentageAbsent(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryDaily withAvgPercentageAbstain(final BigDecimal value) {
        setAvgPercentageAbstain(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryDaily withAvgPercentageMale(final BigDecimal value) {
        setAvgPercentageMale(value);
        return this;
    }

	@Override
	public final String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}


    public boolean equals(final ObjectLocator thisLocator, final ObjectLocator thatLocator, final Object object, final EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ViewRiksdagenVoteDataBallotSummaryDaily that = ((ViewRiksdagenVoteDataBallotSummaryDaily) object);
        {
            Date lhsVoteDate;
            lhsVoteDate = this.getVoteDate();
            Date rhsVoteDate;
            rhsVoteDate = that.getVoteDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "voteDate", lhsVoteDate), LocatorUtils.property(thatLocator, "voteDate", rhsVoteDate), lhsVoteDate, rhsVoteDate)) {
                return false;
            }
        }
        {
            BigDecimal lhsAvgBornYear;
            lhsAvgBornYear = this.getAvgBornYear();
            BigDecimal rhsAvgBornYear;
            rhsAvgBornYear = that.getAvgBornYear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "avgBornYear", lhsAvgBornYear), LocatorUtils.property(thatLocator, "avgBornYear", rhsAvgBornYear), lhsAvgBornYear, rhsAvgBornYear)) {
                return false;
            }
        }
        {
            BigDecimal lhsTotalVotes;
            lhsTotalVotes = this.getTotalVotes();
            BigDecimal rhsTotalVotes;
            rhsTotalVotes = that.getTotalVotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalVotes", lhsTotalVotes), LocatorUtils.property(thatLocator, "totalVotes", rhsTotalVotes), lhsTotalVotes, rhsTotalVotes)) {
                return false;
            }
        }
        {
            BigDecimal lhsYesVotes;
            lhsYesVotes = this.getYesVotes();
            BigDecimal rhsYesVotes;
            rhsYesVotes = that.getYesVotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "yesVotes", lhsYesVotes), LocatorUtils.property(thatLocator, "yesVotes", rhsYesVotes), lhsYesVotes, rhsYesVotes)) {
                return false;
            }
        }
        {
            BigDecimal lhsNoVotes;
            lhsNoVotes = this.getNoVotes();
            BigDecimal rhsNoVotes;
            rhsNoVotes = that.getNoVotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "noVotes", lhsNoVotes), LocatorUtils.property(thatLocator, "noVotes", rhsNoVotes), lhsNoVotes, rhsNoVotes)) {
                return false;
            }
        }
        {
            BigDecimal lhsAbstainVotes;
            lhsAbstainVotes = this.getAbstainVotes();
            BigDecimal rhsAbstainVotes;
            rhsAbstainVotes = that.getAbstainVotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abstainVotes", lhsAbstainVotes), LocatorUtils.property(thatLocator, "abstainVotes", rhsAbstainVotes), lhsAbstainVotes, rhsAbstainVotes)) {
                return false;
            }
        }
        {
            BigDecimal lhsAbsentVotes;
            lhsAbsentVotes = this.getAbsentVotes();
            BigDecimal rhsAbsentVotes;
            rhsAbsentVotes = that.getAbsentVotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "absentVotes", lhsAbsentVotes), LocatorUtils.property(thatLocator, "absentVotes", rhsAbsentVotes), lhsAbsentVotes, rhsAbsentVotes)) {
                return false;
            }
        }
        {
            BigDecimal lhsPercentageYes;
            lhsPercentageYes = this.getPercentageYes();
            BigDecimal rhsPercentageYes;
            rhsPercentageYes = that.getPercentageYes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "percentageYes", lhsPercentageYes), LocatorUtils.property(thatLocator, "percentageYes", rhsPercentageYes), lhsPercentageYes, rhsPercentageYes)) {
                return false;
            }
        }
        {
            BigDecimal lhsPercentageNo;
            lhsPercentageNo = this.getPercentageNo();
            BigDecimal rhsPercentageNo;
            rhsPercentageNo = that.getPercentageNo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "percentageNo", lhsPercentageNo), LocatorUtils.property(thatLocator, "percentageNo", rhsPercentageNo), lhsPercentageNo, rhsPercentageNo)) {
                return false;
            }
        }
        {
            BigDecimal lhsPercentageAbsent;
            lhsPercentageAbsent = this.getPercentageAbsent();
            BigDecimal rhsPercentageAbsent;
            rhsPercentageAbsent = that.getPercentageAbsent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "percentageAbsent", lhsPercentageAbsent), LocatorUtils.property(thatLocator, "percentageAbsent", rhsPercentageAbsent), lhsPercentageAbsent, rhsPercentageAbsent)) {
                return false;
            }
        }
        {
            BigDecimal lhsPercentageAbstain;
            lhsPercentageAbstain = this.getPercentageAbstain();
            BigDecimal rhsPercentageAbstain;
            rhsPercentageAbstain = that.getPercentageAbstain();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "percentageAbstain", lhsPercentageAbstain), LocatorUtils.property(thatLocator, "percentageAbstain", rhsPercentageAbstain), lhsPercentageAbstain, rhsPercentageAbstain)) {
                return false;
            }
        }
        {
            long lhsNumberBallots;
            lhsNumberBallots = this.getNumberBallots();
            long rhsNumberBallots;
            rhsNumberBallots = that.getNumberBallots();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberBallots", lhsNumberBallots), LocatorUtils.property(thatLocator, "numberBallots", rhsNumberBallots), lhsNumberBallots, rhsNumberBallots)) {
                return false;
            }
        }
        {
            long lhsAvgTotalVotes;
            lhsAvgTotalVotes = this.getAvgTotalVotes();
            long rhsAvgTotalVotes;
            rhsAvgTotalVotes = that.getAvgTotalVotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "avgTotalVotes", lhsAvgTotalVotes), LocatorUtils.property(thatLocator, "avgTotalVotes", rhsAvgTotalVotes), lhsAvgTotalVotes, rhsAvgTotalVotes)) {
                return false;
            }
        }
        {
            long lhsApprovedBallots;
            lhsApprovedBallots = this.getApprovedBallots();
            long rhsApprovedBallots;
            rhsApprovedBallots = that.getApprovedBallots();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "approvedBallots", lhsApprovedBallots), LocatorUtils.property(thatLocator, "approvedBallots", rhsApprovedBallots), lhsApprovedBallots, rhsApprovedBallots)) {
                return false;
            }
        }
        {
            BigDecimal lhsAvgYesVotes;
            lhsAvgYesVotes = this.getAvgYesVotes();
            BigDecimal rhsAvgYesVotes;
            rhsAvgYesVotes = that.getAvgYesVotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "avgYesVotes", lhsAvgYesVotes), LocatorUtils.property(thatLocator, "avgYesVotes", rhsAvgYesVotes), lhsAvgYesVotes, rhsAvgYesVotes)) {
                return false;
            }
        }
        {
            BigDecimal lhsAvgNoVotes;
            lhsAvgNoVotes = this.getAvgNoVotes();
            BigDecimal rhsAvgNoVotes;
            rhsAvgNoVotes = that.getAvgNoVotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "avgNoVotes", lhsAvgNoVotes), LocatorUtils.property(thatLocator, "avgNoVotes", rhsAvgNoVotes), lhsAvgNoVotes, rhsAvgNoVotes)) {
                return false;
            }
        }
        {
            BigDecimal lhsAvgAbstainVotes;
            lhsAvgAbstainVotes = this.getAvgAbstainVotes();
            BigDecimal rhsAvgAbstainVotes;
            rhsAvgAbstainVotes = that.getAvgAbstainVotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "avgAbstainVotes", lhsAvgAbstainVotes), LocatorUtils.property(thatLocator, "avgAbstainVotes", rhsAvgAbstainVotes), lhsAvgAbstainVotes, rhsAvgAbstainVotes)) {
                return false;
            }
        }
        {
            BigDecimal lhsAvgAbsentVotes;
            lhsAvgAbsentVotes = this.getAvgAbsentVotes();
            BigDecimal rhsAvgAbsentVotes;
            rhsAvgAbsentVotes = that.getAvgAbsentVotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "avgAbsentVotes", lhsAvgAbsentVotes), LocatorUtils.property(thatLocator, "avgAbsentVotes", rhsAvgAbsentVotes), lhsAvgAbsentVotes, rhsAvgAbsentVotes)) {
                return false;
            }
        }
        {
            BigDecimal lhsPercentageApproved;
            lhsPercentageApproved = this.getPercentageApproved();
            BigDecimal rhsPercentageApproved;
            rhsPercentageApproved = that.getPercentageApproved();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "percentageApproved", lhsPercentageApproved), LocatorUtils.property(thatLocator, "percentageApproved", rhsPercentageApproved), lhsPercentageApproved, rhsPercentageApproved)) {
                return false;
            }
        }
        {
            BigDecimal lhsAvgPercentageYes;
            lhsAvgPercentageYes = this.getAvgPercentageYes();
            BigDecimal rhsAvgPercentageYes;
            rhsAvgPercentageYes = that.getAvgPercentageYes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "avgPercentageYes", lhsAvgPercentageYes), LocatorUtils.property(thatLocator, "avgPercentageYes", rhsAvgPercentageYes), lhsAvgPercentageYes, rhsAvgPercentageYes)) {
                return false;
            }
        }
        {
            BigDecimal lhsAvgPercentageNo;
            lhsAvgPercentageNo = this.getAvgPercentageNo();
            BigDecimal rhsAvgPercentageNo;
            rhsAvgPercentageNo = that.getAvgPercentageNo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "avgPercentageNo", lhsAvgPercentageNo), LocatorUtils.property(thatLocator, "avgPercentageNo", rhsAvgPercentageNo), lhsAvgPercentageNo, rhsAvgPercentageNo)) {
                return false;
            }
        }
        {
            BigDecimal lhsAvgPercentageAbsent;
            lhsAvgPercentageAbsent = this.getAvgPercentageAbsent();
            BigDecimal rhsAvgPercentageAbsent;
            rhsAvgPercentageAbsent = that.getAvgPercentageAbsent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "avgPercentageAbsent", lhsAvgPercentageAbsent), LocatorUtils.property(thatLocator, "avgPercentageAbsent", rhsAvgPercentageAbsent), lhsAvgPercentageAbsent, rhsAvgPercentageAbsent)) {
                return false;
            }
        }
        {
            BigDecimal lhsAvgPercentageAbstain;
            lhsAvgPercentageAbstain = this.getAvgPercentageAbstain();
            BigDecimal rhsAvgPercentageAbstain;
            rhsAvgPercentageAbstain = that.getAvgPercentageAbstain();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "avgPercentageAbstain", lhsAvgPercentageAbstain), LocatorUtils.property(thatLocator, "avgPercentageAbstain", rhsAvgPercentageAbstain), lhsAvgPercentageAbstain, rhsAvgPercentageAbstain)) {
                return false;
            }
        }
        {
            BigDecimal lhsAvgPercentageMale;
            lhsAvgPercentageMale = this.getAvgPercentageMale();
            BigDecimal rhsAvgPercentageMale;
            rhsAvgPercentageMale = that.getAvgPercentageMale();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "avgPercentageMale", lhsAvgPercentageMale), LocatorUtils.property(thatLocator, "avgPercentageMale", rhsAvgPercentageMale), lhsAvgPercentageMale, rhsAvgPercentageMale)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(final Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}