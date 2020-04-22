
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
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Role_Name_L10N" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Group_Name_L10N" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}SecurityZone_Name_L10N" maxOccurs="unbounded" minOccurs="0"/>
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
    "roleNameL10N",
    "groupNameL10N",
    "securityZoneNameL10N"
})
@XmlRootElement(name = "Name_L10N_ARRAY", namespace = "http://guidewire.com/pc/exim/import")
public class NameL10NARRAY {

    @XmlElement(name = "Role_Name_L10N", namespace = "http://guidewire.com/pc/exim/import")
    protected List<RoleNameL10N> roleNameL10N;
    @XmlElement(name = "Group_Name_L10N", namespace = "http://guidewire.com/pc/exim/import")
    protected List<GroupNameL10N> groupNameL10N;
    @XmlElement(name = "SecurityZone_Name_L10N", namespace = "http://guidewire.com/pc/exim/import")
    protected List<SecurityZoneNameL10N> securityZoneNameL10N;

    /**
     * Gets the value of the roleNameL10N property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleNameL10N property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleNameL10N().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleNameL10N }
     * 
     * 
     */
    public List<RoleNameL10N> getRoleNameL10N() {
        if (roleNameL10N == null) {
            roleNameL10N = new ArrayList<RoleNameL10N>();
        }
        return this.roleNameL10N;
    }

    /**
     * Gets the value of the groupNameL10N property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupNameL10N property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupNameL10N().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupNameL10N }
     * 
     * 
     */
    public List<GroupNameL10N> getGroupNameL10N() {
        if (groupNameL10N == null) {
            groupNameL10N = new ArrayList<GroupNameL10N>();
        }
        return this.groupNameL10N;
    }

    /**
     * Gets the value of the securityZoneNameL10N property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityZoneNameL10N property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityZoneNameL10N().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityZoneNameL10N }
     * 
     * 
     */
    public List<SecurityZoneNameL10N> getSecurityZoneNameL10N() {
        if (securityZoneNameL10N == null) {
            securityZoneNameL10N = new ArrayList<SecurityZoneNameL10N>();
        }
        return this.securityZoneNameL10N;
    }

}
