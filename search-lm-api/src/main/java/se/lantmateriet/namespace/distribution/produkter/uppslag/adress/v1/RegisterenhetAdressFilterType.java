
package se.lantmateriet.namespace.distribution.produkter.uppslag.adress.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisterenhetAdressFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterenhetAdressFilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kommunnamn" type="{http://namespace.lantmateriet.se/distribution/produkter/uppslag/adress/v1}SearchStringType"/>
 *         &lt;element name="adressomrade" type="{http://namespace.lantmateriet.se/distribution/produkter/uppslag/adress/v1}MatchSearchStringType"/>
 *         &lt;element name="adressplats" type="{http://namespace.lantmateriet.se/distribution/produkter/uppslag/adress/v1}MatchSearchStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterenhetAdressFilterType", propOrder = {
    "kommunnamn",
    "adressomrade",
    "adressplats"
})
public class RegisterenhetAdressFilterType {

    @XmlElement(required = true)
    protected String kommunnamn;
    @XmlElement(required = true)
    protected MatchSearchStringType adressomrade;
    protected MatchSearchStringType adressplats;

    /**
     * Gets the value of the kommunnamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKommunnamn() {
        return kommunnamn;
    }

    /**
     * Sets the value of the kommunnamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKommunnamn(String value) {
        this.kommunnamn = value;
    }

    /**
     * Gets the value of the adressomrade property.
     * 
     * @return
     *     possible object is
     *     {@link MatchSearchStringType }
     *     
     */
    public MatchSearchStringType getAdressomrade() {
        return adressomrade;
    }

    /**
     * Sets the value of the adressomrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchSearchStringType }
     *     
     */
    public void setAdressomrade(MatchSearchStringType value) {
        this.adressomrade = value;
    }

    /**
     * Gets the value of the adressplats property.
     * 
     * @return
     *     possible object is
     *     {@link MatchSearchStringType }
     *     
     */
    public MatchSearchStringType getAdressplats() {
        return adressplats;
    }

    /**
     * Sets the value of the adressplats property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchSearchStringType }
     *     
     */
    public void setAdressplats(MatchSearchStringType value) {
        this.adressplats = value;
    }

}
