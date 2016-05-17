
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisterenhetshistorikType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterenhetshistorikType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ursprung" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}RegisterenhetsreferensArrayPropertyType" minOccurs="0"/>
 *         &lt;element name="AvskildMark" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}RegisterenhetsreferensArrayPropertyType" minOccurs="0"/>
 *         &lt;element name="AvregistreradTill" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}RegisterenhetsreferensArrayPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterenhetshistorikType", propOrder = {
    "ursprung",
    "avskildMark",
    "avregistreradTill"
})
public class RegisterenhetshistorikType {

    @XmlElement(name = "Ursprung")
    protected RegisterenhetsreferensArrayPropertyType ursprung;
    @XmlElement(name = "AvskildMark")
    protected RegisterenhetsreferensArrayPropertyType avskildMark;
    @XmlElement(name = "AvregistreradTill")
    protected RegisterenhetsreferensArrayPropertyType avregistreradTill;

    /**
     * Gets the value of the ursprung property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsreferensArrayPropertyType }
     *     
     */
    public RegisterenhetsreferensArrayPropertyType getUrsprung() {
        return ursprung;
    }

    /**
     * Sets the value of the ursprung property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsreferensArrayPropertyType }
     *     
     */
    public void setUrsprung(RegisterenhetsreferensArrayPropertyType value) {
        this.ursprung = value;
    }

    /**
     * Gets the value of the avskildMark property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsreferensArrayPropertyType }
     *     
     */
    public RegisterenhetsreferensArrayPropertyType getAvskildMark() {
        return avskildMark;
    }

    /**
     * Sets the value of the avskildMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsreferensArrayPropertyType }
     *     
     */
    public void setAvskildMark(RegisterenhetsreferensArrayPropertyType value) {
        this.avskildMark = value;
    }

    /**
     * Gets the value of the avregistreradTill property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsreferensArrayPropertyType }
     *     
     */
    public RegisterenhetsreferensArrayPropertyType getAvregistreradTill() {
        return avregistreradTill;
    }

    /**
     * Sets the value of the avregistreradTill property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsreferensArrayPropertyType }
     *     
     */
    public void setAvregistreradTill(RegisterenhetsreferensArrayPropertyType value) {
        this.avregistreradTill = value;
    }

}
