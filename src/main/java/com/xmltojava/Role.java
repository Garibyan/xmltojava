
package com.xmltojava;

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
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}CarrierInternalRole"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Description"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Description_L10N_ARRAY"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Name"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Name_L10N_ARRAY"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Privileges"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}RoleType" minOccurs="0"/>
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
    "carrierInternalRole",
    "description",
    "descriptionL10NARRAY",
    "name",
    "nameL10NARRAY",
    "privileges",
    "roleType"
})
@XmlRootElement(name = "Role", namespace = "http://guidewire.com/pc/exim/import")
public class Role {

    @XmlElement(name = "CarrierInternalRole", namespace = "http://guidewire.com/pc/exim/import")
    protected Boolean carrierInternalRole;
    @XmlElement(name = "Description", namespace = "http://guidewire.com/pc/exim/import")
    protected String description;
    @XmlElement(name = "Description_L10N_ARRAY", namespace = "http://guidewire.com/pc/exim/import")
    protected DescriptionL10NARRAY descriptionL10NARRAY;
    @XmlElement(name = "Name", namespace = "http://guidewire.com/pc/exim/import")
    protected String name;
    @XmlElement(name = "Name_L10N_ARRAY", namespace = "http://guidewire.com/pc/exim/import")
    protected NameL10NARRAY nameL10NARRAY;
    @XmlElement(name = "Privileges", namespace = "http://guidewire.com/pc/exim/import")
    protected Privileges privileges;
    @XmlElement(name = "RoleType", namespace = "http://guidewire.com/pc/exim/import")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String roleType;
    @XmlAttribute(name = "public-id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String publicId;

    /**
     * Gets the value of the carrierInternalRole property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCarrierInternalRole() {
        return carrierInternalRole;
    }

    /**
     * Sets the value of the carrierInternalRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCarrierInternalRole(Boolean value) {
        this.carrierInternalRole = value;
    }

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
     * Gets the value of the descriptionL10NARRAY property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionL10NARRAY }
     *     
     */
    public DescriptionL10NARRAY getDescriptionL10NARRAY() {
        return descriptionL10NARRAY;
    }

    /**
     * Sets the value of the descriptionL10NARRAY property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionL10NARRAY }
     *     
     */
    public void setDescriptionL10NARRAY(DescriptionL10NARRAY value) {
        this.descriptionL10NARRAY = value;
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
     * Gets the value of the nameL10NARRAY property.
     * 
     * @return
     *     possible object is
     *     {@link NameL10NARRAY }
     *     
     */
    public NameL10NARRAY getNameL10NARRAY() {
        return nameL10NARRAY;
    }

    /**
     * Sets the value of the nameL10NARRAY property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameL10NARRAY }
     *     
     */
    public void setNameL10NARRAY(NameL10NARRAY value) {
        this.nameL10NARRAY = value;
    }

    /**
     * Gets the value of the privileges property.
     * 
     * @return
     *     possible object is
     *     {@link Privileges }
     *     
     */
    public Privileges getPrivileges() {
        return privileges;
    }

    /**
     * Sets the value of the privileges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Privileges }
     *     
     */
    public void setPrivileges(Privileges value) {
        this.privileges = value;
    }

    /**
     * Gets the value of the roleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleType() {
        return roleType;
    }

    /**
     * Sets the value of the roleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleType(String value) {
        this.roleType = value;
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
