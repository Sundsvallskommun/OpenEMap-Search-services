
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objektstatus" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}ObjektstatusType"/>
 *         &lt;element name="hiss" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}HisstatusType"/>
 *         &lt;element name="entretyp" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}EntretypType"/>
 *         &lt;element name="adressid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objektidentitetAdress" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}UUIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntreType", propOrder = {
    "objektstatus",
    "hiss",
    "entretyp",
    "adressid",
    "objektidentitetAdress"
})
public class EntreType {

    @XmlElement(required = true)
    protected ObjektstatusType objektstatus;
    @XmlElement(required = true)
    protected HisstatusType hiss;
    @XmlElement(required = true)
    protected EntretypType entretyp;
    protected String adressid;
    protected String objektidentitetAdress;

    /**
     * Gets the value of the objektstatus property.
     * 
     * @return
     *     possible object is
     *     {@link ObjektstatusType }
     *     
     */
    public ObjektstatusType getObjektstatus() {
        return objektstatus;
    }

    /**
     * Sets the value of the objektstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjektstatusType }
     *     
     */
    public void setObjektstatus(ObjektstatusType value) {
        this.objektstatus = value;
    }

    /**
     * Gets the value of the hiss property.
     * 
     * @return
     *     possible object is
     *     {@link HisstatusType }
     *     
     */
    public HisstatusType getHiss() {
        return hiss;
    }

    /**
     * Sets the value of the hiss property.
     * 
     * @param value
     *     allowed object is
     *     {@link HisstatusType }
     *     
     */
    public void setHiss(HisstatusType value) {
        this.hiss = value;
    }

    /**
     * Gets the value of the entretyp property.
     * 
     * @return
     *     possible object is
     *     {@link EntretypType }
     *     
     */
    public EntretypType getEntretyp() {
        return entretyp;
    }

    /**
     * Sets the value of the entretyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntretypType }
     *     
     */
    public void setEntretyp(EntretypType value) {
        this.entretyp = value;
    }

    /**
     * Gets the value of the adressid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdressid() {
        return adressid;
    }

    /**
     * Sets the value of the adressid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdressid(String value) {
        this.adressid = value;
    }

    /**
     * Gets the value of the objektidentitetAdress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjektidentitetAdress() {
        return objektidentitetAdress;
    }

    /**
     * Sets the value of the objektidentitetAdress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjektidentitetAdress(String value) {
        this.objektidentitetAdress = value;
    }

}
