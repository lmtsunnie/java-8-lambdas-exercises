package com.sunnie.java8.examples.chapter3;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

import static com.sunnie.java8.examples.common.AssertEquals.assertEquals;

public class GetSum16 {
    public static int getSum16(Integer... integers) {
        return Stream.of(integers)
                .reduce(0, (acc, element) -> acc + element);

    }

    public static int getSum17() {
        BinaryOperator<Integer> accumulator = (acc, element) -> acc + element;
        return accumulator.apply(
                accumulator.apply(
                        accumulator.apply(0, 1),
                        2), 3);
    }

    public static void main(String[] args) {
        int count = getSum16(1, 2, 3);
        System.out.println(count);
        System.out.println(assertEquals(6, count));
        System.out.println("===");
        int count2 = getSum17();
        System.out.println(count2);
        System.out.println(assertEquals(6, count2));
    }
}
