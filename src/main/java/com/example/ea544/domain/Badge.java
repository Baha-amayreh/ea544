package com.example.ea544.domain;

import java.time.LocalDate;
import java.util.List;

public class Badge {
    private long id;
    private String badgeID;
    private boolean isActive;
    private LocalDate issueDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private Member member;

    public Badge() {
    }

    public Badge(String badgeID, boolean isActive, LocalDate issueDate,
                 LocalDate startDate, LocalDate endDate, Member member) {
        this.badgeID = badgeID;
        this.isActive = isActive;
        this.issueDate = issueDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.member = member;
    }

    public String getBadgeID() {
        return badgeID;
    }

    public void setBadgeID(String badgeID) {
        this.badgeID = badgeID;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
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

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "Badge{" +
                "id=" + id +
                ", badgeID='" + badgeID + '\'' +
                ", isActive=" + isActive +
                ", issueDate=" + issueDate +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", member=" + member +
                '}';
    }
}
