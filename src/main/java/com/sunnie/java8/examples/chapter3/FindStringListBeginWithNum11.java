package com.sunnie.java8.examples.chapter3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;

public class FindStringListBeginWithNum11 {
    public static List<String> findStringListBeginWithNum11(String... strings) {
        return Stream.of(strings).filter(string -> isDigit(string.charAt(0)))
                .collect(Collectors.toList());
    }
}
