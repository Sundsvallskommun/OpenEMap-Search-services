
package se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindRegisterbeteckningRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindRegisterbeteckningRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegisterbeteckningSearchStringFilter" type="{http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3}SearchStringFilterType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindRegisterbeteckningRequestType", propOrder = {
    "registerbeteckningSearchStringFilter"
})
public class FindRegisterbeteckningRequestType {

    @XmlElement(name = "RegisterbeteckningSearchStringFilter", required = true)
    protected SearchStringFilterType registerbeteckningSearchStringFilter;

    /**
     * Gets the value of the registerbeteckningSearchStringFilter property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringFilterType }
     *     
     */
    public SearchStringFilterType getRegisterbeteckningSearchStringFilter() {
        return registerbeteckningSearchStringFilter;
    }

    /**
     * Sets the value of the registerbeteckningSearchStringFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringFilterType }
     *     
     */
    public void setRegisterbeteckningSearchStringFilter(SearchStringFilterType value) {
        this.registerbeteckningSearchStringFilter = value;
    }

}
