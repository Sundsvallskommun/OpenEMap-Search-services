
package se.lantmateriet.namespace.distribution.products.placename.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_1_1.profiles.gmlsfprofile.v_1_0_0.AbstractFeatureType;


/**
 * <p>Java class for OrtnamnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrtnamnType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="namn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sprak" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="placering" type="{http://namespace.lantmateriet.se/distribution/products/placename/v1}OrtnamnsplaceringType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrtnamnType", propOrder = {
    "rest"
})
public class OrtnamnType
    extends AbstractFeatureType
{

    @XmlElementRefs({
        @XmlElementRef(name = "namn", namespace = "http://namespace.lantmateriet.se/distribution/products/placename/v1", type = JAXBElement.class),
        @XmlElementRef(name = "sprak", namespace = "http://namespace.lantmateriet.se/distribution/products/placename/v1", type = JAXBElement.class),
        @XmlElementRef(name = "id", namespace = "http://namespace.lantmateriet.se/distribution/products/placename/v1", type = JAXBElement.class),
        @XmlElementRef(name = "placering", namespace = "http://namespace.lantmateriet.se/distribution/products/placename/v1", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Id" is used by two different parts of a schema. See: 
     * line 52 of http://namespace.lantmateriet.se/distribution/products/placename/v1/placename-1.1.xsd
     * line 980 of http://namespace.lantmateriet.se/distribution/products/gml/gmlsf-3.1.1/v1/gmlsf.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link OrtnamnsplaceringType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
