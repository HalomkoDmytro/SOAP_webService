//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.28 at 12:21:59 PM EET 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="constellation" type="{http://spring.io/guides/gs-producing-web-service}constellation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "constellation"
})
@XmlRootElement(name = "getConstellationResponse")
public class GetConstellationResponse {

    @XmlElement(required = true)
    protected Constellation constellation;

    /**
     * Gets the value of the constellation property.
     * 
     * @return
     *     possible object is
     *     {@link Constellation }
     *     
     */
    public Constellation getConstellation() {
        return constellation;
    }

    /**
     * Sets the value of the constellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Constellation }
     *     
     */
    public void setConstellation(Constellation value) {
        this.constellation = value;
    }

}
