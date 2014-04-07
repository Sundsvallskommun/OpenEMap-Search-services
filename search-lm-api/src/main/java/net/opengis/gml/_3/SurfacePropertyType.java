
package net.opengis.gml._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * A property that has a surface as its value domain is an appropriate geometry element
 *         encapsulated in an element of this type. XLink references are not supported.
 *       
 * 
 * <p>Java class for SurfacePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SurfacePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractSurface"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfacePropertyType", propOrder = {
    "abstractSurface"
})
public class SurfacePropertyType {

    @XmlElementRef(name = "AbstractSurface", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractSurfaceType> abstractSurface;

    /**
     * Gets the value of the abstractSurface property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AbstractSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractSurfaceType> getAbstractSurface() {
        return abstractSurface;
    }

    /**
     * Sets the value of the abstractSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AbstractSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     *     
     */
    public void setAbstractSurface(JAXBElement<? extends AbstractSurfaceType> value) {
        this.abstractSurface = ((JAXBElement<? extends AbstractSurfaceType> ) value);
    }

}
