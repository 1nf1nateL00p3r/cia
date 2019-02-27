//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.data.impl;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for WorldbankIndicatorDataCountrySummaryEmbeddedId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorldbankIndicatorDataCountrySummaryEmbeddedId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="indicator_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="country_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorldbankIndicatorDataCountrySummaryEmbeddedId", propOrder = {
    "indicatorId",
    "countryId"
})
@Embeddable
public class WorldbankIndicatorDataCountrySummaryEmbeddedId
    implements Serializable, ModelObject, Equals
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "indicator_id", required = true)
    protected String indicatorId;
    @XmlElement(name = "country_id", required = true)
    protected String countryId;

    /**
     * Gets the value of the indicatorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "INDICATOR_ID")
    public String getIndicatorId() {
        return indicatorId;
    }

    /**
     * Sets the value of the indicatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicatorId(final String value) {
        this.indicatorId = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "COUNTRY_ID")
    public String getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryId(final String value) {
        this.countryId = value;
    }

    public WorldbankIndicatorDataCountrySummaryEmbeddedId withIndicatorId(final String value) {
        setIndicatorId(value);
        return this;
    }

    public WorldbankIndicatorDataCountrySummaryEmbeddedId withCountryId(final String value) {
        setCountryId(value);
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
        final WorldbankIndicatorDataCountrySummaryEmbeddedId that = ((WorldbankIndicatorDataCountrySummaryEmbeddedId) object);
        {
            String lhsIndicatorId;
            lhsIndicatorId = this.getIndicatorId();
            String rhsIndicatorId;
            rhsIndicatorId = that.getIndicatorId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indicatorId", lhsIndicatorId), LocatorUtils.property(thatLocator, "indicatorId", rhsIndicatorId), lhsIndicatorId, rhsIndicatorId)) {
                return false;
            }
        }
        {
            String lhsCountryId;
            lhsCountryId = this.getCountryId();
            String rhsCountryId;
            rhsCountryId = that.getCountryId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countryId", lhsCountryId), LocatorUtils.property(thatLocator, "countryId", rhsCountryId), lhsCountryId, rhsCountryId)) {
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