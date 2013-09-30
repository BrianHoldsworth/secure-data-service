//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.31 at 10:43:34 AM EDT 
//


package org.slc.sli.test.edfi.entitiesR1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *                 StudentGradebookEntry
 *                 This entity holds a student's grade or competency level for a GradeBookEntry.
 *                 Associations: Student
 *             
 * 
 * <p>Java class for studentGradebookEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="studentGradebookEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enrollmentId" type="{http://slc-sli/ed-org/0.1}reference"/>
 *         &lt;element name="dateFulfilled" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="letterGradeEarned" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://slc-sli/ed-org/0.1}gradeEarned">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numericGradeEarned" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="CompetencyLevel" type="{http://slc-sli/ed-org/0.1}descriptorReferenceType" minOccurs="0"/>
 *         &lt;element name="diagnosticStatement" type="{http://slc-sli/ed-org/0.1}text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "studentGradebookEntry", propOrder = {
    "enrollmentId",
    "dateFulfilled",
    "letterGradeEarned",
    "numericGradeEarned",
    "competencyLevel",
    "diagnosticStatement"
})
public class StudentGradebookEntry {

    @XmlElement(required = true)
    protected String enrollmentId;
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected String dateFulfilled;
    protected String letterGradeEarned;
    protected BigInteger numericGradeEarned;
    @XmlElement(name = "CompetencyLevel")
    protected DescriptorReferenceType competencyLevel;
    protected String diagnosticStatement;

    /**
     * Gets the value of the enrollmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollmentId() {
        return enrollmentId;
    }

    /**
     * Sets the value of the enrollmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentId(String value) {
        this.enrollmentId = value;
    }

    /**
     * Gets the value of the dateFulfilled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFulfilled() {
        return dateFulfilled;
    }

    /**
     * Sets the value of the dateFulfilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFulfilled(String value) {
        this.dateFulfilled = value;
    }

    /**
     * Gets the value of the letterGradeEarned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetterGradeEarned() {
        return letterGradeEarned;
    }

    /**
     * Sets the value of the letterGradeEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetterGradeEarned(String value) {
        this.letterGradeEarned = value;
    }

    /**
     * Gets the value of the numericGradeEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumericGradeEarned() {
        return numericGradeEarned;
    }

    /**
     * Sets the value of the numericGradeEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumericGradeEarned(BigInteger value) {
        this.numericGradeEarned = value;
    }

    /**
     * Gets the value of the competencyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptorReferenceType }
     *     
     */
    public DescriptorReferenceType getCompetencyLevel() {
        return competencyLevel;
    }

    /**
     * Sets the value of the competencyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptorReferenceType }
     *     
     */
    public void setCompetencyLevel(DescriptorReferenceType value) {
        this.competencyLevel = value;
    }

    /**
     * Gets the value of the diagnosticStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosticStatement() {
        return diagnosticStatement;
    }

    /**
     * Sets the value of the diagnosticStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosticStatement(String value) {
        this.diagnosticStatement = value;
    }

}