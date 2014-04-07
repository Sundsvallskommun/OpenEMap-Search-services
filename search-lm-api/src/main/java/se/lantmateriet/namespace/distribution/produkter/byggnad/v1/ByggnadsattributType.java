
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ByggnadsattributType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ByggnadsattributType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objektversion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="versionGiltigFran" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="husnummer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nybyggnadsar" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="undantagenFranAdressattning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="huvudbyggnad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tillbyggnadsar" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ofriGrund" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="byggnadsservitut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ByggnadsattributType", propOrder = {
    "objektversion",
    "versionGiltigFran",
    "husnummer",
    "nybyggnadsar",
    "undantagenFranAdressattning",
    "huvudbyggnad",
    "tillbyggnadsar",
    "ofriGrund",
    "byggnadsservitut"
})
public class ByggnadsattributType {

    protected int objektversion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar versionGiltigFran;
    protected Integer husnummer;
    protected Integer nybyggnadsar;
    protected Boolean undantagenFranAdressattning;
    protected Boolean huvudbyggnad;
    protected Integer tillbyggnadsar;
    protected Boolean ofriGrund;
    protected Boolean byggnadsservitut;

    /**
     * Gets the value of the objektversion property.
     * 
     */
    public int getObjektversion() {
        return objektversion;
    }

    /**
     * Sets the value of the objektversion property.
     * 
     */
    public void setObjektversion(int value) {
        this.objektversion = value;
    }

    /**
     * Gets the value of the versionGiltigFran property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionGiltigFran() {
        return versionGiltigFran;
    }

    /**
     * Sets the value of the versionGiltigFran property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionGiltigFran(XMLGregorianCalendar value) {
        this.versionGiltigFran = value;
    }

    /**
     * Gets the value of the husnummer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHusnummer() {
        return husnummer;
    }

    /**
     * Sets the value of the husnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHusnummer(Integer value) {
        this.husnummer = value;
    }

    /**
     * Gets the value of the nybyggnadsar property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNybyggnadsar() {
        return nybyggnadsar;
    }

    /**
     * Sets the value of the nybyggnadsar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNybyggnadsar(Integer value) {
        this.nybyggnadsar = value;
    }

    /**
     * Gets the value of the undantagenFranAdressattning property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUndantagenFranAdressattning() {
        return undantagenFranAdressattning;
    }

    /**
     * Sets the value of the undantagenFranAdressattning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUndantagenFranAdressattning(Boolean value) {
        this.undantagenFranAdressattning = value;
    }

    /**
     * Gets the value of the huvudbyggnad property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHuvudbyggnad() {
        return huvudbyggnad;
    }

    /**
     * Sets the value of the huvudbyggnad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHuvudbyggnad(Boolean value) {
        this.huvudbyggnad = value;
    }

    /**
     * Gets the value of the tillbyggnadsar property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTillbyggnadsar() {
        return tillbyggnadsar;
    }

    /**
     * Sets the value of the tillbyggnadsar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTillbyggnadsar(Integer value) {
        this.tillbyggnadsar = value;
    }

    /**
     * Gets the value of the ofriGrund property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfriGrund() {
        return ofriGrund;
    }

    /**
     * Sets the value of the ofriGrund property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfriGrund(Boolean value) {
        this.ofriGrund = value;
    }

    /**
     * Gets the value of the byggnadsservitut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isByggnadsservitut() {
        return byggnadsservitut;
    }

    /**
     * Sets the value of the byggnadsservitut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setByggnadsservitut(Boolean value) {
        this.byggnadsservitut = value;
    }

}
