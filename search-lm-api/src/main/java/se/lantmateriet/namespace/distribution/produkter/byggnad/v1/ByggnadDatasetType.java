
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ByggnadDatasetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ByggnadDatasetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="basinformation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="atgard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="geometri" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="berorkrets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "ByggnadDatasetType", propOrder = {
    "basinformation",
    "atgard",
    "geometri",
    "berorkrets",
    "total"
})
public class ByggnadDatasetType {

    @XmlElement(defaultValue = "false")
    protected Boolean basinformation;
    @XmlElement(defaultValue = "false")
    protected Boolean atgard;
    @XmlElement(defaultValue = "false")
    protected Boolean geometri;
    @XmlElement(defaultValue = "false")
    protected Boolean berorkrets;
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
     * Gets the value of the berorkrets property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBerorkrets() {
        return berorkrets;
    }

    /**
     * Sets the value of the berorkrets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBerorkrets(Boolean value) {
        this.berorkrets = value;
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
