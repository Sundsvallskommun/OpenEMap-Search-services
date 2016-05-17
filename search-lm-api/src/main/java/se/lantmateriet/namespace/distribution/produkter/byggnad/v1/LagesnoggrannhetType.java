
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LagesnoggrannhetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LagesnoggrannhetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="utvarderingsmetod" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}UtvarderingsmetodType" minOccurs="0"/>
 *         &lt;element name="ingenInformation" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}IngenInformationType" minOccurs="0"/>
 *         &lt;element name="Resultat" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}ResultatType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LagesnoggrannhetType", propOrder = {
    "utvarderingsmetod",
    "ingenInformation",
    "resultat"
})
public class LagesnoggrannhetType {

    @XmlSchemaType(name = "string")
    protected UtvarderingsmetodType utvarderingsmetod;
    @XmlSchemaType(name = "string")
    protected IngenInformationType ingenInformation;
    @XmlElement(name = "Resultat")
    protected ResultatType resultat;

    /**
     * Gets the value of the utvarderingsmetod property.
     * 
     * @return
     *     possible object is
     *     {@link UtvarderingsmetodType }
     *     
     */
    public UtvarderingsmetodType getUtvarderingsmetod() {
        return utvarderingsmetod;
    }

    /**
     * Sets the value of the utvarderingsmetod property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtvarderingsmetodType }
     *     
     */
    public void setUtvarderingsmetod(UtvarderingsmetodType value) {
        this.utvarderingsmetod = value;
    }

    /**
     * Gets the value of the ingenInformation property.
     * 
     * @return
     *     possible object is
     *     {@link IngenInformationType }
     *     
     */
    public IngenInformationType getIngenInformation() {
        return ingenInformation;
    }

    /**
     * Sets the value of the ingenInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IngenInformationType }
     *     
     */
    public void setIngenInformation(IngenInformationType value) {
        this.ingenInformation = value;
    }

    /**
     * Gets the value of the resultat property.
     * 
     * @return
     *     possible object is
     *     {@link ResultatType }
     *     
     */
    public ResultatType getResultat() {
        return resultat;
    }

    /**
     * Sets the value of the resultat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultatType }
     *     
     */
    public void setResultat(ResultatType value) {
        this.resultat = value;
    }

}
