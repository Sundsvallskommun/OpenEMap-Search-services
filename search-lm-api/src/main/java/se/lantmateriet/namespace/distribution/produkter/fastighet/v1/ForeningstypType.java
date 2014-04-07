
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForeningstypType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForeningstypType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LGA"/>
 *     &lt;enumeration value="VÄGF"/>
 *     &lt;enumeration value="VÄGSAM"/>
 *     &lt;enumeration value="SAMF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ForeningstypType")
@XmlEnum
public enum ForeningstypType {

    LGA,
    VÄGF,
    VÄGSAM,
    SAMF;

    public String value() {
        return name();
    }

    public static ForeningstypType fromValue(String v) {
        return valueOf(v);
    }

}
