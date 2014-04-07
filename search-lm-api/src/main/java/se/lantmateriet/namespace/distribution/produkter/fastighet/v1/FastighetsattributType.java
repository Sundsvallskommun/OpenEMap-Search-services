
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FastighetsattributType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FastighetsattributType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1}RegisterenhetsattributType">
 *       &lt;sequence>
 *         &lt;element name="jordnaturenKrono" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="forvarvstillstandGlesbygd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="forvarvstillstandOmarrondering" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="preliminarTypkod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outreddaAndelarISamfalligheter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FastighetsattributType", propOrder = {
    "jordnaturenKrono",
    "forvarvstillstandGlesbygd",
    "forvarvstillstandOmarrondering",
    "preliminarTypkod",
    "outreddaAndelarISamfalligheter"
})
public class FastighetsattributType
    extends RegisterenhetsattributType
{

    protected boolean jordnaturenKrono;
    protected boolean forvarvstillstandGlesbygd;
    protected boolean forvarvstillstandOmarrondering;
    protected String preliminarTypkod;
    protected boolean outreddaAndelarISamfalligheter;

    /**
     * Gets the value of the jordnaturenKrono property.
     * 
     */
    public boolean isJordnaturenKrono() {
        return jordnaturenKrono;
    }

    /**
     * Sets the value of the jordnaturenKrono property.
     * 
     */
    public void setJordnaturenKrono(boolean value) {
        this.jordnaturenKrono = value;
    }

    /**
     * Gets the value of the forvarvstillstandGlesbygd property.
     * 
     */
    public boolean isForvarvstillstandGlesbygd() {
        return forvarvstillstandGlesbygd;
    }

    /**
     * Sets the value of the forvarvstillstandGlesbygd property.
     * 
     */
    public void setForvarvstillstandGlesbygd(boolean value) {
        this.forvarvstillstandGlesbygd = value;
    }

    /**
     * Gets the value of the forvarvstillstandOmarrondering property.
     * 
     */
    public boolean isForvarvstillstandOmarrondering() {
        return forvarvstillstandOmarrondering;
    }

    /**
     * Sets the value of the forvarvstillstandOmarrondering property.
     * 
     */
    public void setForvarvstillstandOmarrondering(boolean value) {
        this.forvarvstillstandOmarrondering = value;
    }

    /**
     * Gets the value of the preliminarTypkod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreliminarTypkod() {
        return preliminarTypkod;
    }

    /**
     * Sets the value of the preliminarTypkod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreliminarTypkod(String value) {
        this.preliminarTypkod = value;
    }

    /**
     * Gets the value of the outreddaAndelarISamfalligheter property.
     * 
     */
    public boolean isOutreddaAndelarISamfalligheter() {
        return outreddaAndelarISamfalligheter;
    }

    /**
     * Sets the value of the outreddaAndelarISamfalligheter property.
     * 
     */
    public void setOutreddaAndelarISamfalligheter(boolean value) {
        this.outreddaAndelarISamfalligheter = value;
    }

}
