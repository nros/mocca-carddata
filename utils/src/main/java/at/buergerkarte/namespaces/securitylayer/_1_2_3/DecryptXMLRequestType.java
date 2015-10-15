//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.01 at 04:42:31 PM CEST 
//


package at.buergerkarte.namespaces.securitylayer._1_2_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecryptXMLRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecryptXMLRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EncryptedContent" type="{http://www.buergerkarte.at/namespaces/securitylayer/1.2#}Base64XMLOptRefContentType"/>
 *         &lt;element name="EncrElemsSelector" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Supplement" type="{http://www.buergerkarte.at/namespaces/securitylayer/1.2#}DataObjectAssociationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ReturnResult" type="{http://www.buergerkarte.at/namespaces/securitylayer/1.2#}ReturnResultType" default="xml" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecryptXMLRequestType", propOrder = {
    "encryptedContent",
    "encrElemsSelector",
    "supplement"
})
public class DecryptXMLRequestType {

    @XmlElement(name = "EncryptedContent", required = true)
    protected Base64XMLOptRefContentType encryptedContent;
    @XmlElement(name = "EncrElemsSelector", required = true)
    protected String encrElemsSelector;
    @XmlElement(name = "Supplement")
    protected List<DataObjectAssociationType> supplement;
    @XmlAttribute(name = "ReturnResult")
    protected ReturnResultType returnResult;

    /**
     * Gets the value of the encryptedContent property.
     * 
     * @return
     *     possible object is
     *     {@link Base64XMLOptRefContentType }
     *     
     */
    public Base64XMLOptRefContentType getEncryptedContent() {
        return encryptedContent;
    }

    /**
     * Sets the value of the encryptedContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64XMLOptRefContentType }
     *     
     */
    public void setEncryptedContent(Base64XMLOptRefContentType value) {
        this.encryptedContent = value;
    }

    /**
     * Gets the value of the encrElemsSelector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncrElemsSelector() {
        return encrElemsSelector;
    }

    /**
     * Sets the value of the encrElemsSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncrElemsSelector(String value) {
        this.encrElemsSelector = value;
    }

    /**
     * Gets the value of the supplement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataObjectAssociationType }
     * 
     * 
     */
    public List<DataObjectAssociationType> getSupplement() {
        if (supplement == null) {
            supplement = new ArrayList<DataObjectAssociationType>();
        }
        return this.supplement;
    }

    /**
     * Gets the value of the returnResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnResultType }
     *     
     */
    public ReturnResultType getReturnResult() {
        if (returnResult == null) {
            return ReturnResultType.XML;
        } else {
            return returnResult;
        }
    }

    /**
     * Sets the value of the returnResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnResultType }
     *     
     */
    public void setReturnResult(ReturnResultType value) {
        this.returnResult = value;
    }

}