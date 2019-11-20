package com.kanivets.tickets.controllers;

import com.kanivets.tickets.exeptions.NoEntityException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PaymentWebControllerAdvice {



    @ResponseBody
    @ExceptionHandler(NoEntityException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String noTicketsExceptionHandler(NoEntityException e) { return e.getMessage(); }

}
