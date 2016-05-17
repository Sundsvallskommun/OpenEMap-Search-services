
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Tidigare beteckning, före beteckningsreformen.
 *       
 * 
 * <p>Java class for AldreBeteckningType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AldreBeteckningType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="niva1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="niva2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="niva3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="niva4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="omregistreringsdatum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aktbeteckning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AldreBeteckningType", propOrder = {
    "niva1",
    "niva2",
    "niva3",
    "niva4",
    "omregistreringsdatum",
    "aktbeteckning"
})
public class AldreBeteckningType {

    @XmlElement(required = true)
    protected String niva1;
    @XmlElement(required = true)
    protected String niva2;
    @XmlElement(required = true)
    protected String niva3;
    @XmlElement(required = true)
    protected String niva4;
    protected String omregistreringsdatum;
    protected String aktbeteckning;

    /**
     * Gets the value of the niva1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNiva1() {
        return niva1;
    }

    /**
     * Sets the value of the niva1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNiva1(String value) {
        this.niva1 = value;
    }

    /**
     * Gets the value of the niva2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNiva2() {
        return niva2;
    }

    /**
     * Sets the value of the niva2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNiva2(String value) {
        this.niva2 = value;
    }

    /**
     * Gets the value of the niva3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNiva3() {
        return niva3;
    }

    /**
     * Sets the value of the niva3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNiva3(String value) {
        this.niva3 = value;
    }

    /**
     * Gets the value of the niva4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNiva4() {
        return niva4;
    }

    /**
     * Sets the value of the niva4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNiva4(String value) {
        this.niva4 = value;
    }

    /**
     * Gets the value of the omregistreringsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmregistreringsdatum() {
        return omregistreringsdatum;
    }

    /**
     * Sets the value of the omregistreringsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmregistreringsdatum(String value) {
        this.omregistreringsdatum = value;
    }

    /**
     * Gets the value of the aktbeteckning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAktbeteckning() {
        return aktbeteckning;
    }

    /**
     * Sets the value of the aktbeteckning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAktbeteckning(String value) {
        this.aktbeteckning = value;
    }

}
