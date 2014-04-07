
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisterbeteckningType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterbeteckningType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registeromrade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="traktnamn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="block" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enhet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterbeteckningType", propOrder = {
    "registeromrade",
    "traktnamn",
    "block",
    "enhet"
})
public class RegisterbeteckningType {

    @XmlElement(required = true)
    protected String registeromrade;
    @XmlElement(required = true)
    protected String traktnamn;
    @XmlElement(required = true)
    protected String block;
    protected int enhet;

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
     * Gets the value of the traktnamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraktnamn() {
        return traktnamn;
    }

    /**
     * Sets the value of the traktnamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraktnamn(String value) {
        this.traktnamn = value;
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
     */
    public int getEnhet() {
        return enhet;
    }

    /**
     * Sets the value of the enhet property.
     * 
     */
    public void setEnhet(int value) {
        this.enhet = value;
    }

}
