package com.kanivets.tickets.repo;

import com.kanivets.tickets.models.RequestStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kanivets.tickets.models.Request;

import java.util.List;


@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {

    Request findFirstByRequestStatusEquals(RequestStatus requestStatus);

}
