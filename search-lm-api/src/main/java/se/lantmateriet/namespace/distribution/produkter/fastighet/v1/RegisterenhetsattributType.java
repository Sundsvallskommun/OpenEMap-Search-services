
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.PointArrayPropertyType;


/**
 * <p>Java class for RegisterenhetsattributType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterenhetsattributType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="avregistreringsdatum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avregistreringsaktbeteckning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avregistreringsatgardstyp" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1}FastighetsatgardstypType" minOccurs="0"/>
 *         &lt;element name="lankod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kommunkod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalLandarea" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalVattenarea" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalFiskeomradesarea" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalRegisterarea" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalAreaOsaker" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tredimensionell" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Centralpunkt" type="{http://www.opengis.net/gml/3.2}PointArrayPropertyType" minOccurs="0"/>
 *         &lt;element name="ofullstandigRattighetsredovisning" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allvarligtFel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="senasteAndring" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterenhetsattributType", propOrder = {
    "avregistreringsdatum",
    "avregistreringsaktbeteckning",
    "avregistreringsatgardstyp",
    "lankod",
    "kommunkod",
    "totalLandarea",
    "totalVattenarea",
    "totalFiskeomradesarea",
    "totalRegisterarea",
    "totalAreaOsaker",
    "tredimensionell",
    "centralpunkt",
    "ofullstandigRattighetsredovisning",
    "allvarligtFel",
    "senasteAndring"
})
@XmlSeeAlso({
    SamfallighetsattributType.class,
    FastighetsattributType.class
})
public abstract class RegisterenhetsattributType {

    protected String avregistreringsdatum;
    protected String avregistreringsaktbeteckning;
    protected FastighetsatgardstypType avregistreringsatgardstyp;
    @XmlElement(required = true)
    protected String lankod;
    @XmlElement(required = true)
    protected String kommunkod;
    protected Double totalLandarea;
    protected Double totalVattenarea;
    protected Double totalFiskeomradesarea;
    protected Double totalRegisterarea;
    protected Boolean totalAreaOsaker;
    protected boolean tredimensionell;
    @XmlElement(name = "Centralpunkt")
    protected PointArrayPropertyType centralpunkt;
    protected boolean ofullstandigRattighetsredovisning;
    protected boolean allvarligtFel;
    protected String senasteAndring;

    /**
     * Gets the value of the avregistreringsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvregistreringsdatum() {
        return avregistreringsdatum;
    }

    /**
     * Sets the value of the avregistreringsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvregistreringsdatum(String value) {
        this.avregistreringsdatum = value;
    }

    /**
     * Gets the value of the avregistreringsaktbeteckning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvregistreringsaktbeteckning() {
        return avregistreringsaktbeteckning;
    }

    /**
     * Sets the value of the avregistreringsaktbeteckning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvregistreringsaktbeteckning(String value) {
        this.avregistreringsaktbeteckning = value;
    }

    /**
     * Gets the value of the avregistreringsatgardstyp property.
     * 
     * @return
     *     possible object is
     *     {@link FastighetsatgardstypType }
     *     
     */
    public FastighetsatgardstypType getAvregistreringsatgardstyp() {
        return avregistreringsatgardstyp;
    }

    /**
     * Sets the value of the avregistreringsatgardstyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FastighetsatgardstypType }
     *     
     */
    public void setAvregistreringsatgardstyp(FastighetsatgardstypType value) {
        this.avregistreringsatgardstyp = value;
    }

    /**
     * Gets the value of the lankod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLankod() {
        return lankod;
    }

    /**
     * Sets the value of the lankod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLankod(String value) {
        this.lankod = value;
    }

    /**
     * Gets the value of the kommunkod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKommunkod() {
        return kommunkod;
    }

    /**
     * Sets the value of the kommunkod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKommunkod(String value) {
        this.kommunkod = value;
    }

    /**
     * Gets the value of the totalLandarea property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalLandarea() {
        return totalLandarea;
    }

    /**
     * Sets the value of the totalLandarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalLandarea(Double value) {
        this.totalLandarea = value;
    }

    /**
     * Gets the value of the totalVattenarea property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalVattenarea() {
        return totalVattenarea;
    }

    /**
     * Sets the value of the totalVattenarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalVattenarea(Double value) {
        this.totalVattenarea = value;
    }

    /**
     * Gets the value of the totalFiskeomradesarea property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalFiskeomradesarea() {
        return totalFiskeomradesarea;
    }

    /**
     * Sets the value of the totalFiskeomradesarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalFiskeomradesarea(Double value) {
        this.totalFiskeomradesarea = value;
    }

    /**
     * Gets the value of the totalRegisterarea property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalRegisterarea() {
        return totalRegisterarea;
    }

    /**
     * Sets the value of the totalRegisterarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalRegisterarea(Double value) {
        this.totalRegisterarea = value;
    }

    /**
     * Gets the value of the totalAreaOsaker property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalAreaOsaker() {
        return totalAreaOsaker;
    }

    /**
     * Sets the value of the totalAreaOsaker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalAreaOsaker(Boolean value) {
        this.totalAreaOsaker = value;
    }

    /**
     * Gets the value of the tredimensionell property.
     * 
     */
    public boolean isTredimensionell() {
        return tredimensionell;
    }

    /**
     * Sets the value of the tredimensionell property.
     * 
     */
    public void setTredimensionell(boolean value) {
        this.tredimensionell = value;
    }

    /**
     * Gets the value of the centralpunkt property.
     * 
     * @return
     *     possible object is
     *     {@link PointArrayPropertyType }
     *     
     */
    public PointArrayPropertyType getCentralpunkt() {
        return centralpunkt;
    }

    /**
     * Sets the value of the centralpunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointArrayPropertyType }
     *     
     */
    public void setCentralpunkt(PointArrayPropertyType value) {
        this.centralpunkt = value;
    }

    /**
     * Gets the value of the ofullstandigRattighetsredovisning property.
     * 
     */
    public boolean isOfullstandigRattighetsredovisning() {
        return ofullstandigRattighetsredovisning;
    }

    /**
     * Sets the value of the ofullstandigRattighetsredovisning property.
     * 
     */
    public void setOfullstandigRattighetsredovisning(boolean value) {
        this.ofullstandigRattighetsredovisning = value;
    }

    /**
     * Gets the value of the allvarligtFel property.
     * 
     */
    public boolean isAllvarligtFel() {
        return allvarligtFel;
    }

    /**
     * Sets the value of the allvarligtFel property.
     * 
     */
    public void setAllvarligtFel(boolean value) {
        this.allvarligtFel = value;
    }

    /**
     * Gets the value of the senasteAndring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenasteAndring() {
        return senasteAndring;
    }

    /**
     * Sets the value of the senasteAndring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenasteAndring(String value) {
        this.senasteAndring = value;
    }

}
