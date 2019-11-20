package com.kanivets.tickets.services;

import com.kanivets.tickets.controllers.PaymentWebController;
import com.kanivets.tickets.models.Request;
import com.kanivets.tickets.models.RequestStatus;
import com.kanivets.tickets.repo.RequestRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class ScheduledTasks {

    @Autowired
    private RequestRepository requestRepository;



    @Scheduled(fixedRate = 60000)
    public void updateStatus() {

        try {

            Request request = requestRepository.findFirstByRequestStatusEquals(RequestStatus.ERROR);

            PaymentWebController paymentWebController = new PaymentWebController();
            request.setRequestStatus(paymentWebController.randomRequestStatus());
            requestRepository.save(request);
            log.info(request.toString());
            log.info("Status was updated");

        }catch (NullPointerException e){
            log.info("There is no PROSESSING requests");
        }


    }

}
