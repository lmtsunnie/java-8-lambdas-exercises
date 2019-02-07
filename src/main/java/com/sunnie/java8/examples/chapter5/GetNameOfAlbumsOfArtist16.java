package com.sunnie.java8.examples.chapter5;

import com.sunnie.java8.examples.common.Album;
import com.sunnie.java8.examples.common.Artist;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class GetNameOfAlbumsOfArtist16 {
    /**
     * 求每个艺术家的专辑名
     *
     * @param albumStream
     * @return
     */
    public static Map<Artist, List<String>> nameOfAlbums(Stream<Album> albumStream) {
        return albumStream.collect(groupingBy(Album::getMainMusician,
                mapping(Album::getName, toList())));
    }
}
