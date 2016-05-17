
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SkattetalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SkattetalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="skattetal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="skattetalssort" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}SkattetalssortType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SkattetalType", propOrder = {
    "skattetal",
    "skattetalssort"
})
public class SkattetalType {

    @XmlElement(required = true)
    protected String skattetal;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SkattetalssortType skattetalssort;

    /**
     * Gets the value of the skattetal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkattetal() {
        return skattetal;
    }

    /**
     * Sets the value of the skattetal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkattetal(String value) {
        this.skattetal = value;
    }

    /**
     * Gets the value of the skattetalssort property.
     * 
     * @return
     *     possible object is
     *     {@link SkattetalssortType }
     *     
     */
    public SkattetalssortType getSkattetalssort() {
        return skattetalssort;
    }

    /**
     * Sets the value of the skattetalssort property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkattetalssortType }
     *     
     */
    public void setSkattetalssort(SkattetalssortType value) {
        this.skattetalssort = value;
    }

}
