
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FastighetsatgardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FastighetsatgardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atgardsnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="atgardstidpunkt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anteckning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atgardstyp" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.5}FastighetsatgardstypType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="littera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fastighetsarende" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.5}FastighetsarendeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FastighetsatgardType", propOrder = {
    "atgardsnummer",
    "atgardstidpunkt",
    "anteckning",
    "atgardstyp",
    "littera",
    "fastighetsarende"
})
public class FastighetsatgardType {

    protected int atgardsnummer;
    protected String atgardstidpunkt;
    protected String anteckning;
    protected List<FastighetsatgardstypType> atgardstyp;
    protected String littera;
    @XmlElement(name = "Fastighetsarende")
    protected FastighetsarendeType fastighetsarende;

    /**
     * Gets the value of the atgardsnummer property.
     * 
     */
    public int getAtgardsnummer() {
        return atgardsnummer;
    }

    /**
     * Sets the value of the atgardsnummer property.
     * 
     */
    public void setAtgardsnummer(int value) {
        this.atgardsnummer = value;
    }

    /**
     * Gets the value of the atgardstidpunkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtgardstidpunkt() {
        return atgardstidpunkt;
    }

    /**
     * Sets the value of the atgardstidpunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtgardstidpunkt(String value) {
        this.atgardstidpunkt = value;
    }

    /**
     * Gets the value of the anteckning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnteckning() {
        return anteckning;
    }

    /**
     * Sets the value of the anteckning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnteckning(String value) {
        this.anteckning = value;
    }

    /**
     * Gets the value of the atgardstyp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atgardstyp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtgardstyp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FastighetsatgardstypType }
     * 
     * 
     */
    public List<FastighetsatgardstypType> getAtgardstyp() {
        if (atgardstyp == null) {
            atgardstyp = new ArrayList<FastighetsatgardstypType>();
        }
        return this.atgardstyp;
    }

    /**
     * Gets the value of the littera property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLittera() {
        return littera;
    }

    /**
     * Sets the value of the littera property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLittera(String value) {
        this.littera = value;
    }

    /**
     * Gets the value of the fastighetsarende property.
     * 
     * @return
     *     possible object is
     *     {@link FastighetsarendeType }
     *     
     */
    public FastighetsarendeType getFastighetsarende() {
        return fastighetsarende;
    }

    /**
     * Sets the value of the fastighetsarende property.
     * 
     * @param value
     *     allowed object is
     *     {@link FastighetsarendeType }
     *     
     */
    public void setFastighetsarende(FastighetsarendeType value) {
        this.fastighetsarende = value;
    }

}
