
package net.opengis.gml.v_3_1_1.profiles.gmlsfprofile.v_1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A container for an array of surface patches.
 *          
 * 
 * <p>Java class for SurfacePatchArrayPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SurfacePatchArrayPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}_SurfacePatch" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfacePatchArrayPropertyType", propOrder = {
    "surfacePatch"
})
public class SurfacePatchArrayPropertyType {

    @XmlElementRef(name = "_SurfacePatch", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends AbstractSurfacePatchType>> surfacePatch;

    /**
     * Gets the value of the surfacePatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surfacePatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurfacePatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PolygonPatchType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSurfacePatchType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractSurfacePatchType>> getSurfacePatch() {
        if (surfacePatch == null) {
            surfacePatch = new ArrayList<JAXBElement<? extends AbstractSurfacePatchType>>();
        }
        return this.surfacePatch;
    }

    public boolean isSetSurfacePatch() {
        return ((this.surfacePatch!= null)&&(!this.surfacePatch.isEmpty()));
    }

    public void unsetSurfacePatch() {
        this.surfacePatch = null;
    }

}
