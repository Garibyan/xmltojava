
package com.xmltojava;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Description"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Group"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}LockingColumn"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Name"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}SubGroupVisible"/>
 *       &lt;/sequence>
 *       &lt;attribute name="public-id" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "group",
    "lockingColumn",
    "name",
    "subGroupVisible"
})
@XmlRootElement(name = "AssignableQueue", namespace = "http://guidewire.com/pc/exim/import")
public class AssignableQueue {

    @XmlElement(name = "Description", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String description;
    @XmlElement(name = "Group", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected Group group;
    @XmlElement(name = "LockingColumn", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected BigInteger lockingColumn;
    @XmlElement(name = "Name", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String name;
    @XmlElement(name = "SubGroupVisible", namespace = "http://guidewire.com/pc/exim/import")
    protected boolean subGroupVisible;
    @XmlAttribute(name = "public-id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String publicId;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link Group }
     *     
     */
    public Group getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link Group }
     *     
     */
    public void setGroup(Group value) {
        this.group = value;
    }

    /**
     * Gets the value of the lockingColumn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLockingColumn() {
        return lockingColumn;
    }

    /**
     * Sets the value of the lockingColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLockingColumn(BigInteger value) {
        this.lockingColumn = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the subGroupVisible property.
     * 
     */
    public boolean isSubGroupVisible() {
        return subGroupVisible;
    }

    /**
     * Sets the value of the subGroupVisible property.
     * 
     */
    public void setSubGroupVisible(boolean value) {
        this.subGroupVisible = value;
    }

    /**
     * Gets the value of the publicId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicId() {
        return publicId;
    }

    /**
     * Sets the value of the publicId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicId(String value) {
        this.publicId = value;
    }

}
