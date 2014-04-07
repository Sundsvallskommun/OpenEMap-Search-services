
package se.lantmateriet.namespace.distribution.produkter.uppslag.adress.v1;

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
 *         &lt;element name="RegisterenhetAdressFilter" type="{http://namespace.lantmateriet.se/distribution/produkter/uppslag/adress/v1}RegisterenhetAdressFilterType"/>
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
    "registerenhetAdressFilter"
})
public class FindRegisterenhetRequestType {

    @XmlElement(name = "RegisterenhetAdressFilter", required = true)
    protected RegisterenhetAdressFilterType registerenhetAdressFilter;

    /**
     * Gets the value of the registerenhetAdressFilter property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetAdressFilterType }
     *     
     */
    public RegisterenhetAdressFilterType getRegisterenhetAdressFilter() {
        return registerenhetAdressFilter;
    }

    /**
     * Sets the value of the registerenhetAdressFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetAdressFilterType }
     *     
     */
    public void setRegisterenhetAdressFilter(RegisterenhetAdressFilterType value) {
        this.registerenhetAdressFilter = value;
    }

}
