package com.kanivets.tickets.models;

import java.util.Random;

public enum RequestStatus {

    private final String enumString;
    
    PROSESSING("PROSESSING"),
    DONE("DONE"),
    ERROR("ERROR");

    

    RequestStatus(String enumString) {
        this.enumString = enumString;
    }

    public String getAsString() {
        return enumString;
    }

    private static final RequestStatus[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static RequestStatus getRandomStatus()  {
        return VALUES[RANDOM.nextInt(SIZE)];
    }
}
