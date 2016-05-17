
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SamfallighetsattributType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SamfallighetsattributType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}RegisterenhetsattributType">
 *       &lt;sequence>
 *         &lt;element name="samfallighetsandamal" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="delagareOfullstandigtRedovisade" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SamfallighetsattributType", propOrder = {
    "samfallighetsandamal",
    "delagareOfullstandigtRedovisade"
})
public class SamfallighetsattributType
    extends RegisterenhetsattributType
{

    protected List<String> samfallighetsandamal;
    protected boolean delagareOfullstandigtRedovisade;

    /**
     * Gets the value of the samfallighetsandamal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the samfallighetsandamal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSamfallighetsandamal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSamfallighetsandamal() {
        if (samfallighetsandamal == null) {
            samfallighetsandamal = new ArrayList<String>();
        }
        return this.samfallighetsandamal;
    }

    /**
     * Gets the value of the delagareOfullstandigtRedovisade property.
     * 
     */
    public boolean isDelagareOfullstandigtRedovisade() {
        return delagareOfullstandigtRedovisade;
    }

    /**
     * Sets the value of the delagareOfullstandigtRedovisade property.
     * 
     */
    public void setDelagareOfullstandigtRedovisade(boolean value) {
        this.delagareOfullstandigtRedovisade = value;
    }

}
