
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.GeometryArrayPropertyType;
import net.opengis.gml._3.PointPropertyType;


/**
 * <p>Java class for EnhetsomradeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnhetsomradeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="omradesnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="samjedelad" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="samjelittera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jarnvagsomrade" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="andelsomrade" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="landarea" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vattenarea" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="enhetsomradetsTotalarea" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="osakertLage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="registerkarta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ytkvalitet" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.5}YtkvalitetType" minOccurs="0"/>
 *         &lt;element name="Yta" type="{http://www.opengis.net/gml/3.2}GeometryArrayPropertyType" minOccurs="0"/>
 *         &lt;element name="Centralpunkt" type="{http://www.opengis.net/gml/3.2}PointPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnhetsomradeType", propOrder = {
    "omradesnummer",
    "samjedelad",
    "samjelittera",
    "jarnvagsomrade",
    "andelsomrade",
    "landarea",
    "vattenarea",
    "enhetsomradetsTotalarea",
    "osakertLage",
    "registerkarta",
    "ytkvalitet",
    "yta",
    "centralpunkt"
})
public class EnhetsomradeType {

    protected int omradesnummer;
    protected boolean samjedelad;
    protected String samjelittera;
    protected boolean jarnvagsomrade;
    protected boolean andelsomrade;
    protected Double landarea;
    protected Double vattenarea;
    protected Double enhetsomradetsTotalarea;
    protected boolean osakertLage;
    protected String registerkarta;
    protected YtkvalitetType ytkvalitet;
    @XmlElement(name = "Yta")
    protected GeometryArrayPropertyType yta;
    @XmlElement(name = "Centralpunkt")
    protected PointPropertyType centralpunkt;

    /**
     * Gets the value of the omradesnummer property.
     * 
     */
    public int getOmradesnummer() {
        return omradesnummer;
    }

    /**
     * Sets the value of the omradesnummer property.
     * 
     */
    public void setOmradesnummer(int value) {
        this.omradesnummer = value;
    }

    /**
     * Gets the value of the samjedelad property.
     * 
     */
    public boolean isSamjedelad() {
        return samjedelad;
    }

    /**
     * Sets the value of the samjedelad property.
     * 
     */
    public void setSamjedelad(boolean value) {
        this.samjedelad = value;
    }

    /**
     * Gets the value of the samjelittera property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSamjelittera() {
        return samjelittera;
    }

    /**
     * Sets the value of the samjelittera property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSamjelittera(String value) {
        this.samjelittera = value;
    }

    /**
     * Gets the value of the jarnvagsomrade property.
     * 
     */
    public boolean isJarnvagsomrade() {
        return jarnvagsomrade;
    }

    /**
     * Sets the value of the jarnvagsomrade property.
     * 
     */
    public void setJarnvagsomrade(boolean value) {
        this.jarnvagsomrade = value;
    }

    /**
     * Gets the value of the andelsomrade property.
     * 
     */
    public boolean isAndelsomrade() {
        return andelsomrade;
    }

    /**
     * Sets the value of the andelsomrade property.
     * 
     */
    public void setAndelsomrade(boolean value) {
        this.andelsomrade = value;
    }

    /**
     * Gets the value of the landarea property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLandarea() {
        return landarea;
    }

    /**
     * Sets the value of the landarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLandarea(Double value) {
        this.landarea = value;
    }

    /**
     * Gets the value of the vattenarea property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVattenarea() {
        return vattenarea;
    }

    /**
     * Sets the value of the vattenarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVattenarea(Double value) {
        this.vattenarea = value;
    }

    /**
     * Gets the value of the enhetsomradetsTotalarea property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEnhetsomradetsTotalarea() {
        return enhetsomradetsTotalarea;
    }

    /**
     * Sets the value of the enhetsomradetsTotalarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEnhetsomradetsTotalarea(Double value) {
        this.enhetsomradetsTotalarea = value;
    }

    /**
     * Gets the value of the osakertLage property.
     * 
     */
    public boolean isOsakertLage() {
        return osakertLage;
    }

    /**
     * Sets the value of the osakertLage property.
     * 
     */
    public void setOsakertLage(boolean value) {
        this.osakertLage = value;
    }

    /**
     * Gets the value of the registerkarta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterkarta() {
        return registerkarta;
    }

    /**
     * Sets the value of the registerkarta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterkarta(String value) {
        this.registerkarta = value;
    }

    /**
     * Gets the value of the ytkvalitet property.
     * 
     * @return
     *     possible object is
     *     {@link YtkvalitetType }
     *     
     */
    public YtkvalitetType getYtkvalitet() {
        return ytkvalitet;
    }

    /**
     * Sets the value of the ytkvalitet property.
     * 
     * @param value
     *     allowed object is
     *     {@link YtkvalitetType }
     *     
     */
    public void setYtkvalitet(YtkvalitetType value) {
        this.ytkvalitet = value;
    }

    /**
     * Gets the value of the yta property.
     * 
     * @return
     *     possible object is
     *     {@link GeometryArrayPropertyType }
     *     
     */
    public GeometryArrayPropertyType getYta() {
        return yta;
    }

    /**
     * Sets the value of the yta property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryArrayPropertyType }
     *     
     */
    public void setYta(GeometryArrayPropertyType value) {
        this.yta = value;
    }

    /**
     * Gets the value of the centralpunkt property.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getCentralpunkt() {
        return centralpunkt;
    }

    /**
     * Sets the value of the centralpunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setCentralpunkt(PointPropertyType value) {
        this.centralpunkt = value;
    }

}
