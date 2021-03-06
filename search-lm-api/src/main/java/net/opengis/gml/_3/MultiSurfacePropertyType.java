
package net.opengis.gml._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A property that has a collection of surfaces as its value domain is an appropriate geometry element
 *         encapsulated in an element of this type. XLink references are not supported.
 *       
 * 
 * <p>Java class for MultiSurfacePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiSurfacePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}MultiSurface"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiSurfacePropertyType", propOrder = {
    "multiSurface"
})
public class MultiSurfacePropertyType {

    @XmlElement(name = "MultiSurface", required = true)
    protected MultiSurfaceType multiSurface;

    /**
     * Gets the value of the multiSurface property.
     * 
     * @return
     *     possible object is
     *     {@link MultiSurfaceType }
     *     
     */
    public MultiSurfaceType getMultiSurface() {
        return multiSurface;
    }

    /**
     * Sets the value of the multiSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSurfaceType }
     *     
     */
    public void setMultiSurface(MultiSurfaceType value) {
        this.multiSurface = value;
    }

}
