
package se.lantmateriet.namespace.distribution.products.address.v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.lantmateriet.namespace.distribution.products.address.v2 package. 
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

    private final static QName _Adressreferens_QNAME = new QName("http://namespace.lantmateriet.se/distribution/products/address/v2", "Adressreferens");
    private final static QName _FritextCriteria_QNAME = new QName("http://namespace.lantmateriet.se/distribution/products/address/v2", "FritextCriteria");
    private final static QName _Adress_QNAME = new QName("http://namespace.lantmateriet.se/distribution/products/address/v2", "Adress");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.lantmateriet.namespace.distribution.products.address.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindAdressResponse }
     * 
     */
    public FindAdressResponse createFindAdressResponse() {
        return new FindAdressResponse();
    }

    /**
     * Create an instance of {@link AdressType }
     * 
     */
    public AdressType createAdressType() {
        return new AdressType();
    }

    /**
     * Create an instance of {@link FritextCriteriaType }
     * 
     */
    public FritextCriteriaType createFritextCriteriaType() {
        return new FritextCriteriaType();
    }

    /**
     * Create an instance of {@link FindAdressRequest }
     * 
     */
    public FindAdressRequest createFindAdressRequest() {
        return new FindAdressRequest();
    }

    /**
     * Create an instance of {@link AdressCriteriaType }
     * 
     */
    public AdressCriteriaType createAdressCriteriaType() {
        return new AdressCriteriaType();
    }

    /**
     * Create an instance of {@link FindAdressreferensRequest }
     * 
     */
    public FindAdressreferensRequest createFindAdressreferensRequest() {
        return new FindAdressreferensRequest();
    }

    /**
     * Create an instance of {@link FindAdressreferensResponse }
     * 
     */
    public FindAdressreferensResponse createFindAdressreferensResponse() {
        return new FindAdressreferensResponse();
    }

    /**
     * Create an instance of {@link AdressreferensType }
     * 
     */
    public AdressreferensType createAdressreferensType() {
        return new AdressreferensType();
    }

    /**
     * Create an instance of {@link MatchFritextType }
     * 
     */
    public MatchFritextType createMatchFritextType() {
        return new MatchFritextType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdressreferensType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespace.lantmateriet.se/distribution/products/address/v2", name = "Adressreferens")
    public JAXBElement<AdressreferensType> createAdressreferens(AdressreferensType value) {
        return new JAXBElement<AdressreferensType>(_Adressreferens_QNAME, AdressreferensType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FritextCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespace.lantmateriet.se/distribution/products/address/v2", name = "FritextCriteria")
    public JAXBElement<FritextCriteriaType> createFritextCriteria(FritextCriteriaType value) {
        return new JAXBElement<FritextCriteriaType>(_FritextCriteria_QNAME, FritextCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespace.lantmateriet.se/distribution/products/address/v2", name = "Adress", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
    public JAXBElement<AdressType> createAdress(AdressType value) {
        return new JAXBElement<AdressType>(_Adress_QNAME, AdressType.class, null, value);
    }

}
