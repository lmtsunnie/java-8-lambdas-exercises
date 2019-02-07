package com.sunnie.java8.examples.chapter5;

import org.hamcrest.CoreMatchers;
import org.junit.Ignore;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class Order1Test {
    /**
     * 有序List -> 打散成Stream后有序 -> 收集成的List有序
     */
    @Test
    public void listToStream1() {
        List<Integer> numbers = asList(1, 2, 3, 4);

        List<Integer> sameOrder = numbers.stream()
                .collect(toList());
        assertEquals(numbers, sameOrder);
    }

    /**
     * 无序Set -> 打散成Stream后无序 -> 收集成的Set无序
     */
    @Ignore
    @Test
    public void hashSetToStream2() {
        Set<Integer> numbers = new HashSet<>(asList(4, 3, 2, 1));
        List<Integer> sameOrder = numbers.stream()
                .collect(toList());
        // 该断言有时会失败
        assertEquals(asList(4, 3, 2, 1), sameOrder);
    }

    /**
     * 无序Set -> 打散成Stream后无序 -> 排序 -> 收集成的List有序
     */
    @Test
    public void hashSetToList3() {
        Set<Integer> numbers = new HashSet<>(asList(4, 3, 2, 1));
        List<Integer> sameOrder = numbers.stream()
                .sorted()
                .collect(toList());
        assertEquals(asList(1, 2, 3, 4), sameOrder);
    }

    /**
     * List -> 映射 -> 有序 / Set -> 映射 -> 无序
     */
    @Test
    public void ListToListSetToSet4() {
        List<Integer> numbers = asList(1, 2, 3, 4);
        List<Integer> stillOrdered = numbers.stream()
                .map(x -> x + 1)
                .collect(toList());
        // 顺序得到了保留
        assertEquals(asList(2, 3, 4, 5), stillOrdered);

        Set<Integer> unordered = new HashSet<>(numbers);
        List<Integer> stillUnordered = unordered.stream()
                .map(x -> x + 1)
                .collect(toList());
        // 顺序得不到保证
        assertThat(stillUnordered, CoreMatchers.hasItem(2));
        assertThat(stillUnordered, CoreMatchers.hasItem(3));
        assertThat(stillUnordered, CoreMatchers.hasItem(4));
        assertThat(stillUnordered, CoreMatchers.hasItem(5));
    }
}
