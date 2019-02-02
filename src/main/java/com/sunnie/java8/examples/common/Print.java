package com.sunnie.java8.examples.common;

import java.util.List;
import java.util.Set;

public class Print {
    public static <T> void printList(List<T> list) {
        list.forEach(System.out::println);
    }

    public static <T> void printSet(Set<T> set) {
        set.forEach(System.out::println);
    }
}
