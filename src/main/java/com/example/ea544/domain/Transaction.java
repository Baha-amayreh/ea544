package com.example.ea544.domain;

import java.time.LocalDateTime;

public class Transaction {
    private long id;//Auto Generated
    private LocalDateTime localDateTime;//not null
    private String operation;//description of the transaction

    public Transaction() {
    }

    public Transaction(LocalDateTime localDateTime, String operation) {
        this.localDateTime = localDateTime;
        this.operation = operation;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", localDateTime=" + localDateTime +
                ", operation='" + operation + '\'' +
                '}';
    }
}
