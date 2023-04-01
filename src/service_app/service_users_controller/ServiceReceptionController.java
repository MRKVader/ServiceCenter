package service_app.service_users_controller;

import service_app.exception.AppException;
import service_app.exception.LoginDataException;
import service_app.model.Ticket;
import service_app.model.ReceptionUser;

import java.util.List;

public interface ServiceReceptionController {

    ReceptionUser loginServiceUser(String name, String pass) throws LoginDataException;

    Ticket createTicket(Ticket ticket, String nameServiceUser) throws AppException;

    Ticket findTicketById(Ticket id) throws AppException;

    Ticket findTicketByPhone(Ticket phone) throws AppException;

    Ticket showTicketInfo(Ticket id) throws AppException;

    Ticket changeTicketInfo(Ticket id, String nameServiceUser) throws AppException;

    Ticket changeTicketStatus(Ticket id, String nameServiceUser) throws AppException;

    List<Ticket> showAllTickets() throws AppException;

    List<Ticket> showTicketsByDate() throws AppException;

}
