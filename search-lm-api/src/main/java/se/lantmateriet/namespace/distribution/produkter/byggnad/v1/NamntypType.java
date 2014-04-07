
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NamntypType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NamntypType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Huvudnamn topografi"/>
 *     &lt;enumeration value="Övrigt namn topografi"/>
 *     &lt;enumeration value="Alternativnamn"/>
 *     &lt;enumeration value="Alternativ byggnadsbeteckning"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NamntypType")
@XmlEnum
public enum NamntypType {

    @XmlEnumValue("Huvudnamn topografi")
    HUVUDNAMN_TOPOGRAFI("Huvudnamn topografi"),
    @XmlEnumValue("\u00d6vrigt namn topografi")
    ÖVRIGT_NAMN_TOPOGRAFI("\u00d6vrigt namn topografi"),
    @XmlEnumValue("Alternativnamn")
    ALTERNATIVNAMN("Alternativnamn"),
    @XmlEnumValue("Alternativ byggnadsbeteckning")
    ALTERNATIV_BYGGNADSBETECKNING("Alternativ byggnadsbeteckning");
    private final String value;

    NamntypType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NamntypType fromValue(String v) {
        for (NamntypType c: NamntypType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
