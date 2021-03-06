
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reserveTicket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reserveTicket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataTransfer" type="{http://ws/}dataTransfer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reserveTicket", propOrder = {
    "dataTransfer"
})
public class ReserveTicket {

    protected DataTransfer dataTransfer;

    /**
     * Gets the value of the dataTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link DataTransfer }
     *     
     */
    public DataTransfer getDataTransfer() {
        return dataTransfer;
    }

    /**
     * Sets the value of the dataTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTransfer }
     *     
     */
    public void setDataTransfer(DataTransfer value) {
        this.dataTransfer = value;
    }

}
