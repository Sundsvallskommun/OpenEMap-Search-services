
package se.lantmateriet.namespace.distribution.products.address.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdressreferensType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdressreferensType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="etikett" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdressreferensType", propOrder = {
    "etikett",
    "id"
})
public class AdressreferensType {

    @XmlElement(required = true)
    protected String etikett;
    @XmlElement(required = true)
    protected String id;

    /**
     * Gets the value of the etikett property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtikett() {
        return etikett;
    }

    /**
     * Sets the value of the etikett property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtikett(String value) {
        this.etikett = value;
    }

    public boolean isSetEtikett() {
        return (this.etikett!= null);
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
    }

}
