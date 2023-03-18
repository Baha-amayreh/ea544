package com.example.ea544.domain;

import java.util.List;

public class Role {
    private long id;//Auto Generated
    private String name;//not null, length=255
    //example of permission is Faculty and staff may have only 20, 30 or 50 meals/month.
    private List<String> permissions;
    public Role() {
    }

    public Role(String name, List<String> permissions) {
        this.name = name;
        this.permissions = permissions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "Rule{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", permissions=" + permissions +
                '}';
    }
}
