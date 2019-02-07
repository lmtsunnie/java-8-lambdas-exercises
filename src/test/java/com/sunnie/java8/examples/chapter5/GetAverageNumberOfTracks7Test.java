package com.sunnie.java8.examples.chapter5;

import org.testng.annotations.Test;

import static com.sunnie.java8.examples.chapter5.GetAverageNumberOfTracks7.averageNumberOfTracks7;
import static com.sunnie.java8.examples.common.SampleData.getAlbums;
import static org.testng.Assert.assertEquals;

public class GetAverageNumberOfTracks7Test {

    @Test
    public void testAverageNumberOfTracks7() {
        assertEquals((2 + 1 + 5) / 3.0, averageNumberOfTracks7(getAlbums));
    }
}