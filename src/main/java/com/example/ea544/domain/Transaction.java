package com.example.ea544.domain;

import java.time.LocalDateTime;

public class Transaction {
    private long id;//Auto Generated
    private LocalDateTime entryDate;//not null
    private String description;//description of the transaction
    private Member member;
    private Membership membership;
    private Location location;

    public Transaction() {
    }


}
