package com.kanivets.tickets.controllers;

import com.kanivets.tickets.exeptions.NoEntityException;
import com.kanivets.tickets.models.Request;
import com.kanivets.tickets.models.RequestStatus;
import com.kanivets.tickets.repo.RequestRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
public class PaymentWebController {


    @Autowired
    private RequestRepository requestRepository;

    @PostMapping("/requests")
    public Long createOrSaveRequest( @RequestBody Request newRequest) {

        requestRepository.save(newRequest);
        log.info("Request was saved");
        return newRequest.getId();
    }

    @GetMapping("/requests/{id}")
    public String getRequestById(@PathVariable Long id) throws NoEntityException {


        return requestRepository.findById(id).map(request -> request.getRequestStatus().getAsString()).orElseThrow(() -> new NoEntityException(id));


    }

    @GetMapping("/randomrequest")
    public RequestStatus randomRequestStatus()  {

        return RequestStatus.getRandomStatus();

    }


}
