
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VerksamhetsatgardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerksamhetsatgardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atgardstyp" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}AtgardstypType"/>
 *         &lt;element name="ansvarigOrganisation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="utforandeOrganisation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atgardstidpunkt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerksamhetsatgardType", propOrder = {
    "atgardstyp",
    "ansvarigOrganisation",
    "utforandeOrganisation",
    "atgardstidpunkt"
})
public class VerksamhetsatgardType {

    @XmlElement(required = true)
    protected AtgardstypType atgardstyp;
    @XmlElement(required = true)
    protected String ansvarigOrganisation;
    protected String utforandeOrganisation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar atgardstidpunkt;

    /**
     * Gets the value of the atgardstyp property.
     * 
     * @return
     *     possible object is
     *     {@link AtgardstypType }
     *     
     */
    public AtgardstypType getAtgardstyp() {
        return atgardstyp;
    }

    /**
     * Sets the value of the atgardstyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtgardstypType }
     *     
     */
    public void setAtgardstyp(AtgardstypType value) {
        this.atgardstyp = value;
    }

    /**
     * Gets the value of the ansvarigOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnsvarigOrganisation() {
        return ansvarigOrganisation;
    }

    /**
     * Sets the value of the ansvarigOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnsvarigOrganisation(String value) {
        this.ansvarigOrganisation = value;
    }

    /**
     * Gets the value of the utforandeOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtforandeOrganisation() {
        return utforandeOrganisation;
    }

    /**
     * Sets the value of the utforandeOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtforandeOrganisation(String value) {
        this.utforandeOrganisation = value;
    }

    /**
     * Gets the value of the atgardstidpunkt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAtgardstidpunkt() {
        return atgardstidpunkt;
    }

    /**
     * Sets the value of the atgardstidpunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAtgardstidpunkt(XMLGregorianCalendar value) {
        this.atgardstidpunkt = value;
    }

}
