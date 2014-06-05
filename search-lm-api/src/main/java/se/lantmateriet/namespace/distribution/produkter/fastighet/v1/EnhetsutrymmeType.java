
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.GeometryArrayPropertyType;
import net.opengis.gml._3.PointPropertyType;


/**
 * 
 *         3D-utrymme. Egentligen 2D-område + höjd ovan mark.
 *       
 * 
 * <p>Java class for EnhetsutrymmeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnhetsutrymmeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="omradesnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="utrymmestyp" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.5}UtrymmestypType" minOccurs="0"/>
 *         &lt;element name="hojdlage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storlek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="boarea" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="osakerhetBoarea" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="registerkarta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ytkvalitet" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.5}YtkvalitetType" minOccurs="0"/>
 *         &lt;element name="Yta" type="{http://www.opengis.net/gml/3.2}GeometryArrayPropertyType" minOccurs="0"/>
 *         &lt;element name="Centralpunkt" type="{http://www.opengis.net/gml/3.2}PointPropertyType" minOccurs="0"/>
 *         &lt;element name="UrholkarRegisterenhet" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.5}RegisterenhetsreferensArrayPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnhetsutrymmeType", propOrder = {
    "omradesnummer",
    "utrymmestyp",
    "hojdlage",
    "storlek",
    "boarea",
    "osakerhetBoarea",
    "registerkarta",
    "ytkvalitet",
    "yta",
    "centralpunkt",
    "urholkarRegisterenhet"
})
public class EnhetsutrymmeType {

    protected int omradesnummer;
    protected UtrymmestypType utrymmestyp;
    protected String hojdlage;
    protected String storlek;
    protected Integer boarea;
    protected Boolean osakerhetBoarea;
    protected String registerkarta;
    protected YtkvalitetType ytkvalitet;
    @XmlElement(name = "Yta")
    protected GeometryArrayPropertyType yta;
    @XmlElement(name = "Centralpunkt")
    protected PointPropertyType centralpunkt;
    @XmlElement(name = "UrholkarRegisterenhet")
    protected RegisterenhetsreferensArrayPropertyType urholkarRegisterenhet;

    /**
     * Gets the value of the omradesnummer property.
     * 
     */
    public int getOmradesnummer() {
        return omradesnummer;
    }

    /**
     * Sets the value of the omradesnummer property.
     * 
     */
    public void setOmradesnummer(int value) {
        this.omradesnummer = value;
    }

    /**
     * Gets the value of the utrymmestyp property.
     * 
     * @return
     *     possible object is
     *     {@link UtrymmestypType }
     *     
     */
    public UtrymmestypType getUtrymmestyp() {
        return utrymmestyp;
    }

    /**
     * Sets the value of the utrymmestyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtrymmestypType }
     *     
     */
    public void setUtrymmestyp(UtrymmestypType value) {
        this.utrymmestyp = value;
    }

    /**
     * Gets the value of the hojdlage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHojdlage() {
        return hojdlage;
    }

    /**
     * Sets the value of the hojdlage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHojdlage(String value) {
        this.hojdlage = value;
    }

    /**
     * Gets the value of the storlek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorlek() {
        return storlek;
    }

    /**
     * Sets the value of the storlek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorlek(String value) {
        this.storlek = value;
    }

    /**
     * Gets the value of the boarea property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBoarea() {
        return boarea;
    }

    /**
     * Sets the value of the boarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBoarea(Integer value) {
        this.boarea = value;
    }

    /**
     * Gets the value of the osakerhetBoarea property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOsakerhetBoarea() {
        return osakerhetBoarea;
    }

    /**
     * Sets the value of the osakerhetBoarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOsakerhetBoarea(Boolean value) {
        this.osakerhetBoarea = value;
    }

    /**
     * Gets the value of the registerkarta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterkarta() {
        return registerkarta;
    }

    /**
     * Sets the value of the registerkarta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterkarta(String value) {
        this.registerkarta = value;
    }

    /**
     * Gets the value of the ytkvalitet property.
     * 
     * @return
     *     possible object is
     *     {@link YtkvalitetType }
     *     
     */
    public YtkvalitetType getYtkvalitet() {
        return ytkvalitet;
    }

    /**
     * Sets the value of the ytkvalitet property.
     * 
     * @param value
     *     allowed object is
     *     {@link YtkvalitetType }
     *     
     */
    public void setYtkvalitet(YtkvalitetType value) {
        this.ytkvalitet = value;
    }

    /**
     * Gets the value of the yta property.
     * 
     * @return
     *     possible object is
     *     {@link GeometryArrayPropertyType }
     *     
     */
    public GeometryArrayPropertyType getYta() {
        return yta;
    }

    /**
     * Sets the value of the yta property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryArrayPropertyType }
     *     
     */
    public void setYta(GeometryArrayPropertyType value) {
        this.yta = value;
    }

    /**
     * Gets the value of the centralpunkt property.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getCentralpunkt() {
        return centralpunkt;
    }

    /**
     * Sets the value of the centralpunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setCentralpunkt(PointPropertyType value) {
        this.centralpunkt = value;
    }

    /**
     * Gets the value of the urholkarRegisterenhet property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsreferensArrayPropertyType }
     *     
     */
    public RegisterenhetsreferensArrayPropertyType getUrholkarRegisterenhet() {
        return urholkarRegisterenhet;
    }

    /**
     * Sets the value of the urholkarRegisterenhet property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsreferensArrayPropertyType }
     *     
     */
    public void setUrholkarRegisterenhet(RegisterenhetsreferensArrayPropertyType value) {
        this.urholkarRegisterenhet = value;
    }

}
