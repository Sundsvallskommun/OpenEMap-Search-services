
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FastighetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FastighetType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1}RegisterenhetType">
 *       &lt;sequence>
 *         &lt;element name="Skattetal" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1}SkattetalType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FastighetType", propOrder = {
    "skattetal"
})
public class FastighetType
    extends RegisterenhetType
{

    @XmlElement(name = "Skattetal")
    protected List<SkattetalType> skattetal;

    /**
     * Gets the value of the skattetal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skattetal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkattetal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SkattetalType }
     * 
     * 
     */
    public List<SkattetalType> getSkattetal() {
        if (skattetal == null) {
            skattetal = new ArrayList<SkattetalType>();
        }
        return this.skattetal;
    }

}
