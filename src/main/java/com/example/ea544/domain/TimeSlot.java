package com.example.ea544.domain;

import java.time.LocalDate;
import java.time.LocalTime;

public class TimeSlot {
    private long id;
    private Days days;
    private LocalTime start;
    private LocalTime end;

    public TimeSlot() {
    }

    public TimeSlot(Days days, LocalTime start, LocalTime end) {
        this.days = days;
        this.start = start;
        this.end = end;
    }

    public Days getDays() {
        return days;
    }

    public void setDays(Days days) {
        this.days = days;
    }

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "TimeSlot{" +
                "id=" + id +
                ", days=" + days +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
