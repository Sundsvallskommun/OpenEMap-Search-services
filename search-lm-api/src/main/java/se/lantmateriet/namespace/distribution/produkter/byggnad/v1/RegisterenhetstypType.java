
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisterenhetstypType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegisterenhetstypType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Fastighet"/>
 *     &lt;enumeration value="Samfällighet"/>
 *     &lt;enumeration value="Gemensamhetsanläggning"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RegisterenhetstypType")
@XmlEnum
public enum RegisterenhetstypType {

    @XmlEnumValue("Fastighet")
    FASTIGHET("Fastighet"),
    @XmlEnumValue("Samf\u00e4llighet")
    SAMFÄLLIGHET("Samf\u00e4llighet"),
    @XmlEnumValue("Gemensamhetsanl\u00e4ggning")
    GEMENSAMHETSANLÄGGNING("Gemensamhetsanl\u00e4ggning");
    private final String value;

    RegisterenhetstypType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegisterenhetstypType fromValue(String v) {
        for (RegisterenhetstypType c: RegisterenhetstypType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
