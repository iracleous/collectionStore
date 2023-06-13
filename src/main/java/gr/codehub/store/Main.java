package gr.codehub.store;

import gr.codehub.store.service.HrService;
import gr.codehub.store.service.impl.HrServiceImpl;

public class Main {
    public static void main(String[] args) {
        HrService service = new HrServiceImpl();

        service.insertData();
        service.printData();
        service.deleteData();
        service.printData();




    }
}