
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRegisterenhetRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRegisterenhetRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="objektidentitet" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.5}UUIDType" maxOccurs="unbounded"/>
 *           &lt;element name="fastighetsnyckel" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.5}FastighetsnyckelType" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element name="IncludeData" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.5}RegisterenhetDatasetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRegisterenhetRequestType", propOrder = {
    "objektidentitet",
    "fastighetsnyckel",
    "includeData"
})
public class GetRegisterenhetRequestType {

    protected List<String> objektidentitet;
    protected List<String> fastighetsnyckel;
    @XmlElement(name = "IncludeData")
    protected RegisterenhetDatasetType includeData;

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
     * Gets the value of the includeData property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetDatasetType }
     *     
     */
    public RegisterenhetDatasetType getIncludeData() {
        return includeData;
    }

    /**
     * Sets the value of the includeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetDatasetType }
     *     
     */
    public void setIncludeData(RegisterenhetDatasetType value) {
        this.includeData = value;
    }

}
