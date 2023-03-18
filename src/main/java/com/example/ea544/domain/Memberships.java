package com.example.ea544.domain;

import java.time.LocalDate;

public class Memberships {
    private long id;
    private LocalDate startDate;
    private LocalDate endDate;
    private byte type;// 1-> unlimited.  2->limited.
    private Location location;
    private Member member;

    public Memberships() {
    }

    public Memberships(LocalDate startDate, LocalDate endDate, byte type
            , Location location, Member member) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;
        this.location = location;
        this.member = member;
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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "Memberships{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", type=" + type +
                ", location=" + location +
                ", member=" + member +
                '}';
    }
}
