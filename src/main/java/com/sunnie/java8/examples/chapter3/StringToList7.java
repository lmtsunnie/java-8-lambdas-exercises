package com.sunnie.java8.examples.chapter3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringToList7 {
    public static List<String> stringToList7(String... strings) {
        return Stream.of(strings)  //  多个字符串 -> Stream
                .collect(Collectors.toList()); // Stream -> 列表
    }

}
