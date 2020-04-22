
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
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}GroupProducerCode" minOccurs="0"/>
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
    "groupProducerCode"
})
@XmlRootElement(name = "GroupProducerCodes", namespace = "http://guidewire.com/pc/exim/import")
public class GroupProducerCodes {

    @XmlElement(name = "GroupProducerCode", namespace = "http://guidewire.com/pc/exim/import")
    protected GroupProducerCode groupProducerCode;

    /**
     * Gets the value of the groupProducerCode property.
     * 
     * @return
     *     possible object is
     *     {@link GroupProducerCode }
     *     
     */
    public GroupProducerCode getGroupProducerCode() {
        return groupProducerCode;
    }

    /**
     * Sets the value of the groupProducerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupProducerCode }
     *     
     */
    public void setGroupProducerCode(GroupProducerCode value) {
        this.groupProducerCode = value;
    }

}
