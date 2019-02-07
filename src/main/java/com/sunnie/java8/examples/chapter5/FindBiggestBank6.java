package com.sunnie.java8.examples.chapter5;


import com.sunnie.java8.examples.common.Artist;

import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class FindBiggestBank6 {
    /**
     * 找出成员最多的乐队
     *
     * @param artistStream
     * @return
     */
    public static Optional<Artist> findBiggestBank6(Stream<Artist> artistStream) {
        return artistStream.max(comparing(artist -> artist.getMembers().size()));
        // return artistStream.collect(maxBy(comparing(artist -> artist.getMembers().size())));
    }
}
