
package se.lantmateriet.namespace.distribution.products.placename.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://namespace.lantmateriet.se/distribution/products/placename/v1}FritextCriteria"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fritextCriteria"
})
@XmlRootElement(name = "FindOrtnamnsreferensRequest")
public class FindOrtnamnsreferensRequest {

    @XmlElement(name = "FritextCriteria", required = true)
    protected FritextCriteriaType fritextCriteria;

    /**
     * Gets the value of the fritextCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link FritextCriteriaType }
     *     
     */
    public FritextCriteriaType getFritextCriteria() {
        return fritextCriteria;
    }

    /**
     * Sets the value of the fritextCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FritextCriteriaType }
     *     
     */
    public void setFritextCriteria(FritextCriteriaType value) {
        this.fritextCriteria = value;
    }

    public boolean isSetFritextCriteria() {
        return (this.fritextCriteria!= null);
    }

}
