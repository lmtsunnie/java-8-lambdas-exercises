package com.sunnie.java8.examples.chapter3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.sunnie.java8.examples.common.AssertEquals.assertEquals;


public class StringToList7 {
    public static void stringToList7() {
        List<String> collected = Stream.of("a", "b", "c")  //  多个字符串 -> Stream
               .collect(Collectors.toList()); // Stream -> 列表
        assertEquals(Arrays.asList("a", "b", "c"), collected);
    }

    public static void main(String[] args) {
        stringToList7();
    }
}
