package com.sunnie.java8.examples.chapter3;

import com.sunnie.java8.examples.common.Track;
import org.junit.Test;

import static com.sunnie.java8.examples.chapter3.FindShortestTrack13.findShortestTrack13;
import static org.testng.Assert.assertEquals;

public class FindShortestTrack13Test {
    @Test
    public void testFindShortestTrack13() {
        Track shortestTrack = findShortestTrack13();
        System.out.println(shortestTrack.toString());
        assertEquals(new Track("Violets for Your Furs", 378), shortestTrack);
    }
}
