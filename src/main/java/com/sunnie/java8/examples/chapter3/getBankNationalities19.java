package com.sunnie.java8.examples.chapter3;

import com.sunnie.java8.examples.common.Album;
import com.sunnie.java8.examples.common.Artist;

import java.util.Set;
import java.util.stream.Collectors;

import static com.sunnie.java8.examples.common.GenerateData.generateAlbum;
import static com.sunnie.java8.examples.common.Print.printSet;

public class getBankNationalities19 {
    public static Set<String> getBankNationalities19(Album album) {
        return album.getMusicians().stream()
                .filter(artist -> artist.getName().startsWith("The"))
                .map(Artist::getNationality)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        Album album = generateAlbum();
        System.out.println(album);
        Set<String> set = getBankNationalities19(album);
        printSet(set);
    }
}
