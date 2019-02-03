package com.sunnie.java8.answers.chapter3;

import com.sunnie.java8.examples.common.SampleData;
import org.junit.Test;

import java.util.Arrays;

import static com.sunnie.java8.answers.chapter3.Question2.countArtistsMembersExternal;
import static com.sunnie.java8.answers.chapter3.Question2.countArtistsMembersInternal;
import static org.testng.AssertJUnit.assertEquals;

public class Question2Test {
    @Test
    public void testCountArtistsMembersExternal() {
        assertEquals(4, countArtistsMembersExternal(Arrays.asList(SampleData.johnColtrane, SampleData.theBeatles)));
    }
    @Test
    public void testCountArtistsMembersInternal() {
        assertEquals(4, countArtistsMembersInternal(Arrays.asList(SampleData.johnColtrane, SampleData.theBeatles)));
    }
}
