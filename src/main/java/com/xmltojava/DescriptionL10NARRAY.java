
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
 *       &lt;choice>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}SecurityZone_Description_L10N"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ProducerCode_Description_L10N" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Role_Description_L10N" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ActivityPattern_Description_L10N" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "securityZoneDescriptionL10N",
    "producerCodeDescriptionL10N",
    "roleDescriptionL10N",
    "activityPatternDescriptionL10N"
})
@XmlRootElement(name = "Description_L10N_ARRAY", namespace = "http://guidewire.com/pc/exim/import")
public class DescriptionL10NARRAY {

    @XmlElement(name = "SecurityZone_Description_L10N", namespace = "http://guidewire.com/pc/exim/import")
    protected SecurityZoneDescriptionL10N securityZoneDescriptionL10N;
    @XmlElement(name = "ProducerCode_Description_L10N", namespace = "http://guidewire.com/pc/exim/import")
    protected List<ProducerCodeDescriptionL10N> producerCodeDescriptionL10N;
    @XmlElement(name = "Role_Description_L10N", namespace = "http://guidewire.com/pc/exim/import")
    protected List<RoleDescriptionL10N> roleDescriptionL10N;
    @XmlElement(name = "ActivityPattern_Description_L10N", namespace = "http://guidewire.com/pc/exim/import")
    protected List<ActivityPatternDescriptionL10N> activityPatternDescriptionL10N;

    /**
     * Gets the value of the securityZoneDescriptionL10N property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityZoneDescriptionL10N }
     *     
     */
    public SecurityZoneDescriptionL10N getSecurityZoneDescriptionL10N() {
        return securityZoneDescriptionL10N;
    }

    /**
     * Sets the value of the securityZoneDescriptionL10N property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityZoneDescriptionL10N }
     *     
     */
    public void setSecurityZoneDescriptionL10N(SecurityZoneDescriptionL10N value) {
        this.securityZoneDescriptionL10N = value;
    }

    /**
     * Gets the value of the producerCodeDescriptionL10N property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producerCodeDescriptionL10N property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducerCodeDescriptionL10N().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProducerCodeDescriptionL10N }
     * 
     * 
     */
    public List<ProducerCodeDescriptionL10N> getProducerCodeDescriptionL10N() {
        if (producerCodeDescriptionL10N == null) {
            producerCodeDescriptionL10N = new ArrayList<ProducerCodeDescriptionL10N>();
        }
        return this.producerCodeDescriptionL10N;
    }

    /**
     * Gets the value of the roleDescriptionL10N property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleDescriptionL10N property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleDescriptionL10N().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleDescriptionL10N }
     * 
     * 
     */
    public List<RoleDescriptionL10N> getRoleDescriptionL10N() {
        if (roleDescriptionL10N == null) {
            roleDescriptionL10N = new ArrayList<RoleDescriptionL10N>();
        }
        return this.roleDescriptionL10N;
    }

    /**
     * Gets the value of the activityPatternDescriptionL10N property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityPatternDescriptionL10N property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityPatternDescriptionL10N().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityPatternDescriptionL10N }
     * 
     * 
     */
    public List<ActivityPatternDescriptionL10N> getActivityPatternDescriptionL10N() {
        if (activityPatternDescriptionL10N == null) {
            activityPatternDescriptionL10N = new ArrayList<ActivityPatternDescriptionL10N>();
        }
        return this.activityPatternDescriptionL10N;
    }

}
