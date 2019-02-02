package com.sunnie.java8.examples.chapter3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.sunnie.java8.examples.common.AssertEquals.assertEquals;
import static com.sunnie.java8.examples.common.PrintList.printList;

public class StringToUpperCase9 {
    public static List<String> stringToUpperCase9(String... strings) {
        return Stream.of(strings)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> upperCaseStringList = stringToUpperCase9("a","b","Hello");
        printList(upperCaseStringList);
        System.out.println(assertEquals(Arrays.asList("A", "B", "HELLO"), upperCaseStringList));
    }
}
