
package se.lantmateriet.namespace.distribution.products.placename.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrtnamnCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrtnamnCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="namn" type="{http://namespace.lantmateriet.se/distribution/products/placename/v1}MatchFritextType"/>
 *         &lt;element name="sprak" type="{http://namespace.lantmateriet.se/distribution/products/placename/v1}FritextType" minOccurs="0"/>
 *         &lt;element name="lanskod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="kommunkod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="namntyper" type="{http://namespace.lantmateriet.se/distribution/products/placename/v1}NamntyperType" minOccurs="0"/>
 *         &lt;element name="intervall" type="{http://namespace.lantmateriet.se/distribution/products/placename/v1}IntervallType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrtnamnCriteriaType", propOrder = {
    "namn",
    "sprak",
    "lanskod",
    "kommunkod",
    "namntyper",
    "intervall"
})
public class OrtnamnCriteriaType {

    @XmlElement(required = true)
    protected MatchFritextType namn;
    protected String sprak;
    protected Integer lanskod;
    protected Integer kommunkod;
    protected NamntyperType namntyper;
    protected IntervallType intervall;

    /**
     * Gets the value of the namn property.
     * 
     * @return
     *     possible object is
     *     {@link MatchFritextType }
     *     
     */
    public MatchFritextType getNamn() {
        return namn;
    }

    /**
     * Sets the value of the namn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchFritextType }
     *     
     */
    public void setNamn(MatchFritextType value) {
        this.namn = value;
    }

    public boolean isSetNamn() {
        return (this.namn!= null);
    }

    /**
     * Gets the value of the sprak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSprak() {
        return sprak;
    }

    /**
     * Sets the value of the sprak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSprak(String value) {
        this.sprak = value;
    }

    public boolean isSetSprak() {
        return (this.sprak!= null);
    }

    /**
     * Gets the value of the lanskod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLanskod() {
        return lanskod;
    }

    /**
     * Sets the value of the lanskod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLanskod(Integer value) {
        this.lanskod = value;
    }

    public boolean isSetLanskod() {
        return (this.lanskod!= null);
    }

    /**
     * Gets the value of the kommunkod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKommunkod() {
        return kommunkod;
    }

    /**
     * Sets the value of the kommunkod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKommunkod(Integer value) {
        this.kommunkod = value;
    }

    public boolean isSetKommunkod() {
        return (this.kommunkod!= null);
    }

    /**
     * Gets the value of the namntyper property.
     * 
     * @return
     *     possible object is
     *     {@link NamntyperType }
     *     
     */
    public NamntyperType getNamntyper() {
        return namntyper;
    }

    /**
     * Sets the value of the namntyper property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamntyperType }
     *     
     */
    public void setNamntyper(NamntyperType value) {
        this.namntyper = value;
    }

    public boolean isSetNamntyper() {
        return (this.namntyper!= null);
    }

    /**
     * Gets the value of the intervall property.
     * 
     * @return
     *     possible object is
     *     {@link IntervallType }
     *     
     */
    public IntervallType getIntervall() {
        return intervall;
    }

    /**
     * Sets the value of the intervall property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntervallType }
     *     
     */
    public void setIntervall(IntervallType value) {
        this.intervall = value;
    }

    public boolean isSetIntervall() {
        return (this.intervall!= null);
    }

}
