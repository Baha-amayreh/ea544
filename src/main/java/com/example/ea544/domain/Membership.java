package com.example.ea544.domain;

import java.time.LocalDate;

public class Membership {
    private long id;//Auto Generated
    private LocalDate startDate;//not null
    private LocalDate endDate;//not null
    private Plan plan;//memberships has one plan
    private MemberShipType type;// 1-> unlimited.  2->limited 3->Checker.

    public Membership() {
    }

    public Membership(LocalDate startDate, LocalDate endDate, Plan plan, MemberShipType type) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.plan = plan;
        this.type = type;
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

    public MemberShipType getType() {
        return type;
    }

    public void setType(MemberShipType type) {
        this.type = type;
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
