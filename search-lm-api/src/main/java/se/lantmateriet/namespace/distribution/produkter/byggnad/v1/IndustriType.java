
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndustriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndustriType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}ByggnadsandamalType">
 *       &lt;sequence>
 *         &lt;element name="andamal" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}IndustriandamalType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndustriType", propOrder = {
    "andamal"
})
public class IndustriType
    extends ByggnadsandamalType
{

    @XmlElement(required = true)
    protected IndustriandamalType andamal;

    /**
     * Gets the value of the andamal property.
     * 
     * @return
     *     possible object is
     *     {@link IndustriandamalType }
     *     
     */
    public IndustriandamalType getAndamal() {
        return andamal;
    }

    /**
     * Sets the value of the andamal property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustriandamalType }
     *     
     */
    public void setAndamal(IndustriandamalType value) {
        this.andamal = value;
    }

}
