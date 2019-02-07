package com.sunnie.java8.examples.chapter5;

import com.sunnie.java8.examples.common.Album;
import com.sunnie.java8.examples.common.Artist;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.sunnie.java8.examples.chapter5.SortAlbumsByArtist10.sortAlbumsByArtist;
import static com.sunnie.java8.examples.common.SampleData.*;
import static org.testng.Assert.*;

public class SortAlbumsByArtist10Test {

    @Test
    public void testSortAlbumsByArtist() {
        Map<Artist, List<Album>> expectedMap = new HashMap<>();
        expectedMap.put(johnColtrane, Arrays.asList(aLoveSupreme, sampleShortAlbum, manyTrackAlbum));
        expectedMap.put(ringoStarr, Arrays.asList(ringoStarrAlbum));
        assertEquals(sortAlbumsByArtist(albumStream), expectedMap);
    }
}