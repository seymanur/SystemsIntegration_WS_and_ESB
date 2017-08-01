
package artifact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the artifact package. 
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

    private final static QName _SubscribeUser_QNAME = new QName("http://ws/", "subscribeUser");
    private final static QName _UnsubscribeUser_QNAME = new QName("http://ws/", "unsubscribeUser");
    private final static QName _UnsubscribeUserResponse_QNAME = new QName("http://ws/", "unsubscribeUserResponse");
    private final static QName _SubscribeUserResponse_QNAME = new QName("http://ws/", "subscribeUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: artifact
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubscribeUser }
     * 
     */
    public SubscribeUser createSubscribeUser() {
        return new SubscribeUser();
    }

    /**
     * Create an instance of {@link UnsubscribeUser }
     * 
     */
    public UnsubscribeUser createUnsubscribeUser() {
        return new UnsubscribeUser();
    }

    /**
     * Create an instance of {@link UnsubscribeUserResponse }
     * 
     */
    public UnsubscribeUserResponse createUnsubscribeUserResponse() {
        return new UnsubscribeUserResponse();
    }

    /**
     * Create an instance of {@link SubscribeUserResponse }
     * 
     */
    public SubscribeUserResponse createSubscribeUserResponse() {
        return new SubscribeUserResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscribeUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "subscribeUser")
    public JAXBElement<SubscribeUser> createSubscribeUser(SubscribeUser value) {
        return new JAXBElement<SubscribeUser>(_SubscribeUser_QNAME, SubscribeUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsubscribeUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "unsubscribeUser")
    public JAXBElement<UnsubscribeUser> createUnsubscribeUser(UnsubscribeUser value) {
        return new JAXBElement<UnsubscribeUser>(_UnsubscribeUser_QNAME, UnsubscribeUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsubscribeUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "unsubscribeUserResponse")
    public JAXBElement<UnsubscribeUserResponse> createUnsubscribeUserResponse(UnsubscribeUserResponse value) {
        return new JAXBElement<UnsubscribeUserResponse>(_UnsubscribeUserResponse_QNAME, UnsubscribeUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscribeUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "subscribeUserResponse")
    public JAXBElement<SubscribeUserResponse> createSubscribeUserResponse(SubscribeUserResponse value) {
        return new JAXBElement<SubscribeUserResponse>(_SubscribeUserResponse_QNAME, SubscribeUserResponse.class, null, value);
    }

}
