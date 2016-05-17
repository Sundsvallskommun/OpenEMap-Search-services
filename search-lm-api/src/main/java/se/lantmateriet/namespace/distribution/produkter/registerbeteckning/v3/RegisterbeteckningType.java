
package se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.AbstractFeatureType;


/**
 * <p>Java class for RegisterbeteckningType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterbeteckningType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="objektidentitet" type="{http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3}UUIDType" minOccurs="0"/>
 *         &lt;element name="fastighetsnyckel" type="{http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3}FastighetsnyckelType"/>
 *         &lt;element name="objektstatus" type="{http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3}ObjektstatusType"/>
 *         &lt;element name="registeromrade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trakt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="block" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enhet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="senasteAndring" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Enhetsomrade" type="{http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3}EnhetsomradeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterbeteckningType", propOrder = {
    "objektidentitet",
    "fastighetsnyckel",
    "objektstatus",
    "registeromrade",
    "trakt",
    "block",
    "enhet",
    "senasteAndring",
    "enhetsomrade"
})
public class RegisterbeteckningType
    extends AbstractFeatureType
{

    protected String objektidentitet;
    @XmlElement(required = true)
    protected String fastighetsnyckel;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ObjektstatusType objektstatus;
    @XmlElement(required = true)
    protected String registeromrade;
    @XmlElement(required = true)
    protected String trakt;
    @XmlElement(required = true)
    protected String block;
    @XmlElement(required = true)
    protected String enhet;
    @XmlElement(required = true)
    protected String senasteAndring;
    @XmlElement(name = "Enhetsomrade")
    protected List<EnhetsomradeType> enhetsomrade;

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
     * Gets the value of the registeromrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteromrade() {
        return registeromrade;
    }

    /**
     * Sets the value of the registeromrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteromrade(String value) {
        this.registeromrade = value;
    }

    /**
     * Gets the value of the trakt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrakt() {
        return trakt;
    }

    /**
     * Sets the value of the trakt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrakt(String value) {
        this.trakt = value;
    }

    /**
     * Gets the value of the block property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlock(String value) {
        this.block = value;
    }

    /**
     * Gets the value of the enhet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhet() {
        return enhet;
    }

    /**
     * Sets the value of the enhet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhet(String value) {
        this.enhet = value;
    }

    /**
     * Gets the value of the senasteAndring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenasteAndring() {
        return senasteAndring;
    }

    /**
     * Sets the value of the senasteAndring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenasteAndring(String value) {
        this.senasteAndring = value;
    }

    /**
     * Gets the value of the enhetsomrade property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enhetsomrade property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnhetsomrade().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnhetsomradeType }
     * 
     * 
     */
    public List<EnhetsomradeType> getEnhetsomrade() {
        if (enhetsomrade == null) {
            enhetsomrade = new ArrayList<EnhetsomradeType>();
        }
        return this.enhetsomrade;
    }

}
