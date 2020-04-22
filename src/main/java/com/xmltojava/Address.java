
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
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ActiveAddressBoxRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}AddressBookUID"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}AddressLine1"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}AddressLine1Kanji"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}AddressLine2"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}AddressLine2Kanji"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}AddressLine3"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}AddressType"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ApartmentRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ArchivePartition"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}AreaRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}AreaTypeRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}BatchGeocode"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}BuildingRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}CEDEX"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}CEDEXBureau"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}CheckApartmentRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}CheckBuildingRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}CheckCommunityRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}CheckStreetRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}City"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}CityKanji"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}CityTypeRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}CodeCLADRRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}CommunityRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ConstructionRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ContactIdDwh"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Country"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}CountryRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}County"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Description"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ExternalID"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FIASApartmentRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FIASAreaIdRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FIASAreaRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FIASBuildingRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FIASCityIdRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FIASCityRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FIASCommunityIdRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FIASCommunityRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FIASConstructionRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FIASCountryRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FIASHousingRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FIASLocalityIdRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FIASLocalityRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FIASPostalCodeRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FIASRegionIdRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FIASRegionRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FIASRoomRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FIASStreetIdRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FIASStreetRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FIASStreetTypeRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}GeocodeStatus"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}HousingRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}IdDwh"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}LastUpdateTime"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}LinkedAddress"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}LocalityRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}LocalityTypeRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ObfuscatedInternal"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}PostalCode"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}PostalFromDictRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Referenced"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}RegionRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}RegionTypeRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}RelevanceDateRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}RoomRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}SpatialPoint"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}State"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}StreetRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}StreetTypeRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Subtype"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}TemporaryLastUpdateTime"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ValidUntil"/>
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
    "activeAddressBoxRgs",
    "addressBookUID",
    "addressLine1",
    "addressLine1Kanji",
    "addressLine2",
    "addressLine2Kanji",
    "addressLine3",
    "addressType",
    "apartmentRgs",
    "archivePartition",
    "areaRgs",
    "areaTypeRgs",
    "batchGeocode",
    "buildingRgs",
    "cedex",
    "cedexBureau",
    "checkApartmentRgs",
    "checkBuildingRgs",
    "checkCommunityRgs",
    "checkStreetRgs",
    "city",
    "cityKanji",
    "cityTypeRgs",
    "codeCLADRRgs",
    "communityRgs",
    "constructionRgs",
    "contactIdDwh",
    "country",
    "countryRgs",
    "county",
    "description",
    "externalID",
    "fiasApartmentRgs",
    "fiasAreaIdRgs",
    "fiasAreaRgs",
    "fiasBuildingRgs",
    "fiasCityIdRgs",
    "fiasCityRgs",
    "fiasCommunityIdRgs",
    "fiasCommunityRgs",
    "fiasConstructionRgs",
    "fiasCountryRgs",
    "fiasHousingRgs",
    "fiasLocalityIdRgs",
    "fiasLocalityRgs",
    "fiasPostalCodeRgs",
    "fiasRegionIdRgs",
    "fiasRegionRgs",
    "fiasRoomRgs",
    "fiasStreetIdRgs",
    "fiasStreetRgs",
    "fiasStreetTypeRgs",
    "geocodeStatus",
    "housingRgs",
    "idDwh",
    "lastUpdateTime",
    "linkedAddress",
    "localityRgs",
    "localityTypeRgs",
    "obfuscatedInternal",
    "postalCode",
    "postalFromDictRgs",
    "referenced",
    "regionRgs",
    "regionTypeRgs",
    "relevanceDateRgs",
    "roomRgs",
    "spatialPoint",
    "state",
    "streetRgs",
    "streetTypeRgs",
    "subtype",
    "temporaryLastUpdateTime",
    "validUntil"
})
@XmlRootElement(name = "Address", namespace = "http://guidewire.com/pc/exim/import")
public class Address {

    @XmlElement(name = "ActiveAddressBoxRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected Boolean activeAddressBoxRgs;
    @XmlElement(name = "AddressBookUID", namespace = "http://guidewire.com/pc/exim/import")
    protected AddressBookUID addressBookUID;
    @XmlElement(name = "AddressLine1", namespace = "http://guidewire.com/pc/exim/import")
    protected String addressLine1;
    @XmlElement(name = "AddressLine1Kanji", namespace = "http://guidewire.com/pc/exim/import")
    protected AddressLine1Kanji addressLine1Kanji;
    @XmlElement(name = "AddressLine2", namespace = "http://guidewire.com/pc/exim/import")
    protected AddressLine2 addressLine2;
    @XmlElement(name = "AddressLine2Kanji", namespace = "http://guidewire.com/pc/exim/import")
    protected AddressLine2Kanji addressLine2Kanji;
    @XmlElement(name = "AddressLine3", namespace = "http://guidewire.com/pc/exim/import")
    protected AddressLine3 addressLine3;
    @XmlElement(name = "AddressType", namespace = "http://guidewire.com/pc/exim/import")
    protected String addressType;
    @XmlElement(name = "ApartmentRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected ApartmentRgs apartmentRgs;
    @XmlElement(name = "ArchivePartition", namespace = "http://guidewire.com/pc/exim/import")
    protected ArchivePartition archivePartition;
    @XmlElement(name = "AreaRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected AreaRgs areaRgs;
    @XmlElement(name = "AreaTypeRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected AreaTypeRgs areaTypeRgs;
    @XmlElement(name = "BatchGeocode", namespace = "http://guidewire.com/pc/exim/import")
    protected Boolean batchGeocode;
    @XmlElement(name = "BuildingRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected BuildingRgs buildingRgs;
    @XmlElement(name = "CEDEX", namespace = "http://guidewire.com/pc/exim/import")
    protected CEDEX cedex;
    @XmlElement(name = "CEDEXBureau", namespace = "http://guidewire.com/pc/exim/import")
    protected CEDEXBureau cedexBureau;
    @XmlElement(name = "CheckApartmentRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected CheckApartmentRgs checkApartmentRgs;
    @XmlElement(name = "CheckBuildingRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected CheckBuildingRgs checkBuildingRgs;
    @XmlElement(name = "CheckCommunityRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected CheckCommunityRgs checkCommunityRgs;
    @XmlElement(name = "CheckStreetRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected CheckStreetRgs checkStreetRgs;
    @XmlElement(name = "City", namespace = "http://guidewire.com/pc/exim/import")
    protected String city;
    @XmlElement(name = "CityKanji", namespace = "http://guidewire.com/pc/exim/import")
    protected CityKanji cityKanji;
    @XmlElement(name = "CityTypeRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected CityTypeRgs cityTypeRgs;
    @XmlElement(name = "CodeCLADRRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected CodeCLADRRgs codeCLADRRgs;
    @XmlElement(name = "CommunityRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected CommunityRgs communityRgs;
    @XmlElement(name = "ConstructionRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected ConstructionRgs constructionRgs;
    @XmlElement(name = "ContactIdDwh", namespace = "http://guidewire.com/pc/exim/import")
    protected ContactIdDwh contactIdDwh;
    @XmlElement(name = "Country", namespace = "http://guidewire.com/pc/exim/import")
    protected String country;
    @XmlElement(name = "CountryRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected CountryRgs countryRgs;
    @XmlElement(name = "County", namespace = "http://guidewire.com/pc/exim/import")
    protected County county;
    @XmlElement(name = "Description", namespace = "http://guidewire.com/pc/exim/import")
    protected String description;
    @XmlElement(name = "ExternalID", namespace = "http://guidewire.com/pc/exim/import")
    @XmlSchemaType(name = "anyURI")
    protected String externalID;
    @XmlElement(name = "FIASApartmentRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected FIASApartmentRgs fiasApartmentRgs;
    @XmlElement(name = "FIASAreaIdRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected FIASAreaIdRgs fiasAreaIdRgs;
    @XmlElement(name = "FIASAreaRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected FIASAreaRgs fiasAreaRgs;
    @XmlElement(name = "FIASBuildingRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected FIASBuildingRgs fiasBuildingRgs;
    @XmlElement(name = "FIASCityIdRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected FIASCityIdRgs fiasCityIdRgs;
    @XmlElement(name = "FIASCityRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected FIASCityRgs fiasCityRgs;
    @XmlElement(name = "FIASCommunityIdRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected FIASCommunityIdRgs fiasCommunityIdRgs;
    @XmlElement(name = "FIASCommunityRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected FIASCommunityRgs fiasCommunityRgs;
    @XmlElement(name = "FIASConstructionRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected FIASConstructionRgs fiasConstructionRgs;
    @XmlElement(name = "FIASCountryRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected FIASCountryRgs fiasCountryRgs;
    @XmlElement(name = "FIASHousingRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected FIASHousingRgs fiasHousingRgs;
    @XmlElement(name = "FIASLocalityIdRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected FIASLocalityIdRgs fiasLocalityIdRgs;
    @XmlElement(name = "FIASLocalityRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected FIASLocalityRgs fiasLocalityRgs;
    @XmlElement(name = "FIASPostalCodeRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected FIASPostalCodeRgs fiasPostalCodeRgs;
    @XmlElement(name = "FIASRegionIdRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected FIASRegionIdRgs fiasRegionIdRgs;
    @XmlElement(name = "FIASRegionRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected FIASRegionRgs fiasRegionRgs;
    @XmlElement(name = "FIASRoomRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected FIASRoomRgs fiasRoomRgs;
    @XmlElement(name = "FIASStreetIdRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected FIASStreetIdRgs fiasStreetIdRgs;
    @XmlElement(name = "FIASStreetRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected FIASStreetRgs fiasStreetRgs;
    @XmlElement(name = "FIASStreetTypeRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected FIASStreetTypeRgs fiasStreetTypeRgs;
    @XmlElement(name = "GeocodeStatus", namespace = "http://guidewire.com/pc/exim/import")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String geocodeStatus;
    @XmlElement(name = "HousingRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected HousingRgs housingRgs;
    @XmlElement(name = "IdDwh", namespace = "http://guidewire.com/pc/exim/import")
    protected IdDwh idDwh;
    @XmlElement(name = "LastUpdateTime", namespace = "http://guidewire.com/pc/exim/import")
    protected String lastUpdateTime;
    @XmlElement(name = "LinkedAddress", namespace = "http://guidewire.com/pc/exim/import")
    protected LinkedAddress linkedAddress;
    @XmlElement(name = "LocalityRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected LocalityRgs localityRgs;
    @XmlElement(name = "LocalityTypeRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected LocalityTypeRgs localityTypeRgs;
    @XmlElement(name = "ObfuscatedInternal", namespace = "http://guidewire.com/pc/exim/import")
    protected Boolean obfuscatedInternal;
    @XmlElement(name = "PostalCode", namespace = "http://guidewire.com/pc/exim/import")
    protected PostalCode postalCode;
    @XmlElement(name = "PostalFromDictRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected PostalFromDictRgs postalFromDictRgs;
    @XmlElement(name = "Referenced", namespace = "http://guidewire.com/pc/exim/import")
    protected Boolean referenced;
    @XmlElement(name = "RegionRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected RegionRgs regionRgs;
    @XmlElement(name = "RegionTypeRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected RegionTypeRgs regionTypeRgs;
    @XmlElement(name = "RelevanceDateRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected String relevanceDateRgs;
    @XmlElement(name = "RoomRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected RoomRgs roomRgs;
    @XmlElement(name = "SpatialPoint", namespace = "http://guidewire.com/pc/exim/import")
    protected SpatialPoint spatialPoint;
    @XmlElement(name = "State", namespace = "http://guidewire.com/pc/exim/import")
    protected State state;
    @XmlElement(name = "StreetRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected StreetRgs streetRgs;
    @XmlElement(name = "StreetTypeRgs", namespace = "http://guidewire.com/pc/exim/import")
    protected StreetTypeRgs streetTypeRgs;
    @XmlElement(name = "Subtype", namespace = "http://guidewire.com/pc/exim/import")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String subtype;
    @XmlElement(name = "TemporaryLastUpdateTime", namespace = "http://guidewire.com/pc/exim/import")
    protected TemporaryLastUpdateTime temporaryLastUpdateTime;
    @XmlElement(name = "ValidUntil", namespace = "http://guidewire.com/pc/exim/import")
    protected ValidUntil validUntil;
    @XmlAttribute(name = "public-id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String publicId;

    /**
     * Gets the value of the activeAddressBoxRgs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveAddressBoxRgs() {
        return activeAddressBoxRgs;
    }

    /**
     * Sets the value of the activeAddressBoxRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveAddressBoxRgs(Boolean value) {
        this.activeAddressBoxRgs = value;
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
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine1Kanji property.
     * 
     * @return
     *     possible object is
     *     {@link AddressLine1Kanji }
     *     
     */
    public AddressLine1Kanji getAddressLine1Kanji() {
        return addressLine1Kanji;
    }

    /**
     * Sets the value of the addressLine1Kanji property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressLine1Kanji }
     *     
     */
    public void setAddressLine1Kanji(AddressLine1Kanji value) {
        this.addressLine1Kanji = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link AddressLine2 }
     *     
     */
    public AddressLine2 getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressLine2 }
     *     
     */
    public void setAddressLine2(AddressLine2 value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the addressLine2Kanji property.
     * 
     * @return
     *     possible object is
     *     {@link AddressLine2Kanji }
     *     
     */
    public AddressLine2Kanji getAddressLine2Kanji() {
        return addressLine2Kanji;
    }

    /**
     * Sets the value of the addressLine2Kanji property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressLine2Kanji }
     *     
     */
    public void setAddressLine2Kanji(AddressLine2Kanji value) {
        this.addressLine2Kanji = value;
    }

    /**
     * Gets the value of the addressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link AddressLine3 }
     *     
     */
    public AddressLine3 getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressLine3 }
     *     
     */
    public void setAddressLine3(AddressLine3 value) {
        this.addressLine3 = value;
    }

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the apartmentRgs property.
     * 
     * @return
     *     possible object is
     *     {@link ApartmentRgs }
     *     
     */
    public ApartmentRgs getApartmentRgs() {
        return apartmentRgs;
    }

    /**
     * Sets the value of the apartmentRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApartmentRgs }
     *     
     */
    public void setApartmentRgs(ApartmentRgs value) {
        this.apartmentRgs = value;
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
     * Gets the value of the areaRgs property.
     * 
     * @return
     *     possible object is
     *     {@link AreaRgs }
     *     
     */
    public AreaRgs getAreaRgs() {
        return areaRgs;
    }

    /**
     * Sets the value of the areaRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaRgs }
     *     
     */
    public void setAreaRgs(AreaRgs value) {
        this.areaRgs = value;
    }

    /**
     * Gets the value of the areaTypeRgs property.
     * 
     * @return
     *     possible object is
     *     {@link AreaTypeRgs }
     *     
     */
    public AreaTypeRgs getAreaTypeRgs() {
        return areaTypeRgs;
    }

    /**
     * Sets the value of the areaTypeRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaTypeRgs }
     *     
     */
    public void setAreaTypeRgs(AreaTypeRgs value) {
        this.areaTypeRgs = value;
    }

    /**
     * Gets the value of the batchGeocode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBatchGeocode() {
        return batchGeocode;
    }

    /**
     * Sets the value of the batchGeocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBatchGeocode(Boolean value) {
        this.batchGeocode = value;
    }

    /**
     * Gets the value of the buildingRgs property.
     * 
     * @return
     *     possible object is
     *     {@link BuildingRgs }
     *     
     */
    public BuildingRgs getBuildingRgs() {
        return buildingRgs;
    }

    /**
     * Sets the value of the buildingRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingRgs }
     *     
     */
    public void setBuildingRgs(BuildingRgs value) {
        this.buildingRgs = value;
    }

    /**
     * Gets the value of the cedex property.
     * 
     * @return
     *     possible object is
     *     {@link CEDEX }
     *     
     */
    public CEDEX getCEDEX() {
        return cedex;
    }

    /**
     * Sets the value of the cedex property.
     * 
     * @param value
     *     allowed object is
     *     {@link CEDEX }
     *     
     */
    public void setCEDEX(CEDEX value) {
        this.cedex = value;
    }

    /**
     * Gets the value of the cedexBureau property.
     * 
     * @return
     *     possible object is
     *     {@link CEDEXBureau }
     *     
     */
    public CEDEXBureau getCEDEXBureau() {
        return cedexBureau;
    }

    /**
     * Sets the value of the cedexBureau property.
     * 
     * @param value
     *     allowed object is
     *     {@link CEDEXBureau }
     *     
     */
    public void setCEDEXBureau(CEDEXBureau value) {
        this.cedexBureau = value;
    }

    /**
     * Gets the value of the checkApartmentRgs property.
     * 
     * @return
     *     possible object is
     *     {@link CheckApartmentRgs }
     *     
     */
    public CheckApartmentRgs getCheckApartmentRgs() {
        return checkApartmentRgs;
    }

    /**
     * Sets the value of the checkApartmentRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckApartmentRgs }
     *     
     */
    public void setCheckApartmentRgs(CheckApartmentRgs value) {
        this.checkApartmentRgs = value;
    }

    /**
     * Gets the value of the checkBuildingRgs property.
     * 
     * @return
     *     possible object is
     *     {@link CheckBuildingRgs }
     *     
     */
    public CheckBuildingRgs getCheckBuildingRgs() {
        return checkBuildingRgs;
    }

    /**
     * Sets the value of the checkBuildingRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckBuildingRgs }
     *     
     */
    public void setCheckBuildingRgs(CheckBuildingRgs value) {
        this.checkBuildingRgs = value;
    }

    /**
     * Gets the value of the checkCommunityRgs property.
     * 
     * @return
     *     possible object is
     *     {@link CheckCommunityRgs }
     *     
     */
    public CheckCommunityRgs getCheckCommunityRgs() {
        return checkCommunityRgs;
    }

    /**
     * Sets the value of the checkCommunityRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckCommunityRgs }
     *     
     */
    public void setCheckCommunityRgs(CheckCommunityRgs value) {
        this.checkCommunityRgs = value;
    }

    /**
     * Gets the value of the checkStreetRgs property.
     * 
     * @return
     *     possible object is
     *     {@link CheckStreetRgs }
     *     
     */
    public CheckStreetRgs getCheckStreetRgs() {
        return checkStreetRgs;
    }

    /**
     * Sets the value of the checkStreetRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckStreetRgs }
     *     
     */
    public void setCheckStreetRgs(CheckStreetRgs value) {
        this.checkStreetRgs = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the cityKanji property.
     * 
     * @return
     *     possible object is
     *     {@link CityKanji }
     *     
     */
    public CityKanji getCityKanji() {
        return cityKanji;
    }

    /**
     * Sets the value of the cityKanji property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityKanji }
     *     
     */
    public void setCityKanji(CityKanji value) {
        this.cityKanji = value;
    }

    /**
     * Gets the value of the cityTypeRgs property.
     * 
     * @return
     *     possible object is
     *     {@link CityTypeRgs }
     *     
     */
    public CityTypeRgs getCityTypeRgs() {
        return cityTypeRgs;
    }

    /**
     * Sets the value of the cityTypeRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityTypeRgs }
     *     
     */
    public void setCityTypeRgs(CityTypeRgs value) {
        this.cityTypeRgs = value;
    }

    /**
     * Gets the value of the codeCLADRRgs property.
     * 
     * @return
     *     possible object is
     *     {@link CodeCLADRRgs }
     *     
     */
    public CodeCLADRRgs getCodeCLADRRgs() {
        return codeCLADRRgs;
    }

    /**
     * Sets the value of the codeCLADRRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeCLADRRgs }
     *     
     */
    public void setCodeCLADRRgs(CodeCLADRRgs value) {
        this.codeCLADRRgs = value;
    }

    /**
     * Gets the value of the communityRgs property.
     * 
     * @return
     *     possible object is
     *     {@link CommunityRgs }
     *     
     */
    public CommunityRgs getCommunityRgs() {
        return communityRgs;
    }

    /**
     * Sets the value of the communityRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunityRgs }
     *     
     */
    public void setCommunityRgs(CommunityRgs value) {
        this.communityRgs = value;
    }

    /**
     * Gets the value of the constructionRgs property.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionRgs }
     *     
     */
    public ConstructionRgs getConstructionRgs() {
        return constructionRgs;
    }

    /**
     * Sets the value of the constructionRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionRgs }
     *     
     */
    public void setConstructionRgs(ConstructionRgs value) {
        this.constructionRgs = value;
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
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
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
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link County }
     *     
     */
    public County getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link County }
     *     
     */
    public void setCounty(County value) {
        this.county = value;
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
     * Gets the value of the fiasApartmentRgs property.
     * 
     * @return
     *     possible object is
     *     {@link FIASApartmentRgs }
     *     
     */
    public FIASApartmentRgs getFIASApartmentRgs() {
        return fiasApartmentRgs;
    }

    /**
     * Sets the value of the fiasApartmentRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIASApartmentRgs }
     *     
     */
    public void setFIASApartmentRgs(FIASApartmentRgs value) {
        this.fiasApartmentRgs = value;
    }

    /**
     * Gets the value of the fiasAreaIdRgs property.
     * 
     * @return
     *     possible object is
     *     {@link FIASAreaIdRgs }
     *     
     */
    public FIASAreaIdRgs getFIASAreaIdRgs() {
        return fiasAreaIdRgs;
    }

    /**
     * Sets the value of the fiasAreaIdRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIASAreaIdRgs }
     *     
     */
    public void setFIASAreaIdRgs(FIASAreaIdRgs value) {
        this.fiasAreaIdRgs = value;
    }

    /**
     * Gets the value of the fiasAreaRgs property.
     * 
     * @return
     *     possible object is
     *     {@link FIASAreaRgs }
     *     
     */
    public FIASAreaRgs getFIASAreaRgs() {
        return fiasAreaRgs;
    }

    /**
     * Sets the value of the fiasAreaRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIASAreaRgs }
     *     
     */
    public void setFIASAreaRgs(FIASAreaRgs value) {
        this.fiasAreaRgs = value;
    }

    /**
     * Gets the value of the fiasBuildingRgs property.
     * 
     * @return
     *     possible object is
     *     {@link FIASBuildingRgs }
     *     
     */
    public FIASBuildingRgs getFIASBuildingRgs() {
        return fiasBuildingRgs;
    }

    /**
     * Sets the value of the fiasBuildingRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIASBuildingRgs }
     *     
     */
    public void setFIASBuildingRgs(FIASBuildingRgs value) {
        this.fiasBuildingRgs = value;
    }

    /**
     * Gets the value of the fiasCityIdRgs property.
     * 
     * @return
     *     possible object is
     *     {@link FIASCityIdRgs }
     *     
     */
    public FIASCityIdRgs getFIASCityIdRgs() {
        return fiasCityIdRgs;
    }

    /**
     * Sets the value of the fiasCityIdRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIASCityIdRgs }
     *     
     */
    public void setFIASCityIdRgs(FIASCityIdRgs value) {
        this.fiasCityIdRgs = value;
    }

    /**
     * Gets the value of the fiasCityRgs property.
     * 
     * @return
     *     possible object is
     *     {@link FIASCityRgs }
     *     
     */
    public FIASCityRgs getFIASCityRgs() {
        return fiasCityRgs;
    }

    /**
     * Sets the value of the fiasCityRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIASCityRgs }
     *     
     */
    public void setFIASCityRgs(FIASCityRgs value) {
        this.fiasCityRgs = value;
    }

    /**
     * Gets the value of the fiasCommunityIdRgs property.
     * 
     * @return
     *     possible object is
     *     {@link FIASCommunityIdRgs }
     *     
     */
    public FIASCommunityIdRgs getFIASCommunityIdRgs() {
        return fiasCommunityIdRgs;
    }

    /**
     * Sets the value of the fiasCommunityIdRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIASCommunityIdRgs }
     *     
     */
    public void setFIASCommunityIdRgs(FIASCommunityIdRgs value) {
        this.fiasCommunityIdRgs = value;
    }

    /**
     * Gets the value of the fiasCommunityRgs property.
     * 
     * @return
     *     possible object is
     *     {@link FIASCommunityRgs }
     *     
     */
    public FIASCommunityRgs getFIASCommunityRgs() {
        return fiasCommunityRgs;
    }

    /**
     * Sets the value of the fiasCommunityRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIASCommunityRgs }
     *     
     */
    public void setFIASCommunityRgs(FIASCommunityRgs value) {
        this.fiasCommunityRgs = value;
    }

    /**
     * Gets the value of the fiasConstructionRgs property.
     * 
     * @return
     *     possible object is
     *     {@link FIASConstructionRgs }
     *     
     */
    public FIASConstructionRgs getFIASConstructionRgs() {
        return fiasConstructionRgs;
    }

    /**
     * Sets the value of the fiasConstructionRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIASConstructionRgs }
     *     
     */
    public void setFIASConstructionRgs(FIASConstructionRgs value) {
        this.fiasConstructionRgs = value;
    }

    /**
     * Gets the value of the fiasCountryRgs property.
     * 
     * @return
     *     possible object is
     *     {@link FIASCountryRgs }
     *     
     */
    public FIASCountryRgs getFIASCountryRgs() {
        return fiasCountryRgs;
    }

    /**
     * Sets the value of the fiasCountryRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIASCountryRgs }
     *     
     */
    public void setFIASCountryRgs(FIASCountryRgs value) {
        this.fiasCountryRgs = value;
    }

    /**
     * Gets the value of the fiasHousingRgs property.
     * 
     * @return
     *     possible object is
     *     {@link FIASHousingRgs }
     *     
     */
    public FIASHousingRgs getFIASHousingRgs() {
        return fiasHousingRgs;
    }

    /**
     * Sets the value of the fiasHousingRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIASHousingRgs }
     *     
     */
    public void setFIASHousingRgs(FIASHousingRgs value) {
        this.fiasHousingRgs = value;
    }

    /**
     * Gets the value of the fiasLocalityIdRgs property.
     * 
     * @return
     *     possible object is
     *     {@link FIASLocalityIdRgs }
     *     
     */
    public FIASLocalityIdRgs getFIASLocalityIdRgs() {
        return fiasLocalityIdRgs;
    }

    /**
     * Sets the value of the fiasLocalityIdRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIASLocalityIdRgs }
     *     
     */
    public void setFIASLocalityIdRgs(FIASLocalityIdRgs value) {
        this.fiasLocalityIdRgs = value;
    }

    /**
     * Gets the value of the fiasLocalityRgs property.
     * 
     * @return
     *     possible object is
     *     {@link FIASLocalityRgs }
     *     
     */
    public FIASLocalityRgs getFIASLocalityRgs() {
        return fiasLocalityRgs;
    }

    /**
     * Sets the value of the fiasLocalityRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIASLocalityRgs }
     *     
     */
    public void setFIASLocalityRgs(FIASLocalityRgs value) {
        this.fiasLocalityRgs = value;
    }

    /**
     * Gets the value of the fiasPostalCodeRgs property.
     * 
     * @return
     *     possible object is
     *     {@link FIASPostalCodeRgs }
     *     
     */
    public FIASPostalCodeRgs getFIASPostalCodeRgs() {
        return fiasPostalCodeRgs;
    }

    /**
     * Sets the value of the fiasPostalCodeRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIASPostalCodeRgs }
     *     
     */
    public void setFIASPostalCodeRgs(FIASPostalCodeRgs value) {
        this.fiasPostalCodeRgs = value;
    }

    /**
     * Gets the value of the fiasRegionIdRgs property.
     * 
     * @return
     *     possible object is
     *     {@link FIASRegionIdRgs }
     *     
     */
    public FIASRegionIdRgs getFIASRegionIdRgs() {
        return fiasRegionIdRgs;
    }

    /**
     * Sets the value of the fiasRegionIdRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIASRegionIdRgs }
     *     
     */
    public void setFIASRegionIdRgs(FIASRegionIdRgs value) {
        this.fiasRegionIdRgs = value;
    }

    /**
     * Gets the value of the fiasRegionRgs property.
     * 
     * @return
     *     possible object is
     *     {@link FIASRegionRgs }
     *     
     */
    public FIASRegionRgs getFIASRegionRgs() {
        return fiasRegionRgs;
    }

    /**
     * Sets the value of the fiasRegionRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIASRegionRgs }
     *     
     */
    public void setFIASRegionRgs(FIASRegionRgs value) {
        this.fiasRegionRgs = value;
    }

    /**
     * Gets the value of the fiasRoomRgs property.
     * 
     * @return
     *     possible object is
     *     {@link FIASRoomRgs }
     *     
     */
    public FIASRoomRgs getFIASRoomRgs() {
        return fiasRoomRgs;
    }

    /**
     * Sets the value of the fiasRoomRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIASRoomRgs }
     *     
     */
    public void setFIASRoomRgs(FIASRoomRgs value) {
        this.fiasRoomRgs = value;
    }

    /**
     * Gets the value of the fiasStreetIdRgs property.
     * 
     * @return
     *     possible object is
     *     {@link FIASStreetIdRgs }
     *     
     */
    public FIASStreetIdRgs getFIASStreetIdRgs() {
        return fiasStreetIdRgs;
    }

    /**
     * Sets the value of the fiasStreetIdRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIASStreetIdRgs }
     *     
     */
    public void setFIASStreetIdRgs(FIASStreetIdRgs value) {
        this.fiasStreetIdRgs = value;
    }

    /**
     * Gets the value of the fiasStreetRgs property.
     * 
     * @return
     *     possible object is
     *     {@link FIASStreetRgs }
     *     
     */
    public FIASStreetRgs getFIASStreetRgs() {
        return fiasStreetRgs;
    }

    /**
     * Sets the value of the fiasStreetRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIASStreetRgs }
     *     
     */
    public void setFIASStreetRgs(FIASStreetRgs value) {
        this.fiasStreetRgs = value;
    }

    /**
     * Gets the value of the fiasStreetTypeRgs property.
     * 
     * @return
     *     possible object is
     *     {@link FIASStreetTypeRgs }
     *     
     */
    public FIASStreetTypeRgs getFIASStreetTypeRgs() {
        return fiasStreetTypeRgs;
    }

    /**
     * Sets the value of the fiasStreetTypeRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIASStreetTypeRgs }
     *     
     */
    public void setFIASStreetTypeRgs(FIASStreetTypeRgs value) {
        this.fiasStreetTypeRgs = value;
    }

    /**
     * Gets the value of the geocodeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeocodeStatus() {
        return geocodeStatus;
    }

    /**
     * Sets the value of the geocodeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeocodeStatus(String value) {
        this.geocodeStatus = value;
    }

    /**
     * Gets the value of the housingRgs property.
     * 
     * @return
     *     possible object is
     *     {@link HousingRgs }
     *     
     */
    public HousingRgs getHousingRgs() {
        return housingRgs;
    }

    /**
     * Sets the value of the housingRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link HousingRgs }
     *     
     */
    public void setHousingRgs(HousingRgs value) {
        this.housingRgs = value;
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
     * Gets the value of the linkedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link LinkedAddress }
     *     
     */
    public LinkedAddress getLinkedAddress() {
        return linkedAddress;
    }

    /**
     * Sets the value of the linkedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedAddress }
     *     
     */
    public void setLinkedAddress(LinkedAddress value) {
        this.linkedAddress = value;
    }

    /**
     * Gets the value of the localityRgs property.
     * 
     * @return
     *     possible object is
     *     {@link LocalityRgs }
     *     
     */
    public LocalityRgs getLocalityRgs() {
        return localityRgs;
    }

    /**
     * Sets the value of the localityRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalityRgs }
     *     
     */
    public void setLocalityRgs(LocalityRgs value) {
        this.localityRgs = value;
    }

    /**
     * Gets the value of the localityTypeRgs property.
     * 
     * @return
     *     possible object is
     *     {@link LocalityTypeRgs }
     *     
     */
    public LocalityTypeRgs getLocalityTypeRgs() {
        return localityTypeRgs;
    }

    /**
     * Sets the value of the localityTypeRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalityTypeRgs }
     *     
     */
    public void setLocalityTypeRgs(LocalityTypeRgs value) {
        this.localityTypeRgs = value;
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
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link PostalCode }
     *     
     */
    public PostalCode getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalCode }
     *     
     */
    public void setPostalCode(PostalCode value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the postalFromDictRgs property.
     * 
     * @return
     *     possible object is
     *     {@link PostalFromDictRgs }
     *     
     */
    public PostalFromDictRgs getPostalFromDictRgs() {
        return postalFromDictRgs;
    }

    /**
     * Sets the value of the postalFromDictRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalFromDictRgs }
     *     
     */
    public void setPostalFromDictRgs(PostalFromDictRgs value) {
        this.postalFromDictRgs = value;
    }

    /**
     * Gets the value of the referenced property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReferenced() {
        return referenced;
    }

    /**
     * Sets the value of the referenced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReferenced(Boolean value) {
        this.referenced = value;
    }

    /**
     * Gets the value of the regionRgs property.
     * 
     * @return
     *     possible object is
     *     {@link RegionRgs }
     *     
     */
    public RegionRgs getRegionRgs() {
        return regionRgs;
    }

    /**
     * Sets the value of the regionRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionRgs }
     *     
     */
    public void setRegionRgs(RegionRgs value) {
        this.regionRgs = value;
    }

    /**
     * Gets the value of the regionTypeRgs property.
     * 
     * @return
     *     possible object is
     *     {@link RegionTypeRgs }
     *     
     */
    public RegionTypeRgs getRegionTypeRgs() {
        return regionTypeRgs;
    }

    /**
     * Sets the value of the regionTypeRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionTypeRgs }
     *     
     */
    public void setRegionTypeRgs(RegionTypeRgs value) {
        this.regionTypeRgs = value;
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
     * Gets the value of the roomRgs property.
     * 
     * @return
     *     possible object is
     *     {@link RoomRgs }
     *     
     */
    public RoomRgs getRoomRgs() {
        return roomRgs;
    }

    /**
     * Sets the value of the roomRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomRgs }
     *     
     */
    public void setRoomRgs(RoomRgs value) {
        this.roomRgs = value;
    }

    /**
     * Gets the value of the spatialPoint property.
     * 
     * @return
     *     possible object is
     *     {@link SpatialPoint }
     *     
     */
    public SpatialPoint getSpatialPoint() {
        return spatialPoint;
    }

    /**
     * Sets the value of the spatialPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialPoint }
     *     
     */
    public void setSpatialPoint(SpatialPoint value) {
        this.spatialPoint = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link State }
     *     
     */
    public State getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link State }
     *     
     */
    public void setState(State value) {
        this.state = value;
    }

    /**
     * Gets the value of the streetRgs property.
     * 
     * @return
     *     possible object is
     *     {@link StreetRgs }
     *     
     */
    public StreetRgs getStreetRgs() {
        return streetRgs;
    }

    /**
     * Sets the value of the streetRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetRgs }
     *     
     */
    public void setStreetRgs(StreetRgs value) {
        this.streetRgs = value;
    }

    /**
     * Gets the value of the streetTypeRgs property.
     * 
     * @return
     *     possible object is
     *     {@link StreetTypeRgs }
     *     
     */
    public StreetTypeRgs getStreetTypeRgs() {
        return streetTypeRgs;
    }

    /**
     * Sets the value of the streetTypeRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetTypeRgs }
     *     
     */
    public void setStreetTypeRgs(StreetTypeRgs value) {
        this.streetTypeRgs = value;
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
     * Gets the value of the validUntil property.
     * 
     * @return
     *     possible object is
     *     {@link ValidUntil }
     *     
     */
    public ValidUntil getValidUntil() {
        return validUntil;
    }

    /**
     * Sets the value of the validUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidUntil }
     *     
     */
    public void setValidUntil(ValidUntil value) {
        this.validUntil = value;
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
