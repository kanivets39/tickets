package com.kanivets.tickets.validators;

import com.kanivets.tickets.models.Request;
import com.kanivets.tickets.models.RequestStatus;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
//
//@Service
//public class RequestValidator implements Validator {
//
//    @Override
//    public boolean supports(Class<?> aClass) {
//        return Request.class.equals(aClass);
//    }
//
//    @Override
//    public void validate(Object obj, Errors errors) {
//        Request p = (Request) obj;
//        if (p.getDepartTime() < 0) {
//            errors.rejectValue("departTime", "value.negative");
//        }
//        if (p.getArrivalTime() < 0) {
//            errors.rejectValue("arrivalTime", "value.negative");
//        }
//
//        if (p.getRequestStatus() != RequestStatus.PROSESSING|| p.getRequestStatus() != RequestStatus.DONE || p.getRequestStatus() != RequestStatus.ERROR){
//            errors.rejectValue("arrivalTime(", "value.uncorrect");
//        }
//    }
//
//
//
//}
