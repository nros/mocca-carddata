//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.09.07 at 09:47:31 AM CEST 
//


package at.buergerkarte.namespaces.securitylayer._20020225_;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the at.buergerkarte.namespaces.securitylayer._20020225_ package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateXMLSignatureRequest_QNAME = new QName("http://www.buergerkarte.at/namespaces/securitylayer/20020225#", "CreateXMLSignatureRequest");
    private final static QName _InfoboxUpdateRequest_QNAME = new QName("http://www.buergerkarte.at/namespaces/securitylayer/20020225#", "InfoboxUpdateRequest");
    private final static QName _ErrorResponse_QNAME = new QName("http://www.buergerkarte.at/namespaces/securitylayer/20020225#", "ErrorResponse");
    private final static QName _VerifyXMLSignatureResponse_QNAME = new QName("http://www.buergerkarte.at/namespaces/securitylayer/20020225#", "VerifyXMLSignatureResponse");
    private final static QName _CreateSessionKeyResponse_QNAME = new QName("http://www.buergerkarte.at/namespaces/securitylayer/20020225#", "CreateSessionKeyResponse");
    private final static QName _GetPropertiesRequest_QNAME = new QName("http://www.buergerkarte.at/namespaces/securitylayer/20020225#", "GetPropertiesRequest");
    private final static QName _GetPropertiesResponse_QNAME = new QName("http://www.buergerkarte.at/namespaces/securitylayer/20020225#", "GetPropertiesResponse");
    private final static QName _InfoboxAvailableResponse_QNAME = new QName("http://www.buergerkarte.at/namespaces/securitylayer/20020225#", "InfoboxAvailableResponse");
    private final static QName _InfoboxAvailableRequest_QNAME = new QName("http://www.buergerkarte.at/namespaces/securitylayer/20020225#", "InfoboxAvailableRequest");
    private final static QName _CreateSessionKeyRequest_QNAME = new QName("http://www.buergerkarte.at/namespaces/securitylayer/20020225#", "CreateSessionKeyRequest");
    private final static QName _InfoboxUpdateResponse_QNAME = new QName("http://www.buergerkarte.at/namespaces/securitylayer/20020225#", "InfoboxUpdateResponse");
    private final static QName _CreateXMLSignatureResponse_QNAME = new QName("http://www.buergerkarte.at/namespaces/securitylayer/20020225#", "CreateXMLSignatureResponse");
    private final static QName _GetStatusResponse_QNAME = new QName("http://www.buergerkarte.at/namespaces/securitylayer/20020225#", "GetStatusResponse");
    private final static QName _CreateCMSSignatureRequest_QNAME = new QName("http://www.buergerkarte.at/namespaces/securitylayer/20020225#", "CreateCMSSignatureRequest");
    private final static QName _CreateSymmetricSecretRequest_QNAME = new QName("http://www.buergerkarte.at/namespaces/securitylayer/20020225#", "CreateSymmetricSecretRequest");
    private final static QName _VerifyXMLSignatureRequest_QNAME = new QName("http://www.buergerkarte.at/namespaces/securitylayer/20020225#", "VerifyXMLSignatureRequest");
    private final static QName _CreateSymmetricSecretResponse_QNAME = new QName("http://www.buergerkarte.at/namespaces/securitylayer/20020225#", "CreateSymmetricSecretResponse");
    private final static QName _CreateCMSSignatureResponse_QNAME = new QName("http://www.buergerkarte.at/namespaces/securitylayer/20020225#", "CreateCMSSignatureResponse");
    private final static QName _VerifyCMSSignatureResponse_QNAME = new QName("http://www.buergerkarte.at/namespaces/securitylayer/20020225#", "VerifyCMSSignatureResponse");
    private final static QName _InfoboxReadResponse_QNAME = new QName("http://www.buergerkarte.at/namespaces/securitylayer/20020225#", "InfoboxReadResponse");
    private final static QName _VerifyCMSSignatureRequest_QNAME = new QName("http://www.buergerkarte.at/namespaces/securitylayer/20020225#", "VerifyCMSSignatureRequest");
    private final static QName _InfoboxReadRequest_QNAME = new QName("http://www.buergerkarte.at/namespaces/securitylayer/20020225#", "InfoboxReadRequest");
    private final static QName _GetStatusRequest_QNAME = new QName("http://www.buergerkarte.at/namespaces/securitylayer/20020225#", "GetStatusRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.buergerkarte.namespaces.securitylayer._20020225_
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ErrorResponseType }
     * 
     */
    public ErrorResponseType createErrorResponseType() {
        return new ErrorResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.buergerkarte.at/namespaces/securitylayer/20020225#", name = "CreateXMLSignatureRequest")
    public JAXBElement<Object> createCreateXMLSignatureRequest(Object value) {
        return new JAXBElement<Object>(_CreateXMLSignatureRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.buergerkarte.at/namespaces/securitylayer/20020225#", name = "InfoboxUpdateRequest")
    public JAXBElement<Object> createInfoboxUpdateRequest(Object value) {
        return new JAXBElement<Object>(_InfoboxUpdateRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.buergerkarte.at/namespaces/securitylayer/20020225#", name = "ErrorResponse")
    public JAXBElement<ErrorResponseType> createErrorResponse(ErrorResponseType value) {
        return new JAXBElement<ErrorResponseType>(_ErrorResponse_QNAME, ErrorResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.buergerkarte.at/namespaces/securitylayer/20020225#", name = "VerifyXMLSignatureResponse")
    public JAXBElement<Object> createVerifyXMLSignatureResponse(Object value) {
        return new JAXBElement<Object>(_VerifyXMLSignatureResponse_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.buergerkarte.at/namespaces/securitylayer/20020225#", name = "CreateSessionKeyResponse")
    public JAXBElement<Object> createCreateSessionKeyResponse(Object value) {
        return new JAXBElement<Object>(_CreateSessionKeyResponse_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.buergerkarte.at/namespaces/securitylayer/20020225#", name = "GetPropertiesRequest")
    public JAXBElement<Object> createGetPropertiesRequest(Object value) {
        return new JAXBElement<Object>(_GetPropertiesRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.buergerkarte.at/namespaces/securitylayer/20020225#", name = "GetPropertiesResponse")
    public JAXBElement<Object> createGetPropertiesResponse(Object value) {
        return new JAXBElement<Object>(_GetPropertiesResponse_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.buergerkarte.at/namespaces/securitylayer/20020225#", name = "InfoboxAvailableResponse")
    public JAXBElement<Object> createInfoboxAvailableResponse(Object value) {
        return new JAXBElement<Object>(_InfoboxAvailableResponse_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.buergerkarte.at/namespaces/securitylayer/20020225#", name = "InfoboxAvailableRequest")
    public JAXBElement<Object> createInfoboxAvailableRequest(Object value) {
        return new JAXBElement<Object>(_InfoboxAvailableRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.buergerkarte.at/namespaces/securitylayer/20020225#", name = "CreateSessionKeyRequest")
    public JAXBElement<Object> createCreateSessionKeyRequest(Object value) {
        return new JAXBElement<Object>(_CreateSessionKeyRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.buergerkarte.at/namespaces/securitylayer/20020225#", name = "InfoboxUpdateResponse")
    public JAXBElement<Object> createInfoboxUpdateResponse(Object value) {
        return new JAXBElement<Object>(_InfoboxUpdateResponse_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.buergerkarte.at/namespaces/securitylayer/20020225#", name = "CreateXMLSignatureResponse")
    public JAXBElement<Object> createCreateXMLSignatureResponse(Object value) {
        return new JAXBElement<Object>(_CreateXMLSignatureResponse_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.buergerkarte.at/namespaces/securitylayer/20020225#", name = "GetStatusResponse")
    public JAXBElement<Object> createGetStatusResponse(Object value) {
        return new JAXBElement<Object>(_GetStatusResponse_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.buergerkarte.at/namespaces/securitylayer/20020225#", name = "CreateCMSSignatureRequest")
    public JAXBElement<Object> createCreateCMSSignatureRequest(Object value) {
        return new JAXBElement<Object>(_CreateCMSSignatureRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.buergerkarte.at/namespaces/securitylayer/20020225#", name = "CreateSymmetricSecretRequest")
    public JAXBElement<Object> createCreateSymmetricSecretRequest(Object value) {
        return new JAXBElement<Object>(_CreateSymmetricSecretRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.buergerkarte.at/namespaces/securitylayer/20020225#", name = "VerifyXMLSignatureRequest")
    public JAXBElement<Object> createVerifyXMLSignatureRequest(Object value) {
        return new JAXBElement<Object>(_VerifyXMLSignatureRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.buergerkarte.at/namespaces/securitylayer/20020225#", name = "CreateSymmetricSecretResponse")
    public JAXBElement<Object> createCreateSymmetricSecretResponse(Object value) {
        return new JAXBElement<Object>(_CreateSymmetricSecretResponse_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.buergerkarte.at/namespaces/securitylayer/20020225#", name = "CreateCMSSignatureResponse")
    public JAXBElement<Object> createCreateCMSSignatureResponse(Object value) {
        return new JAXBElement<Object>(_CreateCMSSignatureResponse_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.buergerkarte.at/namespaces/securitylayer/20020225#", name = "VerifyCMSSignatureResponse")
    public JAXBElement<Object> createVerifyCMSSignatureResponse(Object value) {
        return new JAXBElement<Object>(_VerifyCMSSignatureResponse_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.buergerkarte.at/namespaces/securitylayer/20020225#", name = "InfoboxReadResponse")
    public JAXBElement<Object> createInfoboxReadResponse(Object value) {
        return new JAXBElement<Object>(_InfoboxReadResponse_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.buergerkarte.at/namespaces/securitylayer/20020225#", name = "VerifyCMSSignatureRequest")
    public JAXBElement<Object> createVerifyCMSSignatureRequest(Object value) {
        return new JAXBElement<Object>(_VerifyCMSSignatureRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.buergerkarte.at/namespaces/securitylayer/20020225#", name = "InfoboxReadRequest")
    public JAXBElement<Object> createInfoboxReadRequest(Object value) {
        return new JAXBElement<Object>(_InfoboxReadRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.buergerkarte.at/namespaces/securitylayer/20020225#", name = "GetStatusRequest")
    public JAXBElement<Object> createGetStatusRequest(Object value) {
        return new JAXBElement<Object>(_GetStatusRequest_QNAME, Object.class, null, value);
    }

}