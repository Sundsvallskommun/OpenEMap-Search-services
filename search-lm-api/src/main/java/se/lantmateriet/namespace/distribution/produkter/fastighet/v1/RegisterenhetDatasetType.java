
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisterenhetDatasetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterenhetDatasetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="basinformation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="atgard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="geometri" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="historik" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="andel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="aldreBeteckning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterenhetDatasetType", propOrder = {
    "basinformation",
    "atgard",
    "geometri",
    "historik",
    "andel",
    "aldreBeteckning",
    "total"
})
public class RegisterenhetDatasetType {

    @XmlElement(defaultValue = "false")
    protected Boolean basinformation;
    @XmlElement(defaultValue = "false")
    protected Boolean atgard;
    @XmlElement(defaultValue = "false")
    protected Boolean geometri;
    @XmlElement(defaultValue = "false")
    protected Boolean historik;
    @XmlElement(defaultValue = "false")
    protected Boolean andel;
    @XmlElement(defaultValue = "false")
    protected Boolean aldreBeteckning;
    protected Boolean total;

    /**
     * Gets the value of the basinformation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBasinformation() {
        return basinformation;
    }

    /**
     * Sets the value of the basinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBasinformation(Boolean value) {
        this.basinformation = value;
    }

    /**
     * Gets the value of the atgard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAtgard() {
        return atgard;
    }

    /**
     * Sets the value of the atgard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAtgard(Boolean value) {
        this.atgard = value;
    }

    /**
     * Gets the value of the geometri property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeometri() {
        return geometri;
    }

    /**
     * Sets the value of the geometri property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeometri(Boolean value) {
        this.geometri = value;
    }

    /**
     * Gets the value of the historik property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHistorik() {
        return historik;
    }

    /**
     * Sets the value of the historik property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHistorik(Boolean value) {
        this.historik = value;
    }

    /**
     * Gets the value of the andel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAndel() {
        return andel;
    }

    /**
     * Sets the value of the andel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAndel(Boolean value) {
        this.andel = value;
    }

    /**
     * Gets the value of the aldreBeteckning property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAldreBeteckning() {
        return aldreBeteckning;
    }

    /**
     * Sets the value of the aldreBeteckning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAldreBeteckning(Boolean value) {
        this.aldreBeteckning = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotal(Boolean value) {
        this.total = value;
    }

}
