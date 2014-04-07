
package se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisterbeteckningFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterbeteckningFilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registeromrade" type="{http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3}SearchStringType"/>
 *         &lt;element name="trakt" type="{http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3}MatchSearchStringType"/>
 *         &lt;element name="block" type="{http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3}MatchSearchStringType" minOccurs="0"/>
 *         &lt;element name="enhet" type="{http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3}MatchSearchStringType" minOccurs="0"/>
 *         &lt;element name="maxHits" type="{http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3}MaxHitsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterbeteckningFilterType", propOrder = {
    "registeromrade",
    "trakt",
    "block",
    "enhet",
    "maxHits"
})
public class RegisterbeteckningFilterType {

    @XmlElement(required = true)
    protected String registeromrade;
    @XmlElement(required = true)
    protected MatchSearchStringType trakt;
    protected MatchSearchStringType block;
    protected MatchSearchStringType enhet;
    @XmlElement(defaultValue = "100")
    protected Integer maxHits;

    /**
     * Gets the value of the registeromrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteromrade() {
        return registeromrade;
    }

    /**
     * Sets the value of the registeromrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteromrade(String value) {
        this.registeromrade = value;
    }

    /**
     * Gets the value of the trakt property.
     * 
     * @return
     *     possible object is
     *     {@link MatchSearchStringType }
     *     
     */
    public MatchSearchStringType getTrakt() {
        return trakt;
    }

    /**
     * Sets the value of the trakt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchSearchStringType }
     *     
     */
    public void setTrakt(MatchSearchStringType value) {
        this.trakt = value;
    }

    /**
     * Gets the value of the block property.
     * 
     * @return
     *     possible object is
     *     {@link MatchSearchStringType }
     *     
     */
    public MatchSearchStringType getBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchSearchStringType }
     *     
     */
    public void setBlock(MatchSearchStringType value) {
        this.block = value;
    }

    /**
     * Gets the value of the enhet property.
     * 
     * @return
     *     possible object is
     *     {@link MatchSearchStringType }
     *     
     */
    public MatchSearchStringType getEnhet() {
        return enhet;
    }

    /**
     * Sets the value of the enhet property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchSearchStringType }
     *     
     */
    public void setEnhet(MatchSearchStringType value) {
        this.enhet = value;
    }

    /**
     * Gets the value of the maxHits property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxHits() {
        return maxHits;
    }

    /**
     * Sets the value of the maxHits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxHits(Integer value) {
        this.maxHits = value;
    }

}
