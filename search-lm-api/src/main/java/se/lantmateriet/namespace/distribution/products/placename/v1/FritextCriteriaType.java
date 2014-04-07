
package se.lantmateriet.namespace.distribution.products.placename.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FritextCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FritextCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fritext" type="{http://namespace.lantmateriet.se/distribution/products/placename/v1}MatchFritextType"/>
 *         &lt;element name="maxAntal" type="{http://namespace.lantmateriet.se/distribution/products/placename/v1}MaxAntalType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FritextCriteriaType", propOrder = {
    "fritext",
    "maxAntal"
})
public class FritextCriteriaType {

    @XmlElement(required = true)
    protected MatchFritextType fritext;
    @XmlElement(defaultValue = "100")
    protected Integer maxAntal;

    /**
     * Gets the value of the fritext property.
     * 
     * @return
     *     possible object is
     *     {@link MatchFritextType }
     *     
     */
    public MatchFritextType getFritext() {
        return fritext;
    }

    /**
     * Sets the value of the fritext property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchFritextType }
     *     
     */
    public void setFritext(MatchFritextType value) {
        this.fritext = value;
    }

    public boolean isSetFritext() {
        return (this.fritext!= null);
    }

    /**
     * Gets the value of the maxAntal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAntal() {
        return maxAntal;
    }

    /**
     * Sets the value of the maxAntal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAntal(Integer value) {
        this.maxAntal = value;
    }

    public boolean isSetMaxAntal() {
        return (this.maxAntal!= null);
    }

}
