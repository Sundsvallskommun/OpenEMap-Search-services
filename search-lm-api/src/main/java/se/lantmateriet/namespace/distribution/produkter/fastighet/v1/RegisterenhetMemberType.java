
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.AbstractFeatureMemberType;


/**
 * <p>Java class for RegisterenhetMemberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterenhetMemberType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureMemberType">
 *       &lt;sequence>
 *         &lt;element ref="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1}Registerenhet"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterenhetMemberType", propOrder = {
    "registerenhet"
})
public class RegisterenhetMemberType
    extends AbstractFeatureMemberType
{

    @XmlElementRef(name = "Registerenhet", namespace = "http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1", type = JAXBElement.class)
    protected JAXBElement<? extends RegisterenhetType> registerenhet;

    /**
     * Gets the value of the registerenhet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegisterenhetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SamfallighetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FastighetType }{@code >}
     *     
     */
    public JAXBElement<? extends RegisterenhetType> getRegisterenhet() {
        return registerenhet;
    }

    /**
     * Sets the value of the registerenhet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegisterenhetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SamfallighetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FastighetType }{@code >}
     *     
     */
    public void setRegisterenhet(JAXBElement<? extends RegisterenhetType> value) {
        this.registerenhet = ((JAXBElement<? extends RegisterenhetType> ) value);
    }

}
