
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AndelISamfallighetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AndelISamfallighetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Delagare" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}RegisterenhetsreferensPropertyType"/>
 *           &lt;element name="Samfallighet" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}RegisterenhetsreferensPropertyType"/>
 *         &lt;/choice>
 *         &lt;element name="AnnanDelagare" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}AnnanDelagare" minOccurs="0"/>
 *         &lt;element name="andel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="andelstalssort" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}AndelstalssortType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AndelISamfallighetType", propOrder = {
    "delagare",
    "samfallighet",
    "annanDelagare",
    "andel",
    "andelstalssort"
})
public class AndelISamfallighetType {

    @XmlElement(name = "Delagare")
    protected RegisterenhetsreferensPropertyType delagare;
    @XmlElement(name = "Samfallighet")
    protected RegisterenhetsreferensPropertyType samfallighet;
    @XmlElement(name = "AnnanDelagare")
    protected AnnanDelagare annanDelagare;
    protected String andel;
    @XmlSchemaType(name = "string")
    protected AndelstalssortType andelstalssort;

    /**
     * Gets the value of the delagare property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsreferensPropertyType }
     *     
     */
    public RegisterenhetsreferensPropertyType getDelagare() {
        return delagare;
    }

    /**
     * Sets the value of the delagare property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsreferensPropertyType }
     *     
     */
    public void setDelagare(RegisterenhetsreferensPropertyType value) {
        this.delagare = value;
    }

    /**
     * Gets the value of the samfallighet property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsreferensPropertyType }
     *     
     */
    public RegisterenhetsreferensPropertyType getSamfallighet() {
        return samfallighet;
    }

    /**
     * Sets the value of the samfallighet property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsreferensPropertyType }
     *     
     */
    public void setSamfallighet(RegisterenhetsreferensPropertyType value) {
        this.samfallighet = value;
    }

    /**
     * Gets the value of the annanDelagare property.
     * 
     * @return
     *     possible object is
     *     {@link AnnanDelagare }
     *     
     */
    public AnnanDelagare getAnnanDelagare() {
        return annanDelagare;
    }

    /**
     * Sets the value of the annanDelagare property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnanDelagare }
     *     
     */
    public void setAnnanDelagare(AnnanDelagare value) {
        this.annanDelagare = value;
    }

    /**
     * Gets the value of the andel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAndel() {
        return andel;
    }

    /**
     * Sets the value of the andel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAndel(String value) {
        this.andel = value;
    }

    /**
     * Gets the value of the andelstalssort property.
     * 
     * @return
     *     possible object is
     *     {@link AndelstalssortType }
     *     
     */
    public AndelstalssortType getAndelstalssort() {
        return andelstalssort;
    }

    /**
     * Sets the value of the andelstalssort property.
     * 
     * @param value
     *     allowed object is
     *     {@link AndelstalssortType }
     *     
     */
    public void setAndelstalssort(AndelstalssortType value) {
        this.andelstalssort = value;
    }

}
