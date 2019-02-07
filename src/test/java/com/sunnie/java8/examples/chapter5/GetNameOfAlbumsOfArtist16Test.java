package com.sunnie.java8.examples.chapter5;

import com.sunnie.java8.examples.common.Artist;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.sunnie.java8.examples.chapter5.GetNameOfAlbumsOfArtist16.nameOfAlbums;
import static com.sunnie.java8.examples.common.SampleData.*;
import static org.testng.Assert.*;

public class GetNameOfAlbumsOfArtist16Test {

    @Test
    public void testNameOfAlbums() {
        Map<Artist, List<String>> exceptedMap = new HashMap<>();
        exceptedMap.put(johnColtrane, Arrays.asList("A Love Supreme", "sample Short Album", "many Track Album"));
        exceptedMap.put(ringoStarr, Arrays.asList("ringo Starr Album"));
        assertEquals(exceptedMap, nameOfAlbums(albumStream));
    }
}