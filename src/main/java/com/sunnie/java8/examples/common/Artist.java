package com.sunnie.java8.examples.common;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

@Data
public class Artist {
    private String name;
    private List<Artist> members;
    private String nationality;

    public Artist(String name, String nationality) {
        this(name, Collections.emptyList(), nationality);
    }

    public Artist(String name, List<Artist> members, String nationality) {
        Objects.requireNonNull(name);
        Objects.requireNonNull(members);
        Objects.requireNonNull(nationality);
        this.name = name;
        this.members = new ArrayList<>(members);
        this.nationality = nationality;
    }

    public Stream<Artist> getMemberStream() {
        return members.stream();
    }


    public boolean isSolo() {
        return members.isEmpty();
    }

    public boolean isFrom(String nationality) {
        return this.nationality.equals(nationality);
    }

    /*@Override
    public String toString() {
        return getName();
    }*/

    public Artist copy() {
        List<Artist> members = getMemberStream().map(Artist::copy).collect(toList());
        return new Artist(name, members, nationality);
    }
}
