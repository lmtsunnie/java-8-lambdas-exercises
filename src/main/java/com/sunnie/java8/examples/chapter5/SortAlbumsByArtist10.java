package com.sunnie.java8.examples.chapter5;

import com.sunnie.java8.examples.common.Album;
import com.sunnie.java8.examples.common.Artist;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class SortAlbumsByArtist10 {
    /**
     * 使用主唱对专辑分组
     *
     * @param albumStream
     * @return
     */
    public static Map<Artist, List<Album>> sortAlbumsByArtist(Stream<Album> albumStream) {
        return albumStream.collect(groupingBy(Album::getMainMusician));
    }
}
