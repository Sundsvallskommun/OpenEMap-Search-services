
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjektstatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObjektstatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Planerad"/>
 *     &lt;enumeration value="Gällande"/>
 *     &lt;enumeration value="Gällande under utredning"/>
 *     &lt;enumeration value="Avregistrerad"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObjektstatusType")
@XmlEnum
public enum ObjektstatusType {

    @XmlEnumValue("Planerad")
    PLANERAD("Planerad"),
    @XmlEnumValue("G\u00e4llande")
    GÄLLANDE("G\u00e4llande"),
    @XmlEnumValue("G\u00e4llande under utredning")
    GÄLLANDE_UNDER_UTREDNING("G\u00e4llande under utredning"),
    @XmlEnumValue("Avregistrerad")
    AVREGISTRERAD("Avregistrerad");
    private final String value;

    ObjektstatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObjektstatusType fromValue(String v) {
        for (ObjektstatusType c: ObjektstatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
