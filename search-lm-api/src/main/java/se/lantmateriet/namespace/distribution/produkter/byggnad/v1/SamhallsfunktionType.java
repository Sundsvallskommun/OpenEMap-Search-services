
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SamhallsfunktionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SamhallsfunktionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}ByggnadsandamalType">
 *       &lt;sequence>
 *         &lt;element name="andamal" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}SamhallsfunktionsandamalType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SamhallsfunktionType", propOrder = {
    "andamal"
})
public class SamhallsfunktionType
    extends ByggnadsandamalType
{

    @XmlElement(required = true)
    protected SamhallsfunktionsandamalType andamal;

    /**
     * Gets the value of the andamal property.
     * 
     * @return
     *     possible object is
     *     {@link SamhallsfunktionsandamalType }
     *     
     */
    public SamhallsfunktionsandamalType getAndamal() {
        return andamal;
    }

    /**
     * Sets the value of the andamal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamhallsfunktionsandamalType }
     *     
     */
    public void setAndamal(SamhallsfunktionsandamalType value) {
        this.andamal = value;
    }

}
