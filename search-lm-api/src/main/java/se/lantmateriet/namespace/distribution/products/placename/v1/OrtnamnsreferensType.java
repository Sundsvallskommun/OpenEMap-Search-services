
package se.lantmateriet.namespace.distribution.products.placename.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrtnamnsreferensType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrtnamnsreferensType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="etikett" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ortnamnsid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrtnamnsreferensType", propOrder = {
    "etikett",
    "ortnamnsid"
})
public class OrtnamnsreferensType {

    @XmlElement(required = true)
    protected String etikett;
    protected long ortnamnsid;

    /**
     * Gets the value of the etikett property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtikett() {
        return etikett;
    }

    /**
     * Sets the value of the etikett property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtikett(String value) {
        this.etikett = value;
    }

    public boolean isSetEtikett() {
        return (this.etikett!= null);
    }

    /**
     * Gets the value of the ortnamnsid property.
     * 
     */
    public long getOrtnamnsid() {
        return ortnamnsid;
    }

    /**
     * Sets the value of the ortnamnsid property.
     * 
     */
    public void setOrtnamnsid(long value) {
        this.ortnamnsid = value;
    }

    public boolean isSetOrtnamnsid() {
        return true;
    }

}
