
package se.lantmateriet.namespace.distribution.products.address.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_1_1.profiles.gmlsfprofile.v_1_0_0.AbstractFeatureType;
import net.opengis.gml.v_3_1_1.profiles.gmlsfprofile.v_1_0_0.PointType;


/**
 * <p>Java class for AdressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdressType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="fastighetsnyckel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adressplatsprefix" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="adressplatsid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="adressplatsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adressplatstyp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lanskod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lansnamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kommunkod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kommunnamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="skiljenamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adressomradestyp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adressomrade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gardsadressomrade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="popularnamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="belagenhetsadresstatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kommundelsprefix" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="kommundelsid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="kommundelsnamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adressplatspunkt" type="{http://www.opengis.net/gml}PointType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdressType", propOrder = {
    "fastighetsnyckel",
    "adressplatsprefix",
    "adressplatsid",
    "adressplatsnummer",
    "adressplatstyp",
    "lanskod",
    "lansnamn",
    "kommunkod",
    "kommunnamn",
    "skiljenamn",
    "adressomradestyp",
    "adressomrade",
    "gardsadressomrade",
    "postnummer",
    "postort",
    "popularnamn",
    "belagenhetsadresstatus",
    "kommundelsprefix",
    "kommundelsid",
    "kommundelsnamn",
    "adressplatspunkt"
})
public class AdressType
    extends AbstractFeatureType
{

    @XmlElement(required = true, nillable = true)
    protected String fastighetsnyckel;
    protected int adressplatsprefix;
    protected int adressplatsid;
    @XmlElement(required = true, nillable = true)
    protected String adressplatsnummer;
    @XmlElement(required = true)
    protected String adressplatstyp;
    @XmlElement(required = true)
    protected String lanskod;
    @XmlElement(required = true)
    protected String lansnamn;
    @XmlElement(required = true)
    protected String kommunkod;
    @XmlElement(required = true)
    protected String kommunnamn;
    @XmlElement(required = true, nillable = true)
    protected String skiljenamn;
    @XmlElement(required = true)
    protected String adressomradestyp;
    @XmlElement(required = true)
    protected String adressomrade;
    @XmlElement(required = true, nillable = true)
    protected String gardsadressomrade;
    @XmlElement(required = true, nillable = true)
    protected String postnummer;
    @XmlElement(required = true, nillable = true)
    protected String postort;
    @XmlElement(required = true, nillable = true)
    protected String popularnamn;
    @XmlElement(required = true)
    protected String belagenhetsadresstatus;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer kommundelsprefix;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer kommundelsid;
    @XmlElement(required = true, nillable = true)
    protected String kommundelsnamn;
    @XmlElement(required = true, nillable = true)
    protected PointType adressplatspunkt;

    /**
     * Gets the value of the fastighetsnyckel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFastighetsnyckel() {
        return fastighetsnyckel;
    }

    /**
     * Sets the value of the fastighetsnyckel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFastighetsnyckel(String value) {
        this.fastighetsnyckel = value;
    }

    public boolean isSetFastighetsnyckel() {
        return (this.fastighetsnyckel!= null);
    }

    /**
     * Gets the value of the adressplatsprefix property.
     * 
     */
    public int getAdressplatsprefix() {
        return adressplatsprefix;
    }

    /**
     * Sets the value of the adressplatsprefix property.
     * 
     */
    public void setAdressplatsprefix(int value) {
        this.adressplatsprefix = value;
    }

    public boolean isSetAdressplatsprefix() {
        return true;
    }

    /**
     * Gets the value of the adressplatsid property.
     * 
     */
    public int getAdressplatsid() {
        return adressplatsid;
    }

    /**
     * Sets the value of the adressplatsid property.
     * 
     */
    public void setAdressplatsid(int value) {
        this.adressplatsid = value;
    }

    public boolean isSetAdressplatsid() {
        return true;
    }

    /**
     * Gets the value of the adressplatsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdressplatsnummer() {
        return adressplatsnummer;
    }

    /**
     * Sets the value of the adressplatsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdressplatsnummer(String value) {
        this.adressplatsnummer = value;
    }

    public boolean isSetAdressplatsnummer() {
        return (this.adressplatsnummer!= null);
    }

    /**
     * Gets the value of the adressplatstyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdressplatstyp() {
        return adressplatstyp;
    }

    /**
     * Sets the value of the adressplatstyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdressplatstyp(String value) {
        this.adressplatstyp = value;
    }

    public boolean isSetAdressplatstyp() {
        return (this.adressplatstyp!= null);
    }

    /**
     * Gets the value of the lanskod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanskod() {
        return lanskod;
    }

    /**
     * Sets the value of the lanskod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanskod(String value) {
        this.lanskod = value;
    }

    public boolean isSetLanskod() {
        return (this.lanskod!= null);
    }

    /**
     * Gets the value of the lansnamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLansnamn() {
        return lansnamn;
    }

    /**
     * Sets the value of the lansnamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLansnamn(String value) {
        this.lansnamn = value;
    }

    public boolean isSetLansnamn() {
        return (this.lansnamn!= null);
    }

    /**
     * Gets the value of the kommunkod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKommunkod() {
        return kommunkod;
    }

    /**
     * Sets the value of the kommunkod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKommunkod(String value) {
        this.kommunkod = value;
    }

    public boolean isSetKommunkod() {
        return (this.kommunkod!= null);
    }

    /**
     * Gets the value of the kommunnamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKommunnamn() {
        return kommunnamn;
    }

    /**
     * Sets the value of the kommunnamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKommunnamn(String value) {
        this.kommunnamn = value;
    }

    public boolean isSetKommunnamn() {
        return (this.kommunnamn!= null);
    }

    /**
     * Gets the value of the skiljenamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkiljenamn() {
        return skiljenamn;
    }

    /**
     * Sets the value of the skiljenamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkiljenamn(String value) {
        this.skiljenamn = value;
    }

    public boolean isSetSkiljenamn() {
        return (this.skiljenamn!= null);
    }

    /**
     * Gets the value of the adressomradestyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdressomradestyp() {
        return adressomradestyp;
    }

    /**
     * Sets the value of the adressomradestyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdressomradestyp(String value) {
        this.adressomradestyp = value;
    }

    public boolean isSetAdressomradestyp() {
        return (this.adressomradestyp!= null);
    }

    /**
     * Gets the value of the adressomrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdressomrade() {
        return adressomrade;
    }

    /**
     * Sets the value of the adressomrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdressomrade(String value) {
        this.adressomrade = value;
    }

    public boolean isSetAdressomrade() {
        return (this.adressomrade!= null);
    }

    /**
     * Gets the value of the gardsadressomrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGardsadressomrade() {
        return gardsadressomrade;
    }

    /**
     * Sets the value of the gardsadressomrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGardsadressomrade(String value) {
        this.gardsadressomrade = value;
    }

    public boolean isSetGardsadressomrade() {
        return (this.gardsadressomrade!= null);
    }

    /**
     * Gets the value of the postnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostnummer() {
        return postnummer;
    }

    /**
     * Sets the value of the postnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostnummer(String value) {
        this.postnummer = value;
    }

    public boolean isSetPostnummer() {
        return (this.postnummer!= null);
    }

    /**
     * Gets the value of the postort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostort() {
        return postort;
    }

    /**
     * Sets the value of the postort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostort(String value) {
        this.postort = value;
    }

    public boolean isSetPostort() {
        return (this.postort!= null);
    }

    /**
     * Gets the value of the popularnamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPopularnamn() {
        return popularnamn;
    }

    /**
     * Sets the value of the popularnamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPopularnamn(String value) {
        this.popularnamn = value;
    }

    public boolean isSetPopularnamn() {
        return (this.popularnamn!= null);
    }

    /**
     * Gets the value of the belagenhetsadresstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelagenhetsadresstatus() {
        return belagenhetsadresstatus;
    }

    /**
     * Sets the value of the belagenhetsadresstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelagenhetsadresstatus(String value) {
        this.belagenhetsadresstatus = value;
    }

    public boolean isSetBelagenhetsadresstatus() {
        return (this.belagenhetsadresstatus!= null);
    }

    /**
     * Gets the value of the kommundelsprefix property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKommundelsprefix() {
        return kommundelsprefix;
    }

    /**
     * Sets the value of the kommundelsprefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKommundelsprefix(Integer value) {
        this.kommundelsprefix = value;
    }

    public boolean isSetKommundelsprefix() {
        return (this.kommundelsprefix!= null);
    }

    /**
     * Gets the value of the kommundelsid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKommundelsid() {
        return kommundelsid;
    }

    /**
     * Sets the value of the kommundelsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKommundelsid(Integer value) {
        this.kommundelsid = value;
    }

    public boolean isSetKommundelsid() {
        return (this.kommundelsid!= null);
    }

    /**
     * Gets the value of the kommundelsnamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKommundelsnamn() {
        return kommundelsnamn;
    }

    /**
     * Sets the value of the kommundelsnamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKommundelsnamn(String value) {
        this.kommundelsnamn = value;
    }

    public boolean isSetKommundelsnamn() {
        return (this.kommundelsnamn!= null);
    }

    /**
     * Gets the value of the adressplatspunkt property.
     * 
     * @return
     *     possible object is
     *     {@link PointType }
     *     
     */
    public PointType getAdressplatspunkt() {
        return adressplatspunkt;
    }

    /**
     * Sets the value of the adressplatspunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointType }
     *     
     */
    public void setAdressplatspunkt(PointType value) {
        this.adressplatspunkt = value;
    }

    public boolean isSetAdressplatspunkt() {
        return (this.adressplatspunkt!= null);
    }

}
