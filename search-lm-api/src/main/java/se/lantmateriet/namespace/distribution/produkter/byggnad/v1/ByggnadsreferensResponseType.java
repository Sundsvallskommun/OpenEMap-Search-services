
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ByggnadsreferensResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ByggnadsreferensResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Byggnadsreferens" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}ByggnadsreferensType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ByggnadsreferensResponseType", propOrder = {
    "byggnadsreferens"
})
public class ByggnadsreferensResponseType {

    @XmlElement(name = "Byggnadsreferens")
    protected List<ByggnadsreferensType> byggnadsreferens;

    /**
     * Gets the value of the byggnadsreferens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the byggnadsreferens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getByggnadsreferens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ByggnadsreferensType }
     * 
     * 
     */
    public List<ByggnadsreferensType> getByggnadsreferens() {
        if (byggnadsreferens == null) {
            byggnadsreferens = new ArrayList<ByggnadsreferensType>();
        }
        return this.byggnadsreferens;
    }

}
