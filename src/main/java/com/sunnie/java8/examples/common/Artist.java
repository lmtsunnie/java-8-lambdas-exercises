package com.sunnie.java8.examples.common;

import lombok.Data;

@Data
public class Artist {
    private String name;
    private String members;
    private String origin;

    public Artist(String name, String members, String origin) {
        this.name = name;
        this.members = members;
        this.origin = origin;
    }

    public boolean isFrom(String origin) {
        if (origin.equals(this.origin)) {
            return true;
        } else {
            return false;
        }
    }
}
