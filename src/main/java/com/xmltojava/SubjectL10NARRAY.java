
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
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ActivityPattern_Subject_L10N" maxOccurs="unbounded" minOccurs="0"/>
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
    "activityPatternSubjectL10N"
})
@XmlRootElement(name = "Subject_L10N_ARRAY", namespace = "http://guidewire.com/pc/exim/import")
public class SubjectL10NARRAY {

    @XmlElement(name = "ActivityPattern_Subject_L10N", namespace = "http://guidewire.com/pc/exim/import")
    protected List<ActivityPatternSubjectL10N> activityPatternSubjectL10N;

    /**
     * Gets the value of the activityPatternSubjectL10N property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityPatternSubjectL10N property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityPatternSubjectL10N().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityPatternSubjectL10N }
     * 
     * 
     */
    public List<ActivityPatternSubjectL10N> getActivityPatternSubjectL10N() {
        if (activityPatternSubjectL10N == null) {
            activityPatternSubjectL10N = new ArrayList<ActivityPatternSubjectL10N>();
        }
        return this.activityPatternSubjectL10N;
    }

}
