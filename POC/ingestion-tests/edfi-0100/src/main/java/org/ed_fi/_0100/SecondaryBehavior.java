//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.22 at 01:42:02 PM EST 
//


package org.ed_fi._0100;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Definition of the behavior coded for use in describing an incident.
 * 
 * <p>Java class for SecondaryBehavior complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecondaryBehavior">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SecondaryBehavior" type="{http://ed-fi.org/0100}SecondaryBehaviorsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BehaviorCategory" use="required" type="{http://ed-fi.org/0100}BehaviorCategoryType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondaryBehavior", propOrder = {
    "secondaryBehavior"
})
public class SecondaryBehavior {

    @XmlElement(name = "SecondaryBehavior", required = true)
    protected String secondaryBehavior;
    @XmlAttribute(name = "BehaviorCategory", required = true)
    protected BehaviorCategoryType behaviorCategory;

    /**
     * Gets the value of the secondaryBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryBehavior() {
        return secondaryBehavior;
    }

    /**
     * Sets the value of the secondaryBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryBehavior(String value) {
        this.secondaryBehavior = value;
    }

    /**
     * Gets the value of the behaviorCategory property.
     * 
     * @return
     *     possible object is
     *     {@link BehaviorCategoryType }
     *     
     */
    public BehaviorCategoryType getBehaviorCategory() {
        return behaviorCategory;
    }

    /**
     * Sets the value of the behaviorCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BehaviorCategoryType }
     *     
     */
    public void setBehaviorCategory(BehaviorCategoryType value) {
        this.behaviorCategory = value;
    }

}