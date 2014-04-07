
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statistiskMetod" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}StatistisktMattType"/>
 *         &lt;element name="varde" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="vardeenhet" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}MattenhetType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultatType", propOrder = {
    "statistiskMetod",
    "varde",
    "vardeenhet"
})
public class ResultatType {

    @XmlElement(required = true)
    protected StatistisktMattType statistiskMetod;
    @XmlElement(required = true)
    protected BigDecimal varde;
    @XmlElement(required = true)
    protected MattenhetType vardeenhet;

    /**
     * Gets the value of the statistiskMetod property.
     * 
     * @return
     *     possible object is
     *     {@link StatistisktMattType }
     *     
     */
    public StatistisktMattType getStatistiskMetod() {
        return statistiskMetod;
    }

    /**
     * Sets the value of the statistiskMetod property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatistisktMattType }
     *     
     */
    public void setStatistiskMetod(StatistisktMattType value) {
        this.statistiskMetod = value;
    }

    /**
     * Gets the value of the varde property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVarde() {
        return varde;
    }

    /**
     * Sets the value of the varde property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVarde(BigDecimal value) {
        this.varde = value;
    }

    /**
     * Gets the value of the vardeenhet property.
     * 
     * @return
     *     possible object is
     *     {@link MattenhetType }
     *     
     */
    public MattenhetType getVardeenhet() {
        return vardeenhet;
    }

    /**
     * Sets the value of the vardeenhet property.
     * 
     * @param value
     *     allowed object is
     *     {@link MattenhetType }
     *     
     */
    public void setVardeenhet(MattenhetType value) {
        this.vardeenhet = value;
    }

}
