package com.example.ea544.domain;

import java.time.LocalDate;

public class Memberships {
    private long id;
    private LocalDate startDate;
    private LocalDate endDate;
    private byte type;// 1-> unlimited.  2->limited.

    private Plan plan;

    public Memberships() {
    }

    public Memberships(LocalDate startDate, LocalDate endDate, byte type, Plan plan) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;
        this.plan = plan;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "Memberships{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", type=" + type +
                ", plan=" + plan +
                '}';
    }
}
