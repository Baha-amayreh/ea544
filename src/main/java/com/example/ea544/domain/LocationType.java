package com.example.ea544.domain;

public class LocationType {
    private long id;//Auto Generated
    private String name;//business rule ID, not null, length=255

    public LocationType() {
    }

    public LocationType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LocationType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
