
package se.lantmateriet.namespace.distribution.products.address.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://namespace.lantmateriet.se/distribution/products/address/v2}Adressreferens" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "adressreferens"
})
@XmlRootElement(name = "FindAdressreferensResponse")
public class FindAdressreferensResponse {

    @XmlElement(name = "Adressreferens")
    protected List<AdressreferensType> adressreferens;

    /**
     * Gets the value of the adressreferens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adressreferens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdressreferens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdressreferensType }
     * 
     * 
     */
    public List<AdressreferensType> getAdressreferens() {
        if (adressreferens == null) {
            adressreferens = new ArrayList<AdressreferensType>();
        }
        return this.adressreferens;
    }

    public boolean isSetAdressreferens() {
        return ((this.adressreferens!= null)&&(!this.adressreferens.isEmpty()));
    }

    public void unsetAdressreferens() {
        this.adressreferens = null;
    }

}
