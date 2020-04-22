
package com.xmltojava;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Address"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Credential"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Group"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Organization"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ProducerCode"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Region"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Role"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}SecurityZone"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}UWAuthorityProfile"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}User"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}UserSettings"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ActivityPattern"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}AssignableQueue"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Company"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}UWIssueType"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}UserContact"/>
 *       &lt;/choice>
 *       &lt;attribute name="usePeriodicFlushes" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addressOrCredentialOrGroup"
})
@XmlRootElement(name = "import", namespace = "http://guidewire.com/pc/exim/import")
public class Import {

    @XmlElements({
        @XmlElement(name = "Address", namespace = "http://guidewire.com/pc/exim/import", type = Address.class),
        @XmlElement(name = "Credential", namespace = "http://guidewire.com/pc/exim/import", type = Credential.class),
        @XmlElement(name = "Group", namespace = "http://guidewire.com/pc/exim/import", type = Group.class),
        @XmlElement(name = "Organization", namespace = "http://guidewire.com/pc/exim/import", type = Organization.class),
        @XmlElement(name = "ProducerCode", namespace = "http://guidewire.com/pc/exim/import", type = ProducerCode.class),
        @XmlElement(name = "Region", namespace = "http://guidewire.com/pc/exim/import", type = Region.class),
        @XmlElement(name = "Role", namespace = "http://guidewire.com/pc/exim/import", type = Role.class),
        @XmlElement(name = "SecurityZone", namespace = "http://guidewire.com/pc/exim/import", type = SecurityZone.class),
        @XmlElement(name = "UWAuthorityProfile", namespace = "http://guidewire.com/pc/exim/import", type = UWAuthorityProfile.class),
        @XmlElement(name = "User", namespace = "http://guidewire.com/pc/exim/import", type = User.class),
        @XmlElement(name = "UserSettings", namespace = "http://guidewire.com/pc/exim/import", type = UserSettings.class),
        @XmlElement(name = "ActivityPattern", namespace = "http://guidewire.com/pc/exim/import", type = ActivityPattern.class),
        @XmlElement(name = "AssignableQueue", namespace = "http://guidewire.com/pc/exim/import", type = AssignableQueue.class),
        @XmlElement(name = "Company", namespace = "http://guidewire.com/pc/exim/import", type = Company.class),
        @XmlElement(name = "UWIssueType", namespace = "http://guidewire.com/pc/exim/import", type = UWIssueType.class),
        @XmlElement(name = "UserContact", namespace = "http://guidewire.com/pc/exim/import", type = UserContact.class)
    })
    protected List<Object> addressOrCredentialOrGroup;
    @XmlAttribute(name = "usePeriodicFlushes", required = true)
    protected boolean usePeriodicFlushes;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String version;

    /**
     * Gets the value of the addressOrCredentialOrGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressOrCredentialOrGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressOrCredentialOrGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * {@link Credential }
     * {@link Group }
     * {@link Organization }
     * {@link ProducerCode }
     * {@link Region }
     * {@link Role }
     * {@link SecurityZone }
     * {@link UWAuthorityProfile }
     * {@link User }
     * {@link UserSettings }
     * {@link ActivityPattern }
     * {@link AssignableQueue }
     * {@link Company }
     * {@link UWIssueType }
     * {@link UserContact }
     * 
     * 
     */
    public List<Object> getAddressOrCredentialOrGroup() {
        if (addressOrCredentialOrGroup == null) {
            addressOrCredentialOrGroup = new ArrayList<Object>();
        }
        return this.addressOrCredentialOrGroup;
    }

    /**
     * Gets the value of the usePeriodicFlushes property.
     * 
     */
    public boolean isUsePeriodicFlushes() {
        return usePeriodicFlushes;
    }

    /**
     * Sets the value of the usePeriodicFlushes property.
     * 
     */
    public void setUsePeriodicFlushes(boolean value) {
        this.usePeriodicFlushes = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
