package com.sunnie.java8.examples.chapter3;

import com.sunnie.java8.examples.common.Album;
import com.sunnie.java8.examples.common.Track;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindLongTracks19To23 {
    public interface LongTrackFinder {
        Set<String> findLongTracks(List<Album> albums);
    }

    public static class FindLongTracks19 implements LongTrackFinder {
        @Override
        public Set<String> findLongTracks(List<Album> albums) {
            Set<String> trackNames = new HashSet<>();
            for (Album album : albums) {
                for (Track track : album.getTrackList()) {
                    if (track.getLength() > 60) {
                        String name = track.getName();
                        trackNames.add(name);
                    }
                }
            }
            return trackNames;
        }
    }

    public static class FindLongTracks20 implements LongTrackFinder {
        @Override
        public Set<String> findLongTracks(List<Album> albums) {
            Set<String> trackNames = new HashSet<>();
            albums.forEach(album ->
                    album.getTrackStream()
                            .forEach(track -> {
                                        if (track.getLength() > 60) {
                                            String name = track.getName();
                                            trackNames.add(name);
                                        }
                                    }
                            )
            );
            return trackNames;
        }
    }

    public static class FindLongTracks21 implements LongTrackFinder {
        @Override
        public Set<String> findLongTracks(List<Album> albums) {
            Set<String> trackNames = new HashSet<>();
            albums.forEach(album ->
                    album.getTrackStream()
                            .filter(track -> track.getLength() > 60)
                            .map(Track::getName)
                            .forEach(trackNames::add)
            );
            return trackNames;
        }
    }

    public static class FindLongTracks22 implements LongTrackFinder {
        @Override
        public Set<String> findLongTracks(List<Album> albums) {
            Set<String> trackNames = new HashSet<>();
            albums.stream()
                    .flatMap(Album::getTrackStream)
                    .filter(track -> track.getLength() > 60)
                    .map(Track::getName)
                    .forEach(trackNames::add);
            return trackNames;
        }
    }

    public static class FindLongTracks23 implements LongTrackFinder {
        @Override
        public Set<String> findLongTracks(List<Album> albums) {
            return albums.stream()
                    .flatMap(Album::getTrackStream)
                    .filter(track -> track.getLength() > 60)
                    .map(Track::getName)
                    .collect(Collectors.toSet());
        }
    }
}
