package com.sunnie.java8.examples.common;

import java.util.List;
import java.util.Set;

public class Print {
    public static <T> void printList(List<T> list) {
        list.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    public static <T> void printSet(Set<T> set) {
        set.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}
