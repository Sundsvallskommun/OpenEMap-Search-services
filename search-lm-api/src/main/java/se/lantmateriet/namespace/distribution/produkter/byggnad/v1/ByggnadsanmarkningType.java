
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ByggnadsanmarkningType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ByggnadsanmarkningType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anmarkningstyp" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}ByggnadsanmarkningstypType"/>
 *         &lt;element name="anmarkningstext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ByggnadsanmarkningType", propOrder = {
    "anmarkningstyp",
    "anmarkningstext"
})
public class ByggnadsanmarkningType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ByggnadsanmarkningstypType anmarkningstyp;
    @XmlElement(required = true)
    protected String anmarkningstext;

    /**
     * Gets the value of the anmarkningstyp property.
     * 
     * @return
     *     possible object is
     *     {@link ByggnadsanmarkningstypType }
     *     
     */
    public ByggnadsanmarkningstypType getAnmarkningstyp() {
        return anmarkningstyp;
    }

    /**
     * Sets the value of the anmarkningstyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ByggnadsanmarkningstypType }
     *     
     */
    public void setAnmarkningstyp(ByggnadsanmarkningstypType value) {
        this.anmarkningstyp = value;
    }

    /**
     * Gets the value of the anmarkningstext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnmarkningstext() {
        return anmarkningstext;
    }

    /**
     * Sets the value of the anmarkningstext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnmarkningstext(String value) {
        this.anmarkningstext = value;
    }

}
