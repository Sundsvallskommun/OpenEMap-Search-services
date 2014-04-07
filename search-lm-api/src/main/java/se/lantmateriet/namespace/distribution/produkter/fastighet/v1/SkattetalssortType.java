
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SkattetalssortType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SkattetalssortType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Övrigt"/>
 *     &lt;enumeration value="Mantal"/>
 *     &lt;enumeration value="Öresland/penningland"/>
 *     &lt;enumeration value="Reserv"/>
 *     &lt;enumeration value="Snesland/bandland"/>
 *     &lt;enumeration value="Öre, penningar"/>
 *     &lt;enumeration value="Tunnland/kappland"/>
 *     &lt;enumeration value="Korgar"/>
 *     &lt;enumeration value="Hyttor"/>
 *     &lt;enumeration value="Lispund"/>
 *     &lt;enumeration value="Seland"/>
 *     &lt;enumeration value="Mål"/>
 *     &lt;enumeration value="Bergsmanstomter"/>
 *     &lt;enumeration value="Jordfjärdingar"/>
 *     &lt;enumeration value="Sädesparter"/>
 *     &lt;enumeration value="Riksdaler, skillingar, runstycken"/>
 *     &lt;enumeration value="Skillingar, runstycken"/>
 *     &lt;enumeration value="Kvadratrevar, kvadratstänger"/>
 *     &lt;enumeration value="Spannland, snesland, bandland"/>
 *     &lt;enumeration value="Bandland"/>
 *     &lt;enumeration value="Skatteören"/>
 *     &lt;enumeration value="Hektar R"/>
 *     &lt;enumeration value="Daler, runstycken"/>
 *     &lt;enumeration value="Kappland"/>
 *     &lt;enumeration value="Tunnland"/>
 *     &lt;enumeration value="Trög"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SkattetalssortType")
@XmlEnum
public enum SkattetalssortType {

    @XmlEnumValue("\u00d6vrigt")
    ÖVRIGT("\u00d6vrigt"),
    @XmlEnumValue("Mantal")
    MANTAL("Mantal"),
    @XmlEnumValue("\u00d6resland/penningland")
    ÖRESLAND_PENNINGLAND("\u00d6resland/penningland"),
    @XmlEnumValue("Reserv")
    RESERV("Reserv"),
    @XmlEnumValue("Snesland/bandland")
    SNESLAND_BANDLAND("Snesland/bandland"),
    @XmlEnumValue("\u00d6re, penningar")
    ÖRE_PENNINGAR("\u00d6re, penningar"),
    @XmlEnumValue("Tunnland/kappland")
    TUNNLAND_KAPPLAND("Tunnland/kappland"),
    @XmlEnumValue("Korgar")
    KORGAR("Korgar"),
    @XmlEnumValue("Hyttor")
    HYTTOR("Hyttor"),
    @XmlEnumValue("Lispund")
    LISPUND("Lispund"),
    @XmlEnumValue("Seland")
    SELAND("Seland"),
    @XmlEnumValue("M\u00e5l")
    MÅL("M\u00e5l"),
    @XmlEnumValue("Bergsmanstomter")
    BERGSMANSTOMTER("Bergsmanstomter"),
    @XmlEnumValue("Jordfj\u00e4rdingar")
    JORDFJÄRDINGAR("Jordfj\u00e4rdingar"),
    @XmlEnumValue("S\u00e4desparter")
    SÄDESPARTER("S\u00e4desparter"),
    @XmlEnumValue("Riksdaler, skillingar, runstycken")
    RIKSDALER_SKILLINGAR_RUNSTYCKEN("Riksdaler, skillingar, runstycken"),
    @XmlEnumValue("Skillingar, runstycken")
    SKILLINGAR_RUNSTYCKEN("Skillingar, runstycken"),
    @XmlEnumValue("Kvadratrevar, kvadratst\u00e4nger")
    KVADRATREVAR_KVADRATSTÄNGER("Kvadratrevar, kvadratst\u00e4nger"),
    @XmlEnumValue("Spannland, snesland, bandland")
    SPANNLAND_SNESLAND_BANDLAND("Spannland, snesland, bandland"),
    @XmlEnumValue("Bandland")
    BANDLAND("Bandland"),
    @XmlEnumValue("Skatte\u00f6ren")
    SKATTEÖREN("Skatte\u00f6ren"),
    @XmlEnumValue("Hektar R")
    HEKTAR_R("Hektar R"),
    @XmlEnumValue("Daler, runstycken")
    DALER_RUNSTYCKEN("Daler, runstycken"),
    @XmlEnumValue("Kappland")
    KAPPLAND("Kappland"),
    @XmlEnumValue("Tunnland")
    TUNNLAND("Tunnland"),
    @XmlEnumValue("Tr\u00f6g")
    TRÖG("Tr\u00f6g");
    private final String value;

    SkattetalssortType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SkattetalssortType fromValue(String v) {
        for (SkattetalssortType c: SkattetalssortType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
