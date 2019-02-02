package com.sunnie.java8.examples.chapter3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.sunnie.java8.examples.common.AssertEquals.assertEquals;
import static com.sunnie.java8.examples.common.PrintList.printList;
import static java.lang.Character.isDigit;

public class FindStringListBeginWithNum11 {
    public static List<String> findStringListBeginWithNum11(String... strings) {
        return Stream.of(strings).filter(string -> isDigit(string.charAt(0)))
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<String> stringListBeginWithNum = findStringListBeginWithNum11("a","bCC","1cCC");
        printList(stringListBeginWithNum);
        System.out.println(assertEquals(Arrays.asList("1cCC"), stringListBeginWithNum));

    }
}
