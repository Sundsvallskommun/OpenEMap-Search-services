
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisterenhetsreferensPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterenhetsreferensPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Registerenhetsreferens" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.5}RegisterenhetsreferensType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterenhetsreferensPropertyType", propOrder = {
    "registerenhetsreferens"
})
public class RegisterenhetsreferensPropertyType {

    @XmlElement(name = "Registerenhetsreferens", required = true)
    protected RegisterenhetsreferensType registerenhetsreferens;

    /**
     * Gets the value of the registerenhetsreferens property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsreferensType }
     *     
     */
    public RegisterenhetsreferensType getRegisterenhetsreferens() {
        return registerenhetsreferens;
    }

    /**
     * Sets the value of the registerenhetsreferens property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsreferensType }
     *     
     */
    public void setRegisterenhetsreferens(RegisterenhetsreferensType value) {
        this.registerenhetsreferens = value;
    }

}
