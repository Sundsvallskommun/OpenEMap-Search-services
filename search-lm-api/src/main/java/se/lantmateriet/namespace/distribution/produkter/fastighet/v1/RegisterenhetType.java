
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.AbstractFeatureType;


/**
 * <p>Java class for RegisterenhetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterenhetType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="objektidentitet" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}UUIDType" minOccurs="0"/>
 *         &lt;element name="fastighetsnyckel" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}FastighetsnyckelType"/>
 *         &lt;element name="objektstatus" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}ObjektstatusType"/>
 *         &lt;element ref="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}Registerenhetsattribut" minOccurs="0"/>
 *         &lt;element name="PagaendeArende" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}PagaendeArendeType" minOccurs="0"/>
 *         &lt;element name="Registerenhetsanmarkning" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}RegisterenhetsanmarkningType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Registerbeteckning" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}RegisterbeteckningType" minOccurs="0"/>
 *         &lt;element name="TidigareRegisterbeteckning" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}TidigareRegisterbeteckningType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Distrikt" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}DistriktType" minOccurs="0"/>
 *         &lt;element name="UrholkasAvEnhetsutrymme" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}UrholkasAvEnhetsutrymmeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Fastighetsatgard" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}FastighetsatgardType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Enhetsomrade" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}EnhetsomradeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Enhetsutrymme" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}EnhetsutrymmeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Fiskeomrade" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}FiskeomradeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OutrettOmrade" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}OutrettOmradeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Registerenhetshistorik" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}RegisterenhetshistorikType" minOccurs="0"/>
 *         &lt;element name="AndelISamfallighet" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}AndelISamfallighetType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AldreBeteckning" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}AldreBeteckningType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterenhetType", propOrder = {
    "objektidentitet",
    "fastighetsnyckel",
    "objektstatus",
    "registerenhetsattribut",
    "pagaendeArende",
    "registerenhetsanmarkning",
    "registerbeteckning",
    "tidigareRegisterbeteckning",
    "distrikt",
    "urholkasAvEnhetsutrymme",
    "fastighetsatgard",
    "enhetsomrade",
    "enhetsutrymme",
    "fiskeomrade",
    "outrettOmrade",
    "registerenhetshistorik",
    "andelISamfallighet",
    "aldreBeteckning"
})
@XmlSeeAlso({
    FastighetType.class,
    SamfallighetType.class
})
public abstract class RegisterenhetType
    extends AbstractFeatureType
{

    protected String objektidentitet;
    @XmlElement(required = true)
    protected String fastighetsnyckel;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ObjektstatusType objektstatus;
    @XmlElementRef(name = "Registerenhetsattribut", namespace = "http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends RegisterenhetsattributType> registerenhetsattribut;
    @XmlElement(name = "PagaendeArende")
    protected PagaendeArendeType pagaendeArende;
    @XmlElement(name = "Registerenhetsanmarkning")
    protected List<RegisterenhetsanmarkningType> registerenhetsanmarkning;
    @XmlElement(name = "Registerbeteckning")
    protected RegisterbeteckningType registerbeteckning;
    @XmlElement(name = "TidigareRegisterbeteckning")
    protected List<TidigareRegisterbeteckningType> tidigareRegisterbeteckning;
    @XmlElement(name = "Distrikt")
    protected DistriktType distrikt;
    @XmlElement(name = "UrholkasAvEnhetsutrymme")
    protected List<UrholkasAvEnhetsutrymmeType> urholkasAvEnhetsutrymme;
    @XmlElement(name = "Fastighetsatgard")
    protected List<FastighetsatgardType> fastighetsatgard;
    @XmlElement(name = "Enhetsomrade")
    protected List<EnhetsomradeType> enhetsomrade;
    @XmlElement(name = "Enhetsutrymme")
    protected List<EnhetsutrymmeType> enhetsutrymme;
    @XmlElement(name = "Fiskeomrade")
    protected List<FiskeomradeType> fiskeomrade;
    @XmlElement(name = "OutrettOmrade")
    protected List<OutrettOmradeType> outrettOmrade;
    @XmlElement(name = "Registerenhetshistorik")
    protected RegisterenhetshistorikType registerenhetshistorik;
    @XmlElement(name = "AndelISamfallighet")
    protected List<AndelISamfallighetType> andelISamfallighet;
    @XmlElement(name = "AldreBeteckning")
    protected List<AldreBeteckningType> aldreBeteckning;

    /**
     * Gets the value of the objektidentitet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjektidentitet() {
        return objektidentitet;
    }

    /**
     * Sets the value of the objektidentitet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjektidentitet(String value) {
        this.objektidentitet = value;
    }

    /**
     * Gets the value of the fastighetsnyckel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFastighetsnyckel() {
        return fastighetsnyckel;
    }

    /**
     * Sets the value of the fastighetsnyckel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFastighetsnyckel(String value) {
        this.fastighetsnyckel = value;
    }

    /**
     * Gets the value of the objektstatus property.
     * 
     * @return
     *     possible object is
     *     {@link ObjektstatusType }
     *     
     */
    public ObjektstatusType getObjektstatus() {
        return objektstatus;
    }

    /**
     * Sets the value of the objektstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjektstatusType }
     *     
     */
    public void setObjektstatus(ObjektstatusType value) {
        this.objektstatus = value;
    }

    /**
     * Gets the value of the registerenhetsattribut property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SamfallighetsattributType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FastighetsattributType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegisterenhetsattributType }{@code >}
     *     
     */
    public JAXBElement<? extends RegisterenhetsattributType> getRegisterenhetsattribut() {
        return registerenhetsattribut;
    }

    /**
     * Sets the value of the registerenhetsattribut property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SamfallighetsattributType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FastighetsattributType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegisterenhetsattributType }{@code >}
     *     
     */
    public void setRegisterenhetsattribut(JAXBElement<? extends RegisterenhetsattributType> value) {
        this.registerenhetsattribut = value;
    }

    /**
     * Gets the value of the pagaendeArende property.
     * 
     * @return
     *     possible object is
     *     {@link PagaendeArendeType }
     *     
     */
    public PagaendeArendeType getPagaendeArende() {
        return pagaendeArende;
    }

    /**
     * Sets the value of the pagaendeArende property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagaendeArendeType }
     *     
     */
    public void setPagaendeArende(PagaendeArendeType value) {
        this.pagaendeArende = value;
    }

    /**
     * Gets the value of the registerenhetsanmarkning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registerenhetsanmarkning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegisterenhetsanmarkning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisterenhetsanmarkningType }
     * 
     * 
     */
    public List<RegisterenhetsanmarkningType> getRegisterenhetsanmarkning() {
        if (registerenhetsanmarkning == null) {
            registerenhetsanmarkning = new ArrayList<RegisterenhetsanmarkningType>();
        }
        return this.registerenhetsanmarkning;
    }

    /**
     * Gets the value of the registerbeteckning property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterbeteckningType }
     *     
     */
    public RegisterbeteckningType getRegisterbeteckning() {
        return registerbeteckning;
    }

    /**
     * Sets the value of the registerbeteckning property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterbeteckningType }
     *     
     */
    public void setRegisterbeteckning(RegisterbeteckningType value) {
        this.registerbeteckning = value;
    }

    /**
     * Gets the value of the tidigareRegisterbeteckning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tidigareRegisterbeteckning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTidigareRegisterbeteckning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TidigareRegisterbeteckningType }
     * 
     * 
     */
    public List<TidigareRegisterbeteckningType> getTidigareRegisterbeteckning() {
        if (tidigareRegisterbeteckning == null) {
            tidigareRegisterbeteckning = new ArrayList<TidigareRegisterbeteckningType>();
        }
        return this.tidigareRegisterbeteckning;
    }

    /**
     * Gets the value of the distrikt property.
     * 
     * @return
     *     possible object is
     *     {@link DistriktType }
     *     
     */
    public DistriktType getDistrikt() {
        return distrikt;
    }

    /**
     * Sets the value of the distrikt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistriktType }
     *     
     */
    public void setDistrikt(DistriktType value) {
        this.distrikt = value;
    }

    /**
     * Gets the value of the urholkasAvEnhetsutrymme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urholkasAvEnhetsutrymme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrholkasAvEnhetsutrymme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UrholkasAvEnhetsutrymmeType }
     * 
     * 
     */
    public List<UrholkasAvEnhetsutrymmeType> getUrholkasAvEnhetsutrymme() {
        if (urholkasAvEnhetsutrymme == null) {
            urholkasAvEnhetsutrymme = new ArrayList<UrholkasAvEnhetsutrymmeType>();
        }
        return this.urholkasAvEnhetsutrymme;
    }

    /**
     * Gets the value of the fastighetsatgard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fastighetsatgard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFastighetsatgard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FastighetsatgardType }
     * 
     * 
     */
    public List<FastighetsatgardType> getFastighetsatgard() {
        if (fastighetsatgard == null) {
            fastighetsatgard = new ArrayList<FastighetsatgardType>();
        }
        return this.fastighetsatgard;
    }

    /**
     * Gets the value of the enhetsomrade property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enhetsomrade property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnhetsomrade().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnhetsomradeType }
     * 
     * 
     */
    public List<EnhetsomradeType> getEnhetsomrade() {
        if (enhetsomrade == null) {
            enhetsomrade = new ArrayList<EnhetsomradeType>();
        }
        return this.enhetsomrade;
    }

    /**
     * Gets the value of the enhetsutrymme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enhetsutrymme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnhetsutrymme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnhetsutrymmeType }
     * 
     * 
     */
    public List<EnhetsutrymmeType> getEnhetsutrymme() {
        if (enhetsutrymme == null) {
            enhetsutrymme = new ArrayList<EnhetsutrymmeType>();
        }
        return this.enhetsutrymme;
    }

    /**
     * Gets the value of the fiskeomrade property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fiskeomrade property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFiskeomrade().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FiskeomradeType }
     * 
     * 
     */
    public List<FiskeomradeType> getFiskeomrade() {
        if (fiskeomrade == null) {
            fiskeomrade = new ArrayList<FiskeomradeType>();
        }
        return this.fiskeomrade;
    }

    /**
     * Gets the value of the outrettOmrade property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outrettOmrade property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutrettOmrade().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutrettOmradeType }
     * 
     * 
     */
    public List<OutrettOmradeType> getOutrettOmrade() {
        if (outrettOmrade == null) {
            outrettOmrade = new ArrayList<OutrettOmradeType>();
        }
        return this.outrettOmrade;
    }

    /**
     * Gets the value of the registerenhetshistorik property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetshistorikType }
     *     
     */
    public RegisterenhetshistorikType getRegisterenhetshistorik() {
        return registerenhetshistorik;
    }

    /**
     * Sets the value of the registerenhetshistorik property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetshistorikType }
     *     
     */
    public void setRegisterenhetshistorik(RegisterenhetshistorikType value) {
        this.registerenhetshistorik = value;
    }

    /**
     * Gets the value of the andelISamfallighet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the andelISamfallighet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAndelISamfallighet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AndelISamfallighetType }
     * 
     * 
     */
    public List<AndelISamfallighetType> getAndelISamfallighet() {
        if (andelISamfallighet == null) {
            andelISamfallighet = new ArrayList<AndelISamfallighetType>();
        }
        return this.andelISamfallighet;
    }

    /**
     * Gets the value of the aldreBeteckning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aldreBeteckning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAldreBeteckning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AldreBeteckningType }
     * 
     * 
     */
    public List<AldreBeteckningType> getAldreBeteckning() {
        if (aldreBeteckning == null) {
            aldreBeteckning = new ArrayList<AldreBeteckningType>();
        }
        return this.aldreBeteckning;
    }

}
