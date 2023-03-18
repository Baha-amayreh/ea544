package com.example.ea544.domain;

import java.util.List;

public class Plan {
    private long id;
    private String name;
    private String description;
    private List<String> roles;
    private List<Memberships>memberships;
    public Plan(){

    }

    public Plan(String name, String description, List<String> roles,
                List<Memberships> memberships) {
        this.name = name;
        this.description = description;
        this.roles = roles;
        this.memberships = memberships;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public List<Memberships> getMemberships() {
        return memberships;
    }

    public void setMemberships(List<Memberships> memberships) {
        this.memberships = memberships;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", roles=" + roles +
                ", memberships=" + memberships +
                '}';
    }
}
