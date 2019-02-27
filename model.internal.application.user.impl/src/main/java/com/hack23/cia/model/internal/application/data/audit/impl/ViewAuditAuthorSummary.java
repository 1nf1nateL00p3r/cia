//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.data.audit.impl;

import java.io.Serializable;
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
 * <p>Java class for ViewAuditAuthorSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewAuditAuthorSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="changes" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="firstDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="lastDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewAuditAuthorSummary", propOrder = {
    "id",
    "author",
    "changes",
    "firstDate",
    "lastDate"
})
@Entity(name = "ViewAuditAuthorSummary")
@Table(name = "VIEW_AUDIT_AUTHOR_SUMMARY")
@Inheritance(strategy = InheritanceType.JOINED)
public class ViewAuditAuthorSummary
    implements Serializable, ModelObject, Equals
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected long id;
    @XmlElement(required = true)
    protected String author;
    protected long changes;
    @XmlElement(required = true, type = String.class, nillable = true)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date firstDate;
    @XmlElement(required = true, type = String.class, nillable = true)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date lastDate;

    /**
     * Gets the value of the id property.
     * 
     */
    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(final long value) {
        this.id = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "AUTHOR")
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(final String value) {
        this.author = value;
    }

    /**
     * Gets the value of the changes property.
     * 
     */
    @Basic
    @Column(name = "CHANGES", precision = 20, scale = 0)
    public long getChanges() {
        return changes;
    }

    /**
     * Sets the value of the changes property.
     * 
     */
    public void setChanges(final long value) {
        this.changes = value;
    }

    /**
     * Gets the value of the firstDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "FIRST_DATE")
    @Temporal(TemporalType.DATE)
    public Date getFirstDate() {
        return firstDate;
    }

    /**
     * Sets the value of the firstDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstDate(final Date value) {
        this.firstDate = value;
    }

    /**
     * Gets the value of the lastDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "LAST_DATE")
    @Temporal(TemporalType.DATE)
    public Date getLastDate() {
        return lastDate;
    }

    /**
     * Sets the value of the lastDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastDate(final Date value) {
        this.lastDate = value;
    }

    public ViewAuditAuthorSummary withId(final long value) {
        setId(value);
        return this;
    }

    public ViewAuditAuthorSummary withAuthor(final String value) {
        setAuthor(value);
        return this;
    }

    public ViewAuditAuthorSummary withChanges(final long value) {
        setChanges(value);
        return this;
    }

    public ViewAuditAuthorSummary withFirstDate(final Date value) {
        setFirstDate(value);
        return this;
    }

    public ViewAuditAuthorSummary withLastDate(final Date value) {
        setLastDate(value);
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
        final ViewAuditAuthorSummary that = ((ViewAuditAuthorSummary) object);
        {
            long lhsId;
            lhsId = this.getId();
            long rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            String lhsAuthor;
            lhsAuthor = this.getAuthor();
            String rhsAuthor;
            rhsAuthor = that.getAuthor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "author", lhsAuthor), LocatorUtils.property(thatLocator, "author", rhsAuthor), lhsAuthor, rhsAuthor)) {
                return false;
            }
        }
        {
            long lhsChanges;
            lhsChanges = this.getChanges();
            long rhsChanges;
            rhsChanges = that.getChanges();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "changes", lhsChanges), LocatorUtils.property(thatLocator, "changes", rhsChanges), lhsChanges, rhsChanges)) {
                return false;
            }
        }
        {
            Date lhsFirstDate;
            lhsFirstDate = this.getFirstDate();
            Date rhsFirstDate;
            rhsFirstDate = that.getFirstDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firstDate", lhsFirstDate), LocatorUtils.property(thatLocator, "firstDate", rhsFirstDate), lhsFirstDate, rhsFirstDate)) {
                return false;
            }
        }
        {
            Date lhsLastDate;
            lhsLastDate = this.getLastDate();
            Date rhsLastDate;
            rhsLastDate = that.getLastDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastDate", lhsLastDate), LocatorUtils.property(thatLocator, "lastDate", rhsLastDate), lhsLastDate, rhsLastDate)) {
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