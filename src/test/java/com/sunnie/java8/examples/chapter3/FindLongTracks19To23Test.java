package com.sunnie.java8.examples.chapter3;

import com.sunnie.java8.examples.common.Album;
import com.sunnie.java8.examples.common.SampleData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FindLongTracks19To23Test {
    @Test
    public void testFindLongTracks() {
        List<Supplier<FindLongTracks19To23.LongTrackFinder>> finders = Arrays.asList(
                FindLongTracks19To23.FindLongTracks19::new,
                FindLongTracks19To23.FindLongTracks20::new,
                FindLongTracks19To23.FindLongTracks21::new,
                FindLongTracks19To23.FindLongTracks22::new,
                FindLongTracks19To23.FindLongTracks23::new
        );

        List<Album> albums = unmodifiableList(asList(SampleData.aLoveSupreme, SampleData.sampleShortAlbum));
        List<Album> noTracks = unmodifiableList(asList(SampleData.sampleShortAlbum));

        finders.forEach(finder -> {
            System.out.println("Testing: " + finder.toString());

            FindLongTracks19To23.LongTrackFinder longTrackFinder = finder.get();
            Set<String> longTracks = longTrackFinder.findLongTracks(albums);

            assertEquals("[Acknowledgement, Resolution]", longTracks.toString());

            longTracks = longTrackFinder.findLongTracks(noTracks);

            assertTrue(longTracks.isEmpty());
        });
    }
}
