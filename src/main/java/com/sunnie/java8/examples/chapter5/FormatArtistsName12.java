package com.sunnie.java8.examples.chapter5;

import com.sunnie.java8.examples.common.Artist;

import java.util.List;
import java.util.stream.Collectors;

public class FormatArtistsName12 {
    public static String formatArtistsName(List<Artist> artists) {
        return artists.stream()
                .map(Artist::getName)
                .collect(Collectors.joining("[",", ","]"));
    }
}
