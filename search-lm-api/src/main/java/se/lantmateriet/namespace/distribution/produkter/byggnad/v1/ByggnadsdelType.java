
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ByggnadsdelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ByggnadsdelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="insamlingslage" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}ByggnadslageType"/>
 *         &lt;element name="Byggnadsyta" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}ByggnadsytaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ByggnadsdelType", propOrder = {
    "insamlingslage",
    "byggnadsyta"
})
public class ByggnadsdelType {

    @XmlElement(required = true)
    protected ByggnadslageType insamlingslage;
    @XmlElement(name = "Byggnadsyta", required = true)
    protected ByggnadsytaType byggnadsyta;

    /**
     * Gets the value of the insamlingslage property.
     * 
     * @return
     *     possible object is
     *     {@link ByggnadslageType }
     *     
     */
    public ByggnadslageType getInsamlingslage() {
        return insamlingslage;
    }

    /**
     * Sets the value of the insamlingslage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ByggnadslageType }
     *     
     */
    public void setInsamlingslage(ByggnadslageType value) {
        this.insamlingslage = value;
    }

    /**
     * Gets the value of the byggnadsyta property.
     * 
     * @return
     *     possible object is
     *     {@link ByggnadsytaType }
     *     
     */
    public ByggnadsytaType getByggnadsyta() {
        return byggnadsyta;
    }

    /**
     * Sets the value of the byggnadsyta property.
     * 
     * @param value
     *     allowed object is
     *     {@link ByggnadsytaType }
     *     
     */
    public void setByggnadsyta(ByggnadsytaType value) {
        this.byggnadsyta = value;
    }

}
