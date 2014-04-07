
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisterenhetsanmarkningType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterenhetsanmarkningType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informationsgruppkod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lopnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="registerenhetsanmarkning" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterenhetsanmarkningType", propOrder = {
    "informationsgruppkod",
    "lopnummer",
    "registerenhetsanmarkning"
})
public class RegisterenhetsanmarkningType {

    @XmlElement(required = true)
    protected String informationsgruppkod;
    @XmlElement(required = true)
    protected String lopnummer;
    @XmlElement(required = true)
    protected String registerenhetsanmarkning;

    /**
     * Gets the value of the informationsgruppkod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationsgruppkod() {
        return informationsgruppkod;
    }

    /**
     * Sets the value of the informationsgruppkod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationsgruppkod(String value) {
        this.informationsgruppkod = value;
    }

    /**
     * Gets the value of the lopnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLopnummer() {
        return lopnummer;
    }

    /**
     * Sets the value of the lopnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLopnummer(String value) {
        this.lopnummer = value;
    }

    /**
     * Gets the value of the registerenhetsanmarkning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterenhetsanmarkning() {
        return registerenhetsanmarkning;
    }

    /**
     * Sets the value of the registerenhetsanmarkning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterenhetsanmarkning(String value) {
        this.registerenhetsanmarkning = value;
    }

}
