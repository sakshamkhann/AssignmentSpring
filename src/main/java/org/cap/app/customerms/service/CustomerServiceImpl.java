package org.cap.app.customerms.service;

import org.cap.app.customerms.entities.Customer;
import org.cap.app.customerms.exceptions.CustomerNotExistException;
import org.cap.app.customerms.repository.CustomerRepository;
import org.cap.app.customerms.util.ValidateCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repo;

    public Customer register(Customer customer) {
        ValidateCustomer.checkName(customer.getName());
        repo.add(customer);
        return customer;
    }

    public Customer updateName(Long id, String name)  {
        ValidateCustomer.checkName(name);
        ValidateCustomer.checkId(id);
        Customer customer = findById(id);
        ValidateCustomer.checkCustomerExist(customer);
        customer.setName(name);
        customer.setId(id);
        repo.update(customer);
        return customer;
    }

    public Customer findById(Long id) {
        Customer customer = repo.findById(id);
        return customer;
    }
    /*public Customer checkExists(Customer customer){
        try{
        ValidateCustomer.checkCustomerExist(customer);
        }
        catch (CustomerNotExistException e){
            Customer newCustomer = new Customer();
            return newCustomer;
        }
        return customer;
    }*/
}
