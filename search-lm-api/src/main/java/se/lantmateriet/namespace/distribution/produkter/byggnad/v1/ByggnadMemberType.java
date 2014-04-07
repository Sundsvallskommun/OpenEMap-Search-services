
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.AbstractFeatureMemberType;


/**
 * <p>Java class for ByggnadMemberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ByggnadMemberType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureMemberType">
 *       &lt;sequence>
 *         &lt;element ref="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}Byggnad"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ByggnadMemberType", propOrder = {
    "byggnad"
})
public class ByggnadMemberType
    extends AbstractFeatureMemberType
{

    @XmlElement(name = "Byggnad", required = true)
    protected ByggnadType byggnad;

    /**
     * Gets the value of the byggnad property.
     * 
     * @return
     *     possible object is
     *     {@link ByggnadType }
     *     
     */
    public ByggnadType getByggnad() {
        return byggnad;
    }

    /**
     * Sets the value of the byggnad property.
     * 
     * @param value
     *     allowed object is
     *     {@link ByggnadType }
     *     
     */
    public void setByggnad(ByggnadType value) {
        this.byggnad = value;
    }

}
