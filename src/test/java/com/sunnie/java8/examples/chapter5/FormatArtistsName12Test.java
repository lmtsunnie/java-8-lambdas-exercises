package com.sunnie.java8.examples.chapter5;

import org.testng.annotations.Test;

import static com.sunnie.java8.examples.chapter5.FormatArtistsName12.formatArtistsName;
import static com.sunnie.java8.examples.common.SampleData.membersOfTheBeatles;
import static org.testng.Assert.*;

public class FormatArtistsName12Test {

    @Test
    public void testFormatArtistsName12() {
        assertEquals(formatArtistsName(membersOfTheBeatles), "[John Lennon, Paul McCartney, George Harrison, Ringo Starr]");
    }
}