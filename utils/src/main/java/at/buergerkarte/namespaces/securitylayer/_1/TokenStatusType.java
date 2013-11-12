//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.26 at 12:32:35 PM MEZ 
//


package at.buergerkarte.namespaces.securitylayer._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TokenStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TokenStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ready"/>
 *     &lt;enumeration value="removed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TokenStatusType")
@XmlEnum
public enum TokenStatusType {

    @XmlEnumValue("ready")
    READY("ready"),
    @XmlEnumValue("removed")
    REMOVED("removed");
    private final String value;

    TokenStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TokenStatusType fromValue(String v) {
        for (TokenStatusType c: TokenStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}