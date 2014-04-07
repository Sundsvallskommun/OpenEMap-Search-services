
package se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3 package. 
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

    private final static QName _GetRegisterbeteckningRequest_QNAME = new QName("http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3", "GetRegisterbeteckningRequest");
    private final static QName _RegisterbeteckningsreferensResponse_QNAME = new QName("http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3", "RegisterbeteckningsreferensResponse");
    private final static QName _RegisterbeteckningResponse_QNAME = new QName("http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3", "RegisterbeteckningResponse");
    private final static QName _FindRegisterbeteckningRequest_QNAME = new QName("http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3", "FindRegisterbeteckningRequest");
    private final static QName _Registerbeteckning_QNAME = new QName("http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3", "Registerbeteckning");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnhetsomradeType }
     * 
     */
    public EnhetsomradeType createEnhetsomradeType() {
        return new EnhetsomradeType();
    }

    /**
     * Create an instance of {@link RegisterbeteckningFilterType }
     * 
     */
    public RegisterbeteckningFilterType createRegisterbeteckningFilterType() {
        return new RegisterbeteckningFilterType();
    }

    /**
     * Create an instance of {@link SearchStringFilterType }
     * 
     */
    public SearchStringFilterType createSearchStringFilterType() {
        return new SearchStringFilterType();
    }

    /**
     * Create an instance of {@link MatchSearchStringType }
     * 
     */
    public MatchSearchStringType createMatchSearchStringType() {
        return new MatchSearchStringType();
    }

    /**
     * Create an instance of {@link RegisterbeteckningType }
     * 
     */
    public RegisterbeteckningType createRegisterbeteckningType() {
        return new RegisterbeteckningType();
    }

    /**
     * Create an instance of {@link RegisterbeteckningMemberType }
     * 
     */
    public RegisterbeteckningMemberType createRegisterbeteckningMemberType() {
        return new RegisterbeteckningMemberType();
    }

    /**
     * Create an instance of {@link RegisterenhetsreferensType }
     * 
     */
    public RegisterenhetsreferensType createRegisterenhetsreferensType() {
        return new RegisterenhetsreferensType();
    }

    /**
     * Create an instance of {@link GetRegisterbeteckningRequestType }
     * 
     */
    public GetRegisterbeteckningRequestType createGetRegisterbeteckningRequestType() {
        return new GetRegisterbeteckningRequestType();
    }

    /**
     * Create an instance of {@link RegisterbeteckningsreferensResponseType }
     * 
     */
    public RegisterbeteckningsreferensResponseType createRegisterbeteckningsreferensResponseType() {
        return new RegisterbeteckningsreferensResponseType();
    }

    /**
     * Create an instance of {@link RegisterbeteckningResponseType }
     * 
     */
    public RegisterbeteckningResponseType createRegisterbeteckningResponseType() {
        return new RegisterbeteckningResponseType();
    }

    /**
     * Create an instance of {@link FindRegisterbeteckningRequestType }
     * 
     */
    public FindRegisterbeteckningRequestType createFindRegisterbeteckningRequestType() {
        return new FindRegisterbeteckningRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRegisterbeteckningRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3", name = "GetRegisterbeteckningRequest")
    public JAXBElement<GetRegisterbeteckningRequestType> createGetRegisterbeteckningRequest(GetRegisterbeteckningRequestType value) {
        return new JAXBElement<GetRegisterbeteckningRequestType>(_GetRegisterbeteckningRequest_QNAME, GetRegisterbeteckningRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterbeteckningsreferensResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3", name = "RegisterbeteckningsreferensResponse")
    public JAXBElement<RegisterbeteckningsreferensResponseType> createRegisterbeteckningsreferensResponse(RegisterbeteckningsreferensResponseType value) {
        return new JAXBElement<RegisterbeteckningsreferensResponseType>(_RegisterbeteckningsreferensResponse_QNAME, RegisterbeteckningsreferensResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterbeteckningResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3", name = "RegisterbeteckningResponse", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<RegisterbeteckningResponseType> createRegisterbeteckningResponse(RegisterbeteckningResponseType value) {
        return new JAXBElement<RegisterbeteckningResponseType>(_RegisterbeteckningResponse_QNAME, RegisterbeteckningResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRegisterbeteckningRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3", name = "FindRegisterbeteckningRequest")
    public JAXBElement<FindRegisterbeteckningRequestType> createFindRegisterbeteckningRequest(FindRegisterbeteckningRequestType value) {
        return new JAXBElement<FindRegisterbeteckningRequestType>(_FindRegisterbeteckningRequest_QNAME, FindRegisterbeteckningRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterbeteckningType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3", name = "Registerbeteckning", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<RegisterbeteckningType> createRegisterbeteckning(RegisterbeteckningType value) {
        return new JAXBElement<RegisterbeteckningType>(_Registerbeteckning_QNAME, RegisterbeteckningType.class, null, value);
    }

}
