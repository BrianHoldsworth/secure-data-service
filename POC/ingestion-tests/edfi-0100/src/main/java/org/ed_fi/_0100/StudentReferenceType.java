//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.22 at 01:42:02 PM EST 
//


package org.ed_fi._0100;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides alternative references for Student reference during interchange. Use XML IDREF to reference a student record that is included in the interchange
 * 
 * <p>Java class for StudentReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ed-fi.org/0100}ReferenceType">
 *       &lt;sequence>
 *         &lt;element name="StudentIdentity" type="{http://ed-fi.org/0100}StudentIdentityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentReferenceType", propOrder = {
    "studentIdentity"
})
public class StudentReferenceType
    extends ReferenceType
{

    @XmlElement(name = "StudentIdentity")
    protected StudentIdentityType studentIdentity;

    /**
     * Gets the value of the studentIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link StudentIdentityType }
     *     
     */
    public StudentIdentityType getStudentIdentity() {
        return studentIdentity;
    }

    /**
     * Sets the value of the studentIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentIdentityType }
     *     
     */
    public void setStudentIdentity(StudentIdentityType value) {
        this.studentIdentity = value;
    }

}