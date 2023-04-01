package service_app.db;

import service_app.model.Client;
import service_app.model.ReceptionUser;
import service_app.model.Ticket;

import java.util.*;

public class ServiceDataBase {

    public int serviceUsersCont = 0;
    public int clientsCount = 0;
    public int ticketsCount = 0;

    private Map<Integer, ReceptionUser> receptionUserMap;
    private Map<Integer, Client> clientsMap;
    private Map<Integer, Ticket> ticketsMap;

    private List<Ticket> newTicketsList;

    public ServiceDataBase() {
        receptionUserMap = new TreeMap<>();
        clientsMap = new TreeMap<>();
        newTicketsList = new LinkedList<>();
    }

    public ReceptionUser addReceptionUser(ReceptionUser receptionUser){
        receptionUser.setId(serviceUsersCont);
        receptionUserMap.put(serviceUsersCont++, receptionUser);
        return receptionUser;
    }

    public Client addClient(Client client){
        client.setId(clientsCount);
        clientsMap.put(clientsCount++, client);
        return client;
    }

    public Ticket crateNewTicket(Ticket ticket){
        ticket.setId(ticketsCount);
        ticketsMap.put(ticketsCount++, ticket);
        newTicketsList.add(ticket);
        return ticket;
    }

}
