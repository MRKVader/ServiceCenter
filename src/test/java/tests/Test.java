package service_app.tests;

import service_app.db.ServiceDataBase;
import service_app.exception.AppException;
import service_app.exception.RegisterDataException;
import service_app.model.ReceptionUser;
import service_app.service_users_controller.ServiceReceptionControllerImpl;

public class Test {
    public static void main(String[] args) throws AppException, RegisterDataException {

        ServiceReceptionControllerImpl service = new ServiceReceptionControllerImpl(new ServiceDataBase());

        service.registerReceptionUser("Igor Soda ", "1qwe1!234");


    }
}