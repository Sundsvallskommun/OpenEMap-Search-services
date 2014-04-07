
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnnanDelagare complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnnanDelagare">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="skifteslagDelagare" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnanDelagare", propOrder = {
    "skifteslagDelagare"
})
public class AnnanDelagare {

    @XmlElement(required = true)
    protected String skifteslagDelagare;

    /**
     * Gets the value of the skifteslagDelagare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkifteslagDelagare() {
        return skifteslagDelagare;
    }

    /**
     * Sets the value of the skifteslagDelagare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkifteslagDelagare(String value) {
        this.skifteslagDelagare = value;
    }

}
