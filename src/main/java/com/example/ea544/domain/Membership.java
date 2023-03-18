package com.example.ea544.domain;

import java.time.LocalDate;

public class Membership {
    private long id;//Auto Generated
    private LocalDate startDate;//not null
    private LocalDate endDate;//not null
    private Plan plan;//memberships has one plan,

    public Membership() {
    }

    public Membership(LocalDate startDate, LocalDate endDate, Plan plan) {
        this.startDate = startDate;
        this.endDate = endDate;
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
                ", plan=" + plan +
                '}';
    }
}
