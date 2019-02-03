package com.sunnie.java8.examples.chapter3;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

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
}
