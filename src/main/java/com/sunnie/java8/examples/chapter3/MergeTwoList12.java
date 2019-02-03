package com.sunnie.java8.examples.chapter3;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoList12 {
    public static List<Integer> mergeTwoList12() {
        return Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}