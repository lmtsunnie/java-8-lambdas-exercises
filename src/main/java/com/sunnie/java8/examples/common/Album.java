package com.sunnie.java8.examples.common;

import lombok.Data;

import java.util.List;
import java.util.stream.Stream;

@Data
public class Album {
    private String name;
    private Stream<Track> tracks;
    private Stream<Artist> musicians;

    public Album(String name, List<Track> tracks, List<Artist> musicians) {
        this.name = name;
        this.tracks = tracks.stream();
        this.musicians = musicians.stream();
    }
}
