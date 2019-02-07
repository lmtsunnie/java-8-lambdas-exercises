package com.sunnie.java8.examples.chapter5;

import com.sunnie.java8.examples.common.Artist;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static com.sunnie.java8.examples.chapter5.GetNumberOfAlbumsOfArtist14.numberOfAlbums;
import static com.sunnie.java8.examples.common.SampleData.*;
import static org.testng.Assert.*;

public class GetNumberOfAlbumsOfArtist14Test {

    @Test
    public void testNumberOfAlbums() {
        Map<Artist, Long> exceptedMap = new HashMap<>();
        exceptedMap.put(johnColtrane, 3L);
        exceptedMap.put(ringoStarr, 1L);
        assertEquals(exceptedMap, numberOfAlbums(albumStream));
    }
}