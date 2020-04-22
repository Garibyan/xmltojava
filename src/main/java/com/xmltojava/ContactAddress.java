
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
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Address"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}AddressBookUID"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}AddressIdDwh"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ArchivePartition"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Contact"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ContactIdDwh"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ExternalID"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}IdDwh"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ObfuscatedInternal"/>
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
    "address",
    "addressBookUID",
    "addressIdDwh",
    "archivePartition",
    "contact",
    "contactIdDwh",
    "externalID",
    "idDwh",
    "obfuscatedInternal"
})
@XmlRootElement(name = "ContactAddress", namespace = "http://guidewire.com/pc/exim/import")
public class ContactAddress {

    @XmlElement(name = "Address", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected Address address;
    @XmlElement(name = "AddressBookUID", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected AddressBookUID addressBookUID;
    @XmlElement(name = "AddressIdDwh", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected AddressIdDwh addressIdDwh;
    @XmlElement(name = "ArchivePartition", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected ArchivePartition archivePartition;
    @XmlElement(name = "Contact", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected Contact contact;
    @XmlElement(name = "ContactIdDwh", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected ContactIdDwh contactIdDwh;
    @XmlElement(name = "ExternalID", namespace = "http://guidewire.com/pc/exim/import", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String externalID;
    @XmlElement(name = "IdDwh", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected IdDwh idDwh;
    @XmlElement(name = "ObfuscatedInternal", namespace = "http://guidewire.com/pc/exim/import")
    protected boolean obfuscatedInternal;
    @XmlAttribute(name = "public-id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String publicId;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

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
     * Gets the value of the addressIdDwh property.
     * 
     * @return
     *     possible object is
     *     {@link AddressIdDwh }
     *     
     */
    public AddressIdDwh getAddressIdDwh() {
        return addressIdDwh;
    }

    /**
     * Sets the value of the addressIdDwh property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressIdDwh }
     *     
     */
    public void setAddressIdDwh(AddressIdDwh value) {
        this.addressIdDwh = value;
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
     * Gets the value of the contactIdDwh property.
     * 
     * @return
     *     possible object is
     *     {@link ContactIdDwh }
     *     
     */
    public ContactIdDwh getContactIdDwh() {
        return contactIdDwh;
    }

    /**
     * Sets the value of the contactIdDwh property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactIdDwh }
     *     
     */
    public void setContactIdDwh(ContactIdDwh value) {
        this.contactIdDwh = value;
    }

    /**
     * Gets the value of the externalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalID() {
        return externalID;
    }

    /**
     * Sets the value of the externalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalID(String value) {
        this.externalID = value;
    }

    /**
     * Gets the value of the idDwh property.
     * 
     * @return
     *     possible object is
     *     {@link IdDwh }
     *     
     */
    public IdDwh getIdDwh() {
        return idDwh;
    }

    /**
     * Sets the value of the idDwh property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdDwh }
     *     
     */
    public void setIdDwh(IdDwh value) {
        this.idDwh = value;
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
