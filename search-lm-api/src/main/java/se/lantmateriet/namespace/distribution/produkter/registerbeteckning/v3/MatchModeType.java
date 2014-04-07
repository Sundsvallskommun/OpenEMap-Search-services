
package se.lantmateriet.namespace.distribution.produkter.registerbeteckning.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MatchModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQUALS"/>
 *     &lt;enumeration value="STARTS_WITH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MatchModeType")
@XmlEnum
public enum MatchModeType {

    EQUALS,
    STARTS_WITH;

    public String value() {
        return name();
    }

    public static MatchModeType fromValue(String v) {
        return valueOf(v);
    }

}
