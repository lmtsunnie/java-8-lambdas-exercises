package com.sunnie.java8.examples.chapter3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.sunnie.java8.examples.common.AssertEquals.assertEquals;
import static com.sunnie.java8.examples.common.PrintList.printList;

public class StringToList7 {
    public static List<String> stringToList7(String... strings) {
        return Stream.of(strings)  //  多个字符串 -> Stream
                .collect(Collectors.toList()); // Stream -> 列表
    }

    public static void main(String[] args) {
        List<String> stringList = stringToList7("a","b","c");
        printList(stringList);
        System.out.println(assertEquals(Arrays.asList("a","b","c"), stringList));
    }
}
