
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
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}AgencyBillPlans"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}BranchID_Rgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Carrier"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Contact"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}INN_Rgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}KPP_Rgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}MasterAdmin"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Name"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}NameKanji"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}PartnerID_Rgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ProducerStatus"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}RootGroup"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}SalesChannel_Rgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Tier"/>
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
    "agencyBillPlans",
    "branchIDRgs",
    "carrier",
    "contact",
    "innRgs",
    "kppRgs",
    "masterAdmin",
    "name",
    "nameKanji",
    "partnerIDRgs",
    "producerStatus",
    "rootGroup",
    "salesChannelRgs",
    "tier",
    "type"
})
@XmlRootElement(name = "Organization", namespace = "http://guidewire.com/pc/exim/import")
public class Organization {

    @XmlElement(name = "AgencyBillPlans", namespace = "http://guidewire.com/pc/exim/import")
    protected AgencyBillPlans agencyBillPlans;
    @XmlElement(name = "BranchID_Rgs", namespace = "http://guidewire.com/pc/exim/import")
    protected BranchIDRgs branchIDRgs;
    @XmlElement(name = "Carrier", namespace = "http://guidewire.com/pc/exim/import")
    protected Boolean carrier;
    @XmlElement(name = "Contact", namespace = "http://guidewire.com/pc/exim/import")
    protected Contact contact;
    @XmlElement(name = "INN_Rgs", namespace = "http://guidewire.com/pc/exim/import")
    protected INNRgs innRgs;
    @XmlElement(name = "KPP_Rgs", namespace = "http://guidewire.com/pc/exim/import")
    protected KPPRgs kppRgs;
    @XmlElement(name = "MasterAdmin", namespace = "http://guidewire.com/pc/exim/import")
    protected Boolean masterAdmin;
    @XmlElement(name = "Name", namespace = "http://guidewire.com/pc/exim/import")
    protected String name;
    @XmlElement(name = "NameKanji", namespace = "http://guidewire.com/pc/exim/import")
    protected NameKanji nameKanji;
    @XmlElement(name = "PartnerID_Rgs", namespace = "http://guidewire.com/pc/exim/import")
    protected PartnerIDRgs partnerIDRgs;
    @XmlElement(name = "ProducerStatus", namespace = "http://guidewire.com/pc/exim/import")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String producerStatus;
    @XmlElement(name = "RootGroup", namespace = "http://guidewire.com/pc/exim/import")
    protected RootGroup rootGroup;
    @XmlElement(name = "SalesChannel_Rgs", namespace = "http://guidewire.com/pc/exim/import")
    protected SalesChannelRgs salesChannelRgs;
    @XmlElement(name = "Tier", namespace = "http://guidewire.com/pc/exim/import")
    protected Tier tier;
    @XmlElement(name = "Type", namespace = "http://guidewire.com/pc/exim/import")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String type;
    @XmlAttribute(name = "public-id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String publicId;

    /**
     * Gets the value of the agencyBillPlans property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyBillPlans }
     *     
     */
    public AgencyBillPlans getAgencyBillPlans() {
        return agencyBillPlans;
    }

    /**
     * Sets the value of the agencyBillPlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyBillPlans }
     *     
     */
    public void setAgencyBillPlans(AgencyBillPlans value) {
        this.agencyBillPlans = value;
    }

    /**
     * Gets the value of the branchIDRgs property.
     * 
     * @return
     *     possible object is
     *     {@link BranchIDRgs }
     *     
     */
    public BranchIDRgs getBranchIDRgs() {
        return branchIDRgs;
    }

    /**
     * Sets the value of the branchIDRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchIDRgs }
     *     
     */
    public void setBranchIDRgs(BranchIDRgs value) {
        this.branchIDRgs = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCarrier(Boolean value) {
        this.carrier = value;
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
     * Gets the value of the innRgs property.
     * 
     * @return
     *     possible object is
     *     {@link INNRgs }
     *     
     */
    public INNRgs getINNRgs() {
        return innRgs;
    }

    /**
     * Sets the value of the innRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link INNRgs }
     *     
     */
    public void setINNRgs(INNRgs value) {
        this.innRgs = value;
    }

    /**
     * Gets the value of the kppRgs property.
     * 
     * @return
     *     possible object is
     *     {@link KPPRgs }
     *     
     */
    public KPPRgs getKPPRgs() {
        return kppRgs;
    }

    /**
     * Sets the value of the kppRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link KPPRgs }
     *     
     */
    public void setKPPRgs(KPPRgs value) {
        this.kppRgs = value;
    }

    /**
     * Gets the value of the masterAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMasterAdmin() {
        return masterAdmin;
    }

    /**
     * Sets the value of the masterAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMasterAdmin(Boolean value) {
        this.masterAdmin = value;
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
     * Gets the value of the nameKanji property.
     * 
     * @return
     *     possible object is
     *     {@link NameKanji }
     *     
     */
    public NameKanji getNameKanji() {
        return nameKanji;
    }

    /**
     * Sets the value of the nameKanji property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameKanji }
     *     
     */
    public void setNameKanji(NameKanji value) {
        this.nameKanji = value;
    }

    /**
     * Gets the value of the partnerIDRgs property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerIDRgs }
     *     
     */
    public PartnerIDRgs getPartnerIDRgs() {
        return partnerIDRgs;
    }

    /**
     * Sets the value of the partnerIDRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerIDRgs }
     *     
     */
    public void setPartnerIDRgs(PartnerIDRgs value) {
        this.partnerIDRgs = value;
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
     * Gets the value of the rootGroup property.
     * 
     * @return
     *     possible object is
     *     {@link RootGroup }
     *     
     */
    public RootGroup getRootGroup() {
        return rootGroup;
    }

    /**
     * Sets the value of the rootGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link RootGroup }
     *     
     */
    public void setRootGroup(RootGroup value) {
        this.rootGroup = value;
    }

    /**
     * Gets the value of the salesChannelRgs property.
     * 
     * @return
     *     possible object is
     *     {@link SalesChannelRgs }
     *     
     */
    public SalesChannelRgs getSalesChannelRgs() {
        return salesChannelRgs;
    }

    /**
     * Sets the value of the salesChannelRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesChannelRgs }
     *     
     */
    public void setSalesChannelRgs(SalesChannelRgs value) {
        this.salesChannelRgs = value;
    }

    /**
     * Gets the value of the tier property.
     * 
     * @return
     *     possible object is
     *     {@link Tier }
     *     
     */
    public Tier getTier() {
        return tier;
    }

    /**
     * Sets the value of the tier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tier }
     *     
     */
    public void setTier(Tier value) {
        this.tier = value;
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
