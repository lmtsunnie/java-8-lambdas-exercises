package com.sunnie.java8.examples.chapter3;

import com.sunnie.java8.examples.common.Artist;
import java.util.List;

import static com.sunnie.java8.examples.common.GenerateArtists.generateArtists;

public class GetArtistCountFromLondon1 {
    public static void getArtistCountFromLondon2() {
        List<Artist> allArtists = generateArtists();
        long count = allArtists.stream().filter(artist -> {
            System.out.println(artist.getName());
            return artist.isFrom("London");
        }).count();
        System.out.println(count);
    }

    public static void getArtistFromLondon5() {
        List<Artist> allArtists = generateArtists();
        allArtists.stream().filter(artist -> {
            System.out.println(artist.getName());
            return artist.isFrom("London");
        });
    }


    public static void main(String[] args) {
        getArtistCountFromLondon2();
        System.out.println("====");
        getArtistFromLondon5();
    }
}