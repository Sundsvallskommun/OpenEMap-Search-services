
package se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="Punkt" type="{http://www.opengis.net/gml/3.2}PointPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="markering" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
    "punkt"
})
public class EnhetsomradeType {

    protected int omradesnummer;
    @XmlElement(name = "Punkt")
    protected PointPropertyType punkt;
    @XmlAttribute(name = "markering")
    protected Boolean markering;

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
     * Gets the value of the punkt property.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getPunkt() {
        return punkt;
    }

    /**
     * Sets the value of the punkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setPunkt(PointPropertyType value) {
        this.punkt = value;
    }

    /**
     * Gets the value of the markering property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMarkering() {
        if (markering == null) {
            return false;
        } else {
            return markering;
        }
    }

    /**
     * Sets the value of the markering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarkering(Boolean value) {
        this.markering = value;
    }

}
