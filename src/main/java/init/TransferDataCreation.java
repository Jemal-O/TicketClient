package init;

import javax.xml.datatype.XMLGregorianCalendar;
import ws.DataTransfer;
public class TransferDataCreation {

	public DataTransfer initDataTransfer(String name, String lastName, String patronymicName, String departCity,
			String arrivalCity, XMLGregorianCalendar departDateTime, XMLGregorianCalendar arrivalDateTime,
			XMLGregorianCalendar bDate) {
		DataTransfer transfer = new DataTransfer();
		transfer.setArrivalCity(arrivalCity);
		transfer.setArrivalDate(arrivalDateTime);
		transfer.setBirthDate(bDate);
		transfer.setDepartCity(departCity);
		transfer.setDepartDate(departDateTime);
		transfer.setLastName(lastName);
		transfer.setName(name);
		transfer.setPatronymicName(patronymicName);
		return transfer;

	}
}
