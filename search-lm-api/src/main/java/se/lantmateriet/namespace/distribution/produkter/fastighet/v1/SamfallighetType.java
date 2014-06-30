
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SamfallighetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SamfallighetType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.5}RegisterenhetType">
 *       &lt;sequence>
 *         &lt;element name="ForeningForForvaltning" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.5}ForeningForForvaltningType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SamfallighetType", propOrder = {
    "foreningForForvaltning"
})
public class SamfallighetType
    extends RegisterenhetType
{

    @XmlElement(name = "ForeningForForvaltning")
    protected List<ForeningForForvaltningType> foreningForForvaltning;

    /**
     * Gets the value of the foreningForForvaltning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foreningForForvaltning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForeningForForvaltning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeningForForvaltningType }
     * 
     * 
     */
    public List<ForeningForForvaltningType> getForeningForForvaltning() {
        if (foreningForForvaltning == null) {
            foreningForForvaltning = new ArrayList<ForeningForForvaltningType>();
        }
        return this.foreningForForvaltning;
    }

}
