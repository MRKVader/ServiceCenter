package service_app.model;

import service_app.exception.RegisterDataException;

public class ReceptionUser {

    private int id;
    private String name;
    private String pass;

    public ReceptionUser() {
    }

    public ReceptionUser(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.pass = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws RegisterDataException {
        if (!name.matches("^[A-z]-\\s-[A-z]{3,16}$")) {
            throw new RegisterDataException("Incorrect name");
        } else {
            this.name = name;
        }
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) throws RegisterDataException {
        if (!pass.matches("^[a-z0-9]{8,18}$")) {
            throw new RegisterDataException("Incorrect password");
        } else {
            this.pass = pass;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReceptionUser receptionUser)) return false;

        return id == receptionUser.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%s. Name %s", id, name);
    }
}
