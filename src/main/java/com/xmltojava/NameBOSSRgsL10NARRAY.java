
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
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Group_NameBOSSRgs_L10N" maxOccurs="unbounded" minOccurs="0"/>
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
    "groupNameBOSSRgsL10N"
})
@XmlRootElement(name = "NameBOSSRgs_L10N_ARRAY", namespace = "http://guidewire.com/pc/exim/import")
public class NameBOSSRgsL10NARRAY {

    @XmlElement(name = "Group_NameBOSSRgs_L10N", namespace = "http://guidewire.com/pc/exim/import")
    protected List<GroupNameBOSSRgsL10N> groupNameBOSSRgsL10N;

    /**
     * Gets the value of the groupNameBOSSRgsL10N property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupNameBOSSRgsL10N property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupNameBOSSRgsL10N().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupNameBOSSRgsL10N }
     * 
     * 
     */
    public List<GroupNameBOSSRgsL10N> getGroupNameBOSSRgsL10N() {
        if (groupNameBOSSRgsL10N == null) {
            groupNameBOSSRgsL10N = new ArrayList<GroupNameBOSSRgsL10N>();
        }
        return this.groupNameBOSSRgsL10N;
    }

}
