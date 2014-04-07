
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ByggnadsandamalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ByggnadsandamalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="osakertandamal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="huvudandamal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ByggnadsandamalType", propOrder = {
    "osakertandamal",
    "huvudandamal"
})
@XmlSeeAlso({
    BostadType.class,
    VerksamhetType.class,
    IndustriType.class,
    KomplementbyggnadType.class,
    OvrigByggnadType.class,
    EkonomibyggnadType.class,
    SamhallsfunktionType.class
})
public abstract class ByggnadsandamalType {

    protected Boolean osakertandamal;
    protected Boolean huvudandamal;

    /**
     * Gets the value of the osakertandamal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOsakertandamal() {
        return osakertandamal;
    }

    /**
     * Sets the value of the osakertandamal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOsakertandamal(Boolean value) {
        this.osakertandamal = value;
    }

    /**
     * Gets the value of the huvudandamal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHuvudandamal() {
        return huvudandamal;
    }

    /**
     * Sets the value of the huvudandamal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHuvudandamal(Boolean value) {
        this.huvudandamal = value;
    }

}
