package com.sunnie.java8.examples.chapter5;

import com.sunnie.java8.examples.common.Artist;
import org.testng.annotations.Test;

import java.util.Optional;
import java.util.stream.Stream;

import static com.sunnie.java8.examples.chapter5.FindBiggestBank6.findBiggestBank6;
import static com.sunnie.java8.examples.common.SampleData.getThreeArtistsStream;
import static com.sunnie.java8.examples.common.SampleData.theBeatles;
import static org.junit.Assert.assertEquals;

public class FindBiggestBank6Test {

    @Test
    public void testFindBiggestBank6() {
        Stream<Artist> artistsStream = getThreeArtistsStream();
        assertEquals(theBeatles, findBiggestBank6(artistsStream).get());

        assertEquals(Optional.empty(), findBiggestBank6(Stream.empty()));
    }



}