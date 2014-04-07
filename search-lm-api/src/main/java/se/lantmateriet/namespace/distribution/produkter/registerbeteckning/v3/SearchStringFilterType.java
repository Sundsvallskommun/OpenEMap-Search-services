
package se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchStringFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchStringFilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchString" type="{http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3}MatchSearchStringType"/>
 *         &lt;element name="maxHits" type="{http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3}MaxHitsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchStringFilterType", propOrder = {
    "searchString",
    "maxHits"
})
public class SearchStringFilterType {

    @XmlElement(required = true)
    protected MatchSearchStringType searchString;
    @XmlElement(defaultValue = "100")
    protected Integer maxHits;

    /**
     * Gets the value of the searchString property.
     * 
     * @return
     *     possible object is
     *     {@link MatchSearchStringType }
     *     
     */
    public MatchSearchStringType getSearchString() {
        return searchString;
    }

    /**
     * Sets the value of the searchString property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchSearchStringType }
     *     
     */
    public void setSearchString(MatchSearchStringType value) {
        this.searchString = value;
    }

    /**
     * Gets the value of the maxHits property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxHits() {
        return maxHits;
    }

    /**
     * Sets the value of the maxHits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxHits(Integer value) {
        this.maxHits = value;
    }

}
