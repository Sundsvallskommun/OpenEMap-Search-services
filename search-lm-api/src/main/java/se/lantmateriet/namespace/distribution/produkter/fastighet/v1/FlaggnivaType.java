
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlaggnivaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlaggnivaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Lantmäteriförrättning pågår"/>
 *     &lt;enumeration value="Lantmäteriförrättning pågår - beslut taget"/>
 *     &lt;enumeration value="Ajourföring pågår i fastighetsregistret"/>
 *     &lt;enumeration value="Allvarligt fel i FR Allmänna delen"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlaggnivaType")
@XmlEnum
public enum FlaggnivaType {

    @XmlEnumValue("Lantm\u00e4terif\u00f6rr\u00e4ttning p\u00e5g\u00e5r")
    LANTMÄTERIFÖRRÄTTNING_PÅGÅR("Lantm\u00e4terif\u00f6rr\u00e4ttning p\u00e5g\u00e5r"),
    @XmlEnumValue("Lantm\u00e4terif\u00f6rr\u00e4ttning p\u00e5g\u00e5r - beslut taget")
    LANTMÄTERIFÖRRÄTTNING_PÅGÅR_BESLUT_TAGET("Lantm\u00e4terif\u00f6rr\u00e4ttning p\u00e5g\u00e5r - beslut taget"),
    @XmlEnumValue("Ajourf\u00f6ring p\u00e5g\u00e5r i fastighetsregistret")
    AJOURFÖRING_PÅGÅR_I_FASTIGHETSREGISTRET("Ajourf\u00f6ring p\u00e5g\u00e5r i fastighetsregistret"),
    @XmlEnumValue("Allvarligt fel i FR Allm\u00e4nna delen")
    ALLVARLIGT_FEL_I_FR_ALLMÄNNA_DELEN("Allvarligt fel i FR Allm\u00e4nna delen");
    private final String value;

    FlaggnivaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlaggnivaType fromValue(String v) {
        for (FlaggnivaType c: FlaggnivaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
