
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _GetTicketUsingNum_QNAME = new QName("http://ws/", "getTicketUsingNum");
    private final static QName _ReserveTicketResponse_QNAME = new QName("http://ws/", "reserveTicketResponse");
    private final static QName _PayTicketResponse_QNAME = new QName("http://ws/", "payTicketResponse");
    private final static QName _ReserveTicket_QNAME = new QName("http://ws/", "reserveTicket");
    private final static QName _ReturnTicketResponse_QNAME = new QName("http://ws/", "returnTicketResponse");
    private final static QName _PayTicket_QNAME = new QName("http://ws/", "payTicket");
    private final static QName _ReturnTicket_QNAME = new QName("http://ws/", "returnTicket");
    private final static QName _IsPaidException_QNAME = new QName("http://ws/", "IsPaidException");
    private final static QName _GetTicketUsingNumResponse_QNAME = new QName("http://ws/", "getTicketUsingNumResponse");
    private final static QName _NotTicketFoundException_QNAME = new QName("http://ws/", "NotTicketFoundException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTicketUsingNum }
     * 
     */
    public GetTicketUsingNum createGetTicketUsingNum() {
        return new GetTicketUsingNum();
    }

    /**
     * Create an instance of {@link ReserveTicketResponse }
     * 
     */
    public ReserveTicketResponse createReserveTicketResponse() {
        return new ReserveTicketResponse();
    }

    /**
     * Create an instance of {@link PayTicketResponse }
     * 
     */
    public PayTicketResponse createPayTicketResponse() {
        return new PayTicketResponse();
    }

    /**
     * Create an instance of {@link ReserveTicket }
     * 
     */
    public ReserveTicket createReserveTicket() {
        return new ReserveTicket();
    }

    /**
     * Create an instance of {@link ReturnTicketResponse }
     * 
     */
    public ReturnTicketResponse createReturnTicketResponse() {
        return new ReturnTicketResponse();
    }

    /**
     * Create an instance of {@link PayTicket }
     * 
     */
    public PayTicket createPayTicket() {
        return new PayTicket();
    }

    /**
     * Create an instance of {@link ReturnTicket }
     * 
     */
    public ReturnTicket createReturnTicket() {
        return new ReturnTicket();
    }

    /**
     * Create an instance of {@link IsPaidException }
     * 
     */
    public IsPaidException createIsPaidException() {
        return new IsPaidException();
    }

    /**
     * Create an instance of {@link GetTicketUsingNumResponse }
     * 
     */
    public GetTicketUsingNumResponse createGetTicketUsingNumResponse() {
        return new GetTicketUsingNumResponse();
    }

    /**
     * Create an instance of {@link NotTicketFoundException }
     * 
     */
    public NotTicketFoundException createNotTicketFoundException() {
        return new NotTicketFoundException();
    }

    /**
     * Create an instance of {@link DataTransfer }
     * 
     */
    public DataTransfer createDataTransfer() {
        return new DataTransfer();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketUsingNum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getTicketUsingNum")
    public JAXBElement<GetTicketUsingNum> createGetTicketUsingNum(GetTicketUsingNum value) {
        return new JAXBElement<GetTicketUsingNum>(_GetTicketUsingNum_QNAME, GetTicketUsingNum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "reserveTicketResponse")
    public JAXBElement<ReserveTicketResponse> createReserveTicketResponse(ReserveTicketResponse value) {
        return new JAXBElement<ReserveTicketResponse>(_ReserveTicketResponse_QNAME, ReserveTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "payTicketResponse")
    public JAXBElement<PayTicketResponse> createPayTicketResponse(PayTicketResponse value) {
        return new JAXBElement<PayTicketResponse>(_PayTicketResponse_QNAME, PayTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "reserveTicket")
    public JAXBElement<ReserveTicket> createReserveTicket(ReserveTicket value) {
        return new JAXBElement<ReserveTicket>(_ReserveTicket_QNAME, ReserveTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "returnTicketResponse")
    public JAXBElement<ReturnTicketResponse> createReturnTicketResponse(ReturnTicketResponse value) {
        return new JAXBElement<ReturnTicketResponse>(_ReturnTicketResponse_QNAME, ReturnTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "payTicket")
    public JAXBElement<PayTicket> createPayTicket(PayTicket value) {
        return new JAXBElement<PayTicket>(_PayTicket_QNAME, PayTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "returnTicket")
    public JAXBElement<ReturnTicket> createReturnTicket(ReturnTicket value) {
        return new JAXBElement<ReturnTicket>(_ReturnTicket_QNAME, ReturnTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsPaidException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "IsPaidException")
    public JAXBElement<IsPaidException> createIsPaidException(IsPaidException value) {
        return new JAXBElement<IsPaidException>(_IsPaidException_QNAME, IsPaidException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketUsingNumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getTicketUsingNumResponse")
    public JAXBElement<GetTicketUsingNumResponse> createGetTicketUsingNumResponse(GetTicketUsingNumResponse value) {
        return new JAXBElement<GetTicketUsingNumResponse>(_GetTicketUsingNumResponse_QNAME, GetTicketUsingNumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotTicketFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "NotTicketFoundException")
    public JAXBElement<NotTicketFoundException> createNotTicketFoundException(NotTicketFoundException value) {
        return new JAXBElement<NotTicketFoundException>(_NotTicketFoundException_QNAME, NotTicketFoundException.class, null, value);
    }

}
