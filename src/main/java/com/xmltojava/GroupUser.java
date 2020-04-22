
package com.xmltojava;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Group"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}LoadFactor"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}LoadFactorType"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Manager"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Member"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}TextField1"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}TextField2"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}TextField3"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}User"/>
 *       &lt;/sequence>
 *       &lt;attribute name="public-id" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "group",
    "loadFactor",
    "loadFactorType",
    "manager",
    "member",
    "textField1",
    "textField2",
    "textField3",
    "user"
})
@XmlRootElement(name = "GroupUser", namespace = "http://guidewire.com/pc/exim/import")
public class GroupUser {

    @XmlElement(name = "Group", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected Group group;
    @XmlElement(name = "LoadFactor", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String loadFactor;
    @XmlElement(name = "LoadFactorType", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected LoadFactorType loadFactorType;
    @XmlElement(name = "Manager", namespace = "http://guidewire.com/pc/exim/import")
    protected boolean manager;
    @XmlElement(name = "Member", namespace = "http://guidewire.com/pc/exim/import")
    protected boolean member;
    @XmlElement(name = "TextField1", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected TextField1 textField1;
    @XmlElement(name = "TextField2", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected TextField2 textField2;
    @XmlElement(name = "TextField3", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected TextField3 textField3;
    @XmlElement(name = "User", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected User user;
    @XmlAttribute(name = "public-id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String publicId;

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link Group }
     *     
     */
    public Group getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link Group }
     *     
     */
    public void setGroup(Group value) {
        this.group = value;
    }

    /**
     * Gets the value of the loadFactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadFactor() {
        return loadFactor;
    }

    /**
     * Sets the value of the loadFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadFactor(String value) {
        this.loadFactor = value;
    }

    /**
     * Gets the value of the loadFactorType property.
     * 
     * @return
     *     possible object is
     *     {@link LoadFactorType }
     *     
     */
    public LoadFactorType getLoadFactorType() {
        return loadFactorType;
    }

    /**
     * Sets the value of the loadFactorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadFactorType }
     *     
     */
    public void setLoadFactorType(LoadFactorType value) {
        this.loadFactorType = value;
    }

    /**
     * Gets the value of the manager property.
     * 
     */
    public boolean isManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     */
    public void setManager(boolean value) {
        this.manager = value;
    }

    /**
     * Gets the value of the member property.
     * 
     */
    public boolean isMember() {
        return member;
    }

    /**
     * Sets the value of the member property.
     * 
     */
    public void setMember(boolean value) {
        this.member = value;
    }

    /**
     * Gets the value of the textField1 property.
     * 
     * @return
     *     possible object is
     *     {@link TextField1 }
     *     
     */
    public TextField1 getTextField1() {
        return textField1;
    }

    /**
     * Sets the value of the textField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextField1 }
     *     
     */
    public void setTextField1(TextField1 value) {
        this.textField1 = value;
    }

    /**
     * Gets the value of the textField2 property.
     * 
     * @return
     *     possible object is
     *     {@link TextField2 }
     *     
     */
    public TextField2 getTextField2() {
        return textField2;
    }

    /**
     * Sets the value of the textField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextField2 }
     *     
     */
    public void setTextField2(TextField2 value) {
        this.textField2 = value;
    }

    /**
     * Gets the value of the textField3 property.
     * 
     * @return
     *     possible object is
     *     {@link TextField3 }
     *     
     */
    public TextField3 getTextField3() {
        return textField3;
    }

    /**
     * Sets the value of the textField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextField3 }
     *     
     */
    public void setTextField3(TextField3 value) {
        this.textField3 = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Gets the value of the publicId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicId() {
        return publicId;
    }

    /**
     * Sets the value of the publicId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicId(String value) {
        this.publicId = value;
    }

}
