
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HisstatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HisstatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ja"/>
 *     &lt;enumeration value="Nej"/>
 *     &lt;enumeration value="Uppgift saknas"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HisstatusType")
@XmlEnum
public enum HisstatusType {

    @XmlEnumValue("Ja")
    JA("Ja"),
    @XmlEnumValue("Nej")
    NEJ("Nej"),
    @XmlEnumValue("Uppgift saknas")
    UPPGIFT_SAKNAS("Uppgift saknas");
    private final String value;

    HisstatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HisstatusType fromValue(String v) {
        for (HisstatusType c: HisstatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
