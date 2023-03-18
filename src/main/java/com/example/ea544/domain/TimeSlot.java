package com.example.ea544.domain;

import java.time.LocalDate;
import java.time.LocalTime;

public class TimeSlot {
    private long id;
    private LocalDate localDate;
    private LocalTime start;
    private LocalTime end;

    public TimeSlot() {
    }

    public TimeSlot(LocalDate localDate, LocalTime start, LocalTime end) {
        this.localDate = localDate;
        this.start = start;
        this.end = end;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
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
                ", localDate=" + localDate +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
