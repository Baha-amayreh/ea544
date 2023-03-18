package com.example.ea544.domain;

import java.time.LocalDate;


public class Badge {
    private long id;//PK
    private String badgeID;//it is also like Barcode, it should be not null and unique!
    private boolean isActive;//ture or false!
    private LocalDate issueDate;//not null
    private String description;//could be null
    private String imagePath;//there is a default image path

    public Badge() {
    }

    public Badge(String badgeID, boolean isActive, LocalDate issueDate, String description, String imagePath) {
        this.badgeID = badgeID;
        this.isActive = isActive;
        this.issueDate = issueDate;
        this.description = description;
        this.imagePath = imagePath;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String toString() {
        return "Badge{" +
                "badgeID='" + badgeID + '\'' +
                ", isActive=" + isActive +
                ", issueDate=" + issueDate +
                ", description='" + description + '\'' +
                '}';
    }
}
