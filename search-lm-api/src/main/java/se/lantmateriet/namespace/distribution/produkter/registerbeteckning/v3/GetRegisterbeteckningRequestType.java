
package se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.PointPropertyType;


/**
 * <p>Java class for GetRegisterbeteckningRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRegisterbeteckningRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="objektidentitet" type="{http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3}UUIDType" maxOccurs="1000"/>
 *         &lt;element name="fastighetsnyckel" type="{http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3}FastighetsnyckelType" maxOccurs="1000"/>
 *         &lt;element name="RegisterbeteckningFilter" type="{http://namespace.lantmateriet.se/distribution/produkter/registerbeteckning/v3}RegisterbeteckningFilterType"/>
 *         &lt;element name="Punkt" type="{http://www.opengis.net/gml/3.2}PointPropertyType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRegisterbeteckningRequestType", propOrder = {
    "objektidentitet",
    "fastighetsnyckel",
    "registerbeteckningFilter",
    "punkt"
})
public class GetRegisterbeteckningRequestType {

    protected List<String> objektidentitet;
    protected List<String> fastighetsnyckel;
    @XmlElement(name = "RegisterbeteckningFilter")
    protected RegisterbeteckningFilterType registerbeteckningFilter;
    @XmlElement(name = "Punkt")
    protected PointPropertyType punkt;

    /**
     * Gets the value of the objektidentitet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objektidentitet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjektidentitet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObjektidentitet() {
        if (objektidentitet == null) {
            objektidentitet = new ArrayList<String>();
        }
        return this.objektidentitet;
    }

    /**
     * Gets the value of the fastighetsnyckel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fastighetsnyckel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFastighetsnyckel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFastighetsnyckel() {
        if (fastighetsnyckel == null) {
            fastighetsnyckel = new ArrayList<String>();
        }
        return this.fastighetsnyckel;
    }

    /**
     * Gets the value of the registerbeteckningFilter property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterbeteckningFilterType }
     *     
     */
    public RegisterbeteckningFilterType getRegisterbeteckningFilter() {
        return registerbeteckningFilter;
    }

    /**
     * Sets the value of the registerbeteckningFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterbeteckningFilterType }
     *     
     */
    public void setRegisterbeteckningFilter(RegisterbeteckningFilterType value) {
        this.registerbeteckningFilter = value;
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

}
