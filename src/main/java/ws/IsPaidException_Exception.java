
package ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "IsPaidException", targetNamespace = "http://ws/")
public class IsPaidException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private IsPaidException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public IsPaidException_Exception(String message, IsPaidException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public IsPaidException_Exception(String message, IsPaidException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: ws.IsPaidException
     */
    public IsPaidException getFaultInfo() {
        return faultInfo;
    }

}