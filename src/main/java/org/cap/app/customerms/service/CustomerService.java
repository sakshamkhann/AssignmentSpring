package org.cap.app.customerms.service;

import org.cap.app.customerms.entities.Customer;

public interface CustomerService {
    public Customer register(Customer customer);
    public Customer updateName(Long id, String name);
    public Customer findById(Long id);

}
