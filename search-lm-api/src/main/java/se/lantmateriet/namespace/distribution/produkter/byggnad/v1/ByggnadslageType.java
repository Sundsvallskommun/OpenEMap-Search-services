
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ByggnadslageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ByggnadslageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ospecificerad"/>
 *     &lt;enumeration value="Fasad"/>
 *     &lt;enumeration value="Takkant"/>
 *     &lt;enumeration value="Illustrativt läge"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ByggnadslageType")
@XmlEnum
public enum ByggnadslageType {

    @XmlEnumValue("Ospecificerad")
    OSPECIFICERAD("Ospecificerad"),
    @XmlEnumValue("Fasad")
    FASAD("Fasad"),
    @XmlEnumValue("Takkant")
    TAKKANT("Takkant"),
    @XmlEnumValue("Illustrativt l\u00e4ge")
    ILLUSTRATIVT_LÄGE("Illustrativt l\u00e4ge");
    private final String value;

    ByggnadslageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ByggnadslageType fromValue(String v) {
        for (ByggnadslageType c: ByggnadslageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
