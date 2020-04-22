
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
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}AutoApprovable"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}BlockingPoint"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}CheckingSet"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Code"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Comparator"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}DefaultApprovalBlockingPoint"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}DefaultDurationType"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}DefaultEditBeforeBind"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}DefaultValueAssignmentType"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}DefaultValueOffsetAmount"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}DefaultValueOffsetCurrency"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Description"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Description_L10N_ARRAY"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Name"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Name_L10N_ARRAY"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ValueFormatterType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="public-id" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "autoApprovable",
    "blockingPoint",
    "checkingSet",
    "code",
    "comparator",
    "defaultApprovalBlockingPoint",
    "defaultDurationType",
    "defaultEditBeforeBind",
    "defaultValueAssignmentType",
    "defaultValueOffsetAmount",
    "defaultValueOffsetCurrency",
    "description",
    "descriptionL10NARRAY",
    "name",
    "nameL10NARRAY",
    "valueFormatterType"
})
@XmlRootElement(name = "UWIssueType", namespace = "http://guidewire.com/pc/exim/import")
public class UWIssueType {

    @XmlElement(name = "AutoApprovable", namespace = "http://guidewire.com/pc/exim/import")
    protected boolean autoApprovable;
    @XmlElement(name = "BlockingPoint", namespace = "http://guidewire.com/pc/exim/import", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String blockingPoint;
    @XmlElement(name = "CheckingSet", namespace = "http://guidewire.com/pc/exim/import", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String checkingSet;
    @XmlElement(name = "Code", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String code;
    @XmlElement(name = "Comparator", namespace = "http://guidewire.com/pc/exim/import", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String comparator;
    @XmlElement(name = "DefaultApprovalBlockingPoint", namespace = "http://guidewire.com/pc/exim/import", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String defaultApprovalBlockingPoint;
    @XmlElement(name = "DefaultDurationType", namespace = "http://guidewire.com/pc/exim/import", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String defaultDurationType;
    @XmlElement(name = "DefaultEditBeforeBind", namespace = "http://guidewire.com/pc/exim/import")
    protected boolean defaultEditBeforeBind;
    @XmlElement(name = "DefaultValueAssignmentType", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected DefaultValueAssignmentType defaultValueAssignmentType;
    @XmlElement(name = "DefaultValueOffsetAmount", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected DefaultValueOffsetAmount defaultValueOffsetAmount;
    @XmlElement(name = "DefaultValueOffsetCurrency", namespace = "http://guidewire.com/pc/exim/import", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String defaultValueOffsetCurrency;
    @XmlElement(name = "Description", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String description;
    @XmlElement(name = "Description_L10N_ARRAY", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected DescriptionL10NARRAY descriptionL10NARRAY;
    @XmlElement(name = "Name", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String name;
    @XmlElement(name = "Name_L10N_ARRAY", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected NameL10NARRAY nameL10NARRAY;
    @XmlElement(name = "ValueFormatterType", namespace = "http://guidewire.com/pc/exim/import", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String valueFormatterType;
    @XmlAttribute(name = "public-id", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String publicId;

    /**
     * Gets the value of the autoApprovable property.
     * 
     */
    public boolean isAutoApprovable() {
        return autoApprovable;
    }

    /**
     * Sets the value of the autoApprovable property.
     * 
     */
    public void setAutoApprovable(boolean value) {
        this.autoApprovable = value;
    }

    /**
     * Gets the value of the blockingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockingPoint() {
        return blockingPoint;
    }

    /**
     * Sets the value of the blockingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockingPoint(String value) {
        this.blockingPoint = value;
    }

    /**
     * Gets the value of the checkingSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckingSet() {
        return checkingSet;
    }

    /**
     * Sets the value of the checkingSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckingSet(String value) {
        this.checkingSet = value;
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
     * Gets the value of the comparator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComparator() {
        return comparator;
    }

    /**
     * Sets the value of the comparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComparator(String value) {
        this.comparator = value;
    }

    /**
     * Gets the value of the defaultApprovalBlockingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultApprovalBlockingPoint() {
        return defaultApprovalBlockingPoint;
    }

    /**
     * Sets the value of the defaultApprovalBlockingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultApprovalBlockingPoint(String value) {
        this.defaultApprovalBlockingPoint = value;
    }

    /**
     * Gets the value of the defaultDurationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultDurationType() {
        return defaultDurationType;
    }

    /**
     * Sets the value of the defaultDurationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultDurationType(String value) {
        this.defaultDurationType = value;
    }

    /**
     * Gets the value of the defaultEditBeforeBind property.
     * 
     */
    public boolean isDefaultEditBeforeBind() {
        return defaultEditBeforeBind;
    }

    /**
     * Sets the value of the defaultEditBeforeBind property.
     * 
     */
    public void setDefaultEditBeforeBind(boolean value) {
        this.defaultEditBeforeBind = value;
    }

    /**
     * Gets the value of the defaultValueAssignmentType property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultValueAssignmentType }
     *     
     */
    public DefaultValueAssignmentType getDefaultValueAssignmentType() {
        return defaultValueAssignmentType;
    }

    /**
     * Sets the value of the defaultValueAssignmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultValueAssignmentType }
     *     
     */
    public void setDefaultValueAssignmentType(DefaultValueAssignmentType value) {
        this.defaultValueAssignmentType = value;
    }

    /**
     * Gets the value of the defaultValueOffsetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultValueOffsetAmount }
     *     
     */
    public DefaultValueOffsetAmount getDefaultValueOffsetAmount() {
        return defaultValueOffsetAmount;
    }

    /**
     * Sets the value of the defaultValueOffsetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultValueOffsetAmount }
     *     
     */
    public void setDefaultValueOffsetAmount(DefaultValueOffsetAmount value) {
        this.defaultValueOffsetAmount = value;
    }

    /**
     * Gets the value of the defaultValueOffsetCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValueOffsetCurrency() {
        return defaultValueOffsetCurrency;
    }

    /**
     * Sets the value of the defaultValueOffsetCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValueOffsetCurrency(String value) {
        this.defaultValueOffsetCurrency = value;
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
     * Gets the value of the valueFormatterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueFormatterType() {
        return valueFormatterType;
    }

    /**
     * Sets the value of the valueFormatterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueFormatterType(String value) {
        this.valueFormatterType = value;
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
