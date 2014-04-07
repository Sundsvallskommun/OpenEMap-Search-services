
package net.opengis.gml.v_3_1_1.profiles.gmlsfprofile.v_1_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A property that has a collection of points as its value
 *             domain shall contain an appropriate geometry element
 *             encapsulated in an element of this type.
 *          
 * 
 * <p>Java class for MultiPointPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiPointPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}MultiPoint"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiPointPropertyType", propOrder = {
    "multiPoint"
})
public class MultiPointPropertyType {

    @XmlElement(name = "MultiPoint", required = true)
    protected MultiPointType multiPoint;

    /**
     * Gets the value of the multiPoint property.
     * 
     * @return
     *     possible object is
     *     {@link MultiPointType }
     *     
     */
    public MultiPointType getMultiPoint() {
        return multiPoint;
    }

    /**
     * Sets the value of the multiPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiPointType }
     *     
     */
    public void setMultiPoint(MultiPointType value) {
        this.multiPoint = value;
    }

    public boolean isSetMultiPoint() {
        return (this.multiPoint!= null);
    }

}
