package org.cap.app.customerms.repository;

import org.cap.app.customerms.entities.Customer;
import org.cap.app.customerms.exceptions.CustomerIdException;
import org.cap.app.customerms.util.ValidateCustomer;
import org.springframework.stereotype.Repository;

import javax.jnlp.IntegrationService;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {



    private Map<Long, Customer > map = new HashMap<Long, Customer>();

    private Long generatedId = Long.valueOf(0);

    Long generateId(){
        generatedId = generatedId + 1 ;
        return generatedId;
    }

    public Customer add(Customer customer) {
        long id = generateId();
        customer.setId(id);
        map.put(id, customer);
        return customer;
    }

    public Customer update(Customer customer) {

        map.put(customer.getId(), customer);
        return customer;
    }

    public Customer findById(Long id) {
        Customer customer = map.get(id);
        return customer;
    }


}
