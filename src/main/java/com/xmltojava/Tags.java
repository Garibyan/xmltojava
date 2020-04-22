
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
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ContactTag"/>
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
    "contactTag"
})
@XmlRootElement(name = "Tags", namespace = "http://guidewire.com/pc/exim/import")
public class Tags {

    @XmlElement(name = "ContactTag", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected ContactTag contactTag;

    /**
     * Gets the value of the contactTag property.
     * 
     * @return
     *     possible object is
     *     {@link ContactTag }
     *     
     */
    public ContactTag getContactTag() {
        return contactTag;
    }

    /**
     * Sets the value of the contactTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactTag }
     *     
     */
    public void setContactTag(ContactTag value) {
        this.contactTag = value;
    }

}
