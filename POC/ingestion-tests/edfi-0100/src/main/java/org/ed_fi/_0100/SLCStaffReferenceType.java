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
 * <p>Java class for SLC-StaffReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SLC-StaffReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StaffIdentity" type="{http://ed-fi.org/0100}SLC-StaffIdentityType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SLC-StaffReferenceType", propOrder = {
    "staffIdentity"
})
public class SLCStaffReferenceType {

    @XmlElement(name = "StaffIdentity", required = true)
    protected SLCStaffIdentityType staffIdentity;

    /**
     * Gets the value of the staffIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link SLCStaffIdentityType }
     *     
     */
    public SLCStaffIdentityType getStaffIdentity() {
        return staffIdentity;
    }

    /**
     * Sets the value of the staffIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SLCStaffIdentityType }
     *     
     */
    public void setStaffIdentity(SLCStaffIdentityType value) {
        this.staffIdentity = value;
    }

}
