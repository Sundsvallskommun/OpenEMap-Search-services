
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindRegisterenhetRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindRegisterenhetRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeometriFilter" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}GeometriFilterType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindRegisterenhetRequestType", propOrder = {
    "geometriFilter"
})
public class FindRegisterenhetRequestType {

    @XmlElement(name = "GeometriFilter", required = true)
    protected GeometriFilterType geometriFilter;

    /**
     * Gets the value of the geometriFilter property.
     * 
     * @return
     *     possible object is
     *     {@link GeometriFilterType }
     *     
     */
    public GeometriFilterType getGeometriFilter() {
        return geometriFilter;
    }

    /**
     * Sets the value of the geometriFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometriFilterType }
     *     
     */
    public void setGeometriFilter(GeometriFilterType value) {
        this.geometriFilter = value;
    }

}
