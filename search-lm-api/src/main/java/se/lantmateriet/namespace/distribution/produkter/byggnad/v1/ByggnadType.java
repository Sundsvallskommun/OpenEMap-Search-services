
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.AbstractFeatureType;


/**
 * <p>Java class for ByggnadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ByggnadType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="objektidentitet" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}UUIDType"/>
 *         &lt;element name="objektstatus" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}ObjektstatusType"/>
 *         &lt;element name="Byggnadsattribut" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}ByggnadsattributType" minOccurs="0"/>
 *         &lt;element name="Byggnadsanmarkning" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}ByggnadsanmarkningType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Byggnadsnamn" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}ByggnadsnamnType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}Byggnadsandamal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Skyddsrum" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}SkyddsrumType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Entre" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}EntreType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Verksamhetsatgard" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}VerksamhetsatgardType" minOccurs="0"/>
 *         &lt;element name="Byggnadsdel" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}ByggnadsdelType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Tillhor" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}RegisterenhetsreferensPropertyType" minOccurs="0"/>
 *         &lt;element name="LiggerPa" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}RegisterenhetsreferensPropertyType" minOccurs="0"/>
 *         &lt;element name="BerorsAv" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}RegisterenhetsreferensArrayPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ByggnadType", propOrder = {
    "objektidentitet",
    "objektstatus",
    "byggnadsattribut",
    "byggnadsanmarkning",
    "byggnadsnamn",
    "byggnadsandamal",
    "skyddsrum",
    "entre",
    "verksamhetsatgard",
    "byggnadsdel",
    "tillhor",
    "liggerPa",
    "berorsAv"
})
public class ByggnadType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    protected String objektidentitet;
    @XmlElement(required = true)
    protected ObjektstatusType objektstatus;
    @XmlElement(name = "Byggnadsattribut")
    protected ByggnadsattributType byggnadsattribut;
    @XmlElement(name = "Byggnadsanmarkning")
    protected List<ByggnadsanmarkningType> byggnadsanmarkning;
    @XmlElement(name = "Byggnadsnamn")
    protected List<ByggnadsnamnType> byggnadsnamn;
    @XmlElementRef(name = "Byggnadsandamal", namespace = "http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1", type = JAXBElement.class)
    protected List<JAXBElement<? extends ByggnadsandamalType>> byggnadsandamal;
    @XmlElement(name = "Skyddsrum")
    protected List<SkyddsrumType> skyddsrum;
    @XmlElement(name = "Entre")
    protected List<EntreType> entre;
    @XmlElement(name = "Verksamhetsatgard")
    protected VerksamhetsatgardType verksamhetsatgard;
    @XmlElement(name = "Byggnadsdel")
    protected List<ByggnadsdelType> byggnadsdel;
    @XmlElement(name = "Tillhor")
    protected RegisterenhetsreferensPropertyType tillhor;
    @XmlElement(name = "LiggerPa")
    protected RegisterenhetsreferensPropertyType liggerPa;
    @XmlElement(name = "BerorsAv")
    protected RegisterenhetsreferensArrayPropertyType berorsAv;

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
     * Gets the value of the byggnadsattribut property.
     * 
     * @return
     *     possible object is
     *     {@link ByggnadsattributType }
     *     
     */
    public ByggnadsattributType getByggnadsattribut() {
        return byggnadsattribut;
    }

    /**
     * Sets the value of the byggnadsattribut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ByggnadsattributType }
     *     
     */
    public void setByggnadsattribut(ByggnadsattributType value) {
        this.byggnadsattribut = value;
    }

    /**
     * Gets the value of the byggnadsanmarkning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the byggnadsanmarkning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getByggnadsanmarkning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ByggnadsanmarkningType }
     * 
     * 
     */
    public List<ByggnadsanmarkningType> getByggnadsanmarkning() {
        if (byggnadsanmarkning == null) {
            byggnadsanmarkning = new ArrayList<ByggnadsanmarkningType>();
        }
        return this.byggnadsanmarkning;
    }

    /**
     * Gets the value of the byggnadsnamn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the byggnadsnamn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getByggnadsnamn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ByggnadsnamnType }
     * 
     * 
     */
    public List<ByggnadsnamnType> getByggnadsnamn() {
        if (byggnadsnamn == null) {
            byggnadsnamn = new ArrayList<ByggnadsnamnType>();
        }
        return this.byggnadsnamn;
    }

    /**
     * Gets the value of the byggnadsandamal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the byggnadsandamal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getByggnadsandamal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BostadType }{@code >}
     * {@link JAXBElement }{@code <}{@link OvrigByggnadType }{@code >}
     * {@link JAXBElement }{@code <}{@link ByggnadsandamalType }{@code >}
     * {@link JAXBElement }{@code <}{@link KomplementbyggnadType }{@code >}
     * {@link JAXBElement }{@code <}{@link EkonomibyggnadType }{@code >}
     * {@link JAXBElement }{@code <}{@link IndustriType }{@code >}
     * {@link JAXBElement }{@code <}{@link VerksamhetType }{@code >}
     * {@link JAXBElement }{@code <}{@link SamhallsfunktionType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends ByggnadsandamalType>> getByggnadsandamal() {
        if (byggnadsandamal == null) {
            byggnadsandamal = new ArrayList<JAXBElement<? extends ByggnadsandamalType>>();
        }
        return this.byggnadsandamal;
    }

    /**
     * Gets the value of the skyddsrum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skyddsrum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkyddsrum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SkyddsrumType }
     * 
     * 
     */
    public List<SkyddsrumType> getSkyddsrum() {
        if (skyddsrum == null) {
            skyddsrum = new ArrayList<SkyddsrumType>();
        }
        return this.skyddsrum;
    }

    /**
     * Gets the value of the entre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntreType }
     * 
     * 
     */
    public List<EntreType> getEntre() {
        if (entre == null) {
            entre = new ArrayList<EntreType>();
        }
        return this.entre;
    }

    /**
     * Gets the value of the verksamhetsatgard property.
     * 
     * @return
     *     possible object is
     *     {@link VerksamhetsatgardType }
     *     
     */
    public VerksamhetsatgardType getVerksamhetsatgard() {
        return verksamhetsatgard;
    }

    /**
     * Sets the value of the verksamhetsatgard property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerksamhetsatgardType }
     *     
     */
    public void setVerksamhetsatgard(VerksamhetsatgardType value) {
        this.verksamhetsatgard = value;
    }

    /**
     * Gets the value of the byggnadsdel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the byggnadsdel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getByggnadsdel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ByggnadsdelType }
     * 
     * 
     */
    public List<ByggnadsdelType> getByggnadsdel() {
        if (byggnadsdel == null) {
            byggnadsdel = new ArrayList<ByggnadsdelType>();
        }
        return this.byggnadsdel;
    }

    /**
     * Gets the value of the tillhor property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsreferensPropertyType }
     *     
     */
    public RegisterenhetsreferensPropertyType getTillhor() {
        return tillhor;
    }

    /**
     * Sets the value of the tillhor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsreferensPropertyType }
     *     
     */
    public void setTillhor(RegisterenhetsreferensPropertyType value) {
        this.tillhor = value;
    }

    /**
     * Gets the value of the liggerPa property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsreferensPropertyType }
     *     
     */
    public RegisterenhetsreferensPropertyType getLiggerPa() {
        return liggerPa;
    }

    /**
     * Sets the value of the liggerPa property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsreferensPropertyType }
     *     
     */
    public void setLiggerPa(RegisterenhetsreferensPropertyType value) {
        this.liggerPa = value;
    }

    /**
     * Gets the value of the berorsAv property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsreferensArrayPropertyType }
     *     
     */
    public RegisterenhetsreferensArrayPropertyType getBerorsAv() {
        return berorsAv;
    }

    /**
     * Sets the value of the berorsAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsreferensArrayPropertyType }
     *     
     */
    public void setBerorsAv(RegisterenhetsreferensArrayPropertyType value) {
        this.berorsAv = value;
    }

}
