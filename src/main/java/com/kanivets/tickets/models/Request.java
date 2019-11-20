package com.kanivets.tickets.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
    @Min(1)
    private Long departTime;


    @NotNull
    @Min(1)
    private Long arrivalTime;

    @org.springframework.lang.NonNull
    @Enumerated(EnumType.STRING)
    private RequestStatus requestStatus;

}
