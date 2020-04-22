
package com.xmltojava;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ProducerCodeRole" maxOccurs="unbounded" minOccurs="0"/>
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
    "producerCodeRole"
})
@XmlRootElement(name = "ProducerCodeRoles", namespace = "http://guidewire.com/pc/exim/import")
public class ProducerCodeRoles {

    @XmlElement(name = "ProducerCodeRole", namespace = "http://guidewire.com/pc/exim/import")
    protected List<ProducerCodeRole> producerCodeRole;

    /**
     * Gets the value of the producerCodeRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producerCodeRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducerCodeRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProducerCodeRole }
     * 
     * 
     */
    public List<ProducerCodeRole> getProducerCodeRole() {
        if (producerCodeRole == null) {
            producerCodeRole = new ArrayList<ProducerCodeRole>();
        }
        return this.producerCodeRole;
    }

}
