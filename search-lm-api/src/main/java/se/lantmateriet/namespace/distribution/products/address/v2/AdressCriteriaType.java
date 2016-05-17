
package se.lantmateriet.namespace.distribution.products.address.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdressCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdressCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kommunnamn" type="{http://namespace.lantmateriet.se/distribution/products/address/v2}FritextType"/>
 *         &lt;element name="adressomrade" type="{http://namespace.lantmateriet.se/distribution/products/address/v2}MatchFritextType"/>
 *         &lt;element name="adressplatsnummer" type="{http://namespace.lantmateriet.se/distribution/products/address/v2}MatchFritextType" minOccurs="0"/>
 *         &lt;element name="maxAntal" type="{http://namespace.lantmateriet.se/distribution/products/address/v2}MaxCriteriaAntalType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdressCriteriaType", propOrder = {
    "kommunnamn",
    "adressomrade",
    "adressplatsnummer",
    "maxAntal"
})
public class AdressCriteriaType {

    @XmlElement(required = true)
    protected String kommunnamn;
    @XmlElement(required = true)
    protected MatchFritextType adressomrade;
    protected MatchFritextType adressplatsnummer;
    @XmlElement(defaultValue = "100")
    @XmlSchemaType(name = "integer")
    protected Integer maxAntal;

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

    public boolean isSetKommunnamn() {
        return (this.kommunnamn!= null);
    }

    /**
     * Gets the value of the adressomrade property.
     * 
     * @return
     *     possible object is
     *     {@link MatchFritextType }
     *     
     */
    public MatchFritextType getAdressomrade() {
        return adressomrade;
    }

    /**
     * Sets the value of the adressomrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchFritextType }
     *     
     */
    public void setAdressomrade(MatchFritextType value) {
        this.adressomrade = value;
    }

    public boolean isSetAdressomrade() {
        return (this.adressomrade!= null);
    }

    /**
     * Gets the value of the adressplatsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link MatchFritextType }
     *     
     */
    public MatchFritextType getAdressplatsnummer() {
        return adressplatsnummer;
    }

    /**
     * Sets the value of the adressplatsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchFritextType }
     *     
     */
    public void setAdressplatsnummer(MatchFritextType value) {
        this.adressplatsnummer = value;
    }

    public boolean isSetAdressplatsnummer() {
        return (this.adressplatsnummer!= null);
    }

    /**
     * Gets the value of the maxAntal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAntal() {
        return maxAntal;
    }

    /**
     * Sets the value of the maxAntal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAntal(Integer value) {
        this.maxAntal = value;
    }

    public boolean isSetMaxAntal() {
        return (this.maxAntal!= null);
    }

}
