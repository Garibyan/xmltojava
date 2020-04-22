
package com.xmltojava;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}UserAuthorityProfile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userAuthorityProfile"
})
@XmlRootElement(name = "UserAuthorityProfiles", namespace = "http://guidewire.com/pc/exim/import")
public class UserAuthorityProfiles {

    @XmlElement(name = "UserAuthorityProfile", namespace = "http://guidewire.com/pc/exim/import")
    protected UserAuthorityProfile userAuthorityProfile;

    /**
     * Gets the value of the userAuthorityProfile property.
     * 
     * @return
     *     possible object is
     *     {@link UserAuthorityProfile }
     *     
     */
    public UserAuthorityProfile getUserAuthorityProfile() {
        return userAuthorityProfile;
    }

    /**
     * Sets the value of the userAuthorityProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAuthorityProfile }
     *     
     */
    public void setUserAuthorityProfile(UserAuthorityProfile value) {
        this.userAuthorityProfile = value;
    }

}
