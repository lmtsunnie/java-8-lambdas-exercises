package com.sunnie.java8.examples.common;

import lombok.Data;

import java.util.List;

@Data
public class Artist {
    private String name;
    private List<String> members;
    private String nationality;

    public Artist(String name, List<String> members, String nationality) {
        this.name = name;
        this.members = members;
        this.nationality = nationality;
    }

    public boolean isFrom(String origin) {
        if (origin.equals(this.nationality)) {
            return true;
        } else {
            return false;
        }
    }
}
