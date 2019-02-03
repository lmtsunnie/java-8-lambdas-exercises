package com.sunnie.java8.answers.chapter3;


import com.sunnie.java8.examples.common.Album;
import com.sunnie.java8.examples.common.Artist;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question1 {
    /**
     * a. 编写一个求和函数，计算流中所有数之和。例如，int addUp(Stream<Integer> numbers);
     */
    public static int addUp(Stream<Integer> numbers) {
        return numbers.reduce(0, (acc, number) -> acc + number);
    }

    /**
     * b. 编写一个函数，接受艺术家列表作为参数，返回一个字符串列表，其中包含艺术家的姓名和国籍;
     */
    public static List<String> getArtistNamesAndNationalities(List<Artist> artists) {
        return artists.stream()
                .flatMap(artist -> Stream.of(artist.getName(), artist.getNationality()))
                .collect(Collectors.toList());
    }

    /**
     * c. 编写一个函数，接受专辑列表作为参数，返回一个由最多包含 3 首歌曲的专辑组成的列表。
     */
    public static List<Album> getAlbumsWithAtMostThreeTracks(List<Album> albums) {
        return albums.stream()
                .filter(album -> album.getTrackList().size() <= 3)
                .collect(Collectors.toList());
    }
}
