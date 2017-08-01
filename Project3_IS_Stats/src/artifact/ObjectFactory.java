
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

    private final static QName _NumTwitter_QNAME = new QName("http://ws/", "numTwitter");
    private final static QName _EmailsDigest_QNAME = new QName("http://ws/", "emailsDigest");
    private final static QName _EmailsDigestResponse_QNAME = new QName("http://ws/", "emailsDigestResponse");
    private final static QName _TotalNews_QNAME = new QName("http://ws/", "totalNews");
    private final static QName _NumTwitterResponse_QNAME = new QName("http://ws/", "numTwitterResponse");
    private final static QName _TotalNewsResponse_QNAME = new QName("http://ws/", "totalNewsResponse");
    private final static QName _TotalNewsByGenreResponse_QNAME = new QName("http://ws/", "totalNewsByGenreResponse");
    private final static QName _TotalNewsByGenre_QNAME = new QName("http://ws/", "totalNewsByGenre");
    private final static QName _EmailsNonDigest_QNAME = new QName("http://ws/", "emailsNonDigest");
    private final static QName _EmailsNonDigestResponse_QNAME = new QName("http://ws/", "emailsNonDigestResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: artifact
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NumTwitter }
     * 
     */
    public NumTwitter createNumTwitter() {
        return new NumTwitter();
    }

    /**
     * Create an instance of {@link EmailsDigest }
     * 
     */
    public EmailsDigest createEmailsDigest() {
        return new EmailsDigest();
    }

    /**
     * Create an instance of {@link EmailsDigestResponse }
     * 
     */
    public EmailsDigestResponse createEmailsDigestResponse() {
        return new EmailsDigestResponse();
    }

    /**
     * Create an instance of {@link TotalNews }
     * 
     */
    public TotalNews createTotalNews() {
        return new TotalNews();
    }

    /**
     * Create an instance of {@link NumTwitterResponse }
     * 
     */
    public NumTwitterResponse createNumTwitterResponse() {
        return new NumTwitterResponse();
    }

    /**
     * Create an instance of {@link TotalNewsResponse }
     * 
     */
    public TotalNewsResponse createTotalNewsResponse() {
        return new TotalNewsResponse();
    }

    /**
     * Create an instance of {@link TotalNewsByGenreResponse }
     * 
     */
    public TotalNewsByGenreResponse createTotalNewsByGenreResponse() {
        return new TotalNewsByGenreResponse();
    }

    /**
     * Create an instance of {@link TotalNewsByGenre }
     * 
     */
    public TotalNewsByGenre createTotalNewsByGenre() {
        return new TotalNewsByGenre();
    }

    /**
     * Create an instance of {@link EmailsNonDigest }
     * 
     */
    public EmailsNonDigest createEmailsNonDigest() {
        return new EmailsNonDigest();
    }

    /**
     * Create an instance of {@link EmailsNonDigestResponse }
     * 
     */
    public EmailsNonDigestResponse createEmailsNonDigestResponse() {
        return new EmailsNonDigestResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumTwitter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "numTwitter")
    public JAXBElement<NumTwitter> createNumTwitter(NumTwitter value) {
        return new JAXBElement<NumTwitter>(_NumTwitter_QNAME, NumTwitter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailsDigest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "emailsDigest")
    public JAXBElement<EmailsDigest> createEmailsDigest(EmailsDigest value) {
        return new JAXBElement<EmailsDigest>(_EmailsDigest_QNAME, EmailsDigest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailsDigestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "emailsDigestResponse")
    public JAXBElement<EmailsDigestResponse> createEmailsDigestResponse(EmailsDigestResponse value) {
        return new JAXBElement<EmailsDigestResponse>(_EmailsDigestResponse_QNAME, EmailsDigestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalNews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "totalNews")
    public JAXBElement<TotalNews> createTotalNews(TotalNews value) {
        return new JAXBElement<TotalNews>(_TotalNews_QNAME, TotalNews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumTwitterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "numTwitterResponse")
    public JAXBElement<NumTwitterResponse> createNumTwitterResponse(NumTwitterResponse value) {
        return new JAXBElement<NumTwitterResponse>(_NumTwitterResponse_QNAME, NumTwitterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalNewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "totalNewsResponse")
    public JAXBElement<TotalNewsResponse> createTotalNewsResponse(TotalNewsResponse value) {
        return new JAXBElement<TotalNewsResponse>(_TotalNewsResponse_QNAME, TotalNewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalNewsByGenreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "totalNewsByGenreResponse")
    public JAXBElement<TotalNewsByGenreResponse> createTotalNewsByGenreResponse(TotalNewsByGenreResponse value) {
        return new JAXBElement<TotalNewsByGenreResponse>(_TotalNewsByGenreResponse_QNAME, TotalNewsByGenreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalNewsByGenre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "totalNewsByGenre")
    public JAXBElement<TotalNewsByGenre> createTotalNewsByGenre(TotalNewsByGenre value) {
        return new JAXBElement<TotalNewsByGenre>(_TotalNewsByGenre_QNAME, TotalNewsByGenre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailsNonDigest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "emailsNonDigest")
    public JAXBElement<EmailsNonDigest> createEmailsNonDigest(EmailsNonDigest value) {
        return new JAXBElement<EmailsNonDigest>(_EmailsNonDigest_QNAME, EmailsNonDigest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailsNonDigestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "emailsNonDigestResponse")
    public JAXBElement<EmailsNonDigestResponse> createEmailsNonDigestResponse(EmailsNonDigestResponse value) {
        return new JAXBElement<EmailsNonDigestResponse>(_EmailsNonDigestResponse_QNAME, EmailsNonDigestResponse.class, null, value);
    }

}
