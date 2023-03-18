package com.example.ea544.domain;

import java.time.LocalDate;
import java.util.List;
import java.util.Stack;

public  class Member {
    private long id;//Auto Generated
    private String firstName;//not null, length=255
    private String lastName;//not null, length=255
    private LocalDate DOB;//DOB:date of birth,not null
    private String email;//university email, not null, length=255
    private String phone; //not null, length=255
    private Address address;
    private List<Membership> memberships;

    //The last element in the stack will be active, while the other elements will be inactive.
    Stack<Badge> stackBadges = new Stack<Badge>();

    public Member() {
    }

    public Member(String memberId, String firstName,
                  String lastName, LocalDate DOB,
                  String email1, String phone, Address address,
                  List<Membership> memberships, Stack<Badge> stackBadges) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.email = email1;
        this.phone = phone;
        this.address = address;
        this.memberships = memberships;
        this.stackBadges = stackBadges;
    }
    public void AddNewBadge(Badge badge){
        this.stackBadges.peek().setActive(false);//deactivate the old one
        this.stackBadges.push(badge);//push the new active one
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

    public String getEmail1() {
        return email;
    }

    public void setEmail1(String email1) {
        this.email = email1;
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

    public List<Membership> getMemberships() {
        return memberships;
    }

    public void setMemberships(List<Membership> memberships) {
        this.memberships = memberships;
    }

    public Stack<Badge> getStackBadges() {
        return stackBadges;
    }

    public void setStackBadges(Stack<Badge> stackBadges) {
        this.stackBadges = stackBadges;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", DOB=" + DOB +
                ", email1='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address=" + address +
                ", memberships=" + memberships +
                ", stackBadges=" + stackBadges +
                '}';
    }
}
