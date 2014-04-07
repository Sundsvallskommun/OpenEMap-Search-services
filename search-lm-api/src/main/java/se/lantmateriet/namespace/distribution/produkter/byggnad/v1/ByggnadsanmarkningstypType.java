
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ByggnadsanmarkningstypType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ByggnadsanmarkningstypType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Adress"/>
 *     &lt;enumeration value="Taxering"/>
 *     &lt;enumeration value="Ägare"/>
 *     &lt;enumeration value="Belägen på oidentifierat område"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ByggnadsanmarkningstypType")
@XmlEnum
public enum ByggnadsanmarkningstypType {

    @XmlEnumValue("Adress")
    ADRESS("Adress"),
    @XmlEnumValue("Taxering")
    TAXERING("Taxering"),
    @XmlEnumValue("\u00c4gare")
    ÄGARE("\u00c4gare"),
    @XmlEnumValue("Bel\u00e4gen p\u00e5 oidentifierat omr\u00e5de")
    BELÄGEN_PÅ_OIDENTIFIERAT_OMRÅDE("Bel\u00e4gen p\u00e5 oidentifierat omr\u00e5de");
    private final String value;

    ByggnadsanmarkningstypType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ByggnadsanmarkningstypType fromValue(String v) {
        for (ByggnadsanmarkningstypType c: ByggnadsanmarkningstypType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
