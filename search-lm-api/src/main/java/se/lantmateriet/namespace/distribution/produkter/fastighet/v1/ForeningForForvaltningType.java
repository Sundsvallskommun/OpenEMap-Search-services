
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForeningForForvaltningType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForeningForForvaltningType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="foreningstyp" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}ForeningstypType"/>
 *         &lt;element name="foreningsnamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeningForForvaltningType", propOrder = {
    "foreningstyp",
    "foreningsnamn"
})
public class ForeningForForvaltningType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ForeningstypType foreningstyp;
    @XmlElement(required = true)
    protected String foreningsnamn;

    /**
     * Gets the value of the foreningstyp property.
     * 
     * @return
     *     possible object is
     *     {@link ForeningstypType }
     *     
     */
    public ForeningstypType getForeningstyp() {
        return foreningstyp;
    }

    /**
     * Sets the value of the foreningstyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeningstypType }
     *     
     */
    public void setForeningstyp(ForeningstypType value) {
        this.foreningstyp = value;
    }

    /**
     * Gets the value of the foreningsnamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeningsnamn() {
        return foreningsnamn;
    }

    /**
     * Sets the value of the foreningsnamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeningsnamn(String value) {
        this.foreningsnamn = value;
    }

}
