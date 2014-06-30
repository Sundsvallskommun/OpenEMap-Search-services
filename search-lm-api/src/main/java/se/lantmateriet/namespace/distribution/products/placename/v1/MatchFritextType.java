
package se.lantmateriet.namespace.distribution.products.placename.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for MatchFritextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchFritextType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://namespace.lantmateriet.se/distribution/products/placename/v1>FritextType">
 *       &lt;attribute name="match" type="{http://namespace.lantmateriet.se/distribution/products/placename/v1}MatchModeType" default="EQUALS" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchFritextType", propOrder = {
    "value"
})
public class MatchFritextType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "match")
    protected MatchModeType match;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }

    /**
     * Gets the value of the match property.
     * 
     * @return
     *     possible object is
     *     {@link MatchModeType }
     *     
     */
    public MatchModeType getMatch() {
        if (match == null) {
            return MatchModeType.EQUALS;
        } else {
            return match;
        }
    }

    /**
     * Sets the value of the match property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchModeType }
     *     
     */
    public void setMatch(MatchModeType value) {
        this.match = value;
    }

    public boolean isSetMatch() {
        return (this.match!= null);
    }

}
