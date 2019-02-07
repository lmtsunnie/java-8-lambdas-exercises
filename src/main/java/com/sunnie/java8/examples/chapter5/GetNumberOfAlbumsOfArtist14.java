package com.sunnie.java8.examples.chapter5;

import com.sunnie.java8.examples.common.Album;
import com.sunnie.java8.examples.common.Artist;

import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class GetNumberOfAlbumsOfArtist14 {
    /**
     * 计算每个艺术家的专辑数
     *
     * @param albums
     * @return
     */
    public static Map<Artist, Long> numberOfAlbums(Stream<Album> albums) {
        return albums.collect(groupingBy(Album::getMainMusician, counting()));
    }
}
