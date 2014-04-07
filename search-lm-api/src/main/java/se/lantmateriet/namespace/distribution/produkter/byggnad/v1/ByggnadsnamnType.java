
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ByggnadsnamnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ByggnadsnamnType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ortid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="namn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="namntyp" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}NamntypType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ByggnadsnamnType", propOrder = {
    "ortid",
    "namn",
    "namntyp"
})
public class ByggnadsnamnType {

    protected String ortid;
    @XmlElement(required = true)
    protected String namn;
    @XmlElement(required = true)
    protected NamntypType namntyp;

    /**
     * Gets the value of the ortid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrtid() {
        return ortid;
    }

    /**
     * Sets the value of the ortid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrtid(String value) {
        this.ortid = value;
    }

    /**
     * Gets the value of the namn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamn() {
        return namn;
    }

    /**
     * Sets the value of the namn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamn(String value) {
        this.namn = value;
    }

    /**
     * Gets the value of the namntyp property.
     * 
     * @return
     *     possible object is
     *     {@link NamntypType }
     *     
     */
    public NamntypType getNamntyp() {
        return namntyp;
    }

    /**
     * Sets the value of the namntyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamntypType }
     *     
     */
    public void setNamntyp(NamntypType value) {
        this.namntyp = value;
    }

}
