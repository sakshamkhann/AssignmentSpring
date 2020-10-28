package org.cap.app.customerms.util;

import org.cap.app.customerms.entities.Customer;
import org.cap.app.customerms.exceptions.CustomerIdException;
import org.cap.app.customerms.exceptions.CustomerNameException;
import org.cap.app.customerms.exceptions.CustomerNotExistException;

public class ValidateCustomer {
    public static void  checkName(String name){
        if( name==null || name.isEmpty())
        {
            throw new CustomerNameException("name is not valid");
        }
    }

    public static void  checkId(Long Id){
        if(Id==null)
        {
            throw new CustomerIdException("Id is not valid");
        }
    }

    public static void  checkCustomerExist(Customer customer){
        if(customer==null)
        {
            throw new CustomerNotExistException("customer is not existing");
        }
    }
}
