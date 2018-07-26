
package com.philps.soapws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getContact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getContact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getContactResponseIn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getContact", propOrder = {
    "getContactResponseIn"
})
public class GetContact {

    protected int getContactResponseIn;

    /**
     * Gets the value of the getContactResponseIn property.
     * 
     */
    public int getGetContactResponseIn() {
        return getContactResponseIn;
    }

    /**
     * Sets the value of the getContactResponseIn property.
     * 
     */
    public void setGetContactResponseIn(int value) {
        this.getContactResponseIn = value;
    }

}
