package com.sunnie.java8.examples.chapter3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringToUpperCase9 {
    public static List<String> stringToUpperCase9(String... strings) {
        return Stream.of(strings)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
