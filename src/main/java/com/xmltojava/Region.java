
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
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Code"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Name"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Name_L10N_ARRAY"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}RegionZones"/>
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
    "code",
    "name",
    "nameL10NARRAY",
    "regionZones"
})
@XmlRootElement(name = "Region", namespace = "http://guidewire.com/pc/exim/import")
public class Region {

    @XmlElement(name = "Code", namespace = "http://guidewire.com/pc/exim/import")
    protected String code;
    @XmlElement(name = "Name", namespace = "http://guidewire.com/pc/exim/import")
    protected String name;
    @XmlElement(name = "Name_L10N_ARRAY", namespace = "http://guidewire.com/pc/exim/import")
    protected NameL10NARRAY nameL10NARRAY;
    @XmlElement(name = "RegionZones", namespace = "http://guidewire.com/pc/exim/import")
    protected RegionZones regionZones;
    @XmlAttribute(name = "public-id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String publicId;

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
     * Gets the value of the regionZones property.
     * 
     * @return
     *     possible object is
     *     {@link RegionZones }
     *     
     */
    public RegionZones getRegionZones() {
        return regionZones;
    }

    /**
     * Sets the value of the regionZones property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionZones }
     *     
     */
    public void setRegionZones(RegionZones value) {
        this.regionZones = value;
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
