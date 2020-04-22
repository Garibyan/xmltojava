
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
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Address"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}AddressPublicID"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}AffinityGroupProducerCodes"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}AppointmentDate"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Branch"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}CardIDRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Code"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}CommissionPlans"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Description"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Description_L10N_ARRAY"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}EMailAddresRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}INNRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}LNRRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}MiddleNameRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}NameOfSubdivisionRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}NameRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Organization"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Parent"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}PhoneNumberRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}PreferredUnderwriter"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}ProducerCodeRoles"/>
 *         &lt;/sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}ProducerStatus"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}SKKCodeRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}SNILSRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}SalesChannelRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}SalesGroupRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}SalesPointRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}SurnameRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}TerminationDate"/>
 *         &lt;/sequence>
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
    "addressPublicID",
    "affinityGroupProducerCodes",
    "appointmentDate",
    "branch",
    "cardIDRgs",
    "code",
    "commissionPlans",
    "description",
    "descriptionL10NARRAY",
    "eMailAddresRgs",
    "innRgs",
    "lnrRgs",
    "middleNameRgs",
    "nameOfSubdivisionRgs",
    "nameRgs",
    "organization",
    "parent",
    "phoneNumberRgs",
    "preferredUnderwriter",
    "producerCodeRoles",
    "producerStatus",
    "skkCodeRgs",
    "snilsRgs",
    "salesChannelRgs",
    "salesGroupRgs",
    "salesPointRgs",
    "surnameRgs",
    "terminationDate"
})
@XmlRootElement(name = "ProducerCode", namespace = "http://guidewire.com/pc/exim/import")
public class ProducerCode {

    @XmlElement(name = "Address", namespace = "http://guidewire.com/pc/exim/import")
    protected Address address;
    @XmlElement(name = "AddressPublicID", namespace = "http://guidewire.com/pc/exim/import")
    protected AddressPublicID addressPublicID;
    @XmlElement(name = "AffinityGroupProducerCodes", namespace = "http://guidewire.com/pc/exim/import")
    protected AffinityGroupProducerCodes affinityGroupProducerCodes;
    @XmlElement(name = "AppointmentDate", namespace = "http://guidewire.com/pc/exim/import")
    protected AppointmentDate appointmentDate;
    @XmlElement(name = "Branch", namespace = "http://guidewire.com/pc/exim/import")
    protected Branch branch;
    @XmlElement(name = "CardIDRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String cardIDRgs;
    @XmlElement(name = "Code", namespace = "http://guidewire.com/pc/exim/import")
    protected String code;
    @XmlElement(name = "CommissionPlans", namespace = "http://guidewire.com/pc/exim/import")
    protected CommissionPlans commissionPlans;
    @XmlElement(name = "Description", namespace = "http://guidewire.com/pc/exim/import")
    protected String description;
    @XmlElement(name = "Description_L10N_ARRAY", namespace = "http://guidewire.com/pc/exim/import")
    protected DescriptionL10NARRAY descriptionL10NARRAY;
    @XmlElement(name = "EMailAddresRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String eMailAddresRgs;
    @XmlElement(name = "INNRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String innRgs;
    @XmlElement(name = "LNRRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String lnrRgs;
    @XmlElement(name = "MiddleNameRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String middleNameRgs;
    @XmlElement(name = "NameOfSubdivisionRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String nameOfSubdivisionRgs;
    @XmlElement(name = "NameRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String nameRgs;
    @XmlElement(name = "Organization", namespace = "http://guidewire.com/pc/exim/import")
    protected Organization organization;
    @XmlElement(name = "Parent", namespace = "http://guidewire.com/pc/exim/import")
    protected Parent parent;
    @XmlElement(name = "PhoneNumberRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String phoneNumberRgs;
    @XmlElement(name = "PreferredUnderwriter", namespace = "http://guidewire.com/pc/exim/import")
    protected PreferredUnderwriter preferredUnderwriter;
    @XmlElement(name = "ProducerCodeRoles", namespace = "http://guidewire.com/pc/exim/import")
    protected ProducerCodeRoles producerCodeRoles;
    @XmlElement(name = "ProducerStatus", namespace = "http://guidewire.com/pc/exim/import")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String producerStatus;
    @XmlElement(name = "SKKCodeRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String skkCodeRgs;
    @XmlElement(name = "SNILSRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String snilsRgs;
    @XmlElement(name = "SalesChannelRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String salesChannelRgs;
    @XmlElement(name = "SalesGroupRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String salesGroupRgs;
    @XmlElement(name = "SalesPointRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String salesPointRgs;
    @XmlElement(name = "SurnameRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String surnameRgs;
    @XmlElement(name = "TerminationDate", namespace = "http://guidewire.com/pc/exim/import")
    protected TerminationDate terminationDate;
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
     * Gets the value of the addressPublicID property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPublicID }
     *     
     */
    public AddressPublicID getAddressPublicID() {
        return addressPublicID;
    }

    /**
     * Sets the value of the addressPublicID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPublicID }
     *     
     */
    public void setAddressPublicID(AddressPublicID value) {
        this.addressPublicID = value;
    }

    /**
     * Gets the value of the affinityGroupProducerCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AffinityGroupProducerCodes }
     *     
     */
    public AffinityGroupProducerCodes getAffinityGroupProducerCodes() {
        return affinityGroupProducerCodes;
    }

    /**
     * Sets the value of the affinityGroupProducerCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffinityGroupProducerCodes }
     *     
     */
    public void setAffinityGroupProducerCodes(AffinityGroupProducerCodes value) {
        this.affinityGroupProducerCodes = value;
    }

    /**
     * Gets the value of the appointmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentDate }
     *     
     */
    public AppointmentDate getAppointmentDate() {
        return appointmentDate;
    }

    /**
     * Sets the value of the appointmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentDate }
     *     
     */
    public void setAppointmentDate(AppointmentDate value) {
        this.appointmentDate = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link Branch }
     *     
     */
    public Branch getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Branch }
     *     
     */
    public void setBranch(Branch value) {
        this.branch = value;
    }

    /**
     * Gets the value of the cardIDRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIDRgs() {
        return cardIDRgs;
    }

    /**
     * Sets the value of the cardIDRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIDRgs(String value) {
        this.cardIDRgs = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the commissionPlans property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionPlans }
     *     
     */
    public CommissionPlans getCommissionPlans() {
        return commissionPlans;
    }

    /**
     * Sets the value of the commissionPlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionPlans }
     *     
     */
    public void setCommissionPlans(CommissionPlans value) {
        this.commissionPlans = value;
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
     * Gets the value of the eMailAddresRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMailAddresRgs() {
        return eMailAddresRgs;
    }

    /**
     * Sets the value of the eMailAddresRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMailAddresRgs(String value) {
        this.eMailAddresRgs = value;
    }

    /**
     * Gets the value of the innRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINNRgs() {
        return innRgs;
    }

    /**
     * Sets the value of the innRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINNRgs(String value) {
        this.innRgs = value;
    }

    /**
     * Gets the value of the lnrRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNRRgs() {
        return lnrRgs;
    }

    /**
     * Sets the value of the lnrRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNRRgs(String value) {
        this.lnrRgs = value;
    }

    /**
     * Gets the value of the middleNameRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleNameRgs() {
        return middleNameRgs;
    }

    /**
     * Sets the value of the middleNameRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleNameRgs(String value) {
        this.middleNameRgs = value;
    }

    /**
     * Gets the value of the nameOfSubdivisionRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfSubdivisionRgs() {
        return nameOfSubdivisionRgs;
    }

    /**
     * Sets the value of the nameOfSubdivisionRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfSubdivisionRgs(String value) {
        this.nameOfSubdivisionRgs = value;
    }

    /**
     * Gets the value of the nameRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameRgs() {
        return nameRgs;
    }

    /**
     * Sets the value of the nameRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameRgs(String value) {
        this.nameRgs = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setOrganization(Organization value) {
        this.organization = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link Parent }
     *     
     */
    public Parent getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parent }
     *     
     */
    public void setParent(Parent value) {
        this.parent = value;
    }

    /**
     * Gets the value of the phoneNumberRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberRgs() {
        return phoneNumberRgs;
    }

    /**
     * Sets the value of the phoneNumberRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberRgs(String value) {
        this.phoneNumberRgs = value;
    }

    /**
     * Gets the value of the preferredUnderwriter property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredUnderwriter }
     *     
     */
    public PreferredUnderwriter getPreferredUnderwriter() {
        return preferredUnderwriter;
    }

    /**
     * Sets the value of the preferredUnderwriter property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredUnderwriter }
     *     
     */
    public void setPreferredUnderwriter(PreferredUnderwriter value) {
        this.preferredUnderwriter = value;
    }

    /**
     * Gets the value of the producerCodeRoles property.
     * 
     * @return
     *     possible object is
     *     {@link ProducerCodeRoles }
     *     
     */
    public ProducerCodeRoles getProducerCodeRoles() {
        return producerCodeRoles;
    }

    /**
     * Sets the value of the producerCodeRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProducerCodeRoles }
     *     
     */
    public void setProducerCodeRoles(ProducerCodeRoles value) {
        this.producerCodeRoles = value;
    }

    /**
     * Gets the value of the producerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerStatus() {
        return producerStatus;
    }

    /**
     * Sets the value of the producerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerStatus(String value) {
        this.producerStatus = value;
    }

    /**
     * Gets the value of the skkCodeRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKKCodeRgs() {
        return skkCodeRgs;
    }

    /**
     * Sets the value of the skkCodeRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKKCodeRgs(String value) {
        this.skkCodeRgs = value;
    }

    /**
     * Gets the value of the snilsRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNILSRgs() {
        return snilsRgs;
    }

    /**
     * Sets the value of the snilsRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNILSRgs(String value) {
        this.snilsRgs = value;
    }

    /**
     * Gets the value of the salesChannelRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesChannelRgs() {
        return salesChannelRgs;
    }

    /**
     * Sets the value of the salesChannelRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesChannelRgs(String value) {
        this.salesChannelRgs = value;
    }

    /**
     * Gets the value of the salesGroupRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesGroupRgs() {
        return salesGroupRgs;
    }

    /**
     * Sets the value of the salesGroupRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesGroupRgs(String value) {
        this.salesGroupRgs = value;
    }

    /**
     * Gets the value of the salesPointRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesPointRgs() {
        return salesPointRgs;
    }

    /**
     * Sets the value of the salesPointRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesPointRgs(String value) {
        this.salesPointRgs = value;
    }

    /**
     * Gets the value of the surnameRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnameRgs() {
        return surnameRgs;
    }

    /**
     * Sets the value of the surnameRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnameRgs(String value) {
        this.surnameRgs = value;
    }

    /**
     * Gets the value of the terminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link TerminationDate }
     *     
     */
    public TerminationDate getTerminationDate() {
        return terminationDate;
    }

    /**
     * Sets the value of the terminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationDate }
     *     
     */
    public void setTerminationDate(TerminationDate value) {
        this.terminationDate = value;
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
