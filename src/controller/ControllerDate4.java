package controller;

import model.Customer;
import service.CustomerService;
import service.impl.CustomerServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ControllerDate4 {
    static List<Customer> customers=new ArrayList<>();
    static {
        customers.add(new Customer(1,"Toan",20,"Quang Nam"));
        customers.add(new Customer(2,"Lâm",20,"Quang Nam"));
        customers.add(new Customer(3,"Văn Phúc",20,"Quang Nam"));
        customers.add(new Customer(4,"Hông phúc",20,"Quang Nam"));
        customers.add(new Customer(5,"Nam",20,"Quang Nam"));
        customers.add(new Customer(6,"Tâm",20,"Quang Nam"));
        customers.add(new Customer(7,"Quảng",20,"Quang Nam"));
        customers.add(new Customer(8,"Quốc",20,"Quang Nam"));
        customers.add(new Customer(9,"Dương",20,"Quang Nam"));
        customers.add(new Customer(10,"Chục",20,"Quang Nam"));

    }

    public static void main(String[] args) {
        CustomerService customerService=new CustomerServiceImpl();
        customerService.displayCustomer(customers);
    }
}
