package com.sunnie.java8.examples.chapter3;

import com.google.common.collect.Lists;
import com.sunnie.java8.examples.common.Artist;
import java.util.List;

import static com.sunnie.java8.examples.common.SampleData.membersOfTheBeatles;


public class GetArtistCountFromLondon3 {
    public static void getArtistCountFromLondon3() {
        List<Artist> allArtists = membersOfTheBeatles;
        long count = allArtists.stream().filter(artist -> {
            System.out.println(artist.getName());
            return artist.isFrom("London");
        }).count();
        System.out.println(count);
    }

    public static void getArtistFromLondon5() {
        List<Artist> allArtists = membersOfTheBeatles;
        allArtists.stream().filter(artist -> {
            System.out.println(artist.getName());
            return artist.isFrom("London");
        });
    }
}
