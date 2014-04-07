
package se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.AbstractFeatureMemberType;


/**
 * <p>Java class for RegisterbeteckningMemberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterbeteckningMemberType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureMemberType">
 *       &lt;sequence>
 *         &lt;element ref="{http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3}Registerbeteckning"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterbeteckningMemberType", propOrder = {
    "registerbeteckning"
})
public class RegisterbeteckningMemberType
    extends AbstractFeatureMemberType
{

    @XmlElement(name = "Registerbeteckning", required = true)
    protected RegisterbeteckningType registerbeteckning;

    /**
     * Gets the value of the registerbeteckning property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterbeteckningType }
     *     
     */
    public RegisterbeteckningType getRegisterbeteckning() {
        return registerbeteckning;
    }

    /**
     * Sets the value of the registerbeteckning property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterbeteckningType }
     *     
     */
    public void setRegisterbeteckning(RegisterbeteckningType value) {
        this.registerbeteckning = value;
    }

}
