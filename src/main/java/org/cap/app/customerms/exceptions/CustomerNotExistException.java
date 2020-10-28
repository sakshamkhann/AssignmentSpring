package org.cap.app.customerms.exceptions;

public class CustomerNotExistException extends RuntimeException{

    public CustomerNotExistException(String message) {
        super(message);
    }
}
