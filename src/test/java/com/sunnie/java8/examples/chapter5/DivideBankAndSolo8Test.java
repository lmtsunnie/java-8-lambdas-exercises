package com.sunnie.java8.examples.chapter5;

import com.google.common.collect.Maps;
import com.sunnie.java8.examples.common.Artist;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Stream;

import static com.sunnie.java8.examples.chapter5.DivideBankAndSolo8.bandsAndSolo;
import static com.sunnie.java8.examples.common.SampleData.*;
import static org.testng.Assert.*;

public class DivideBankAndSolo8Test {

    @Test
    public void testBandsAndSolo() {
        Stream<Artist> artistStream = getThreeArtistsStream();
        Map<Boolean, List<Artist>> expectedMap = new HashMap<>();
        expectedMap.put(true, Arrays.asList(johnColtrane, johnLennon));
        expectedMap.put(false, Arrays.asList(theBeatles));
        assertEquals(expectedMap, bandsAndSolo(artistStream));
    }
}