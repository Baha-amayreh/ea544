package com.example.ea544.domain;

import java.util.List;

public class Location {
    private long id;//Auto Generated
    private String name;//not null, length=255
    private String description;
    private short capacity;//the max value is 32767, should not less than zero, default value=30
    private LocationType type;
    private Address address;
    private List<TimeSlot> slots;

    public Location() {
    }

    public Location(String name, String description, short capacity,
                    LocationType type, Address address, List<TimeSlot> slots) {
        this.name = name;
        this.description = description;
        this.capacity = capacity;
        this.type = type;
        this.address = address;
        this.slots = slots;
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

    public short getCapacity() {
        return capacity;
    }

    public void setCapacity(short capacity) {
        this.capacity = capacity;
    }

    public LocationType getType() {
        return type;
    }

    public void setType(LocationType type) {
        this.type = type;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<TimeSlot> getSlots() {
        return slots;
    }

    public void setSlots(List<TimeSlot> slots) {
        this.slots = slots;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", capacity=" + capacity +
                ", type=" + type +
                ", address=" + address +
                ", slots=" + slots +
                '}';
    }
}
