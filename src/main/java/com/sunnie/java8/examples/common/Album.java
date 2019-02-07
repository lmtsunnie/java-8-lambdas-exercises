package com.sunnie.java8.examples.common;

import lombok.Data;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

@Data
public class Album {
    private String name;
    private List<Track> trackList;
    private List<Artist> musicianList;

    public Album(String name, List<Track> trackList, List<Artist> musicianList) {
        this.name = name;
        this.trackList = trackList;
        this.musicianList = musicianList;
    }

    public Stream<Track> getTrackStream() {
        return trackList.stream();
    }

    public Stream<Artist> getMusicianStream() {
        return musicianList.stream();
    }

    public Artist getMainMusician() {
        return musicianList.get(0);
    }

    public Album copy() {
        List<Track> tracks = getTrackStream().map(Track::copy).collect(toList());
        List<Artist> musicians = getMusicianStream().map(Artist::copy).collect(toList());
        return new Album(name, tracks, musicians);
    }
}
