
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BostadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BostadType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}ByggnadsandamalType">
 *       &lt;sequence>
 *         &lt;element name="andamal" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}BostadsandamalType"/>
 *         &lt;element name="totalboarea" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BostadType", propOrder = {
    "andamal",
    "totalboarea"
})
public class BostadType
    extends ByggnadsandamalType
{

    @XmlElement(required = true)
    protected BostadsandamalType andamal;
    protected Integer totalboarea;

    /**
     * Gets the value of the andamal property.
     * 
     * @return
     *     possible object is
     *     {@link BostadsandamalType }
     *     
     */
    public BostadsandamalType getAndamal() {
        return andamal;
    }

    /**
     * Sets the value of the andamal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BostadsandamalType }
     *     
     */
    public void setAndamal(BostadsandamalType value) {
        this.andamal = value;
    }

    /**
     * Gets the value of the totalboarea property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalboarea() {
        return totalboarea;
    }

    /**
     * Sets the value of the totalboarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalboarea(Integer value) {
        this.totalboarea = value;
    }

}
