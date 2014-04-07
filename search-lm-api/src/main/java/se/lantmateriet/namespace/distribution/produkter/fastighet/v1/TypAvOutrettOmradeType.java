
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypAvOutrettOmradeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypAvOutrettOmradeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Fastighetsområde"/>
 *     &lt;enumeration value="Samfällt område"/>
 *     &lt;enumeration value="Ospecificerat område"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypAvOutrettOmradeType")
@XmlEnum
public enum TypAvOutrettOmradeType {

    @XmlEnumValue("Fastighetsomr\u00e5de")
    FASTIGHETSOMRÅDE("Fastighetsomr\u00e5de"),
    @XmlEnumValue("Samf\u00e4llt omr\u00e5de")
    SAMFÄLLT_OMRÅDE("Samf\u00e4llt omr\u00e5de"),
    @XmlEnumValue("Ospecificerat omr\u00e5de")
    OSPECIFICERAT_OMRÅDE("Ospecificerat omr\u00e5de");
    private final String value;

    TypAvOutrettOmradeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypAvOutrettOmradeType fromValue(String v) {
        for (TypAvOutrettOmradeType c: TypAvOutrettOmradeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
