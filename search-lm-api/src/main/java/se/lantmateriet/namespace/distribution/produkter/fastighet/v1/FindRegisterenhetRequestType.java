
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
 *         &lt;element name="RegisterenhetGeometryFilter" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1}RegisterenhetGeometryFilterType"/>
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
    "registerenhetGeometryFilter"
})
public class FindRegisterenhetRequestType {

    @XmlElement(name = "RegisterenhetGeometryFilter", required = true)
    protected RegisterenhetGeometryFilterType registerenhetGeometryFilter;

    /**
     * Gets the value of the registerenhetGeometryFilter property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetGeometryFilterType }
     *     
     */
    public RegisterenhetGeometryFilterType getRegisterenhetGeometryFilter() {
        return registerenhetGeometryFilter;
    }

    /**
     * Sets the value of the registerenhetGeometryFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetGeometryFilterType }
     *     
     */
    public void setRegisterenhetGeometryFilter(RegisterenhetGeometryFilterType value) {
        this.registerenhetGeometryFilter = value;
    }

}
