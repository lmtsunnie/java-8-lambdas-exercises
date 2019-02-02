package com.sunnie.java8.examples.common;

import java.util.List;

public class PrintList {
    public static <T> void printList(List<T> list) {
        list.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}
