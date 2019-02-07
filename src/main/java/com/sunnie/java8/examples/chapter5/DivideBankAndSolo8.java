package com.sunnie.java8.examples.chapter5;

import com.sunnie.java8.examples.common.Artist;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.partitioningBy;

public class DivideBankAndSolo8 {
    /**
     * 将艺术家组成的流分成乐队和独唱歌手两部分
     *
     * @param artists
     * @return
     */
    public static Map<Boolean, List<Artist>> bandsAndSolo(Stream<Artist> artists) {
        return artists.collect(partitioningBy(Artist::isSolo));
    }
}
