package com.sunnie.java8.answers.chapter3;

import com.sunnie.java8.examples.common.Artist;

import java.util.List;
import java.util.stream.Stream;

public class Question2 {
    public static int countArtistsMembersExternal(List<Artist> artists) {
        int totalMembers = 0;
        for (Artist artist : artists) {
            Stream<Artist> members = artist.getMemberStream();
            totalMembers += members.count();
        }
        return totalMembers;
    }

    public static int countArtistsMembersInternal(List<Artist> artists) {
     /*   return artists.stream()
                .map(artist -> artist.getMemberStream().count())
                .reduce(0L, (acc, number) -> acc + number)
                .intValue();*/
       /* return artists.stream()
                .map(artist -> artist.getMemberStream().count())
                .reduce(0L, Long::sum)
                .intValue();*/
        return (int) artists.stream().flatMap(Artist::getMemberStream).count();
    }
}