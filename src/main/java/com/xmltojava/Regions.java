
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
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}GroupRegion" minOccurs="0"/>
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
    "groupRegion"
})
@XmlRootElement(name = "Regions", namespace = "http://guidewire.com/pc/exim/import")
public class Regions {

    @XmlElement(name = "GroupRegion", namespace = "http://guidewire.com/pc/exim/import")
    protected GroupRegion groupRegion;

    /**
     * Gets the value of the groupRegion property.
     * 
     * @return
     *     possible object is
     *     {@link GroupRegion }
     *     
     */
    public GroupRegion getGroupRegion() {
        return groupRegion;
    }

    /**
     * Sets the value of the groupRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupRegion }
     *     
     */
    public void setGroupRegion(GroupRegion value) {
        this.groupRegion = value;
    }

}
