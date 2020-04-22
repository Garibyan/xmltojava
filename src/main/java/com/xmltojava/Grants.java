
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
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}UWAuthorityGrant" maxOccurs="unbounded"/>
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
    "uwAuthorityGrant"
})
@XmlRootElement(name = "Grants", namespace = "http://guidewire.com/pc/exim/import")
public class Grants {

    @XmlElement(name = "UWAuthorityGrant", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected List<UWAuthorityGrant> uwAuthorityGrant;

    /**
     * Gets the value of the uwAuthorityGrant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uwAuthorityGrant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUWAuthorityGrant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UWAuthorityGrant }
     * 
     * 
     */
    public List<UWAuthorityGrant> getUWAuthorityGrant() {
        if (uwAuthorityGrant == null) {
            uwAuthorityGrant = new ArrayList<UWAuthorityGrant>();
        }
        return this.uwAuthorityGrant;
    }

}
