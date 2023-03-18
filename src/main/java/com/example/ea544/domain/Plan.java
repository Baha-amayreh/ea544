package com.example.ea544.domain;

import java.util.List;

public class Plan {
    private long id;//Auto Generated
    private String name;//not null, length=255
    private String description;//could be null,  length=4000
    private byte type;// 1-> unlimited.  2->limited.
    private List<Rule> roles;//list of allowed roles
    public Plan(){

    }

}
