
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
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Active"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}AddressRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}BranchCode"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}CityRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}CodeBOSSRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}CodeSKKRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Description"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Description_L10N_ARRAY"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}EndDateRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}GroupProducerCodes"/>
 *         &lt;/sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}GroupType"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}INNRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}KPPRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}LoadFactor"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}MAGLnrRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Name"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}NameBOSSRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}NameBOSSRgs_L10N_ARRAY"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}NameKanji"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Name_L10N_ARRAY"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}OKTMORgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Organization"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Parent"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Regions"/>
 *         &lt;/sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}SecurityZone"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}StartDateRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Supervisor"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}TimeShiftRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Users"/>
 *         &lt;/sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}ValidationLevel"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}VirtualGroupRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}VisibilityZone"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}WorldVisible"/>
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
    "active",
    "addressRgs",
    "branchCode",
    "cityRgs",
    "codeBOSSRgs",
    "codeSKKRgs",
    "description",
    "descriptionL10NARRAY",
    "endDateRgs",
    "groupProducerCodes",
    "groupType",
    "innRgs",
    "kppRgs",
    "loadFactor",
    "magLnrRgs",
    "name",
    "nameBOSSRgs",
    "nameBOSSRgsL10NARRAY",
    "nameKanji",
    "nameL10NARRAY",
    "oktmoRgs",
    "organization",
    "parent",
    "regions",
    "securityZone",
    "startDateRgs",
    "supervisor",
    "timeShiftRgs",
    "users",
    "validationLevel",
    "virtualGroupRgs",
    "visibilityZone",
    "worldVisible"
})
@XmlRootElement(name = "Group", namespace = "http://guidewire.com/pc/exim/import")
public class Group {

    @XmlElement(name = "Active", namespace = "http://guidewire.com/pc/exim/import")
    protected String active;
    @XmlElement(name = "AddressRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String addressRgs;
    @XmlElement(name = "BranchCode", namespace = "http://guidewire.com/pc/exim/import")
    protected BranchCode branchCode;
    @XmlElement(name = "CityRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String cityRgs;
    @XmlElement(name = "CodeBOSSRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String codeBOSSRgs;
    @XmlElement(name = "CodeSKKRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String codeSKKRgs;
    @XmlElement(name = "Description", namespace = "http://guidewire.com/pc/exim/import")
    protected String description;
    @XmlElement(name = "Description_L10N_ARRAY", namespace = "http://guidewire.com/pc/exim/import")
    protected DescriptionL10NARRAY descriptionL10NARRAY;
    @XmlElement(name = "EndDateRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String endDateRgs;
    @XmlElement(name = "GroupProducerCodes", namespace = "http://guidewire.com/pc/exim/import")
    protected GroupProducerCodes groupProducerCodes;
    @XmlElement(name = "GroupType", namespace = "http://guidewire.com/pc/exim/import")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String groupType;
    @XmlElement(name = "INNRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String innRgs;
    @XmlElement(name = "KPPRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String kppRgs;
    @XmlElement(name = "LoadFactor", namespace = "http://guidewire.com/pc/exim/import")
    protected String loadFactor;
    @XmlElement(name = "MAGLnrRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String magLnrRgs;
    @XmlElement(name = "Name", namespace = "http://guidewire.com/pc/exim/import")
    protected String name;
    @XmlElement(name = "NameBOSSRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String nameBOSSRgs;
    @XmlElement(name = "NameBOSSRgs_L10N_ARRAY", namespace = "http://guidewire.com/pc/exim/import")
    protected NameBOSSRgsL10NARRAY nameBOSSRgsL10NARRAY;
    @XmlElement(name = "NameKanji", namespace = "http://guidewire.com/pc/exim/import")
    protected NameKanji nameKanji;
    @XmlElement(name = "Name_L10N_ARRAY", namespace = "http://guidewire.com/pc/exim/import")
    protected NameL10NARRAY nameL10NARRAY;
    @XmlElement(name = "OKTMORgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String oktmoRgs;
    @XmlElement(name = "Organization", namespace = "http://guidewire.com/pc/exim/import")
    protected Organization organization;
    @XmlElement(name = "Parent", namespace = "http://guidewire.com/pc/exim/import")
    protected Parent parent;
    @XmlElement(name = "Regions", namespace = "http://guidewire.com/pc/exim/import")
    protected Regions regions;
    @XmlElement(name = "SecurityZone", namespace = "http://guidewire.com/pc/exim/import")
    protected SecurityZone securityZone;
    @XmlElement(name = "StartDateRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String startDateRgs;
    @XmlElement(name = "Supervisor", namespace = "http://guidewire.com/pc/exim/import")
    protected Supervisor supervisor;
    @XmlElement(name = "TimeShiftRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String timeShiftRgs;
    @XmlElement(name = "Users", namespace = "http://guidewire.com/pc/exim/import")
    protected Users users;
    @XmlElement(name = "ValidationLevel", namespace = "http://guidewire.com/pc/exim/import")
    protected String validationLevel;
    @XmlElement(name = "VirtualGroupRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected Boolean virtualGroupRgs;
    @XmlElement(name = "VisibilityZone", namespace = "http://guidewire.com/pc/exim/import")
    protected VisibilityZone visibilityZone;
    @XmlElement(name = "WorldVisible", namespace = "http://guidewire.com/pc/exim/import")
    protected Boolean worldVisible;
    @XmlAttribute(name = "public-id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String publicId;

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActive(String value) {
        this.active = value;
    }

    /**
     * Gets the value of the addressRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressRgs() {
        return addressRgs;
    }

    /**
     * Sets the value of the addressRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressRgs(String value) {
        this.addressRgs = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link BranchCode }
     *     
     */
    public BranchCode getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchCode }
     *     
     */
    public void setBranchCode(BranchCode value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the cityRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityRgs() {
        return cityRgs;
    }

    /**
     * Sets the value of the cityRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityRgs(String value) {
        this.cityRgs = value;
    }

    /**
     * Gets the value of the codeBOSSRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeBOSSRgs() {
        return codeBOSSRgs;
    }

    /**
     * Sets the value of the codeBOSSRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeBOSSRgs(String value) {
        this.codeBOSSRgs = value;
    }

    /**
     * Gets the value of the codeSKKRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSKKRgs() {
        return codeSKKRgs;
    }

    /**
     * Sets the value of the codeSKKRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSKKRgs(String value) {
        this.codeSKKRgs = value;
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
     * Gets the value of the endDateRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDateRgs() {
        return endDateRgs;
    }

    /**
     * Sets the value of the endDateRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDateRgs(String value) {
        this.endDateRgs = value;
    }

    /**
     * Gets the value of the groupProducerCodes property.
     * 
     * @return
     *     possible object is
     *     {@link GroupProducerCodes }
     *     
     */
    public GroupProducerCodes getGroupProducerCodes() {
        return groupProducerCodes;
    }

    /**
     * Sets the value of the groupProducerCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupProducerCodes }
     *     
     */
    public void setGroupProducerCodes(GroupProducerCodes value) {
        this.groupProducerCodes = value;
    }

    /**
     * Gets the value of the groupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * Sets the value of the groupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupType(String value) {
        this.groupType = value;
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
     * Gets the value of the kppRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPPRgs() {
        return kppRgs;
    }

    /**
     * Sets the value of the kppRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPPRgs(String value) {
        this.kppRgs = value;
    }

    /**
     * Gets the value of the loadFactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadFactor() {
        return loadFactor;
    }

    /**
     * Sets the value of the loadFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadFactor(String value) {
        this.loadFactor = value;
    }

    /**
     * Gets the value of the magLnrRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAGLnrRgs() {
        return magLnrRgs;
    }

    /**
     * Sets the value of the magLnrRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAGLnrRgs(String value) {
        this.magLnrRgs = value;
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
     * Gets the value of the nameBOSSRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameBOSSRgs() {
        return nameBOSSRgs;
    }

    /**
     * Sets the value of the nameBOSSRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameBOSSRgs(String value) {
        this.nameBOSSRgs = value;
    }

    /**
     * Gets the value of the nameBOSSRgsL10NARRAY property.
     * 
     * @return
     *     possible object is
     *     {@link NameBOSSRgsL10NARRAY }
     *     
     */
    public NameBOSSRgsL10NARRAY getNameBOSSRgsL10NARRAY() {
        return nameBOSSRgsL10NARRAY;
    }

    /**
     * Sets the value of the nameBOSSRgsL10NARRAY property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameBOSSRgsL10NARRAY }
     *     
     */
    public void setNameBOSSRgsL10NARRAY(NameBOSSRgsL10NARRAY value) {
        this.nameBOSSRgsL10NARRAY = value;
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
     * Gets the value of the oktmoRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKTMORgs() {
        return oktmoRgs;
    }

    /**
     * Sets the value of the oktmoRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKTMORgs(String value) {
        this.oktmoRgs = value;
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
     * Gets the value of the regions property.
     * 
     * @return
     *     possible object is
     *     {@link Regions }
     *     
     */
    public Regions getRegions() {
        return regions;
    }

    /**
     * Sets the value of the regions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Regions }
     *     
     */
    public void setRegions(Regions value) {
        this.regions = value;
    }

    /**
     * Gets the value of the securityZone property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityZone }
     *     
     */
    public SecurityZone getSecurityZone() {
        return securityZone;
    }

    /**
     * Sets the value of the securityZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityZone }
     *     
     */
    public void setSecurityZone(SecurityZone value) {
        this.securityZone = value;
    }

    /**
     * Gets the value of the startDateRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDateRgs() {
        return startDateRgs;
    }

    /**
     * Sets the value of the startDateRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateRgs(String value) {
        this.startDateRgs = value;
    }

    /**
     * Gets the value of the supervisor property.
     * 
     * @return
     *     possible object is
     *     {@link Supervisor }
     *     
     */
    public Supervisor getSupervisor() {
        return supervisor;
    }

    /**
     * Sets the value of the supervisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Supervisor }
     *     
     */
    public void setSupervisor(Supervisor value) {
        this.supervisor = value;
    }

    /**
     * Gets the value of the timeShiftRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeShiftRgs() {
        return timeShiftRgs;
    }

    /**
     * Sets the value of the timeShiftRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeShiftRgs(String value) {
        this.timeShiftRgs = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link Users }
     *     
     */
    public Users getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link Users }
     *     
     */
    public void setUsers(Users value) {
        this.users = value;
    }

    /**
     * Gets the value of the validationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationLevel() {
        return validationLevel;
    }

    /**
     * Sets the value of the validationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationLevel(String value) {
        this.validationLevel = value;
    }

    /**
     * Gets the value of the virtualGroupRgs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVirtualGroupRgs() {
        return virtualGroupRgs;
    }

    /**
     * Sets the value of the virtualGroupRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVirtualGroupRgs(Boolean value) {
        this.virtualGroupRgs = value;
    }

    /**
     * Gets the value of the visibilityZone property.
     * 
     * @return
     *     possible object is
     *     {@link VisibilityZone }
     *     
     */
    public VisibilityZone getVisibilityZone() {
        return visibilityZone;
    }

    /**
     * Sets the value of the visibilityZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisibilityZone }
     *     
     */
    public void setVisibilityZone(VisibilityZone value) {
        this.visibilityZone = value;
    }

    /**
     * Gets the value of the worldVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorldVisible() {
        return worldVisible;
    }

    /**
     * Sets the value of the worldVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorldVisible(Boolean value) {
        this.worldVisible = value;
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
