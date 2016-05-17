
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForrattningsstatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForrattningsstatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dagboksnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flaggniva" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}FlaggnivaType" minOccurs="0"/>
 *         &lt;element name="flaggdatum1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flaggdatum2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flaggdatum3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForrattningsstatusType", propOrder = {
    "dagboksnummer",
    "flaggniva",
    "flaggdatum1",
    "flaggdatum2",
    "flaggdatum3"
})
public class ForrattningsstatusType {

    @XmlElement(required = true)
    protected String dagboksnummer;
    @XmlSchemaType(name = "string")
    protected FlaggnivaType flaggniva;
    protected String flaggdatum1;
    protected String flaggdatum2;
    protected String flaggdatum3;

    /**
     * Gets the value of the dagboksnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDagboksnummer() {
        return dagboksnummer;
    }

    /**
     * Sets the value of the dagboksnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDagboksnummer(String value) {
        this.dagboksnummer = value;
    }

    /**
     * Gets the value of the flaggniva property.
     * 
     * @return
     *     possible object is
     *     {@link FlaggnivaType }
     *     
     */
    public FlaggnivaType getFlaggniva() {
        return flaggniva;
    }

    /**
     * Sets the value of the flaggniva property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlaggnivaType }
     *     
     */
    public void setFlaggniva(FlaggnivaType value) {
        this.flaggniva = value;
    }

    /**
     * Gets the value of the flaggdatum1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlaggdatum1() {
        return flaggdatum1;
    }

    /**
     * Sets the value of the flaggdatum1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlaggdatum1(String value) {
        this.flaggdatum1 = value;
    }

    /**
     * Gets the value of the flaggdatum2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlaggdatum2() {
        return flaggdatum2;
    }

    /**
     * Sets the value of the flaggdatum2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlaggdatum2(String value) {
        this.flaggdatum2 = value;
    }

    /**
     * Gets the value of the flaggdatum3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlaggdatum3() {
        return flaggdatum3;
    }

    /**
     * Sets the value of the flaggdatum3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlaggdatum3(String value) {
        this.flaggdatum3 = value;
    }

}
