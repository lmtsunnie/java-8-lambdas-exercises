package com.sunnie.java8.examples.chapter3;

import com.sunnie.java8.examples.common.Track;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static com.sunnie.java8.examples.common.AssertEquals.assertEquals;

public class FindShortestTrack13 {
    public static Track findShortestTrack13() {
        List<Track> tracks = Arrays.asList(new Track("Bakai", 524),
                new Track("Violets for Your Furs", 378),
                new Track("Time Was", 451));
        return tracks.stream()
                .min(Comparator.comparing(Track::getLength))
                .get();
    }

    public static void main(String[] args) {
        Track shortestTrack = findShortestTrack13();
        System.out.println(shortestTrack.toString());
        System.out.println(assertEquals(new Track("Violets for Your Furs", 378), shortestTrack));
    }
}
