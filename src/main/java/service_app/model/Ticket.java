package service_app.model;

import java.util.Date;

public class Ticket {

    private int id;
    private TicketStatus ticketStatus;
    private String gadgetBrand;
    private String gadgetModel;
    private String serialNumber;

    private Date creationDate;
    private Date issueDate;

    private Client client;
/*    private Engineer engineer;*/

    private String lastChangesBy;

    private String priblemDiscription;
    private String notes;

    public Ticket() {
    }

    public Ticket(int id, TicketStatus ticketStatus, String gadgetBrand, String gadgetModel, String serialNumber, Date creationDate, Client client, String lastChangesBy, String priblemDiscription) {
        this.id = id;
        this.ticketStatus = ticketStatus;
        this.gadgetBrand = gadgetBrand;
        this.gadgetModel = gadgetModel;
        this.serialNumber = serialNumber;
        this.creationDate = creationDate;
        this.client = client;
        this.lastChangesBy = lastChangesBy;
        this.priblemDiscription = priblemDiscription;
    }

    public Ticket(int id, Date creationDate, Client client, String lastChangesBy) {
        this.id = id;
        this.creationDate = creationDate;
        this.client = client;
        this.lastChangesBy = lastChangesBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public String getGadgetBrand() {
        return gadgetBrand;
    }

    public void setGadgetBrand(String gadgetBrand) {
        this.gadgetBrand = gadgetBrand;
    }

    public String getGadgetModel() {
        return gadgetModel;
    }

    public void setGadgetModel(String gadgetModel) {
        this.gadgetModel = gadgetModel;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getLastChangesBy() {
        return lastChangesBy;
    }

    public void setLastChangesBy(String lastChangesBy) {
        this.lastChangesBy = lastChangesBy;
    }

    public String getPriblemDiscription() {
        return priblemDiscription;
    }

    public void setPriblemDiscription(String priblemDiscription) {
        this.priblemDiscription = priblemDiscription;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket ticket)) return false;

        return id == ticket.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", ticketStatus=" + ticketStatus +
                ", gadgetBrand='" + gadgetBrand + '\'' +
                ", gadgetModel='" + gadgetModel + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", creationDate=" + creationDate +
                ", issueDate=" + issueDate +
                ", client=" + client +
                ", lastChangesBy='" + lastChangesBy + '\'' +
                ", priblemDiscription='" + priblemDiscription + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
