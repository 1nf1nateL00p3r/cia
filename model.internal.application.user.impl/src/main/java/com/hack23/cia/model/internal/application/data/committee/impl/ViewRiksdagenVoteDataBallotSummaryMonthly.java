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
 * <p>Java class for ViewRiksdagenVoteDataBallotSummaryMonthly complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewRiksdagenVoteDataBallotSummaryMonthly"&gt;
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
 *         &lt;element name="number_ballots" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="approved_ballots" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
@XmlType(name = "ViewRiksdagenVoteDataBallotSummaryMonthly", propOrder = {
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
    "approvedBallots",
    "percentageApproved",
    "avgPercentageYes",
    "avgPercentageNo",
    "avgPercentageAbsent",
    "avgPercentageAbstain",
    "avgPercentageMale"
})
@Entity(name = "ViewRiksdagenVoteDataBallotSummaryMonthly")
@Table(name = "View_Riksdagen_Vote_Data_Ballot_Summary_Monthly")
@Inheritance(strategy = InheritanceType.JOINED)
public class ViewRiksdagenVoteDataBallotSummaryMonthly
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
    @XmlElement(name = "number_ballots", required = true)
    protected BigDecimal numberBallots;
    @XmlElement(name = "approved_ballots", required = true)
    protected BigDecimal approvedBallots;
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
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "NUMBER_BALLOTS", precision = 20, scale = 10)
    public BigDecimal getNumberBallots() {
        return numberBallots;
    }

    /**
     * Sets the value of the numberBallots property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberBallots(final BigDecimal value) {
        this.numberBallots = value;
    }

    /**
     * Gets the value of the approvedBallots property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "APPROVED_BALLOTS", precision = 20, scale = 10)
    public BigDecimal getApprovedBallots() {
        return approvedBallots;
    }

    /**
     * Sets the value of the approvedBallots property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApprovedBallots(final BigDecimal value) {
        this.approvedBallots = value;
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

    public ViewRiksdagenVoteDataBallotSummaryMonthly withVoteDate(final Date value) {
        setVoteDate(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryMonthly withAvgBornYear(final BigDecimal value) {
        setAvgBornYear(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryMonthly withTotalVotes(final BigDecimal value) {
        setTotalVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryMonthly withYesVotes(final BigDecimal value) {
        setYesVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryMonthly withNoVotes(final BigDecimal value) {
        setNoVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryMonthly withAbstainVotes(final BigDecimal value) {
        setAbstainVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryMonthly withAbsentVotes(final BigDecimal value) {
        setAbsentVotes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryMonthly withPercentageYes(final BigDecimal value) {
        setPercentageYes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryMonthly withPercentageNo(final BigDecimal value) {
        setPercentageNo(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryMonthly withPercentageAbsent(final BigDecimal value) {
        setPercentageAbsent(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryMonthly withPercentageAbstain(final BigDecimal value) {
        setPercentageAbstain(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryMonthly withNumberBallots(final BigDecimal value) {
        setNumberBallots(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryMonthly withApprovedBallots(final BigDecimal value) {
        setApprovedBallots(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryMonthly withPercentageApproved(final BigDecimal value) {
        setPercentageApproved(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryMonthly withAvgPercentageYes(final BigDecimal value) {
        setAvgPercentageYes(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryMonthly withAvgPercentageNo(final BigDecimal value) {
        setAvgPercentageNo(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryMonthly withAvgPercentageAbsent(final BigDecimal value) {
        setAvgPercentageAbsent(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryMonthly withAvgPercentageAbstain(final BigDecimal value) {
        setAvgPercentageAbstain(value);
        return this;
    }

    public ViewRiksdagenVoteDataBallotSummaryMonthly withAvgPercentageMale(final BigDecimal value) {
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
        final ViewRiksdagenVoteDataBallotSummaryMonthly that = ((ViewRiksdagenVoteDataBallotSummaryMonthly) object);
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
            BigDecimal lhsNumberBallots;
            lhsNumberBallots = this.getNumberBallots();
            BigDecimal rhsNumberBallots;
            rhsNumberBallots = that.getNumberBallots();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberBallots", lhsNumberBallots), LocatorUtils.property(thatLocator, "numberBallots", rhsNumberBallots), lhsNumberBallots, rhsNumberBallots)) {
                return false;
            }
        }
        {
            BigDecimal lhsApprovedBallots;
            lhsApprovedBallots = this.getApprovedBallots();
            BigDecimal rhsApprovedBallots;
            rhsApprovedBallots = that.getApprovedBallots();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "approvedBallots", lhsApprovedBallots), LocatorUtils.property(thatLocator, "approvedBallots", rhsApprovedBallots), lhsApprovedBallots, rhsApprovedBallots)) {
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