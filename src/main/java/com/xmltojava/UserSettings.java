
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
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}CancelAlertDismiss"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}EmailOnActAssign"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}LastAccounts"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}LastContacts"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}LastPolicies"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}MaxRecentAccounts"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}MaxRecentContacts"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}MaxRecentPoliciesAndJobs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}PrintMargins"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}PrintPageNums"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}RotateTables"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ShowPrintPreview"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}StartupPage"/>
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
    "cancelAlertDismiss",
    "emailOnActAssign",
    "lastAccounts",
    "lastContacts",
    "lastPolicies",
    "maxRecentAccounts",
    "maxRecentContacts",
    "maxRecentPoliciesAndJobs",
    "printMargins",
    "printPageNums",
    "rotateTables",
    "showPrintPreview",
    "startupPage"
})
@XmlRootElement(name = "UserSettings", namespace = "http://guidewire.com/pc/exim/import")
public class UserSettings {

    @XmlElement(name = "CancelAlertDismiss", namespace = "http://guidewire.com/pc/exim/import")
    protected CancelAlertDismiss cancelAlertDismiss;
    @XmlElement(name = "EmailOnActAssign", namespace = "http://guidewire.com/pc/exim/import")
    protected EmailOnActAssign emailOnActAssign;
    @XmlElement(name = "LastAccounts", namespace = "http://guidewire.com/pc/exim/import")
    protected LastAccounts lastAccounts;
    @XmlElement(name = "LastContacts", namespace = "http://guidewire.com/pc/exim/import")
    protected LastContacts lastContacts;
    @XmlElement(name = "LastPolicies", namespace = "http://guidewire.com/pc/exim/import")
    protected LastPolicies lastPolicies;
    @XmlElement(name = "MaxRecentAccounts", namespace = "http://guidewire.com/pc/exim/import")
    protected MaxRecentAccounts maxRecentAccounts;
    @XmlElement(name = "MaxRecentContacts", namespace = "http://guidewire.com/pc/exim/import")
    protected MaxRecentContacts maxRecentContacts;
    @XmlElement(name = "MaxRecentPoliciesAndJobs", namespace = "http://guidewire.com/pc/exim/import")
    protected MaxRecentPoliciesAndJobs maxRecentPoliciesAndJobs;
    @XmlElement(name = "PrintMargins", namespace = "http://guidewire.com/pc/exim/import")
    protected PrintMargins printMargins;
    @XmlElement(name = "PrintPageNums", namespace = "http://guidewire.com/pc/exim/import")
    protected PrintPageNums printPageNums;
    @XmlElement(name = "RotateTables", namespace = "http://guidewire.com/pc/exim/import")
    protected RotateTables rotateTables;
    @XmlElement(name = "ShowPrintPreview", namespace = "http://guidewire.com/pc/exim/import")
    protected ShowPrintPreview showPrintPreview;
    @XmlElement(name = "StartupPage", namespace = "http://guidewire.com/pc/exim/import")
    protected String startupPage;
    @XmlAttribute(name = "public-id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String publicId;

    /**
     * Gets the value of the cancelAlertDismiss property.
     * 
     * @return
     *     possible object is
     *     {@link CancelAlertDismiss }
     *     
     */
    public CancelAlertDismiss getCancelAlertDismiss() {
        return cancelAlertDismiss;
    }

    /**
     * Sets the value of the cancelAlertDismiss property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelAlertDismiss }
     *     
     */
    public void setCancelAlertDismiss(CancelAlertDismiss value) {
        this.cancelAlertDismiss = value;
    }

    /**
     * Gets the value of the emailOnActAssign property.
     * 
     * @return
     *     possible object is
     *     {@link EmailOnActAssign }
     *     
     */
    public EmailOnActAssign getEmailOnActAssign() {
        return emailOnActAssign;
    }

    /**
     * Sets the value of the emailOnActAssign property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailOnActAssign }
     *     
     */
    public void setEmailOnActAssign(EmailOnActAssign value) {
        this.emailOnActAssign = value;
    }

    /**
     * Gets the value of the lastAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link LastAccounts }
     *     
     */
    public LastAccounts getLastAccounts() {
        return lastAccounts;
    }

    /**
     * Sets the value of the lastAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastAccounts }
     *     
     */
    public void setLastAccounts(LastAccounts value) {
        this.lastAccounts = value;
    }

    /**
     * Gets the value of the lastContacts property.
     * 
     * @return
     *     possible object is
     *     {@link LastContacts }
     *     
     */
    public LastContacts getLastContacts() {
        return lastContacts;
    }

    /**
     * Sets the value of the lastContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastContacts }
     *     
     */
    public void setLastContacts(LastContacts value) {
        this.lastContacts = value;
    }

    /**
     * Gets the value of the lastPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link LastPolicies }
     *     
     */
    public LastPolicies getLastPolicies() {
        return lastPolicies;
    }

    /**
     * Sets the value of the lastPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastPolicies }
     *     
     */
    public void setLastPolicies(LastPolicies value) {
        this.lastPolicies = value;
    }

    /**
     * Gets the value of the maxRecentAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link MaxRecentAccounts }
     *     
     */
    public MaxRecentAccounts getMaxRecentAccounts() {
        return maxRecentAccounts;
    }

    /**
     * Sets the value of the maxRecentAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxRecentAccounts }
     *     
     */
    public void setMaxRecentAccounts(MaxRecentAccounts value) {
        this.maxRecentAccounts = value;
    }

    /**
     * Gets the value of the maxRecentContacts property.
     * 
     * @return
     *     possible object is
     *     {@link MaxRecentContacts }
     *     
     */
    public MaxRecentContacts getMaxRecentContacts() {
        return maxRecentContacts;
    }

    /**
     * Sets the value of the maxRecentContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxRecentContacts }
     *     
     */
    public void setMaxRecentContacts(MaxRecentContacts value) {
        this.maxRecentContacts = value;
    }

    /**
     * Gets the value of the maxRecentPoliciesAndJobs property.
     * 
     * @return
     *     possible object is
     *     {@link MaxRecentPoliciesAndJobs }
     *     
     */
    public MaxRecentPoliciesAndJobs getMaxRecentPoliciesAndJobs() {
        return maxRecentPoliciesAndJobs;
    }

    /**
     * Sets the value of the maxRecentPoliciesAndJobs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxRecentPoliciesAndJobs }
     *     
     */
    public void setMaxRecentPoliciesAndJobs(MaxRecentPoliciesAndJobs value) {
        this.maxRecentPoliciesAndJobs = value;
    }

    /**
     * Gets the value of the printMargins property.
     * 
     * @return
     *     possible object is
     *     {@link PrintMargins }
     *     
     */
    public PrintMargins getPrintMargins() {
        return printMargins;
    }

    /**
     * Sets the value of the printMargins property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintMargins }
     *     
     */
    public void setPrintMargins(PrintMargins value) {
        this.printMargins = value;
    }

    /**
     * Gets the value of the printPageNums property.
     * 
     * @return
     *     possible object is
     *     {@link PrintPageNums }
     *     
     */
    public PrintPageNums getPrintPageNums() {
        return printPageNums;
    }

    /**
     * Sets the value of the printPageNums property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintPageNums }
     *     
     */
    public void setPrintPageNums(PrintPageNums value) {
        this.printPageNums = value;
    }

    /**
     * Gets the value of the rotateTables property.
     * 
     * @return
     *     possible object is
     *     {@link RotateTables }
     *     
     */
    public RotateTables getRotateTables() {
        return rotateTables;
    }

    /**
     * Sets the value of the rotateTables property.
     * 
     * @param value
     *     allowed object is
     *     {@link RotateTables }
     *     
     */
    public void setRotateTables(RotateTables value) {
        this.rotateTables = value;
    }

    /**
     * Gets the value of the showPrintPreview property.
     * 
     * @return
     *     possible object is
     *     {@link ShowPrintPreview }
     *     
     */
    public ShowPrintPreview getShowPrintPreview() {
        return showPrintPreview;
    }

    /**
     * Sets the value of the showPrintPreview property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowPrintPreview }
     *     
     */
    public void setShowPrintPreview(ShowPrintPreview value) {
        this.showPrintPreview = value;
    }

    /**
     * Gets the value of the startupPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartupPage() {
        return startupPage;
    }

    /**
     * Sets the value of the startupPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartupPage(String value) {
        this.startupPage = value;
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
