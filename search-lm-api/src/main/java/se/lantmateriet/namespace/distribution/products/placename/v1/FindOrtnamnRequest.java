
package se.lantmateriet.namespace.distribution.products.placename.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_1_1.profiles.gmlsfprofile.v_1_0_0.PointType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://namespace.lantmateriet.se/distribution/products/placename/v1}OrtnamnCriteria"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="400"/>
 *         &lt;element ref="{http://www.opengis.net/gml}Point"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ortnamnCriteria",
    "id",
    "point"
})
@XmlRootElement(name = "FindOrtnamnRequest")
public class FindOrtnamnRequest {

    @XmlElement(name = "OrtnamnCriteria")
    protected OrtnamnCriteriaType ortnamnCriteria;
    @XmlElement(type = Long.class)
    protected List<Long> id;
    @XmlElement(name = "Point", namespace = "http://www.opengis.net/gml")
    protected PointType point;

    /**
     * Gets the value of the ortnamnCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link OrtnamnCriteriaType }
     *     
     */
    public OrtnamnCriteriaType getOrtnamnCriteria() {
        return ortnamnCriteria;
    }

    /**
     * Sets the value of the ortnamnCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrtnamnCriteriaType }
     *     
     */
    public void setOrtnamnCriteria(OrtnamnCriteriaType value) {
        this.ortnamnCriteria = value;
    }

    public boolean isSetOrtnamnCriteria() {
        return (this.ortnamnCriteria!= null);
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getId() {
        if (id == null) {
            id = new ArrayList<Long>();
        }
        return this.id;
    }

    public boolean isSetId() {
        return ((this.id!= null)&&(!this.id.isEmpty()));
    }

    public void unsetId() {
        this.id = null;
    }

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link PointType }
     *     
     */
    public PointType getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointType }
     *     
     */
    public void setPoint(PointType value) {
        this.point = value;
    }

    public boolean isSetPoint() {
        return (this.point!= null);
    }

}
