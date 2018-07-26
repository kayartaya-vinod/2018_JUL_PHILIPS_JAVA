
package com.philps.soapws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getContactResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getContactResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getContactResponseOut" type="{http://philps.com/soapws/}contact" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getContactResponse", propOrder = {
    "getContactResponseOut"
})
public class GetContactResponse {

    protected Contact getContactResponseOut;

    /**
     * Gets the value of the getContactResponseOut property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getGetContactResponseOut() {
        return getContactResponseOut;
    }

    /**
     * Sets the value of the getContactResponseOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setGetContactResponseOut(Contact value) {
        this.getContactResponseOut = value;
    }

}
