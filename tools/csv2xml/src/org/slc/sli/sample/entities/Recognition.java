/*
 * Copyright 2012-2013 inBloom, Inc. and its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.20 at 03:09:04 PM EDT 
//


package org.slc.sli.sample.entities;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Recognition given to the student for accomplishments in a co-curricular, or extra-curricular activity.
 * 
 * <p>Java class for Recognition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Recognition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecognitionType" type="{http://ed-fi.org/0100}RecognitionType"/>
 *         &lt;element name="RecognitionDescription" type="{http://ed-fi.org/0100}RecognitionDescription" minOccurs="0"/>
 *         &lt;element name="RecognitionAwardDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recognition", propOrder = {
    "recognitionType",
    "recognitionDescription",
    "recognitionAwardDate"
})
public class Recognition {

    @XmlElement(name = "RecognitionType", required = true)
    protected RecognitionType recognitionType;
    @XmlElement(name = "RecognitionDescription")
    protected String recognitionDescription;
    @XmlElement(name = "RecognitionAwardDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar recognitionAwardDate;

    /**
     * Gets the value of the recognitionType property.
     * 
     * @return
     *     possible object is
     *     {@link RecognitionType }
     *     
     */
    public RecognitionType getRecognitionType() {
        return recognitionType;
    }

    /**
     * Sets the value of the recognitionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecognitionType }
     *     
     */
    public void setRecognitionType(RecognitionType value) {
        this.recognitionType = value;
    }

    /**
     * Gets the value of the recognitionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecognitionDescription() {
        return recognitionDescription;
    }

    /**
     * Sets the value of the recognitionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecognitionDescription(String value) {
        this.recognitionDescription = value;
    }

    /**
     * Gets the value of the recognitionAwardDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getRecognitionAwardDate() {
        return recognitionAwardDate;
    }

    /**
     * Sets the value of the recognitionAwardDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecognitionAwardDate(Calendar value) {
        this.recognitionAwardDate = value;
    }

}