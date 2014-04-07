
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UtvarderingsmetodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UtvarderingsmetodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Indirekt mätmetod"/>
 *     &lt;enumeration value="Okänd"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UtvarderingsmetodType")
@XmlEnum
public enum UtvarderingsmetodType {

    @XmlEnumValue("Indirekt m\u00e4tmetod")
    INDIREKT_MÄTMETOD("Indirekt m\u00e4tmetod"),
    @XmlEnumValue("Ok\u00e4nd")
    OKÄND("Ok\u00e4nd");
    private final String value;

    UtvarderingsmetodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UtvarderingsmetodType fromValue(String v) {
        for (UtvarderingsmetodType c: UtvarderingsmetodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
