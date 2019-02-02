package com.sunnie.java8.examples.common;

import com.github.javafaker.Faker;
import com.google.common.collect.Lists;

import java.util.List;

public class GenerateData {
    static Faker faker = new Faker();

    public static List<Artist> generateArtists() {
        Artist artist1 = new Artist(faker.name().fullName(), Lists.newArrayList(), faker.address().country());
        Artist artist2 = new Artist(faker.name().fullName(), Lists.newArrayList(), faker.address().country());
        Artist artist3 = new Artist(faker.name().fullName(), Lists.newArrayList(), faker.address().country());
        Artist artist4 = new Artist("The bank", Lists.newArrayList("mem1","mem2","mem3"), faker.address().country());
        Artist artist5 = new Artist("The bank2", Lists.newArrayList("Mem1","Mem2","Mem3"), faker.address().country());
        Artist artist6 = new Artist(faker.name().fullName(), Lists.newArrayList(), "London");
        Artist artist7 = new Artist(faker.name().fullName(), Lists.newArrayList(), "London");
        return Lists.newArrayList(artist1, artist2, artist3, artist4, artist5, artist6, artist7);
    }

    public static List<Track> generateTracks() {
        return Lists.newArrayList(new Track("Bakai", 524),
                new Track("Violets for Your Furs", 378),
                new Track("Time Was", 451));
    }

    public static Album generateAlbum() {
        List<Artist> musicians = generateArtists();
        List<Track> tracks = generateTracks();
        return new Album("《first love》", tracks, musicians);
    }
}
