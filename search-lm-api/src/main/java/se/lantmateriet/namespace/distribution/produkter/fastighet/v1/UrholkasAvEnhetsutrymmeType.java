
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Referens till ett 3D-utrymme eller en ägarlägenhetfastighet som urholkar en fastighet.
 *       
 * 
 * <p>Java class for UrholkasAvEnhetsutrymmeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrholkasAvEnhetsutrymmeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Registerenhetsreferens" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}RegisterenhetsreferensType"/>
 *         &lt;element name="omradesnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrholkasAvEnhetsutrymmeType", propOrder = {
    "registerenhetsreferens",
    "omradesnummer"
})
public class UrholkasAvEnhetsutrymmeType {

    @XmlElement(name = "Registerenhetsreferens", required = true)
    protected RegisterenhetsreferensType registerenhetsreferens;
    protected int omradesnummer;

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

}
