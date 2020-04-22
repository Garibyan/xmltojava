
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
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}AccountHolderCount"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}AddressBookUID"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ArchiveDate"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ArchiveFailure"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ArchiveFailureDetails"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ArchivePartition"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ArchiveSchemaInfo"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ArchiveState"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}AutoSync"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}BatchIdRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}BlackListTypeRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}CategoryScores"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ContactAddresses"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}CorrectionAllowed"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}CountryRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}DivisionCodeRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}DoNotDestroy"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}DwhUploadedRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}EmailAddress1"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}EmailAddress2"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ExcludeReason"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ExcludedFromArchive"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ExternalID"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ExternalVersion"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FaxPhone"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FaxPhoneCountry"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FaxPhoneExtension"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}HomePhone"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}HomePhoneCountry"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}HomePhoneExtension"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}INNRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}IdDwh"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}IdRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}InBlackListRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}LastUpdateTime"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}LnrDwhRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}LoadRelatedContacts"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Name"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}NameKanji"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Notes"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}OGRNRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}OPFRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ObfuscatedInternal"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Preferred"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}PreferredCurrency"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}PreferredSettlementCurrency"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}PrimaryAddress"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}PrimaryContactPhoneRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}PrimaryLanguage"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}PrimaryLocale"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}PrimaryMailRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}PrimaryPhone"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}RegionCodeRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}RegistrationAddressRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}RelevanceDateRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ResidentRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}SNILSRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Score"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Subtype"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Tags"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}TaxID"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}TaxStatus"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}TemporaryLastUpdateTime"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}TrustContactRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ValidationLevel"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}VendorNumber"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}VendorType"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}WithholdingRate"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}WorkPhone"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}WorkPhoneCountry"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}WorkPhoneExtension"/>
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
    "accountHolderCount",
    "addressBookUID",
    "archiveDate",
    "archiveFailure",
    "archiveFailureDetails",
    "archivePartition",
    "archiveSchemaInfo",
    "archiveState",
    "autoSync",
    "batchIdRgs",
    "blackListTypeRgs",
    "categoryScores",
    "contactAddresses",
    "correctionAllowed",
    "countryRgs",
    "divisionCodeRgs",
    "doNotDestroy",
    "dwhUploadedRgs",
    "emailAddress1",
    "emailAddress2",
    "excludeReason",
    "excludedFromArchive",
    "externalID",
    "externalVersion",
    "faxPhone",
    "faxPhoneCountry",
    "faxPhoneExtension",
    "homePhone",
    "homePhoneCountry",
    "homePhoneExtension",
    "innRgs",
    "idDwh",
    "idRgs",
    "inBlackListRgs",
    "lastUpdateTime",
    "lnrDwhRgs",
    "loadRelatedContacts",
    "name",
    "nameKanji",
    "notes",
    "ogrnRgs",
    "opfRgs",
    "obfuscatedInternal",
    "preferred",
    "preferredCurrency",
    "preferredSettlementCurrency",
    "primaryAddress",
    "primaryContactPhoneRgs",
    "primaryLanguage",
    "primaryLocale",
    "primaryMailRgs",
    "primaryPhone",
    "regionCodeRgs",
    "registrationAddressRgs",
    "relevanceDateRgs",
    "residentRgs",
    "snilsRgs",
    "score",
    "subtype",
    "tags",
    "taxID",
    "taxStatus",
    "temporaryLastUpdateTime",
    "trustContactRgs",
    "validationLevel",
    "vendorNumber",
    "vendorType",
    "withholdingRate",
    "workPhone",
    "workPhoneCountry",
    "workPhoneExtension"
})
@XmlRootElement(name = "Company", namespace = "http://guidewire.com/pc/exim/import")
public class Company {

    @XmlElement(name = "AccountHolderCount", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected BigInteger accountHolderCount;
    @XmlElement(name = "AddressBookUID", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected AddressBookUID addressBookUID;
    @XmlElement(name = "ArchiveDate", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected ArchiveDate archiveDate;
    @XmlElement(name = "ArchiveFailure", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected ArchiveFailure archiveFailure;
    @XmlElement(name = "ArchiveFailureDetails", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected ArchiveFailureDetails archiveFailureDetails;
    @XmlElement(name = "ArchivePartition", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected ArchivePartition archivePartition;
    @XmlElement(name = "ArchiveSchemaInfo", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected ArchiveSchemaInfo archiveSchemaInfo;
    @XmlElement(name = "ArchiveState", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected ArchiveState archiveState;
    @XmlElement(name = "AutoSync", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected AutoSync autoSync;
    @XmlElement(name = "BatchIdRgs", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected BatchIdRgs batchIdRgs;
    @XmlElement(name = "BlackListTypeRgs", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected BlackListTypeRgs blackListTypeRgs;
    @XmlElement(name = "CategoryScores", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected CategoryScores categoryScores;
    @XmlElement(name = "ContactAddresses", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected ContactAddresses contactAddresses;
    @XmlElement(name = "CorrectionAllowed", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected CorrectionAllowed correctionAllowed;
    @XmlElement(name = "CountryRgs", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected CountryRgs countryRgs;
    @XmlElement(name = "DivisionCodeRgs", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected DivisionCodeRgs divisionCodeRgs;
    @XmlElement(name = "DoNotDestroy", namespace = "http://guidewire.com/pc/exim/import")
    protected boolean doNotDestroy;
    @XmlElement(name = "DwhUploadedRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected boolean dwhUploadedRgs;
    @XmlElement(name = "EmailAddress1", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String emailAddress1;
    @XmlElement(name = "EmailAddress2", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String emailAddress2;
    @XmlElement(name = "ExcludeReason", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected ExcludeReason excludeReason;
    @XmlElement(name = "ExcludedFromArchive", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected ExcludedFromArchive excludedFromArchive;
    @XmlElement(name = "ExternalID", namespace = "http://guidewire.com/pc/exim/import", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String externalID;
    @XmlElement(name = "ExternalVersion", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected BigInteger externalVersion;
    @XmlElement(name = "FaxPhone", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected FaxPhone faxPhone;
    @XmlElement(name = "FaxPhoneCountry", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected FaxPhoneCountry faxPhoneCountry;
    @XmlElement(name = "FaxPhoneExtension", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected FaxPhoneExtension faxPhoneExtension;
    @XmlElement(name = "HomePhone", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected HomePhone homePhone;
    @XmlElement(name = "HomePhoneCountry", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected HomePhoneCountry homePhoneCountry;
    @XmlElement(name = "HomePhoneExtension", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected HomePhoneExtension homePhoneExtension;
    @XmlElement(name = "INNRgs", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String innRgs;
    @XmlElement(name = "IdDwh", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected IdDwh idDwh;
    @XmlElement(name = "IdRgs", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected IdRgs idRgs;
    @XmlElement(name = "InBlackListRgs", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected InBlackListRgs inBlackListRgs;
    @XmlElement(name = "LastUpdateTime", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String lastUpdateTime;
    @XmlElement(name = "LnrDwhRgs", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected LnrDwhRgs lnrDwhRgs;
    @XmlElement(name = "LoadRelatedContacts", namespace = "http://guidewire.com/pc/exim/import")
    protected boolean loadRelatedContacts;
    @XmlElement(name = "Name", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String name;
    @XmlElement(name = "NameKanji", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected NameKanji nameKanji;
    @XmlElement(name = "Notes", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected Notes notes;
    @XmlElement(name = "OGRNRgs", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected OGRNRgs ogrnRgs;
    @XmlElement(name = "OPFRgs", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String opfRgs;
    @XmlElement(name = "ObfuscatedInternal", namespace = "http://guidewire.com/pc/exim/import")
    protected boolean obfuscatedInternal;
    @XmlElement(name = "Preferred", namespace = "http://guidewire.com/pc/exim/import")
    protected boolean preferred;
    @XmlElement(name = "PreferredCurrency", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected PreferredCurrency preferredCurrency;
    @XmlElement(name = "PreferredSettlementCurrency", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected PreferredSettlementCurrency preferredSettlementCurrency;
    @XmlElement(name = "PrimaryAddress", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected PrimaryAddress primaryAddress;
    @XmlElement(name = "PrimaryContactPhoneRgs", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected PrimaryContactPhoneRgs primaryContactPhoneRgs;
    @XmlElement(name = "PrimaryLanguage", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String primaryLanguage;
    @XmlElement(name = "PrimaryLocale", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String primaryLocale;
    @XmlElement(name = "PrimaryMailRgs", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected PrimaryMailRgs primaryMailRgs;
    @XmlElement(name = "PrimaryPhone", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String primaryPhone;
    @XmlElement(name = "RegionCodeRgs", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected RegionCodeRgs regionCodeRgs;
    @XmlElement(name = "RegistrationAddressRgs", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected RegistrationAddressRgs registrationAddressRgs;
    @XmlElement(name = "RelevanceDateRgs", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String relevanceDateRgs;
    @XmlElement(name = "ResidentRgs", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String residentRgs;
    @XmlElement(name = "SNILSRgs", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String snilsRgs;
    @XmlElement(name = "Score", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected Score score;
    @XmlElement(name = "Subtype", namespace = "http://guidewire.com/pc/exim/import", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String subtype;
    @XmlElement(name = "Tags", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected Tags tags;
    @XmlElement(name = "TaxID", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected TaxID taxID;
    @XmlElement(name = "TaxStatus", namespace = "http://guidewire.com/pc/exim/import", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String taxStatus;
    @XmlElement(name = "TemporaryLastUpdateTime", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected TemporaryLastUpdateTime temporaryLastUpdateTime;
    @XmlElement(name = "TrustContactRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected boolean trustContactRgs;
    @XmlElement(name = "ValidationLevel", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String validationLevel;
    @XmlElement(name = "VendorNumber", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected VendorNumber vendorNumber;
    @XmlElement(name = "VendorType", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected VendorType vendorType;
    @XmlElement(name = "WithholdingRate", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected WithholdingRate withholdingRate;
    @XmlElement(name = "WorkPhone", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected WorkPhone workPhone;
    @XmlElement(name = "WorkPhoneCountry", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected WorkPhoneCountry workPhoneCountry;
    @XmlElement(name = "WorkPhoneExtension", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected WorkPhoneExtension workPhoneExtension;
    @XmlAttribute(name = "public-id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String publicId;

    /**
     * Gets the value of the accountHolderCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccountHolderCount() {
        return accountHolderCount;
    }

    /**
     * Sets the value of the accountHolderCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccountHolderCount(BigInteger value) {
        this.accountHolderCount = value;
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
     * Gets the value of the archiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link ArchiveDate }
     *     
     */
    public ArchiveDate getArchiveDate() {
        return archiveDate;
    }

    /**
     * Sets the value of the archiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchiveDate }
     *     
     */
    public void setArchiveDate(ArchiveDate value) {
        this.archiveDate = value;
    }

    /**
     * Gets the value of the archiveFailure property.
     * 
     * @return
     *     possible object is
     *     {@link ArchiveFailure }
     *     
     */
    public ArchiveFailure getArchiveFailure() {
        return archiveFailure;
    }

    /**
     * Sets the value of the archiveFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchiveFailure }
     *     
     */
    public void setArchiveFailure(ArchiveFailure value) {
        this.archiveFailure = value;
    }

    /**
     * Gets the value of the archiveFailureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArchiveFailureDetails }
     *     
     */
    public ArchiveFailureDetails getArchiveFailureDetails() {
        return archiveFailureDetails;
    }

    /**
     * Sets the value of the archiveFailureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchiveFailureDetails }
     *     
     */
    public void setArchiveFailureDetails(ArchiveFailureDetails value) {
        this.archiveFailureDetails = value;
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
     * Gets the value of the archiveSchemaInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArchiveSchemaInfo }
     *     
     */
    public ArchiveSchemaInfo getArchiveSchemaInfo() {
        return archiveSchemaInfo;
    }

    /**
     * Sets the value of the archiveSchemaInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchiveSchemaInfo }
     *     
     */
    public void setArchiveSchemaInfo(ArchiveSchemaInfo value) {
        this.archiveSchemaInfo = value;
    }

    /**
     * Gets the value of the archiveState property.
     * 
     * @return
     *     possible object is
     *     {@link ArchiveState }
     *     
     */
    public ArchiveState getArchiveState() {
        return archiveState;
    }

    /**
     * Sets the value of the archiveState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchiveState }
     *     
     */
    public void setArchiveState(ArchiveState value) {
        this.archiveState = value;
    }

    /**
     * Gets the value of the autoSync property.
     * 
     * @return
     *     possible object is
     *     {@link AutoSync }
     *     
     */
    public AutoSync getAutoSync() {
        return autoSync;
    }

    /**
     * Sets the value of the autoSync property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoSync }
     *     
     */
    public void setAutoSync(AutoSync value) {
        this.autoSync = value;
    }

    /**
     * Gets the value of the batchIdRgs property.
     * 
     * @return
     *     possible object is
     *     {@link BatchIdRgs }
     *     
     */
    public BatchIdRgs getBatchIdRgs() {
        return batchIdRgs;
    }

    /**
     * Sets the value of the batchIdRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchIdRgs }
     *     
     */
    public void setBatchIdRgs(BatchIdRgs value) {
        this.batchIdRgs = value;
    }

    /**
     * Gets the value of the blackListTypeRgs property.
     * 
     * @return
     *     possible object is
     *     {@link BlackListTypeRgs }
     *     
     */
    public BlackListTypeRgs getBlackListTypeRgs() {
        return blackListTypeRgs;
    }

    /**
     * Sets the value of the blackListTypeRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlackListTypeRgs }
     *     
     */
    public void setBlackListTypeRgs(BlackListTypeRgs value) {
        this.blackListTypeRgs = value;
    }

    /**
     * Gets the value of the categoryScores property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryScores }
     *     
     */
    public CategoryScores getCategoryScores() {
        return categoryScores;
    }

    /**
     * Sets the value of the categoryScores property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryScores }
     *     
     */
    public void setCategoryScores(CategoryScores value) {
        this.categoryScores = value;
    }

    /**
     * Gets the value of the contactAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAddresses }
     *     
     */
    public ContactAddresses getContactAddresses() {
        return contactAddresses;
    }

    /**
     * Sets the value of the contactAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAddresses }
     *     
     */
    public void setContactAddresses(ContactAddresses value) {
        this.contactAddresses = value;
    }

    /**
     * Gets the value of the correctionAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectionAllowed }
     *     
     */
    public CorrectionAllowed getCorrectionAllowed() {
        return correctionAllowed;
    }

    /**
     * Sets the value of the correctionAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectionAllowed }
     *     
     */
    public void setCorrectionAllowed(CorrectionAllowed value) {
        this.correctionAllowed = value;
    }

    /**
     * Gets the value of the countryRgs property.
     * 
     * @return
     *     possible object is
     *     {@link CountryRgs }
     *     
     */
    public CountryRgs getCountryRgs() {
        return countryRgs;
    }

    /**
     * Sets the value of the countryRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRgs }
     *     
     */
    public void setCountryRgs(CountryRgs value) {
        this.countryRgs = value;
    }

    /**
     * Gets the value of the divisionCodeRgs property.
     * 
     * @return
     *     possible object is
     *     {@link DivisionCodeRgs }
     *     
     */
    public DivisionCodeRgs getDivisionCodeRgs() {
        return divisionCodeRgs;
    }

    /**
     * Sets the value of the divisionCodeRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DivisionCodeRgs }
     *     
     */
    public void setDivisionCodeRgs(DivisionCodeRgs value) {
        this.divisionCodeRgs = value;
    }

    /**
     * Gets the value of the doNotDestroy property.
     * 
     */
    public boolean isDoNotDestroy() {
        return doNotDestroy;
    }

    /**
     * Sets the value of the doNotDestroy property.
     * 
     */
    public void setDoNotDestroy(boolean value) {
        this.doNotDestroy = value;
    }

    /**
     * Gets the value of the dwhUploadedRgs property.
     * 
     */
    public boolean isDwhUploadedRgs() {
        return dwhUploadedRgs;
    }

    /**
     * Sets the value of the dwhUploadedRgs property.
     * 
     */
    public void setDwhUploadedRgs(boolean value) {
        this.dwhUploadedRgs = value;
    }

    /**
     * Gets the value of the emailAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress1() {
        return emailAddress1;
    }

    /**
     * Sets the value of the emailAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress1(String value) {
        this.emailAddress1 = value;
    }

    /**
     * Gets the value of the emailAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress2() {
        return emailAddress2;
    }

    /**
     * Sets the value of the emailAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress2(String value) {
        this.emailAddress2 = value;
    }

    /**
     * Gets the value of the excludeReason property.
     * 
     * @return
     *     possible object is
     *     {@link ExcludeReason }
     *     
     */
    public ExcludeReason getExcludeReason() {
        return excludeReason;
    }

    /**
     * Sets the value of the excludeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcludeReason }
     *     
     */
    public void setExcludeReason(ExcludeReason value) {
        this.excludeReason = value;
    }

    /**
     * Gets the value of the excludedFromArchive property.
     * 
     * @return
     *     possible object is
     *     {@link ExcludedFromArchive }
     *     
     */
    public ExcludedFromArchive getExcludedFromArchive() {
        return excludedFromArchive;
    }

    /**
     * Sets the value of the excludedFromArchive property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcludedFromArchive }
     *     
     */
    public void setExcludedFromArchive(ExcludedFromArchive value) {
        this.excludedFromArchive = value;
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
     * Gets the value of the externalVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExternalVersion() {
        return externalVersion;
    }

    /**
     * Sets the value of the externalVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExternalVersion(BigInteger value) {
        this.externalVersion = value;
    }

    /**
     * Gets the value of the faxPhone property.
     * 
     * @return
     *     possible object is
     *     {@link FaxPhone }
     *     
     */
    public FaxPhone getFaxPhone() {
        return faxPhone;
    }

    /**
     * Sets the value of the faxPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaxPhone }
     *     
     */
    public void setFaxPhone(FaxPhone value) {
        this.faxPhone = value;
    }

    /**
     * Gets the value of the faxPhoneCountry property.
     * 
     * @return
     *     possible object is
     *     {@link FaxPhoneCountry }
     *     
     */
    public FaxPhoneCountry getFaxPhoneCountry() {
        return faxPhoneCountry;
    }

    /**
     * Sets the value of the faxPhoneCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaxPhoneCountry }
     *     
     */
    public void setFaxPhoneCountry(FaxPhoneCountry value) {
        this.faxPhoneCountry = value;
    }

    /**
     * Gets the value of the faxPhoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link FaxPhoneExtension }
     *     
     */
    public FaxPhoneExtension getFaxPhoneExtension() {
        return faxPhoneExtension;
    }

    /**
     * Sets the value of the faxPhoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaxPhoneExtension }
     *     
     */
    public void setFaxPhoneExtension(FaxPhoneExtension value) {
        this.faxPhoneExtension = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link HomePhone }
     *     
     */
    public HomePhone getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link HomePhone }
     *     
     */
    public void setHomePhone(HomePhone value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the homePhoneCountry property.
     * 
     * @return
     *     possible object is
     *     {@link HomePhoneCountry }
     *     
     */
    public HomePhoneCountry getHomePhoneCountry() {
        return homePhoneCountry;
    }

    /**
     * Sets the value of the homePhoneCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link HomePhoneCountry }
     *     
     */
    public void setHomePhoneCountry(HomePhoneCountry value) {
        this.homePhoneCountry = value;
    }

    /**
     * Gets the value of the homePhoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link HomePhoneExtension }
     *     
     */
    public HomePhoneExtension getHomePhoneExtension() {
        return homePhoneExtension;
    }

    /**
     * Sets the value of the homePhoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link HomePhoneExtension }
     *     
     */
    public void setHomePhoneExtension(HomePhoneExtension value) {
        this.homePhoneExtension = value;
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
     * Gets the value of the idRgs property.
     * 
     * @return
     *     possible object is
     *     {@link IdRgs }
     *     
     */
    public IdRgs getIdRgs() {
        return idRgs;
    }

    /**
     * Sets the value of the idRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdRgs }
     *     
     */
    public void setIdRgs(IdRgs value) {
        this.idRgs = value;
    }

    /**
     * Gets the value of the inBlackListRgs property.
     * 
     * @return
     *     possible object is
     *     {@link InBlackListRgs }
     *     
     */
    public InBlackListRgs getInBlackListRgs() {
        return inBlackListRgs;
    }

    /**
     * Sets the value of the inBlackListRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link InBlackListRgs }
     *     
     */
    public void setInBlackListRgs(InBlackListRgs value) {
        this.inBlackListRgs = value;
    }

    /**
     * Gets the value of the lastUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Sets the value of the lastUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateTime(String value) {
        this.lastUpdateTime = value;
    }

    /**
     * Gets the value of the lnrDwhRgs property.
     * 
     * @return
     *     possible object is
     *     {@link LnrDwhRgs }
     *     
     */
    public LnrDwhRgs getLnrDwhRgs() {
        return lnrDwhRgs;
    }

    /**
     * Sets the value of the lnrDwhRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnrDwhRgs }
     *     
     */
    public void setLnrDwhRgs(LnrDwhRgs value) {
        this.lnrDwhRgs = value;
    }

    /**
     * Gets the value of the loadRelatedContacts property.
     * 
     */
    public boolean isLoadRelatedContacts() {
        return loadRelatedContacts;
    }

    /**
     * Sets the value of the loadRelatedContacts property.
     * 
     */
    public void setLoadRelatedContacts(boolean value) {
        this.loadRelatedContacts = value;
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
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link Notes }
     *     
     */
    public Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notes }
     *     
     */
    public void setNotes(Notes value) {
        this.notes = value;
    }

    /**
     * Gets the value of the ogrnRgs property.
     * 
     * @return
     *     possible object is
     *     {@link OGRNRgs }
     *     
     */
    public OGRNRgs getOGRNRgs() {
        return ogrnRgs;
    }

    /**
     * Sets the value of the ogrnRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OGRNRgs }
     *     
     */
    public void setOGRNRgs(OGRNRgs value) {
        this.ogrnRgs = value;
    }

    /**
     * Gets the value of the opfRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPFRgs() {
        return opfRgs;
    }

    /**
     * Sets the value of the opfRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPFRgs(String value) {
        this.opfRgs = value;
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
     * Gets the value of the preferred property.
     * 
     */
    public boolean isPreferred() {
        return preferred;
    }

    /**
     * Sets the value of the preferred property.
     * 
     */
    public void setPreferred(boolean value) {
        this.preferred = value;
    }

    /**
     * Gets the value of the preferredCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredCurrency }
     *     
     */
    public PreferredCurrency getPreferredCurrency() {
        return preferredCurrency;
    }

    /**
     * Sets the value of the preferredCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredCurrency }
     *     
     */
    public void setPreferredCurrency(PreferredCurrency value) {
        this.preferredCurrency = value;
    }

    /**
     * Gets the value of the preferredSettlementCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredSettlementCurrency }
     *     
     */
    public PreferredSettlementCurrency getPreferredSettlementCurrency() {
        return preferredSettlementCurrency;
    }

    /**
     * Sets the value of the preferredSettlementCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredSettlementCurrency }
     *     
     */
    public void setPreferredSettlementCurrency(PreferredSettlementCurrency value) {
        this.preferredSettlementCurrency = value;
    }

    /**
     * Gets the value of the primaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryAddress }
     *     
     */
    public PrimaryAddress getPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * Sets the value of the primaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryAddress }
     *     
     */
    public void setPrimaryAddress(PrimaryAddress value) {
        this.primaryAddress = value;
    }

    /**
     * Gets the value of the primaryContactPhoneRgs property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryContactPhoneRgs }
     *     
     */
    public PrimaryContactPhoneRgs getPrimaryContactPhoneRgs() {
        return primaryContactPhoneRgs;
    }

    /**
     * Sets the value of the primaryContactPhoneRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryContactPhoneRgs }
     *     
     */
    public void setPrimaryContactPhoneRgs(PrimaryContactPhoneRgs value) {
        this.primaryContactPhoneRgs = value;
    }

    /**
     * Gets the value of the primaryLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLanguage() {
        return primaryLanguage;
    }

    /**
     * Sets the value of the primaryLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLanguage(String value) {
        this.primaryLanguage = value;
    }

    /**
     * Gets the value of the primaryLocale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLocale() {
        return primaryLocale;
    }

    /**
     * Sets the value of the primaryLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLocale(String value) {
        this.primaryLocale = value;
    }

    /**
     * Gets the value of the primaryMailRgs property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryMailRgs }
     *     
     */
    public PrimaryMailRgs getPrimaryMailRgs() {
        return primaryMailRgs;
    }

    /**
     * Sets the value of the primaryMailRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryMailRgs }
     *     
     */
    public void setPrimaryMailRgs(PrimaryMailRgs value) {
        this.primaryMailRgs = value;
    }

    /**
     * Gets the value of the primaryPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPhone() {
        return primaryPhone;
    }

    /**
     * Sets the value of the primaryPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPhone(String value) {
        this.primaryPhone = value;
    }

    /**
     * Gets the value of the regionCodeRgs property.
     * 
     * @return
     *     possible object is
     *     {@link RegionCodeRgs }
     *     
     */
    public RegionCodeRgs getRegionCodeRgs() {
        return regionCodeRgs;
    }

    /**
     * Sets the value of the regionCodeRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionCodeRgs }
     *     
     */
    public void setRegionCodeRgs(RegionCodeRgs value) {
        this.regionCodeRgs = value;
    }

    /**
     * Gets the value of the registrationAddressRgs property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationAddressRgs }
     *     
     */
    public RegistrationAddressRgs getRegistrationAddressRgs() {
        return registrationAddressRgs;
    }

    /**
     * Sets the value of the registrationAddressRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationAddressRgs }
     *     
     */
    public void setRegistrationAddressRgs(RegistrationAddressRgs value) {
        this.registrationAddressRgs = value;
    }

    /**
     * Gets the value of the relevanceDateRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelevanceDateRgs() {
        return relevanceDateRgs;
    }

    /**
     * Sets the value of the relevanceDateRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelevanceDateRgs(String value) {
        this.relevanceDateRgs = value;
    }

    /**
     * Gets the value of the residentRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentRgs() {
        return residentRgs;
    }

    /**
     * Sets the value of the residentRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentRgs(String value) {
        this.residentRgs = value;
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
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link Score }
     *     
     */
    public Score getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link Score }
     *     
     */
    public void setScore(Score value) {
        this.score = value;
    }

    /**
     * Gets the value of the subtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtype() {
        return subtype;
    }

    /**
     * Sets the value of the subtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtype(String value) {
        this.subtype = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link Tags }
     *     
     */
    public Tags getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tags }
     *     
     */
    public void setTags(Tags value) {
        this.tags = value;
    }

    /**
     * Gets the value of the taxID property.
     * 
     * @return
     *     possible object is
     *     {@link TaxID }
     *     
     */
    public TaxID getTaxID() {
        return taxID;
    }

    /**
     * Sets the value of the taxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxID }
     *     
     */
    public void setTaxID(TaxID value) {
        this.taxID = value;
    }

    /**
     * Gets the value of the taxStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxStatus() {
        return taxStatus;
    }

    /**
     * Sets the value of the taxStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxStatus(String value) {
        this.taxStatus = value;
    }

    /**
     * Gets the value of the temporaryLastUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link TemporaryLastUpdateTime }
     *     
     */
    public TemporaryLastUpdateTime getTemporaryLastUpdateTime() {
        return temporaryLastUpdateTime;
    }

    /**
     * Sets the value of the temporaryLastUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporaryLastUpdateTime }
     *     
     */
    public void setTemporaryLastUpdateTime(TemporaryLastUpdateTime value) {
        this.temporaryLastUpdateTime = value;
    }

    /**
     * Gets the value of the trustContactRgs property.
     * 
     */
    public boolean isTrustContactRgs() {
        return trustContactRgs;
    }

    /**
     * Sets the value of the trustContactRgs property.
     * 
     */
    public void setTrustContactRgs(boolean value) {
        this.trustContactRgs = value;
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
     * Gets the value of the vendorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link VendorNumber }
     *     
     */
    public VendorNumber getVendorNumber() {
        return vendorNumber;
    }

    /**
     * Sets the value of the vendorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorNumber }
     *     
     */
    public void setVendorNumber(VendorNumber value) {
        this.vendorNumber = value;
    }

    /**
     * Gets the value of the vendorType property.
     * 
     * @return
     *     possible object is
     *     {@link VendorType }
     *     
     */
    public VendorType getVendorType() {
        return vendorType;
    }

    /**
     * Sets the value of the vendorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorType }
     *     
     */
    public void setVendorType(VendorType value) {
        this.vendorType = value;
    }

    /**
     * Gets the value of the withholdingRate property.
     * 
     * @return
     *     possible object is
     *     {@link WithholdingRate }
     *     
     */
    public WithholdingRate getWithholdingRate() {
        return withholdingRate;
    }

    /**
     * Sets the value of the withholdingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithholdingRate }
     *     
     */
    public void setWithholdingRate(WithholdingRate value) {
        this.withholdingRate = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link WorkPhone }
     *     
     */
    public WorkPhone getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkPhone }
     *     
     */
    public void setWorkPhone(WorkPhone value) {
        this.workPhone = value;
    }

    /**
     * Gets the value of the workPhoneCountry property.
     * 
     * @return
     *     possible object is
     *     {@link WorkPhoneCountry }
     *     
     */
    public WorkPhoneCountry getWorkPhoneCountry() {
        return workPhoneCountry;
    }

    /**
     * Sets the value of the workPhoneCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkPhoneCountry }
     *     
     */
    public void setWorkPhoneCountry(WorkPhoneCountry value) {
        this.workPhoneCountry = value;
    }

    /**
     * Gets the value of the workPhoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link WorkPhoneExtension }
     *     
     */
    public WorkPhoneExtension getWorkPhoneExtension() {
        return workPhoneExtension;
    }

    /**
     * Sets the value of the workPhoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkPhoneExtension }
     *     
     */
    public void setWorkPhoneExtension(WorkPhoneExtension value) {
        this.workPhoneExtension = value;
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
