package com.sunnie.java8.examples.common;

import com.google.common.collect.Lists;

import java.util.List;

public class GenerateArtists {
    public static List<Artist> generateArtists() {
        Artist artist1 = new Artist("tingting", "", "London");
        Artist artist2 = new Artist("qiqi", "", "London");
        Artist artist3 = new Artist("kangkang", "", "NY");
        return Lists.newArrayList(artist1, artist2, artist3);
    }
}
