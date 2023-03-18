package com.example.ea544.domain;

import java.time.LocalDate;
import java.util.List;
public abstract class Member {
    private long id;
    private String firstName;
    private String lastName;
    private LocalDate DOB;//DOB:date of birth
    private String email;
    private String phone;
    private Address address;
    private List<Memberships> memberships;
    private List<Badge>badges;

    public Member() {
    }

    public long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Memberships> getMemberships() {
        return memberships;
    }

    public void setMemberships(List<Memberships> memberships) {
        this.memberships = memberships;
    }

    public List<Badge> getBadges() {
        return badges;
    }

    public void setBadges(List<Badge> badges) {
        this.badges = badges;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + DOB +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address=" + address +
                ", memberships=" + memberships +
                ", badges=" + badges +
                '}';
    }
}
