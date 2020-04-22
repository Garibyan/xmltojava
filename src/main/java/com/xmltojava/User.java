
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
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}AccountLockoutReasonRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}AgentCategoryTempRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}AgentTempRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Attributes"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}BackupUsers"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}BankAdressRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}BankCodeRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}BankNameFullRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}BankPartnerIdRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}CardIdRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Category"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Contact"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Credential"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}DefaultCountry"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}DefaultPhoneCountry"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Department"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}ExperienceLevel"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}ExternalUser"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}IsTechnicalRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}JobTitle"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}LNRTempRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Language"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Locale"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}ObfuscatedInternal"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Organization"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Regions"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}RelatedAgencies"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}Roles"/>
 *         &lt;/sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}SessionTimeoutSecs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}ShowOrgAddressRgs"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}SystemUserType"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}TimeZone"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}UseOrgAddress"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}UseProducerCodeSecurity"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}UserAuthorityProfiles"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}UserProducerCodes" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}UserSettings"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}UserType"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}VacationStatus"/>
 *           &lt;element ref="{http://guidewire.com/pc/exim/import}ValidationLevel"/>
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
    "accountLockoutReasonRgs",
    "agentCategoryTempRgs",
    "agentTempRgs",
    "attributes",
    "backupUsers",
    "bankAdressRgs",
    "bankCodeRgs",
    "bankNameFullRgs",
    "bankPartnerIdRgs",
    "cardIdRgs",
    "category",
    "contact",
    "credential",
    "defaultCountry",
    "defaultPhoneCountry",
    "department",
    "experienceLevel",
    "externalUser",
    "isTechnicalRgs",
    "jobTitle",
    "lnrTempRgs",
    "language",
    "locale",
    "obfuscatedInternal",
    "organization",
    "regions",
    "relatedAgencies",
    "roles",
    "sessionTimeoutSecs",
    "showOrgAddressRgs",
    "systemUserType",
    "timeZone",
    "useOrgAddress",
    "useProducerCodeSecurity",
    "userAuthorityProfiles",
    "userProducerCodes",
    "userSettings",
    "userType",
    "vacationStatus",
    "validationLevel"
})
@XmlRootElement(name = "User", namespace = "http://guidewire.com/pc/exim/import")
public class User {

    @XmlElement(name = "AccountLockoutReasonRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected AccountLockoutReasonRgs accountLockoutReasonRgs;
    @XmlElement(name = "AgentCategoryTempRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected AgentCategoryTempRgs agentCategoryTempRgs;
    @XmlElement(name = "AgentTempRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected Boolean agentTempRgs;
    @XmlElement(name = "Attributes", namespace = "http://guidewire.com/pc/exim/import")
    protected Attributes attributes;
    @XmlElement(name = "BackupUsers", namespace = "http://guidewire.com/pc/exim/import")
    protected BackupUsers backupUsers;
    @XmlElement(name = "BankAdressRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected BankAdressRgs bankAdressRgs;
    @XmlElement(name = "BankCodeRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected BankCodeRgs bankCodeRgs;
    @XmlElement(name = "BankNameFullRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected BankNameFullRgs bankNameFullRgs;
    @XmlElement(name = "BankPartnerIdRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected BankPartnerIdRgs bankPartnerIdRgs;
    @XmlElement(name = "CardIdRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String cardIdRgs;
    @XmlElement(name = "Category", namespace = "http://guidewire.com/pc/exim/import")
    protected String category;
    @XmlElement(name = "Contact", namespace = "http://guidewire.com/pc/exim/import")
    protected Contact contact;
    @XmlElement(name = "Credential", namespace = "http://guidewire.com/pc/exim/import")
    protected Credential credential;
    @XmlElement(name = "DefaultCountry", namespace = "http://guidewire.com/pc/exim/import")
    protected DefaultCountry defaultCountry;
    @XmlElement(name = "DefaultPhoneCountry", namespace = "http://guidewire.com/pc/exim/import")
    protected DefaultPhoneCountry defaultPhoneCountry;
    @XmlElement(name = "Department", namespace = "http://guidewire.com/pc/exim/import")
    protected Department department;
    @XmlElement(name = "ExperienceLevel", namespace = "http://guidewire.com/pc/exim/import")
    protected ExperienceLevel experienceLevel;
    @XmlElement(name = "ExternalUser", namespace = "http://guidewire.com/pc/exim/import")
    protected Boolean externalUser;
    @XmlElement(name = "IsTechnicalRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected Boolean isTechnicalRgs;
    @XmlElement(name = "JobTitle", namespace = "http://guidewire.com/pc/exim/import")
    protected JobTitle jobTitle;
    @XmlElement(name = "LNRTempRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected LNRTempRgs lnrTempRgs;
    @XmlElement(name = "Language", namespace = "http://guidewire.com/pc/exim/import")
    protected String language;
    @XmlElement(name = "Locale", namespace = "http://guidewire.com/pc/exim/import")
    protected String locale;
    @XmlElement(name = "ObfuscatedInternal", namespace = "http://guidewire.com/pc/exim/import")
    protected Boolean obfuscatedInternal;
    @XmlElement(name = "Organization", namespace = "http://guidewire.com/pc/exim/import")
    protected Organization organization;
    @XmlElement(name = "Regions", namespace = "http://guidewire.com/pc/exim/import")
    protected Regions regions;
    @XmlElement(name = "RelatedAgencies", namespace = "http://guidewire.com/pc/exim/import")
    protected RelatedAgencies relatedAgencies;
    @XmlElement(name = "Roles", namespace = "http://guidewire.com/pc/exim/import")
    protected Roles roles;
    @XmlElement(name = "SessionTimeoutSecs", namespace = "http://guidewire.com/pc/exim/import")
    protected SessionTimeoutSecs sessionTimeoutSecs;
    @XmlElement(name = "ShowOrgAddressRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected Boolean showOrgAddressRgs;
    @XmlElement(name = "SystemUserType", namespace = "http://guidewire.com/pc/exim/import")
    protected String systemUserType;
    @XmlElement(name = "TimeZone", namespace = "http://guidewire.com/pc/exim/import")
    protected TimeZone timeZone;
    @XmlElement(name = "UseOrgAddress", namespace = "http://guidewire.com/pc/exim/import")
    protected Boolean useOrgAddress;
    @XmlElement(name = "UseProducerCodeSecurity", namespace = "http://guidewire.com/pc/exim/import")
    protected Boolean useProducerCodeSecurity;
    @XmlElement(name = "UserAuthorityProfiles", namespace = "http://guidewire.com/pc/exim/import")
    protected UserAuthorityProfiles userAuthorityProfiles;
    @XmlElement(name = "UserProducerCodes", namespace = "http://guidewire.com/pc/exim/import")
    protected UserProducerCodes userProducerCodes;
    @XmlElement(name = "UserSettings", namespace = "http://guidewire.com/pc/exim/import")
    protected UserSettings userSettings;
    @XmlElement(name = "UserType", namespace = "http://guidewire.com/pc/exim/import")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String userType;
    @XmlElement(name = "VacationStatus", namespace = "http://guidewire.com/pc/exim/import")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String vacationStatus;
    @XmlElement(name = "ValidationLevel", namespace = "http://guidewire.com/pc/exim/import")
    protected String validationLevel;
    @XmlAttribute(name = "public-id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String publicId;

    /**
     * Gets the value of the accountLockoutReasonRgs property.
     * 
     * @return
     *     possible object is
     *     {@link AccountLockoutReasonRgs }
     *     
     */
    public AccountLockoutReasonRgs getAccountLockoutReasonRgs() {
        return accountLockoutReasonRgs;
    }

    /**
     * Sets the value of the accountLockoutReasonRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountLockoutReasonRgs }
     *     
     */
    public void setAccountLockoutReasonRgs(AccountLockoutReasonRgs value) {
        this.accountLockoutReasonRgs = value;
    }

    /**
     * Gets the value of the agentCategoryTempRgs property.
     * 
     * @return
     *     possible object is
     *     {@link AgentCategoryTempRgs }
     *     
     */
    public AgentCategoryTempRgs getAgentCategoryTempRgs() {
        return agentCategoryTempRgs;
    }

    /**
     * Sets the value of the agentCategoryTempRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentCategoryTempRgs }
     *     
     */
    public void setAgentCategoryTempRgs(AgentCategoryTempRgs value) {
        this.agentCategoryTempRgs = value;
    }

    /**
     * Gets the value of the agentTempRgs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAgentTempRgs() {
        return agentTempRgs;
    }

    /**
     * Sets the value of the agentTempRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAgentTempRgs(Boolean value) {
        this.agentTempRgs = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link Attributes }
     *     
     */
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attributes }
     *     
     */
    public void setAttributes(Attributes value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the backupUsers property.
     * 
     * @return
     *     possible object is
     *     {@link BackupUsers }
     *     
     */
    public BackupUsers getBackupUsers() {
        return backupUsers;
    }

    /**
     * Sets the value of the backupUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BackupUsers }
     *     
     */
    public void setBackupUsers(BackupUsers value) {
        this.backupUsers = value;
    }

    /**
     * Gets the value of the bankAdressRgs property.
     * 
     * @return
     *     possible object is
     *     {@link BankAdressRgs }
     *     
     */
    public BankAdressRgs getBankAdressRgs() {
        return bankAdressRgs;
    }

    /**
     * Sets the value of the bankAdressRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAdressRgs }
     *     
     */
    public void setBankAdressRgs(BankAdressRgs value) {
        this.bankAdressRgs = value;
    }

    /**
     * Gets the value of the bankCodeRgs property.
     * 
     * @return
     *     possible object is
     *     {@link BankCodeRgs }
     *     
     */
    public BankCodeRgs getBankCodeRgs() {
        return bankCodeRgs;
    }

    /**
     * Sets the value of the bankCodeRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankCodeRgs }
     *     
     */
    public void setBankCodeRgs(BankCodeRgs value) {
        this.bankCodeRgs = value;
    }

    /**
     * Gets the value of the bankNameFullRgs property.
     * 
     * @return
     *     possible object is
     *     {@link BankNameFullRgs }
     *     
     */
    public BankNameFullRgs getBankNameFullRgs() {
        return bankNameFullRgs;
    }

    /**
     * Sets the value of the bankNameFullRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankNameFullRgs }
     *     
     */
    public void setBankNameFullRgs(BankNameFullRgs value) {
        this.bankNameFullRgs = value;
    }

    /**
     * Gets the value of the bankPartnerIdRgs property.
     * 
     * @return
     *     possible object is
     *     {@link BankPartnerIdRgs }
     *     
     */
    public BankPartnerIdRgs getBankPartnerIdRgs() {
        return bankPartnerIdRgs;
    }

    /**
     * Sets the value of the bankPartnerIdRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankPartnerIdRgs }
     *     
     */
    public void setBankPartnerIdRgs(BankPartnerIdRgs value) {
        this.bankPartnerIdRgs = value;
    }

    /**
     * Gets the value of the cardIdRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIdRgs() {
        return cardIdRgs;
    }

    /**
     * Sets the value of the cardIdRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIdRgs(String value) {
        this.cardIdRgs = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
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
     * Gets the value of the credential property.
     * 
     * @return
     *     possible object is
     *     {@link Credential }
     *     
     */
    public Credential getCredential() {
        return credential;
    }

    /**
     * Sets the value of the credential property.
     * 
     * @param value
     *     allowed object is
     *     {@link Credential }
     *     
     */
    public void setCredential(Credential value) {
        this.credential = value;
    }

    /**
     * Gets the value of the defaultCountry property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultCountry }
     *     
     */
    public DefaultCountry getDefaultCountry() {
        return defaultCountry;
    }

    /**
     * Sets the value of the defaultCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultCountry }
     *     
     */
    public void setDefaultCountry(DefaultCountry value) {
        this.defaultCountry = value;
    }

    /**
     * Gets the value of the defaultPhoneCountry property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultPhoneCountry }
     *     
     */
    public DefaultPhoneCountry getDefaultPhoneCountry() {
        return defaultPhoneCountry;
    }

    /**
     * Sets the value of the defaultPhoneCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultPhoneCountry }
     *     
     */
    public void setDefaultPhoneCountry(DefaultPhoneCountry value) {
        this.defaultPhoneCountry = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link Department }
     *     
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link Department }
     *     
     */
    public void setDepartment(Department value) {
        this.department = value;
    }

    /**
     * Gets the value of the experienceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ExperienceLevel }
     *     
     */
    public ExperienceLevel getExperienceLevel() {
        return experienceLevel;
    }

    /**
     * Sets the value of the experienceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperienceLevel }
     *     
     */
    public void setExperienceLevel(ExperienceLevel value) {
        this.experienceLevel = value;
    }

    /**
     * Gets the value of the externalUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternalUser() {
        return externalUser;
    }

    /**
     * Sets the value of the externalUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternalUser(Boolean value) {
        this.externalUser = value;
    }

    /**
     * Gets the value of the isTechnicalRgs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTechnicalRgs() {
        return isTechnicalRgs;
    }

    /**
     * Sets the value of the isTechnicalRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTechnicalRgs(Boolean value) {
        this.isTechnicalRgs = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JobTitle }
     *     
     */
    public JobTitle getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobTitle }
     *     
     */
    public void setJobTitle(JobTitle value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the lnrTempRgs property.
     * 
     * @return
     *     possible object is
     *     {@link LNRTempRgs }
     *     
     */
    public LNRTempRgs getLNRTempRgs() {
        return lnrTempRgs;
    }

    /**
     * Sets the value of the lnrTempRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link LNRTempRgs }
     *     
     */
    public void setLNRTempRgs(LNRTempRgs value) {
        this.lnrTempRgs = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the value of the obfuscatedInternal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isObfuscatedInternal() {
        return obfuscatedInternal;
    }

    /**
     * Sets the value of the obfuscatedInternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setObfuscatedInternal(Boolean value) {
        this.obfuscatedInternal = value;
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
     * Gets the value of the relatedAgencies property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedAgencies }
     *     
     */
    public RelatedAgencies getRelatedAgencies() {
        return relatedAgencies;
    }

    /**
     * Sets the value of the relatedAgencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedAgencies }
     *     
     */
    public void setRelatedAgencies(RelatedAgencies value) {
        this.relatedAgencies = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link Roles }
     *     
     */
    public Roles getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Roles }
     *     
     */
    public void setRoles(Roles value) {
        this.roles = value;
    }

    /**
     * Gets the value of the sessionTimeoutSecs property.
     * 
     * @return
     *     possible object is
     *     {@link SessionTimeoutSecs }
     *     
     */
    public SessionTimeoutSecs getSessionTimeoutSecs() {
        return sessionTimeoutSecs;
    }

    /**
     * Sets the value of the sessionTimeoutSecs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionTimeoutSecs }
     *     
     */
    public void setSessionTimeoutSecs(SessionTimeoutSecs value) {
        this.sessionTimeoutSecs = value;
    }

    /**
     * Gets the value of the showOrgAddressRgs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowOrgAddressRgs() {
        return showOrgAddressRgs;
    }

    /**
     * Sets the value of the showOrgAddressRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowOrgAddressRgs(Boolean value) {
        this.showOrgAddressRgs = value;
    }

    /**
     * Gets the value of the systemUserType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemUserType() {
        return systemUserType;
    }

    /**
     * Sets the value of the systemUserType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemUserType(String value) {
        this.systemUserType = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZone }
     *     
     */
    public TimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZone }
     *     
     */
    public void setTimeZone(TimeZone value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the useOrgAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseOrgAddress() {
        return useOrgAddress;
    }

    /**
     * Sets the value of the useOrgAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseOrgAddress(Boolean value) {
        this.useOrgAddress = value;
    }

    /**
     * Gets the value of the useProducerCodeSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseProducerCodeSecurity() {
        return useProducerCodeSecurity;
    }

    /**
     * Sets the value of the useProducerCodeSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseProducerCodeSecurity(Boolean value) {
        this.useProducerCodeSecurity = value;
    }

    /**
     * Gets the value of the userAuthorityProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link UserAuthorityProfiles }
     *     
     */
    public UserAuthorityProfiles getUserAuthorityProfiles() {
        return userAuthorityProfiles;
    }

    /**
     * Sets the value of the userAuthorityProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAuthorityProfiles }
     *     
     */
    public void setUserAuthorityProfiles(UserAuthorityProfiles value) {
        this.userAuthorityProfiles = value;
    }

    /**
     * Gets the value of the userProducerCodes property.
     * 
     * @return
     *     possible object is
     *     {@link UserProducerCodes }
     *     
     */
    public UserProducerCodes getUserProducerCodes() {
        return userProducerCodes;
    }

    /**
     * Sets the value of the userProducerCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserProducerCodes }
     *     
     */
    public void setUserProducerCodes(UserProducerCodes value) {
        this.userProducerCodes = value;
    }

    /**
     * Gets the value of the userSettings property.
     * 
     * @return
     *     possible object is
     *     {@link UserSettings }
     *     
     */
    public UserSettings getUserSettings() {
        return userSettings;
    }

    /**
     * Sets the value of the userSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserSettings }
     *     
     */
    public void setUserSettings(UserSettings value) {
        this.userSettings = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * Gets the value of the vacationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVacationStatus() {
        return vacationStatus;
    }

    /**
     * Sets the value of the vacationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVacationStatus(String value) {
        this.vacationStatus = value;
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
