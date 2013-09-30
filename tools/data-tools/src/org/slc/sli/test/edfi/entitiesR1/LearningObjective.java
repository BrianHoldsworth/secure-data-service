//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.31 at 10:43:34 AM EDT 
//


package org.slc.sli.test.edfi.entitiesR1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This entity represents identified learning
 *                 objectives for courses in specific grades.
 *             
 * 
 * <p>Java class for learningObjective complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="learningObjective">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="learningObjectiveId" type="{http://slc-sli/ed-org/0.1}learningStandardId" minOccurs="0"/>
 *         &lt;element name="objective" type="{http://slc-sli/ed-org/0.1}objective"/>
 *         &lt;element name="description" type="{http://slc-sli/ed-org/0.1}description" minOccurs="0"/>
 *         &lt;element name="academicSubject" type="{http://slc-sli/ed-org/0.1}academicSubjectType"/>
 *         &lt;element name="objectiveGradeLevel" type="{http://slc-sli/ed-org/0.1}gradeLevelType"/>
 *         &lt;element name="learningStandards" type="{http://slc-sli/ed-org/0.1}reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parentLearningObjective" type="{http://slc-sli/ed-org/0.1}reference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "learningObjective", propOrder = {
    "learningObjectiveId",
    "objective",
    "description",
    "academicSubject",
    "objectiveGradeLevel",
    "learningStandards",
    "parentLearningObjective"
})
public class LearningObjective {

    protected LearningStandardId learningObjectiveId;
    @XmlElement(required = true)
    protected String objective;
    protected String description;
    @XmlElement(required = true)
    protected AcademicSubjectType academicSubject;
    @XmlElement(required = true)
    protected GradeLevelType objectiveGradeLevel;
    protected List<String> learningStandards;
    protected String parentLearningObjective;

    /**
     * Gets the value of the learningObjectiveId property.
     * 
     * @return
     *     possible object is
     *     {@link LearningStandardId }
     *     
     */
    public LearningStandardId getLearningObjectiveId() {
        return learningObjectiveId;
    }

    /**
     * Sets the value of the learningObjectiveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningStandardId }
     *     
     */
    public void setLearningObjectiveId(LearningStandardId value) {
        this.learningObjectiveId = value;
    }

    /**
     * Gets the value of the objective property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjective() {
        return objective;
    }

    /**
     * Sets the value of the objective property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjective(String value) {
        this.objective = value;
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
     * Gets the value of the academicSubject property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicSubjectType }
     *     
     */
    public AcademicSubjectType getAcademicSubject() {
        return academicSubject;
    }

    /**
     * Sets the value of the academicSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicSubjectType }
     *     
     */
    public void setAcademicSubject(AcademicSubjectType value) {
        this.academicSubject = value;
    }

    /**
     * Gets the value of the objectiveGradeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link GradeLevelType }
     *     
     */
    public GradeLevelType getObjectiveGradeLevel() {
        return objectiveGradeLevel;
    }

    /**
     * Sets the value of the objectiveGradeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradeLevelType }
     *     
     */
    public void setObjectiveGradeLevel(GradeLevelType value) {
        this.objectiveGradeLevel = value;
    }

    /**
     * Gets the value of the learningStandards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the learningStandards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLearningStandards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLearningStandards() {
        if (learningStandards == null) {
            learningStandards = new ArrayList<String>();
        }
        return this.learningStandards;
    }

    /**
     * Gets the value of the parentLearningObjective property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentLearningObjective() {
        return parentLearningObjective;
    }

    /**
     * Sets the value of the parentLearningObjective property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentLearningObjective(String value) {
        this.parentLearningObjective = value;
    }

}