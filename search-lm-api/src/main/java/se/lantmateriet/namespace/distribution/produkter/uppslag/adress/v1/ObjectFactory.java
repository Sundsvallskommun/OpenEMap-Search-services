
package se.lantmateriet.namespace.distribution.produkter.uppslag.adress.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.lantmateriet.namespace.distribution.produkter.uppslag.adress.v1 package. 
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

    private final static QName _FindRegisterenhetRequest_QNAME = new QName("http://namespace.lantmateriet.se/distribution/produkter/uppslag/adress/v1", "FindRegisterenhetRequest");
    private final static QName _RegisterenhetsreferensResponse_QNAME = new QName("http://namespace.lantmateriet.se/distribution/produkter/uppslag/adress/v1", "RegisterenhetsreferensResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.lantmateriet.namespace.distribution.produkter.uppslag.adress.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegisterenhetsreferensResponseType }
     * 
     */
    public RegisterenhetsreferensResponseType createRegisterenhetsreferensResponseType() {
        return new RegisterenhetsreferensResponseType();
    }

    /**
     * Create an instance of {@link FindRegisterenhetRequestType }
     * 
     */
    public FindRegisterenhetRequestType createFindRegisterenhetRequestType() {
        return new FindRegisterenhetRequestType();
    }

    /**
     * Create an instance of {@link RegisterenhetAdressFilterType }
     * 
     */
    public RegisterenhetAdressFilterType createRegisterenhetAdressFilterType() {
        return new RegisterenhetAdressFilterType();
    }

    /**
     * Create an instance of {@link MatchSearchStringType }
     * 
     */
    public MatchSearchStringType createMatchSearchStringType() {
        return new MatchSearchStringType();
    }

    /**
     * Create an instance of {@link RegisterenhetsreferensType }
     * 
     */
    public RegisterenhetsreferensType createRegisterenhetsreferensType() {
        return new RegisterenhetsreferensType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRegisterenhetRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespace.lantmateriet.se/distribution/produkter/uppslag/adress/v1", name = "FindRegisterenhetRequest")
    public JAXBElement<FindRegisterenhetRequestType> createFindRegisterenhetRequest(FindRegisterenhetRequestType value) {
        return new JAXBElement<FindRegisterenhetRequestType>(_FindRegisterenhetRequest_QNAME, FindRegisterenhetRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterenhetsreferensResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespace.lantmateriet.se/distribution/produkter/uppslag/adress/v1", name = "RegisterenhetsreferensResponse")
    public JAXBElement<RegisterenhetsreferensResponseType> createRegisterenhetsreferensResponse(RegisterenhetsreferensResponseType value) {
        return new JAXBElement<RegisterenhetsreferensResponseType>(_RegisterenhetsreferensResponse_QNAME, RegisterenhetsreferensResponseType.class, null, value);
    }

}
