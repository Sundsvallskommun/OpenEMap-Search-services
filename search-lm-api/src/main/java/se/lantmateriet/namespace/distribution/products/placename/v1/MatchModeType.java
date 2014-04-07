
package se.lantmateriet.namespace.distribution.products.placename.v1;

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
 *     &lt;enumeration value="ENDS_WITH"/>
 *     &lt;enumeration value="CONTAINS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MatchModeType")
@XmlEnum
public enum MatchModeType {

    EQUALS,
    STARTS_WITH,
    ENDS_WITH,
    CONTAINS;

    public String value() {
        return name();
    }

    public static MatchModeType fromValue(String v) {
        return valueOf(v);
    }

}
