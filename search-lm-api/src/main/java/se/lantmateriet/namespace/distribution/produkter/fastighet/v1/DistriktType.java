
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistriktType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistriktType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objektidentitet" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6}UUIDType"/>
 *         &lt;element name="distriktskod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="distriktsnamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistriktType", propOrder = {
    "objektidentitet",
    "distriktskod",
    "distriktsnamn"
})
public class DistriktType {

    @XmlElement(required = true)
    protected String objektidentitet;
    @XmlElement(required = true)
    protected String distriktskod;
    @XmlElement(required = true)
    protected String distriktsnamn;

    /**
     * Gets the value of the objektidentitet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjektidentitet() {
        return objektidentitet;
    }

    /**
     * Sets the value of the objektidentitet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjektidentitet(String value) {
        this.objektidentitet = value;
    }

    /**
     * Gets the value of the distriktskod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistriktskod() {
        return distriktskod;
    }

    /**
     * Sets the value of the distriktskod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistriktskod(String value) {
        this.distriktskod = value;
    }

    /**
     * Gets the value of the distriktsnamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistriktsnamn() {
        return distriktsnamn;
    }

    /**
     * Sets the value of the distriktsnamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistriktsnamn(String value) {
        this.distriktsnamn = value;
    }

}
