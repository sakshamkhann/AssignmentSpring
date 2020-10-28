package org.cap.app.customerms.ui;

import org.cap.app.customerms.entities.Customer;
import org.cap.app.customerms.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProjectUI {

    @Autowired
    CustomerService service;

    public void runui(){
        Customer customer1 = register("Saksham");
        Customer customer2 = register("suraj");
        Customer updateNonExistCustomer = updateName((long)600,"sunny");
        System.out.println(customer1);
        System.out.println(customer2);

        System.out.println("---Updated customer 2---");
        Customer customerupdated2 = updateName(customer2.getId(), "sunil");
        System.out.println(customerupdated2);
        System.out.println("---Updated Non Existing Customer---");
        System.out.println(updateNonExistCustomer);
        Customer customer3 = register("");
        Customer nullCustomer1 = register("");
        String name=null;
        Customer nullCustomer2 = register(name);


    }
    public Customer register(String name){
        Customer customer =  new Customer(name);
        customer = service.register(customer);
        return customer;
    }
    public Customer updateName(Long id, String changeName){
        Customer customer = service.updateName(id, changeName);
        return customer;
    }

}

