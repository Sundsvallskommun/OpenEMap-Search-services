
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisterenhetsreferensType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterenhetsreferensType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objektidentitet" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}UUIDType" minOccurs="0"/>
 *         &lt;element name="fastighetsnyckel" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}FastighetsnyckelType"/>
 *         &lt;element name="beteckning" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="typ" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}RegisterenhetstypType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterenhetsreferensType", propOrder = {
    "objektidentitet",
    "fastighetsnyckel",
    "beteckning",
    "typ"
})
public class RegisterenhetsreferensType {

    protected String objektidentitet;
    @XmlElement(required = true)
    protected String fastighetsnyckel;
    @XmlElement(required = true)
    protected String beteckning;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RegisterenhetstypType typ;

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
     * Gets the value of the beteckning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeteckning() {
        return beteckning;
    }

    /**
     * Sets the value of the beteckning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeteckning(String value) {
        this.beteckning = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetstypType }
     *     
     */
    public RegisterenhetstypType getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetstypType }
     *     
     */
    public void setTyp(RegisterenhetstypType value) {
        this.typ = value;
    }

}
