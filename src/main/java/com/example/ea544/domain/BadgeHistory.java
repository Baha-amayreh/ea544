package com.example.ea544.domain;

import java.time.LocalDate;

public class BadgeHistory {
    private long id;
    private LocalDate issueDate;
    private Badge badge;

    public BadgeHistory() {
    }

    public BadgeHistory(LocalDate issueDate, Badge badge) {
        this.issueDate = issueDate;
        this.badge = badge;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public Badge getBadge() {
        return badge;
    }

    public void setBadge(Badge badge) {
        this.badge = badge;
    }

    @Override
    public String toString() {
        return "BadgeHistory{" +
                "id=" + id +
                ", issueDate=" + issueDate +
                ", badge=" + badge +
                '}';
    }
}
