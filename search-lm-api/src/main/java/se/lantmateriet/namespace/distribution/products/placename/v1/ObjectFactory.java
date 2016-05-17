
package se.lantmateriet.namespace.distribution.products.placename.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.lantmateriet.namespace.distribution.products.placename.v1 package. 
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

    private final static QName _FritextCriteria_QNAME = new QName("http://namespace.lantmateriet.se/distribution/products/placename/v1", "FritextCriteria");
    private final static QName _Ortnamnsreferens_QNAME = new QName("http://namespace.lantmateriet.se/distribution/products/placename/v1", "Ortnamnsreferens");
    private final static QName _Ortnamn_QNAME = new QName("http://namespace.lantmateriet.se/distribution/products/placename/v1", "Ortnamn");
    private final static QName _OrtnamnCriteria_QNAME = new QName("http://namespace.lantmateriet.se/distribution/products/placename/v1", "OrtnamnCriteria");
    private final static QName _OrtnamnTypeNamn_QNAME = new QName("http://namespace.lantmateriet.se/distribution/products/placename/v1", "namn");
    private final static QName _OrtnamnTypePlacering_QNAME = new QName("http://namespace.lantmateriet.se/distribution/products/placename/v1", "placering");
    private final static QName _OrtnamnTypeSprak_QNAME = new QName("http://namespace.lantmateriet.se/distribution/products/placename/v1", "sprak");
    private final static QName _OrtnamnTypeId_QNAME = new QName("http://namespace.lantmateriet.se/distribution/products/placename/v1", "id");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.lantmateriet.namespace.distribution.products.placename.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindOrtnamnsreferensResponse }
     * 
     */
    public FindOrtnamnsreferensResponse createFindOrtnamnsreferensResponse() {
        return new FindOrtnamnsreferensResponse();
    }

    /**
     * Create an instance of {@link OrtnamnsreferensType }
     * 
     */
    public OrtnamnsreferensType createOrtnamnsreferensType() {
        return new OrtnamnsreferensType();
    }

    /**
     * Create an instance of {@link OrtnamnCriteriaType }
     * 
     */
    public OrtnamnCriteriaType createOrtnamnCriteriaType() {
        return new OrtnamnCriteriaType();
    }

    /**
     * Create an instance of {@link FindOrtnamnRequest }
     * 
     */
    public FindOrtnamnRequest createFindOrtnamnRequest() {
        return new FindOrtnamnRequest();
    }

    /**
     * Create an instance of {@link FritextCriteriaType }
     * 
     */
    public FritextCriteriaType createFritextCriteriaType() {
        return new FritextCriteriaType();
    }

    /**
     * Create an instance of {@link FindOrtnamnResponse }
     * 
     */
    public FindOrtnamnResponse createFindOrtnamnResponse() {
        return new FindOrtnamnResponse();
    }

    /**
     * Create an instance of {@link OrtnamnType }
     * 
     */
    public OrtnamnType createOrtnamnType() {
        return new OrtnamnType();
    }

    /**
     * Create an instance of {@link FindOrtnamnsreferensRequest }
     * 
     */
    public FindOrtnamnsreferensRequest createFindOrtnamnsreferensRequest() {
        return new FindOrtnamnsreferensRequest();
    }

    /**
     * Create an instance of {@link NamntyperType }
     * 
     */
    public NamntyperType createNamntyperType() {
        return new NamntyperType();
    }

    /**
     * Create an instance of {@link IntervallType }
     * 
     */
    public IntervallType createIntervallType() {
        return new IntervallType();
    }

    /**
     * Create an instance of {@link OrtnamnsplaceringType }
     * 
     */
    public OrtnamnsplaceringType createOrtnamnsplaceringType() {
        return new OrtnamnsplaceringType();
    }

    /**
     * Create an instance of {@link MatchFritextType }
     * 
     */
    public MatchFritextType createMatchFritextType() {
        return new MatchFritextType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FritextCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespace.lantmateriet.se/distribution/products/placename/v1", name = "FritextCriteria")
    public JAXBElement<FritextCriteriaType> createFritextCriteria(FritextCriteriaType value) {
        return new JAXBElement<FritextCriteriaType>(_FritextCriteria_QNAME, FritextCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrtnamnsreferensType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespace.lantmateriet.se/distribution/products/placename/v1", name = "Ortnamnsreferens")
    public JAXBElement<OrtnamnsreferensType> createOrtnamnsreferens(OrtnamnsreferensType value) {
        return new JAXBElement<OrtnamnsreferensType>(_Ortnamnsreferens_QNAME, OrtnamnsreferensType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrtnamnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespace.lantmateriet.se/distribution/products/placename/v1", name = "Ortnamn", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
    public JAXBElement<OrtnamnType> createOrtnamn(OrtnamnType value) {
        return new JAXBElement<OrtnamnType>(_Ortnamn_QNAME, OrtnamnType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrtnamnCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespace.lantmateriet.se/distribution/products/placename/v1", name = "OrtnamnCriteria")
    public JAXBElement<OrtnamnCriteriaType> createOrtnamnCriteria(OrtnamnCriteriaType value) {
        return new JAXBElement<OrtnamnCriteriaType>(_OrtnamnCriteria_QNAME, OrtnamnCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespace.lantmateriet.se/distribution/products/placename/v1", name = "namn", scope = OrtnamnType.class)
    public JAXBElement<String> createOrtnamnTypeNamn(String value) {
        return new JAXBElement<String>(_OrtnamnTypeNamn_QNAME, String.class, OrtnamnType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrtnamnsplaceringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespace.lantmateriet.se/distribution/products/placename/v1", name = "placering", scope = OrtnamnType.class)
    public JAXBElement<OrtnamnsplaceringType> createOrtnamnTypePlacering(OrtnamnsplaceringType value) {
        return new JAXBElement<OrtnamnsplaceringType>(_OrtnamnTypePlacering_QNAME, OrtnamnsplaceringType.class, OrtnamnType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespace.lantmateriet.se/distribution/products/placename/v1", name = "sprak", scope = OrtnamnType.class)
    public JAXBElement<String> createOrtnamnTypeSprak(String value) {
        return new JAXBElement<String>(_OrtnamnTypeSprak_QNAME, String.class, OrtnamnType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://namespace.lantmateriet.se/distribution/products/placename/v1", name = "id", scope = OrtnamnType.class)
    public JAXBElement<Long> createOrtnamnTypeId(Long value) {
        return new JAXBElement<Long>(_OrtnamnTypeId_QNAME, Long.class, OrtnamnType.class, value);
    }

}
