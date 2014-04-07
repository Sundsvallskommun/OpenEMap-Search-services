
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatistisktMattType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatistisktMattType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Medelfel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatistisktMattType")
@XmlEnum
public enum StatistisktMattType {

    @XmlEnumValue("Medelfel")
    MEDELFEL("Medelfel");
    private final String value;

    StatistisktMattType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatistisktMattType fromValue(String v) {
        for (StatistisktMattType c: StatistisktMattType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
