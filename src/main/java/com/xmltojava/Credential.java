
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
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Active"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FailedAttempts"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}FailedTime"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}LockDate"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ObfuscatedInternal"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Password"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}UserName"/>
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
    "failedAttempts",
    "failedTime",
    "lockDate",
    "obfuscatedInternal",
    "password",
    "userName"
})
@XmlRootElement(name = "Credential", namespace = "http://guidewire.com/pc/exim/import")
public class Credential {

    @XmlElement(name = "Active", namespace = "http://guidewire.com/pc/exim/import")
    protected String active;
    @XmlElement(name = "FailedAttempts", namespace = "http://guidewire.com/pc/exim/import")
    protected BigInteger failedAttempts;
    @XmlElement(name = "FailedTime", namespace = "http://guidewire.com/pc/exim/import")
    protected FailedTime failedTime;
    @XmlElement(name = "LockDate", namespace = "http://guidewire.com/pc/exim/import")
    protected LockDate lockDate;
    @XmlElement(name = "ObfuscatedInternal", namespace = "http://guidewire.com/pc/exim/import")
    protected Boolean obfuscatedInternal;
    @XmlElement(name = "Password", namespace = "http://guidewire.com/pc/exim/import")
    protected String password;
    @XmlElement(name = "UserName", namespace = "http://guidewire.com/pc/exim/import")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String userName;
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
     * Gets the value of the failedAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFailedAttempts() {
        return failedAttempts;
    }

    /**
     * Sets the value of the failedAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFailedAttempts(BigInteger value) {
        this.failedAttempts = value;
    }

    /**
     * Gets the value of the failedTime property.
     * 
     * @return
     *     possible object is
     *     {@link FailedTime }
     *     
     */
    public FailedTime getFailedTime() {
        return failedTime;
    }

    /**
     * Sets the value of the failedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailedTime }
     *     
     */
    public void setFailedTime(FailedTime value) {
        this.failedTime = value;
    }

    /**
     * Gets the value of the lockDate property.
     * 
     * @return
     *     possible object is
     *     {@link LockDate }
     *     
     */
    public LockDate getLockDate() {
        return lockDate;
    }

    /**
     * Sets the value of the lockDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LockDate }
     *     
     */
    public void setLockDate(LockDate value) {
        this.lockDate = value;
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
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
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
