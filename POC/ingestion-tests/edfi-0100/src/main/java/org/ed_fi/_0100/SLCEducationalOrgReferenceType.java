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
 * Changed to use a required SLC identity type.
 * 
 * <p>Java class for SLC-EducationalOrgReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SLC-EducationalOrgReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EducationalOrgIdentity" type="{http://ed-fi.org/0100}SLC-EducationalOrgIdentityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SLC-EducationalOrgReferenceType", propOrder = {
    "educationalOrgIdentity"
})
public class SLCEducationalOrgReferenceType {

    @XmlElement(name = "EducationalOrgIdentity")
    protected SLCEducationalOrgIdentityType educationalOrgIdentity;

    /**
     * Gets the value of the educationalOrgIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link SLCEducationalOrgIdentityType }
     *     
     */
    public SLCEducationalOrgIdentityType getEducationalOrgIdentity() {
        return educationalOrgIdentity;
    }

    /**
     * Sets the value of the educationalOrgIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SLCEducationalOrgIdentityType }
     *     
     */
    public void setEducationalOrgIdentity(SLCEducationalOrgIdentityType value) {
        this.educationalOrgIdentity = value;
    }

}