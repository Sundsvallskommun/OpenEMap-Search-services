
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindByggnadRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindByggnadRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ByggnadRegisterenhetFilter" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}ByggnadRegisterenhetFilterType"/>
 *           &lt;element name="ByggnadGeometryFilter" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}ByggnadGeometryFilterType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindByggnadRequestType", propOrder = {
    "byggnadRegisterenhetFilter",
    "byggnadGeometryFilter"
})
public class FindByggnadRequestType {

    @XmlElement(name = "ByggnadRegisterenhetFilter")
    protected ByggnadRegisterenhetFilterType byggnadRegisterenhetFilter;
    @XmlElement(name = "ByggnadGeometryFilter")
    protected ByggnadGeometryFilterType byggnadGeometryFilter;

    /**
     * Gets the value of the byggnadRegisterenhetFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ByggnadRegisterenhetFilterType }
     *     
     */
    public ByggnadRegisterenhetFilterType getByggnadRegisterenhetFilter() {
        return byggnadRegisterenhetFilter;
    }

    /**
     * Sets the value of the byggnadRegisterenhetFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ByggnadRegisterenhetFilterType }
     *     
     */
    public void setByggnadRegisterenhetFilter(ByggnadRegisterenhetFilterType value) {
        this.byggnadRegisterenhetFilter = value;
    }

    /**
     * Gets the value of the byggnadGeometryFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ByggnadGeometryFilterType }
     *     
     */
    public ByggnadGeometryFilterType getByggnadGeometryFilter() {
        return byggnadGeometryFilter;
    }

    /**
     * Sets the value of the byggnadGeometryFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ByggnadGeometryFilterType }
     *     
     */
    public void setByggnadGeometryFilter(ByggnadGeometryFilterType value) {
        this.byggnadGeometryFilter = value;
    }

}
