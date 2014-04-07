
package net.opengis.gml._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A property that has a collection of curves as its value domain is an appropriate geometry element
 *         encapsulated in an element of this type. XLink references are not supported.
 *       
 * 
 * <p>Java class for MultiCurvePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiCurvePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}MultiCurve"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiCurvePropertyType", propOrder = {
    "multiCurve"
})
public class MultiCurvePropertyType {

    @XmlElement(name = "MultiCurve", required = true)
    protected MultiCurveType multiCurve;

    /**
     * Gets the value of the multiCurve property.
     * 
     * @return
     *     possible object is
     *     {@link MultiCurveType }
     *     
     */
    public MultiCurveType getMultiCurve() {
        return multiCurve;
    }

    /**
     * Sets the value of the multiCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCurveType }
     *     
     */
    public void setMultiCurve(MultiCurveType value) {
        this.multiCurve = value;
    }

}
