
package se.lantmateriet.namespace.distribution.products.placename.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://namespace.lantmateriet.se/distribution/products/placename/v1}Ortnamn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="totaltAntal" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ortnamn"
})
@XmlRootElement(name = "FindOrtnamnResponse")
public class FindOrtnamnResponse {

    @XmlElement(name = "Ortnamn")
    protected List<OrtnamnType> ortnamn;
    @XmlAttribute(name = "totaltAntal")
    protected Integer totaltAntal;

    /**
     * Gets the value of the ortnamn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ortnamn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrtnamn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrtnamnType }
     * 
     * 
     */
    public List<OrtnamnType> getOrtnamn() {
        if (ortnamn == null) {
            ortnamn = new ArrayList<OrtnamnType>();
        }
        return this.ortnamn;
    }

    public boolean isSetOrtnamn() {
        return ((this.ortnamn!= null)&&(!this.ortnamn.isEmpty()));
    }

    public void unsetOrtnamn() {
        this.ortnamn = null;
    }

    /**
     * Gets the value of the totaltAntal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getTotaltAntal() {
        return totaltAntal;
    }

    /**
     * Sets the value of the totaltAntal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotaltAntal(int value) {
        this.totaltAntal = value;
    }

    public boolean isSetTotaltAntal() {
        return (this.totaltAntal!= null);
    }

    public void unsetTotaltAntal() {
        this.totaltAntal = null;
    }

}
