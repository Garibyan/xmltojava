
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
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ActivityClass"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}AssignedQueue"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}AutomatedOnly"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Category"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Code"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Command"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Description"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Description_L10N_ARRAY"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}DocumentTemplate"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}EmailTemplate"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}EscBusCalLocPath"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}EscalationBusCalTag"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}EscalationDays"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}EscalationHours"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}EscalationInclDays"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}EscalationStartPt"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Mandatory"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}PatternLevel"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Priority"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Recurring"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ReturnDaysRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ReturnHoursRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ReturnInclDaysRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ReturnToQueueRgs"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ShortSubject"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}ShortSubject_L10N_ARRAY"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Subject"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Subject_L10N_ARRAY"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}TargetBusCalLocPath"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}TargetBusCalTag"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}TargetDays"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}TargetHours"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}TargetIncludeDays"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}TargetStartPoint"/>
 *         &lt;element ref="{http://guidewire.com/pc/exim/import}Type"/>
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
    "activityClass",
    "assignedQueue",
    "automatedOnly",
    "category",
    "code",
    "command",
    "description",
    "descriptionL10NARRAY",
    "documentTemplate",
    "emailTemplate",
    "escBusCalLocPath",
    "escalationBusCalTag",
    "escalationDays",
    "escalationHours",
    "escalationInclDays",
    "escalationStartPt",
    "mandatory",
    "patternLevel",
    "priority",
    "recurring",
    "returnDaysRgs",
    "returnHoursRgs",
    "returnInclDaysRgs",
    "returnToQueueRgs",
    "shortSubject",
    "shortSubjectL10NARRAY",
    "subject",
    "subjectL10NARRAY",
    "targetBusCalLocPath",
    "targetBusCalTag",
    "targetDays",
    "targetHours",
    "targetIncludeDays",
    "targetStartPoint",
    "type"
})
@XmlRootElement(name = "ActivityPattern", namespace = "http://guidewire.com/pc/exim/import")
public class ActivityPattern {

    @XmlElement(name = "ActivityClass", namespace = "http://guidewire.com/pc/exim/import", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String activityClass;
    @XmlElement(name = "AssignedQueue", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected AssignedQueue assignedQueue;
    @XmlElement(name = "AutomatedOnly", namespace = "http://guidewire.com/pc/exim/import")
    protected boolean automatedOnly;
    @XmlElement(name = "Category", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String category;
    @XmlElement(name = "Code", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String code;
    @XmlElement(name = "Command", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected Command command;
    @XmlElement(name = "Description", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String description;
    @XmlElement(name = "Description_L10N_ARRAY", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected DescriptionL10NARRAY descriptionL10NARRAY;
    @XmlElement(name = "DocumentTemplate", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected DocumentTemplate documentTemplate;
    @XmlElement(name = "EmailTemplate", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected EmailTemplate emailTemplate;
    @XmlElement(name = "EscBusCalLocPath", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected EscBusCalLocPath escBusCalLocPath;
    @XmlElement(name = "EscalationBusCalTag", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected EscalationBusCalTag escalationBusCalTag;
    @XmlElement(name = "EscalationDays", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String escalationDays;
    @XmlElement(name = "EscalationHours", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String escalationHours;
    @XmlElement(name = "EscalationInclDays", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String escalationInclDays;
    @XmlElement(name = "EscalationStartPt", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String escalationStartPt;
    @XmlElement(name = "Mandatory", namespace = "http://guidewire.com/pc/exim/import")
    protected boolean mandatory;
    @XmlElement(name = "PatternLevel", namespace = "http://guidewire.com/pc/exim/import", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String patternLevel;
    @XmlElement(name = "Priority", namespace = "http://guidewire.com/pc/exim/import", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String priority;
    @XmlElement(name = "Recurring", namespace = "http://guidewire.com/pc/exim/import")
    protected boolean recurring;
    @XmlElement(name = "ReturnDaysRgs", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected ReturnDaysRgs returnDaysRgs;
    @XmlElement(name = "ReturnHoursRgs", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected ReturnHoursRgs returnHoursRgs;
    @XmlElement(name = "ReturnInclDaysRgs", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected ReturnInclDaysRgs returnInclDaysRgs;
    @XmlElement(name = "ReturnToQueueRgs", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String returnToQueueRgs;
    @XmlElement(name = "ShortSubject", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String shortSubject;
    @XmlElement(name = "ShortSubject_L10N_ARRAY", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected ShortSubjectL10NARRAY shortSubjectL10NARRAY;
    @XmlElement(name = "Subject", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String subject;
    @XmlElement(name = "Subject_L10N_ARRAY", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected SubjectL10NARRAY subjectL10NARRAY;
    @XmlElement(name = "TargetBusCalLocPath", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected TargetBusCalLocPath targetBusCalLocPath;
    @XmlElement(name = "TargetBusCalTag", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected TargetBusCalTag targetBusCalTag;
    @XmlElement(name = "TargetDays", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String targetDays;
    @XmlElement(name = "TargetHours", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected TargetHours targetHours;
    @XmlElement(name = "TargetIncludeDays", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String targetIncludeDays;
    @XmlElement(name = "TargetStartPoint", namespace = "http://guidewire.com/pc/exim/import", required = true)
    protected String targetStartPoint;
    @XmlElement(name = "Type", namespace = "http://guidewire.com/pc/exim/import", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String type;
    @XmlAttribute(name = "public-id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String publicId;

    /**
     * Gets the value of the activityClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityClass() {
        return activityClass;
    }

    /**
     * Sets the value of the activityClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityClass(String value) {
        this.activityClass = value;
    }

    /**
     * Gets the value of the assignedQueue property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedQueue }
     *     
     */
    public AssignedQueue getAssignedQueue() {
        return assignedQueue;
    }

    /**
     * Sets the value of the assignedQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedQueue }
     *     
     */
    public void setAssignedQueue(AssignedQueue value) {
        this.assignedQueue = value;
    }

    /**
     * Gets the value of the automatedOnly property.
     * 
     */
    public boolean isAutomatedOnly() {
        return automatedOnly;
    }

    /**
     * Sets the value of the automatedOnly property.
     * 
     */
    public void setAutomatedOnly(boolean value) {
        this.automatedOnly = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link Command }
     *     
     */
    public Command getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link Command }
     *     
     */
    public void setCommand(Command value) {
        this.command = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the descriptionL10NARRAY property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionL10NARRAY }
     *     
     */
    public DescriptionL10NARRAY getDescriptionL10NARRAY() {
        return descriptionL10NARRAY;
    }

    /**
     * Sets the value of the descriptionL10NARRAY property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionL10NARRAY }
     *     
     */
    public void setDescriptionL10NARRAY(DescriptionL10NARRAY value) {
        this.descriptionL10NARRAY = value;
    }

    /**
     * Gets the value of the documentTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTemplate }
     *     
     */
    public DocumentTemplate getDocumentTemplate() {
        return documentTemplate;
    }

    /**
     * Sets the value of the documentTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTemplate }
     *     
     */
    public void setDocumentTemplate(DocumentTemplate value) {
        this.documentTemplate = value;
    }

    /**
     * Gets the value of the emailTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link EmailTemplate }
     *     
     */
    public EmailTemplate getEmailTemplate() {
        return emailTemplate;
    }

    /**
     * Sets the value of the emailTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailTemplate }
     *     
     */
    public void setEmailTemplate(EmailTemplate value) {
        this.emailTemplate = value;
    }

    /**
     * Gets the value of the escBusCalLocPath property.
     * 
     * @return
     *     possible object is
     *     {@link EscBusCalLocPath }
     *     
     */
    public EscBusCalLocPath getEscBusCalLocPath() {
        return escBusCalLocPath;
    }

    /**
     * Sets the value of the escBusCalLocPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscBusCalLocPath }
     *     
     */
    public void setEscBusCalLocPath(EscBusCalLocPath value) {
        this.escBusCalLocPath = value;
    }

    /**
     * Gets the value of the escalationBusCalTag property.
     * 
     * @return
     *     possible object is
     *     {@link EscalationBusCalTag }
     *     
     */
    public EscalationBusCalTag getEscalationBusCalTag() {
        return escalationBusCalTag;
    }

    /**
     * Sets the value of the escalationBusCalTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscalationBusCalTag }
     *     
     */
    public void setEscalationBusCalTag(EscalationBusCalTag value) {
        this.escalationBusCalTag = value;
    }

    /**
     * Gets the value of the escalationDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscalationDays() {
        return escalationDays;
    }

    /**
     * Sets the value of the escalationDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscalationDays(String value) {
        this.escalationDays = value;
    }

    /**
     * Gets the value of the escalationHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscalationHours() {
        return escalationHours;
    }

    /**
     * Sets the value of the escalationHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscalationHours(String value) {
        this.escalationHours = value;
    }

    /**
     * Gets the value of the escalationInclDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscalationInclDays() {
        return escalationInclDays;
    }

    /**
     * Sets the value of the escalationInclDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscalationInclDays(String value) {
        this.escalationInclDays = value;
    }

    /**
     * Gets the value of the escalationStartPt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscalationStartPt() {
        return escalationStartPt;
    }

    /**
     * Sets the value of the escalationStartPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscalationStartPt(String value) {
        this.escalationStartPt = value;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     */
    public boolean isMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     */
    public void setMandatory(boolean value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the patternLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternLevel() {
        return patternLevel;
    }

    /**
     * Sets the value of the patternLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternLevel(String value) {
        this.patternLevel = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the recurring property.
     * 
     */
    public boolean isRecurring() {
        return recurring;
    }

    /**
     * Sets the value of the recurring property.
     * 
     */
    public void setRecurring(boolean value) {
        this.recurring = value;
    }

    /**
     * Gets the value of the returnDaysRgs property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnDaysRgs }
     *     
     */
    public ReturnDaysRgs getReturnDaysRgs() {
        return returnDaysRgs;
    }

    /**
     * Sets the value of the returnDaysRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnDaysRgs }
     *     
     */
    public void setReturnDaysRgs(ReturnDaysRgs value) {
        this.returnDaysRgs = value;
    }

    /**
     * Gets the value of the returnHoursRgs property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnHoursRgs }
     *     
     */
    public ReturnHoursRgs getReturnHoursRgs() {
        return returnHoursRgs;
    }

    /**
     * Sets the value of the returnHoursRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnHoursRgs }
     *     
     */
    public void setReturnHoursRgs(ReturnHoursRgs value) {
        this.returnHoursRgs = value;
    }

    /**
     * Gets the value of the returnInclDaysRgs property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnInclDaysRgs }
     *     
     */
    public ReturnInclDaysRgs getReturnInclDaysRgs() {
        return returnInclDaysRgs;
    }

    /**
     * Sets the value of the returnInclDaysRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnInclDaysRgs }
     *     
     */
    public void setReturnInclDaysRgs(ReturnInclDaysRgs value) {
        this.returnInclDaysRgs = value;
    }

    /**
     * Gets the value of the returnToQueueRgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToQueueRgs() {
        return returnToQueueRgs;
    }

    /**
     * Sets the value of the returnToQueueRgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToQueueRgs(String value) {
        this.returnToQueueRgs = value;
    }

    /**
     * Gets the value of the shortSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortSubject() {
        return shortSubject;
    }

    /**
     * Sets the value of the shortSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortSubject(String value) {
        this.shortSubject = value;
    }

    /**
     * Gets the value of the shortSubjectL10NARRAY property.
     * 
     * @return
     *     possible object is
     *     {@link ShortSubjectL10NARRAY }
     *     
     */
    public ShortSubjectL10NARRAY getShortSubjectL10NARRAY() {
        return shortSubjectL10NARRAY;
    }

    /**
     * Sets the value of the shortSubjectL10NARRAY property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortSubjectL10NARRAY }
     *     
     */
    public void setShortSubjectL10NARRAY(ShortSubjectL10NARRAY value) {
        this.shortSubjectL10NARRAY = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the subjectL10NARRAY property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectL10NARRAY }
     *     
     */
    public SubjectL10NARRAY getSubjectL10NARRAY() {
        return subjectL10NARRAY;
    }

    /**
     * Sets the value of the subjectL10NARRAY property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectL10NARRAY }
     *     
     */
    public void setSubjectL10NARRAY(SubjectL10NARRAY value) {
        this.subjectL10NARRAY = value;
    }

    /**
     * Gets the value of the targetBusCalLocPath property.
     * 
     * @return
     *     possible object is
     *     {@link TargetBusCalLocPath }
     *     
     */
    public TargetBusCalLocPath getTargetBusCalLocPath() {
        return targetBusCalLocPath;
    }

    /**
     * Sets the value of the targetBusCalLocPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetBusCalLocPath }
     *     
     */
    public void setTargetBusCalLocPath(TargetBusCalLocPath value) {
        this.targetBusCalLocPath = value;
    }

    /**
     * Gets the value of the targetBusCalTag property.
     * 
     * @return
     *     possible object is
     *     {@link TargetBusCalTag }
     *     
     */
    public TargetBusCalTag getTargetBusCalTag() {
        return targetBusCalTag;
    }

    /**
     * Sets the value of the targetBusCalTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetBusCalTag }
     *     
     */
    public void setTargetBusCalTag(TargetBusCalTag value) {
        this.targetBusCalTag = value;
    }

    /**
     * Gets the value of the targetDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetDays() {
        return targetDays;
    }

    /**
     * Sets the value of the targetDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetDays(String value) {
        this.targetDays = value;
    }

    /**
     * Gets the value of the targetHours property.
     * 
     * @return
     *     possible object is
     *     {@link TargetHours }
     *     
     */
    public TargetHours getTargetHours() {
        return targetHours;
    }

    /**
     * Sets the value of the targetHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetHours }
     *     
     */
    public void setTargetHours(TargetHours value) {
        this.targetHours = value;
    }

    /**
     * Gets the value of the targetIncludeDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetIncludeDays() {
        return targetIncludeDays;
    }

    /**
     * Sets the value of the targetIncludeDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetIncludeDays(String value) {
        this.targetIncludeDays = value;
    }

    /**
     * Gets the value of the targetStartPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetStartPoint() {
        return targetStartPoint;
    }

    /**
     * Sets the value of the targetStartPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetStartPoint(String value) {
        this.targetStartPoint = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
