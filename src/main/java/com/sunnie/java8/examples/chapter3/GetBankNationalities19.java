package com.sunnie.java8.examples.chapter3;

import com.sunnie.java8.examples.common.Album;
import com.sunnie.java8.examples.common.Artist;

import java.util.Set;
import java.util.stream.Collectors;


public class GetBankNationalities19 {
    public static Set<String> getBankNationalities19(Album album) {
        return album.getMusicianStream()
                .filter(artist -> artist.getName().startsWith("The"))
                .map(Artist::getNationality)
                .collect(Collectors.toSet());
    }
}
