package service_app.service_users_controller;

import service_app.db.ServiceDataBase;
import service_app.exception.AppException;
import service_app.exception.LoginDataException;
import service_app.model.ReceptionUser;
import service_app.model.Ticket;

import java.util.List;

public class ServiceReceptionControllerImpl implements ServiceReceptionController{

    private ServiceDataBase serviceDataBase;

    public ServiceReceptionControllerImpl() {
    }

    public ServiceReceptionControllerImpl(ServiceDataBase serviceDataBase) {
        this.serviceDataBase = serviceDataBase;
    }

    @Override
    public ReceptionUser loginServiceUser(String name, String pass) throws LoginDataException {
        return null;
    }

    @Override
    public Ticket createTicket(Ticket ticket, String nameServiceUser) throws AppException {
        return null;
    }

    @Override
    public Ticket findTicketById(Ticket id) throws AppException {
        return null;
    }

    @Override
    public Ticket findTicketByPhone(Ticket phone) throws AppException {
        return null;
    }

    @Override
    public Ticket showTicketInfo(Ticket id) throws AppException {
        return null;
    }

    @Override
    public Ticket changeTicketInfo(Ticket id, String nameServiceUser) throws AppException {
        return null;
    }

    @Override
    public Ticket changeTicketStatus(Ticket id, String nameServiceUser) throws AppException {
        return null;
    }

    @Override
    public List<Ticket> showAllTickets() throws AppException {
        return null;
    }

    @Override
    public List<Ticket> showTicketsByDate() throws AppException {
        return null;
    }
}
