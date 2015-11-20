package controllers;

import java.io.IOException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ws.Ticket;
import ws.TicketServiceImp;
import ws.TicketServiceImpService;
import ws.TicketStatus;

@Controller
public class TicketsController {
//	не самое хорошее имя для сервиса tickets
	TicketServiceImp tickets;

	@RequestMapping(value = "/reserve")
	public ModelAndView reserveTicket(	@RequestParam(name = "name") String name,
										@RequestParam(name = "lastName") String lastName,
										@RequestParam(name = "patronymicName") String patronymicName,
										@RequestParam(name = "departCity") String departCity,
										@RequestParam(name = "arrivalCity") String arrivalCity,
										@RequestParam(name = "departDate") String departDate,
										@RequestParam(name = "arrivalDate") String arrivalDate, 
										@RequestParam(name = "birthDate") String birthDate,
										@RequestParam(name = "departTime") String departTime,
										@RequestParam(name = "arrivalTime") String arrivalTime, 
										ModelAndView modelAndView)	throws IOException, DatatypeConfigurationException {

//		если это spring, то стоит использовать dependency injection
		tickets = (new TicketServiceImpService()).getTicketServiceImpPort();
		
		XMLGregorianCalendar bDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(birthDate + "T00:00:00");
		XMLGregorianCalendar departDateTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(departDate + departTime);
		XMLGregorianCalendar arrivalDateTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(arrivalDate + departTime);

		int ticketNumber = tickets.reserveTicket(name, lastName, patronymicName, departCity, arrivalCity,
				departDateTime, arrivalDateTime, bDate);
		modelAndView.getModelMap().addAttribute("ticket", ticketNumber);
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@RequestMapping(value = "/getTicket")
	public ModelAndView getTicketUsingNum(@RequestParam(value = "ticketNum", required = false) int ticketNum,
			ModelAndView modelAndView) throws IOException {
//		эм... в каждом методе создавать объект TicketServiceImpService? Зачем?
		tickets = (new TicketServiceImpService()).getTicketServiceImpPort();
		try {
			Ticket ticket = tickets.getTicketUsingNum(ticketNum);
			addAttributeToModel(modelAndView, ticket);
//			плохо ловаить NullPointerException. Это программная ошибка, а не бизнес логики. Можно случайно пропустить серьезный баг.
		} catch (NullPointerException ex) {
			modelAndView.getModelMap().addAttribute("mistake", ticketNum);
		}
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@RequestMapping(value = "/pay")
	public ModelAndView payTicket(@RequestParam(value = "ticketNum", required = false) int ticketNum,
			ModelAndView modelAndView) throws IOException {
		tickets = (new TicketServiceImpService()).getTicketServiceImpPort();
		try {
			Ticket ticket = tickets.payTicket(ticketNum);
			addAttributeToModel(modelAndView, ticket);
		} catch (NullPointerException ex) {
			modelAndView.getModelMap().addAttribute("mistake", ticketNum);
		}
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@RequestMapping(value = "/return")
	public ModelAndView returnTicket(@RequestParam(value = "ticketNum", required = false) int ticketNum,
			ModelAndView modelAndView) throws IOException {
		Boolean cancelTicket = tickets.returnTicket(ticketNum);
		modelAndView.getModelMap().addAttribute("cancelTicket", cancelTicket);
		modelAndView.getModelMap().addAttribute("ticketId", ticketNum);
		modelAndView.setViewName("index");
		return modelAndView;
	}

	private void addAttributeToModel(ModelAndView modelAndView, Ticket ticket) {
		modelAndView.getModelMap().addAttribute("ticketNum", ticket.getTicketNum());
		modelAndView.getModelMap().addAttribute("departDate", ticket.getDepartDate());
		modelAndView.getModelMap().addAttribute("departCity", ticket.getDepartCity());
		modelAndView.getModelMap().addAttribute("arrivalDate", ticket.getArrivalDate());
		modelAndView.getModelMap().addAttribute("arrivalCity", ticket.getArrivalCity());
		modelAndView.getModelMap().addAttribute("status", ticket.getTicketStatus().name());
		modelAndView.setViewName("index");
	}

}
