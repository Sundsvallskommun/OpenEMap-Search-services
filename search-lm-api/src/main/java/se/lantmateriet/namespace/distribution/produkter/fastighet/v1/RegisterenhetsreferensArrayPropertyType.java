
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisterenhetsreferensArrayPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterenhetsreferensArrayPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Registerenhetsreferens" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1}RegisterenhetsreferensType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterenhetsreferensArrayPropertyType", propOrder = {
    "registerenhetsreferens"
})
public class RegisterenhetsreferensArrayPropertyType {

    @XmlElement(name = "Registerenhetsreferens", required = true)
    protected List<RegisterenhetsreferensType> registerenhetsreferens;

    /**
     * Gets the value of the registerenhetsreferens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registerenhetsreferens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegisterenhetsreferens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisterenhetsreferensType }
     * 
     * 
     */
    public List<RegisterenhetsreferensType> getRegisterenhetsreferens() {
        if (registerenhetsreferens == null) {
            registerenhetsreferens = new ArrayList<RegisterenhetsreferensType>();
        }
        return this.registerenhetsreferens;
    }

}
