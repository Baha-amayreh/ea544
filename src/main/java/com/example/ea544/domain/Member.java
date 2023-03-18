package com.example.ea544.domain;

import java.time.LocalDate;
import java.util.List;
import java.util.Stack;

public abstract class Member {
    private long id;//Auto Generated
    private String memberId;//business rule ID, not null, length=255
    private String firstName;//not null, length=255
    private String lastName;//not null, length=255
    private LocalDate DOB;//DOB:date of birth,not null
    private String email1;//university email, not null, length=255
    private String email2;//other email,could be null, gmail,msn,hotmail,yahoo,...
    private String phone; //not null, length=255
    private Address address;
    private List<Memberships> memberships;

    //The last element in the stack will be active, while the other elements will be inactive.
    Stack<Badge> stackBadges = new Stack<Badge>();

    public Member() {
    }

    public Member(String memberId, String firstName,
                  String lastName, LocalDate DOB,
                  String email1, String email2,
                  String phone, Address address,
                  List<Memberships> memberships, Stack<Badge> stackBadges) {
        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.email1 = email1;
        this.email2 = email2;
        this.phone = phone;
        this.address = address;
        this.memberships = memberships;
        this.stackBadges = stackBadges;
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
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
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

    public Stack<Badge> getStackBadges() {
        return stackBadges;
    }

    public void setStackBadges(Stack<Badge> stackBadges) {
        this.stackBadges = stackBadges;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", memberId='" + memberId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", DOB=" + DOB +
                ", email1='" + email1 + '\'' +
                ", email2='" + email2 + '\'' +
                ", phone='" + phone + '\'' +
                ", address=" + address +
                ", memberships=" + memberships +
                ", stackBadges=" + stackBadges +
                '}';
    }
}
