
package com.philps.soapws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ContactsServiceSoap", targetNamespace = "http://philps.com/soapws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ContactsServiceSoap {


    /**
     * 
     * @param getContactResponseIn
     * @return
     *     returns com.philps.soapws.Contact
     * @throws DaoException_Exception
     */
    @WebMethod
    @WebResult(name = "getContactResponseOut", targetNamespace = "")
    @RequestWrapper(localName = "getContact", targetNamespace = "http://philps.com/soapws/", className = "com.philps.soapws.GetContact")
    @ResponseWrapper(localName = "getContactResponse", targetNamespace = "http://philps.com/soapws/", className = "com.philps.soapws.GetContactResponse")
    @Action(input = "http://philps.com/soapws/ContactsServiceSoap/getContactRequest", output = "http://philps.com/soapws/ContactsServiceSoap/getContactResponse", fault = {
        @FaultAction(className = DaoException_Exception.class, value = "http://philps.com/soapws/ContactsServiceSoap/getContact/Fault/DaoException")
    })
    public Contact getContact(
        @WebParam(name = "getContactResponseIn", targetNamespace = "")
        int getContactResponseIn)
        throws DaoException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<com.philps.soapws.Contact>
     * @throws DaoException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllContacts", targetNamespace = "http://philps.com/soapws/", className = "com.philps.soapws.GetAllContacts")
    @ResponseWrapper(localName = "getAllContactsResponse", targetNamespace = "http://philps.com/soapws/", className = "com.philps.soapws.GetAllContactsResponse")
    @Action(input = "http://philps.com/soapws/ContactsServiceSoap/getAllContactsRequest", output = "http://philps.com/soapws/ContactsServiceSoap/getAllContactsResponse", fault = {
        @FaultAction(className = DaoException_Exception.class, value = "http://philps.com/soapws/ContactsServiceSoap/getAllContacts/Fault/DaoException")
    })
    public List<Contact> getAllContacts()
        throws DaoException_Exception
    ;

}