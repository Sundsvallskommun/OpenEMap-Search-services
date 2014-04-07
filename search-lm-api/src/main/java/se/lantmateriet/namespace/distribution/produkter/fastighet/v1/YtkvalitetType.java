
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YtkvalitetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="YtkvalitetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Korrekt ytgeometri"/>
 *     &lt;enumeration value="Osäker identitet"/>
 *     &lt;enumeration value="Geometriskt fel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "YtkvalitetType")
@XmlEnum
public enum YtkvalitetType {

    @XmlEnumValue("Korrekt ytgeometri")
    KORREKT_YTGEOMETRI("Korrekt ytgeometri"),
    @XmlEnumValue("Os\u00e4ker identitet")
    OSÄKER_IDENTITET("Os\u00e4ker identitet"),
    @XmlEnumValue("Geometriskt fel")
    GEOMETRISKT_FEL("Geometriskt fel");
    private final String value;

    YtkvalitetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static YtkvalitetType fromValue(String v) {
        for (YtkvalitetType c: YtkvalitetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
