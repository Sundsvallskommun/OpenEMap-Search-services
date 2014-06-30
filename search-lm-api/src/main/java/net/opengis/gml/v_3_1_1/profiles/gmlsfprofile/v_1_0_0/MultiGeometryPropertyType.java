
package net.opengis.gml.v_3_1_1.profiles.gmlsfprofile.v_1_0_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A property that has a geometric aggregate as its value domain
 *             shall contain an appropriate geometry element encapsulated in
 *             an element of this type.
 *          
 * 
 * <p>Java class for MultiGeometryPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiGeometryPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}_GeometricAggregate"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiGeometryPropertyType", propOrder = {
    "geometricAggregate"
})
public class MultiGeometryPropertyType {

    @XmlElementRef(name = "_GeometricAggregate", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractGeometricAggregateType> geometricAggregate;

    /**
     * Gets the value of the geometricAggregate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultiSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractGeometricAggregateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultiCurveType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractGeometricAggregateType> getGeometricAggregate() {
        return geometricAggregate;
    }

    /**
     * Sets the value of the geometricAggregate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultiSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractGeometricAggregateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultiCurveType }{@code >}
     *     
     */
    public void setGeometricAggregate(JAXBElement<? extends AbstractGeometricAggregateType> value) {
        this.geometricAggregate = value;
    }

    public boolean isSetGeometricAggregate() {
        return (this.geometricAggregate!= null);
    }

}
