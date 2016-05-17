
package net.opengis.gml.v_3_1_1.profiles.gmlsfprofile.v_1_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             This is the abstract root type of the geometric aggregates.
 *          
 * 
 * <p>Java class for AbstractGeometricAggregateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractGeometricAggregateType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeometryType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGeometricAggregateType")
@XmlSeeAlso({
    MultiPointType.class,
    MultiSurfaceType.class,
    MultiCurveType.class
})
public abstract class AbstractGeometricAggregateType
    extends AbstractGeometryType
{


}
