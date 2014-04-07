
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForsamlingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForsamlingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="forsamlingskod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="forsamlingsnamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForsamlingType", propOrder = {
    "forsamlingskod",
    "forsamlingsnamn"
})
public class ForsamlingType {

    @XmlElement(required = true)
    protected String forsamlingskod;
    @XmlElement(required = true)
    protected String forsamlingsnamn;

    /**
     * Gets the value of the forsamlingskod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForsamlingskod() {
        return forsamlingskod;
    }

    /**
     * Sets the value of the forsamlingskod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForsamlingskod(String value) {
        this.forsamlingskod = value;
    }

    /**
     * Gets the value of the forsamlingsnamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForsamlingsnamn() {
        return forsamlingsnamn;
    }

    /**
     * Sets the value of the forsamlingsnamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForsamlingsnamn(String value) {
        this.forsamlingsnamn = value;
    }

}
