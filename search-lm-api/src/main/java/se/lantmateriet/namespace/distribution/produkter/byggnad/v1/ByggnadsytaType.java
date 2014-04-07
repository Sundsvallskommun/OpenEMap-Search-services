
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.GeometryArrayPropertyType;


/**
 * <p>Java class for ByggnadsytaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ByggnadsytaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LagesnoggrannhetPlan" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}LagesnoggrannhetType" minOccurs="0"/>
 *         &lt;element name="LagesnoggrannhetHojd" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}LagesnoggrannhetType" minOccurs="0"/>
 *         &lt;element name="koordinatsystemPlan" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="koordinatsystemHojd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Yta" type="{http://www.opengis.net/gml/3.2}GeometryArrayPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ByggnadsytaType", propOrder = {
    "lagesnoggrannhetPlan",
    "lagesnoggrannhetHojd",
    "koordinatsystemPlan",
    "koordinatsystemHojd",
    "yta"
})
public class ByggnadsytaType {

    @XmlElement(name = "LagesnoggrannhetPlan")
    protected LagesnoggrannhetType lagesnoggrannhetPlan;
    @XmlElement(name = "LagesnoggrannhetHojd")
    protected LagesnoggrannhetType lagesnoggrannhetHojd;
    @XmlElement(required = true)
    protected String koordinatsystemPlan;
    @XmlElement(required = true)
    protected String koordinatsystemHojd;
    @XmlElement(name = "Yta", required = true)
    protected GeometryArrayPropertyType yta;

    /**
     * Gets the value of the lagesnoggrannhetPlan property.
     * 
     * @return
     *     possible object is
     *     {@link LagesnoggrannhetType }
     *     
     */
    public LagesnoggrannhetType getLagesnoggrannhetPlan() {
        return lagesnoggrannhetPlan;
    }

    /**
     * Sets the value of the lagesnoggrannhetPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link LagesnoggrannhetType }
     *     
     */
    public void setLagesnoggrannhetPlan(LagesnoggrannhetType value) {
        this.lagesnoggrannhetPlan = value;
    }

    /**
     * Gets the value of the lagesnoggrannhetHojd property.
     * 
     * @return
     *     possible object is
     *     {@link LagesnoggrannhetType }
     *     
     */
    public LagesnoggrannhetType getLagesnoggrannhetHojd() {
        return lagesnoggrannhetHojd;
    }

    /**
     * Sets the value of the lagesnoggrannhetHojd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LagesnoggrannhetType }
     *     
     */
    public void setLagesnoggrannhetHojd(LagesnoggrannhetType value) {
        this.lagesnoggrannhetHojd = value;
    }

    /**
     * Gets the value of the koordinatsystemPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoordinatsystemPlan() {
        return koordinatsystemPlan;
    }

    /**
     * Sets the value of the koordinatsystemPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoordinatsystemPlan(String value) {
        this.koordinatsystemPlan = value;
    }

    /**
     * Gets the value of the koordinatsystemHojd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoordinatsystemHojd() {
        return koordinatsystemHojd;
    }

    /**
     * Sets the value of the koordinatsystemHojd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoordinatsystemHojd(String value) {
        this.koordinatsystemHojd = value;
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

}
