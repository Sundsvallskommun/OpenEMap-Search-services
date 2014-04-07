
package se.lantmateriet.namespace.distribution.products.placename.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NamntypType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NamntypType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BEBTX"/>
 *     &lt;enumeration value="BEBTÄTTX"/>
 *     &lt;enumeration value="KYRKATX"/>
 *     &lt;enumeration value="ANLTX"/>
 *     &lt;enumeration value="TERRTX"/>
 *     &lt;enumeration value="VATTTX"/>
 *     &lt;enumeration value="VATTDELTX"/>
 *     &lt;enumeration value="VATTDRTX"/>
 *     &lt;enumeration value="SANKTX"/>
 *     &lt;enumeration value="GLACIÄRTX"/>
 *     &lt;enumeration value="TRAKTTX"/>
 *     &lt;enumeration value="NATTX"/>
 *     &lt;enumeration value="KULTURTX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NamntypType")
@XmlEnum
public enum NamntypType {

    BEBTX,
    BEBTÄTTX,
    KYRKATX,
    ANLTX,
    TERRTX,
    VATTTX,
    VATTDELTX,
    VATTDRTX,
    SANKTX,
    GLACIÄRTX,
    TRAKTTX,
    NATTX,
    KULTURTX;

    public String value() {
        return name();
    }

    public static NamntypType fromValue(String v) {
        return valueOf(v);
    }

}
