
package se.lantmateriet.namespace.distribution.products.placename.v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntervallType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntervallType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="startindex" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="slutindex" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntervallType")
public class IntervallType {

    @XmlAttribute(required = true)
    protected BigInteger startindex;
    @XmlAttribute(required = true)
    protected BigInteger slutindex;

    /**
     * Gets the value of the startindex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartindex() {
        return startindex;
    }

    /**
     * Sets the value of the startindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartindex(BigInteger value) {
        this.startindex = value;
    }

    public boolean isSetStartindex() {
        return (this.startindex!= null);
    }

    /**
     * Gets the value of the slutindex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSlutindex() {
        return slutindex;
    }

    /**
     * Sets the value of the slutindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSlutindex(BigInteger value) {
        this.slutindex = value;
    }

    public boolean isSetSlutindex() {
        return (this.slutindex!= null);
    }

}
