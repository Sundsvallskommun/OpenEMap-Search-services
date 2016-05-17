
package se.lantmateriet.namespace.distribution.products.placename.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_1_1.profiles.gmlsfprofile.v_1_0_0.AbstractFeatureType;
import net.opengis.gml.v_3_1_1.profiles.gmlsfprofile.v_1_0_0.PointType;


/**
 * <p>Java class for OrtnamnsplaceringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrtnamnsplaceringType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="lanskod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="kommunkod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="namntyp" type="{http://namespace.lantmateriet.se/distribution/products/placename/v1}NamntypType"/>
 *         &lt;element name="punkt" type="{http://www.opengis.net/gml}PointType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrtnamnsplaceringType", propOrder = {
    "lanskod",
    "kommunkod",
    "namntyp",
    "punkt"
})
public class OrtnamnsplaceringType
    extends AbstractFeatureType
{

    protected int lanskod;
    protected int kommunkod;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected NamntypType namntyp;
    @XmlElement(required = true)
    protected PointType punkt;

    /**
     * Gets the value of the lanskod property.
     * 
     */
    public int getLanskod() {
        return lanskod;
    }

    /**
     * Sets the value of the lanskod property.
     * 
     */
    public void setLanskod(int value) {
        this.lanskod = value;
    }

    public boolean isSetLanskod() {
        return true;
    }

    /**
     * Gets the value of the kommunkod property.
     * 
     */
    public int getKommunkod() {
        return kommunkod;
    }

    /**
     * Sets the value of the kommunkod property.
     * 
     */
    public void setKommunkod(int value) {
        this.kommunkod = value;
    }

    public boolean isSetKommunkod() {
        return true;
    }

    /**
     * Gets the value of the namntyp property.
     * 
     * @return
     *     possible object is
     *     {@link NamntypType }
     *     
     */
    public NamntypType getNamntyp() {
        return namntyp;
    }

    /**
     * Sets the value of the namntyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamntypType }
     *     
     */
    public void setNamntyp(NamntypType value) {
        this.namntyp = value;
    }

    public boolean isSetNamntyp() {
        return (this.namntyp!= null);
    }

    /**
     * Gets the value of the punkt property.
     * 
     * @return
     *     possible object is
     *     {@link PointType }
     *     
     */
    public PointType getPunkt() {
        return punkt;
    }

    /**
     * Sets the value of the punkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointType }
     *     
     */
    public void setPunkt(PointType value) {
        this.punkt = value;
    }

    public boolean isSetPunkt() {
        return (this.punkt!= null);
    }

}
