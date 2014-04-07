
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PagaendeArendeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PagaendeArendeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arendestatusflaggaLM" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="arendestatusflaggaIM" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ejAjourford" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Forrattningsstatus" type="{http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1}ForrattningsstatusType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagaendeArendeType", propOrder = {
    "arendestatusflaggaLM",
    "arendestatusflaggaIM",
    "ejAjourford",
    "forrattningsstatus"
})
public class PagaendeArendeType {

    protected boolean arendestatusflaggaLM;
    protected boolean arendestatusflaggaIM;
    protected boolean ejAjourford;
    @XmlElement(name = "Forrattningsstatus")
    protected List<ForrattningsstatusType> forrattningsstatus;

    /**
     * Gets the value of the arendestatusflaggaLM property.
     * 
     */
    public boolean isArendestatusflaggaLM() {
        return arendestatusflaggaLM;
    }

    /**
     * Sets the value of the arendestatusflaggaLM property.
     * 
     */
    public void setArendestatusflaggaLM(boolean value) {
        this.arendestatusflaggaLM = value;
    }

    /**
     * Gets the value of the arendestatusflaggaIM property.
     * 
     */
    public boolean isArendestatusflaggaIM() {
        return arendestatusflaggaIM;
    }

    /**
     * Sets the value of the arendestatusflaggaIM property.
     * 
     */
    public void setArendestatusflaggaIM(boolean value) {
        this.arendestatusflaggaIM = value;
    }

    /**
     * Gets the value of the ejAjourford property.
     * 
     */
    public boolean isEjAjourford() {
        return ejAjourford;
    }

    /**
     * Sets the value of the ejAjourford property.
     * 
     */
    public void setEjAjourford(boolean value) {
        this.ejAjourford = value;
    }

    /**
     * Gets the value of the forrattningsstatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forrattningsstatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForrattningsstatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForrattningsstatusType }
     * 
     * 
     */
    public List<ForrattningsstatusType> getForrattningsstatus() {
        if (forrattningsstatus == null) {
            forrattningsstatus = new ArrayList<ForrattningsstatusType>();
        }
        return this.forrattningsstatus;
    }

}
