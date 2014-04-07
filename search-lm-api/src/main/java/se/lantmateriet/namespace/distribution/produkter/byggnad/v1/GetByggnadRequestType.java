
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetByggnadRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetByggnadRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objektidentitet" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}UUIDType" maxOccurs="unbounded"/>
 *         &lt;element name="IncludeData" type="{http://namespace.lantmateriet.se/distribution/produkter/byggnad/v1}ByggnadDatasetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetByggnadRequestType", propOrder = {
    "objektidentitet",
    "includeData"
})
public class GetByggnadRequestType {

    @XmlElement(required = true)
    protected List<String> objektidentitet;
    @XmlElement(name = "IncludeData")
    protected ByggnadDatasetType includeData;

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
     * Gets the value of the includeData property.
     * 
     * @return
     *     possible object is
     *     {@link ByggnadDatasetType }
     *     
     */
    public ByggnadDatasetType getIncludeData() {
        return includeData;
    }

    /**
     * Sets the value of the includeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ByggnadDatasetType }
     *     
     */
    public void setIncludeData(ByggnadDatasetType value) {
        this.includeData = value;
    }

}
