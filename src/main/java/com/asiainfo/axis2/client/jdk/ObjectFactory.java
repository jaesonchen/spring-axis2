
package com.asiainfo.axis2.client.jdk;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.asiainfo.axis2.client.jdk package. 
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

    private final static QName _GetBytesResponseReturn_QNAME = new QName("http://service.axis2.asiainfo.com", "return");
    private final static QName _ByteToStringBt_QNAME = new QName("http://service.axis2.asiainfo.com", "bt");
    private final static QName _HelloServiceUnsupportedEncodingExceptionUnsupportedEncodingException_QNAME = new QName("http://service.axis2.asiainfo.com", "UnsupportedEncodingException");
    private final static QName _UserMap_QNAME = new QName("http://model.axis2.asiainfo.com/xsd", "map");
    private final static QName _UserUsername_QNAME = new QName("http://model.axis2.asiainfo.com/xsd", "username");
    private final static QName _GreetingName_QNAME = new QName("http://service.axis2.asiainfo.com", "name");
    private final static QName _GetUserUsername_QNAME = new QName("http://service.axis2.asiainfo.com", "username");
    private final static QName _GetBytesStr_QNAME = new QName("http://service.axis2.asiainfo.com", "str");
    private final static QName _SaveUserUser_QNAME = new QName("http://service.axis2.asiainfo.com", "user");
    private final static QName _Entry1Key_QNAME = new QName("http://ws.apache.org/namespaces/axis2/map", "key");
    private final static QName _Entry1Value_QNAME = new QName("http://ws.apache.org/namespaces/axis2/map", "value");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.asiainfo.axis2.client.jdk
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link ByteToStringResponse }
     * 
     */
    public ByteToStringResponse createByteToStringResponse() {
        return new ByteToStringResponse();
    }

    /**
     * Create an instance of {@link ByteToString }
     * 
     */
    public ByteToString createByteToString() {
        return new ByteToString();
    }

    /**
     * Create an instance of {@link GreetingResponse }
     * 
     */
    public GreetingResponse createGreetingResponse() {
        return new GreetingResponse();
    }

    /**
     * Create an instance of {@link Greeting }
     * 
     */
    public Greeting createGreeting() {
        return new Greeting();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link HelloServiceUnsupportedEncodingException }
     * 
     */
    public HelloServiceUnsupportedEncodingException createHelloServiceUnsupportedEncodingException() {
        return new HelloServiceUnsupportedEncodingException();
    }

    /**
     * Create an instance of {@link UnsupportedEncodingException }
     * 
     */
    public UnsupportedEncodingException createUnsupportedEncodingException() {
        return new UnsupportedEncodingException();
    }

    /**
     * Create an instance of {@link SaveUserResponse }
     * 
     */
    public SaveUserResponse createSaveUserResponse() {
        return new SaveUserResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link GetBytes }
     * 
     */
    public GetBytes createGetBytes() {
        return new GetBytes();
    }

    /**
     * Create an instance of {@link SaveUser }
     * 
     */
    public SaveUser createSaveUser() {
        return new SaveUser();
    }

    /**
     * Create an instance of {@link GetBytesResponse }
     * 
     */
    public GetBytesResponse createGetBytesResponse() {
        return new GetBytesResponse();
    }

    /**
     * Create an instance of {@link Entry1 }
     * 
     */
    public Entry1 createEntry1() {
        return new Entry1();
    }

    /**
     * Create an instance of {@link Map1 }
     * 
     */
    public Map1 createMap1() {
        return new Map1();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.axis2.asiainfo.com", name = "return", scope = GetBytesResponse.class)
    public JAXBElement<byte[]> createGetBytesResponseReturn(byte[] value) {
        return new JAXBElement<byte[]>(_GetBytesResponseReturn_QNAME, byte[].class, GetBytesResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.axis2.asiainfo.com", name = "return", scope = ByteToStringResponse.class)
    public JAXBElement<String> createByteToStringResponseReturn(String value) {
        return new JAXBElement<String>(_GetBytesResponseReturn_QNAME, String.class, ByteToStringResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.axis2.asiainfo.com", name = "bt", scope = ByteToString.class)
    public JAXBElement<byte[]> createByteToStringBt(byte[] value) {
        return new JAXBElement<byte[]>(_ByteToStringBt_QNAME, byte[].class, ByteToString.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsupportedEncodingException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.axis2.asiainfo.com", name = "UnsupportedEncodingException", scope = HelloServiceUnsupportedEncodingException.class)
    public JAXBElement<UnsupportedEncodingException> createHelloServiceUnsupportedEncodingExceptionUnsupportedEncodingException(UnsupportedEncodingException value) {
        return new JAXBElement<UnsupportedEncodingException>(_HelloServiceUnsupportedEncodingExceptionUnsupportedEncodingException_QNAME, UnsupportedEncodingException.class, HelloServiceUnsupportedEncodingException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Map1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.axis2.asiainfo.com/xsd", name = "map", scope = User.class)
    public JAXBElement<Map1> createUserMap(Map1 value) {
        return new JAXBElement<Map1>(_UserMap_QNAME, Map1 .class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.axis2.asiainfo.com/xsd", name = "username", scope = User.class)
    public JAXBElement<String> createUserUsername(String value) {
        return new JAXBElement<String>(_UserUsername_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.axis2.asiainfo.com", name = "name", scope = Greeting.class)
    public JAXBElement<String> createGreetingName(String value) {
        return new JAXBElement<String>(_GreetingName_QNAME, String.class, Greeting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.axis2.asiainfo.com", name = "username", scope = GetUser.class)
    public JAXBElement<String> createGetUserUsername(String value) {
        return new JAXBElement<String>(_GetUserUsername_QNAME, String.class, GetUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.axis2.asiainfo.com", name = "str", scope = GetBytes.class)
    public JAXBElement<String> createGetBytesStr(String value) {
        return new JAXBElement<String>(_GetBytesStr_QNAME, String.class, GetBytes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.axis2.asiainfo.com", name = "user", scope = SaveUser.class)
    public JAXBElement<User> createSaveUserUser(User value) {
        return new JAXBElement<User>(_SaveUserUser_QNAME, User.class, SaveUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.axis2.asiainfo.com", name = "return", scope = GetUserResponse.class)
    public JAXBElement<User> createGetUserResponseReturn(User value) {
        return new JAXBElement<User>(_GetBytesResponseReturn_QNAME, User.class, GetUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.axis2.asiainfo.com", name = "return", scope = GreetingResponse.class)
    public JAXBElement<String> createGreetingResponseReturn(String value) {
        return new JAXBElement<String>(_GetBytesResponseReturn_QNAME, String.class, GreetingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.apache.org/namespaces/axis2/map", name = "key", scope = Entry1 .class)
    public JAXBElement<String> createEntry1Key(String value) {
        return new JAXBElement<String>(_Entry1Key_QNAME, String.class, Entry1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.apache.org/namespaces/axis2/map", name = "value", scope = Entry1 .class)
    public JAXBElement<String> createEntry1Value(String value) {
        return new JAXBElement<String>(_Entry1Value_QNAME, String.class, Entry1 .class, value);
    }

}
