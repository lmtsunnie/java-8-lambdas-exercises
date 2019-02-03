package com.sunnie.java8.answers.chapter3;

import com.sunnie.java8.examples.common.Album;
import com.sunnie.java8.examples.common.SampleData;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static com.sunnie.java8.answers.chapter3.Question1.addUp;
import static com.sunnie.java8.answers.chapter3.Question1.getArtistNamesAndNationalities;
import static com.sunnie.java8.examples.common.SampleData.*;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class Question1Test {
    @Test
    public void testAddUp() {
        int res1 = addUp(Stream.empty());
        assertEquals(0, res1);
        int res2 = addUp(Stream.of(1, 3, -2));
        assertEquals(2, res2);
    }

    @Test
    public void testGetArtistNamesAndNationalities() {
        List<String> namesAndOrigins =
                getArtistNamesAndNationalities(SampleData.getThreeArtists());
        assertEquals(asList("John Coltrane", "US", "John Lennon", "UK", "The Beatles", "UK"), namesAndOrigins);
    }

    @Test
    public void testGetAlbumsWithAtMostThreeTracks() {
        List<Album> albums = asList(manyTrackAlbum, sampleShortAlbum, aLoveSupreme);
        List<Album> result = Question1.getAlbumsWithAtMostThreeTracks(albums);
        assertEquals(asList(sampleShortAlbum, aLoveSupreme), result);
    }
}
