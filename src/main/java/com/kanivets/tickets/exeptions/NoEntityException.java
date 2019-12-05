package com.kanivets.tickets.exeptions;

public class NoEntityException extends Exception{
    public NoEntityException(Long id) {
        super("No request with this id - " + id );
    }

    public NoEntityException(String message) {
        super(message);
    }
}
