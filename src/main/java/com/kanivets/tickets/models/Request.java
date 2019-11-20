package com.kanivets.tickets.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "requests")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @NotNull
    @Positive
    private Long departTime;


    @NotNull
    @Positive
    private Long arrivalTime;

    @NotNull
    @Enumerated(EnumType.STRING)
    private RequestStatus requestStatus;

}
