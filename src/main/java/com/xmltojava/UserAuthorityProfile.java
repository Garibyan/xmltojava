
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
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}UWAuthorityProfile"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}User"/>
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
    "uwAuthorityProfile",
    "user"
})
@XmlRootElement(name = "UserAuthorityProfile", namespace = "http://guidewire.com/pc/exim/import")
public class UserAuthorityProfile {

    @XmlElement(name = "UWAuthorityProfile", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected UWAuthorityProfile uwAuthorityProfile;
    @XmlElement(name = "User", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected User user;
    @XmlAttribute(name = "public-id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String publicId;

    /**
     * Gets the value of the uwAuthorityProfile property.
     * 
     * @return
     *     possible object is
     *     {@link UWAuthorityProfile }
     *     
     */
    public UWAuthorityProfile getUWAuthorityProfile() {
        return uwAuthorityProfile;
    }

    /**
     * Sets the value of the uwAuthorityProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link UWAuthorityProfile }
     *     
     */
    public void setUWAuthorityProfile(UWAuthorityProfile value) {
        this.uwAuthorityProfile = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
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
