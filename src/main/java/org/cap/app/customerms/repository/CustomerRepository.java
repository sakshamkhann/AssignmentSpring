package org.cap.app.customerms.repository;

import org.cap.app.customerms.entities.Customer;

public interface CustomerRepository {
    public Customer add(Customer customer);
    public Customer update(Customer customer);
    public Customer findById(Long id);
 }
