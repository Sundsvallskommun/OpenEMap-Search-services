
package net.opengis.gml._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * A property that has a curve as its value domain is an appropriate geometry element
 *         encapsulated in an element of this type. XLink references are not supported.
 *       
 * 
 * <p>Java class for CurvePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurvePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractCurve"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurvePropertyType", propOrder = {
    "abstractCurve"
})
public class CurvePropertyType {

    @XmlElementRef(name = "AbstractCurve", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractCurveType> abstractCurve;

    /**
     * Gets the value of the abstractCurve property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AbstractCurveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineStringType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractCurveType> getAbstractCurve() {
        return abstractCurve;
    }

    /**
     * Sets the value of the abstractCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AbstractCurveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineStringType }{@code >}
     *     
     */
    public void setAbstractCurve(JAXBElement<? extends AbstractCurveType> value) {
        this.abstractCurve = value;
    }

}
