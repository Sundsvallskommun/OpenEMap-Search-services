
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
 *         &lt;element ref="{http://namespace.lantmateriet.se/distribution/products/address/v2}Adress" maxOccurs="unbounded" minOccurs="0"/>
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
    "adress"
})
@XmlRootElement(name = "FindAdressResponse")
public class FindAdressResponse {

    @XmlElement(name = "Adress")
    protected List<AdressType> adress;

    /**
     * Gets the value of the adress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdressType }
     * 
     * 
     */
    public List<AdressType> getAdress() {
        if (adress == null) {
            adress = new ArrayList<AdressType>();
        }
        return this.adress;
    }

    public boolean isSetAdress() {
        return ((this.adress!= null)&&(!this.adress.isEmpty()));
    }

    public void unsetAdress() {
        this.adress = null;
    }

}
