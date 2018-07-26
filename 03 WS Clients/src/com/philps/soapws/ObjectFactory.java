
package com.philps.soapws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.philps.soapws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllContactsResponse_QNAME = new QName("http://philps.com/soapws/", "getAllContactsResponse");
    private final static QName _DaoException_QNAME = new QName("http://philps.com/soapws/", "DaoException");
    private final static QName _GetAllContacts_QNAME = new QName("http://philps.com/soapws/", "getAllContacts");
    private final static QName _GetContact_QNAME = new QName("http://philps.com/soapws/", "getContact");
    private final static QName _GetContactResponse_QNAME = new QName("http://philps.com/soapws/", "getContactResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.philps.soapws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllContactsResponse }
     * 
     */
    public GetAllContactsResponse createGetAllContactsResponse() {
        return new GetAllContactsResponse();
    }

    /**
     * Create an instance of {@link DaoException }
     * 
     */
    public DaoException createDaoException() {
        return new DaoException();
    }

    /**
     * Create an instance of {@link GetAllContacts }
     * 
     */
    public GetAllContacts createGetAllContacts() {
        return new GetAllContacts();
    }

    /**
     * Create an instance of {@link GetContact }
     * 
     */
    public GetContact createGetContact() {
        return new GetContact();
    }

    /**
     * Create an instance of {@link GetContactResponse }
     * 
     */
    public GetContactResponse createGetContactResponse() {
        return new GetContactResponse();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllContactsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://philps.com/soapws/", name = "getAllContactsResponse")
    public JAXBElement<GetAllContactsResponse> createGetAllContactsResponse(GetAllContactsResponse value) {
        return new JAXBElement<GetAllContactsResponse>(_GetAllContactsResponse_QNAME, GetAllContactsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DaoException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://philps.com/soapws/", name = "DaoException")
    public JAXBElement<DaoException> createDaoException(DaoException value) {
        return new JAXBElement<DaoException>(_DaoException_QNAME, DaoException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllContacts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://philps.com/soapws/", name = "getAllContacts")
    public JAXBElement<GetAllContacts> createGetAllContacts(GetAllContacts value) {
        return new JAXBElement<GetAllContacts>(_GetAllContacts_QNAME, GetAllContacts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://philps.com/soapws/", name = "getContact")
    public JAXBElement<GetContact> createGetContact(GetContact value) {
        return new JAXBElement<GetContact>(_GetContact_QNAME, GetContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://philps.com/soapws/", name = "getContactResponse")
    public JAXBElement<GetContactResponse> createGetContactResponse(GetContactResponse value) {
        return new JAXBElement<GetContactResponse>(_GetContactResponse_QNAME, GetContactResponse.class, null, value);
    }

}
