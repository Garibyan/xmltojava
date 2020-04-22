
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
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}AddressBookUID"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ArchivePartition"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Contact"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ObfuscatedInternal"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Type"/>
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
    "addressBookUID",
    "archivePartition",
    "contact",
    "obfuscatedInternal",
    "type"
})
@XmlRootElement(name = "ContactTag", namespace = "http://guidewire.com/pc/exim/import")
public class ContactTag {

    @XmlElement(name = "AddressBookUID", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected AddressBookUID addressBookUID;
    @XmlElement(name = "ArchivePartition", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected ArchivePartition archivePartition;
    @XmlElement(name = "Contact", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected Contact contact;
    @XmlElement(name = "ObfuscatedInternal", namespace = "http://guidewire.com/pc/exim/import")
    protected boolean obfuscatedInternal;
    @XmlElement(name = "Type", namespace = "http://guidewire.com/pc/exim/import", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String type;
    @XmlAttribute(name = "public-id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String publicId;

    /**
     * Gets the value of the addressBookUID property.
     * 
     * @return
     *     possible object is
     *     {@link AddressBookUID }
     *     
     */
    public AddressBookUID getAddressBookUID() {
        return addressBookUID;
    }

    /**
     * Sets the value of the addressBookUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressBookUID }
     *     
     */
    public void setAddressBookUID(AddressBookUID value) {
        this.addressBookUID = value;
    }

    /**
     * Gets the value of the archivePartition property.
     * 
     * @return
     *     possible object is
     *     {@link ArchivePartition }
     *     
     */
    public ArchivePartition getArchivePartition() {
        return archivePartition;
    }

    /**
     * Sets the value of the archivePartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchivePartition }
     *     
     */
    public void setArchivePartition(ArchivePartition value) {
        this.archivePartition = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the obfuscatedInternal property.
     * 
     */
    public boolean isObfuscatedInternal() {
        return obfuscatedInternal;
    }

    /**
     * Sets the value of the obfuscatedInternal property.
     * 
     */
    public void setObfuscatedInternal(boolean value) {
        this.obfuscatedInternal = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
