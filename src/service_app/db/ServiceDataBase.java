package service_app.db;

import service_app.model.ReceptionUser;
import service_app.model.Ticket;

import java.util.Map;

public class ServiceDataBase {

    public int ServiceUsersCont = 0;
    public int Clients = 0;
    public int Tickets = 0;

    private Map<Integer, ReceptionUser> receptionUserMap;
    private Map<Integer, Ticket> ticketsMap;

}
