package com.sunnie.java8.examples.chapter5;

import com.sunnie.java8.examples.common.Album;

import java.util.List;

import static java.util.stream.Collectors.averagingInt;

public class GetAverageNumberOfTracks7 {
    /**
     * 找出一组专辑上曲目的平均数
     *
     * @param albums
     * @return
     */
    public static double averageNumberOfTracks7(List<Album> albums) {
        return albums.stream()
                .collect(averagingInt(album -> album.getTrackList().size()));
    }
}
