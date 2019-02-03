package com.sunnie.java8.examples.chapter3;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.sunnie.java8.examples.chapter3.MergeTwoList12.mergeTwoList12;
import static com.sunnie.java8.examples.common.Print.printList;
import static org.testng.AssertJUnit.assertEquals;

public class MergeTwoList12Test {
    @Test
    public void testMergeTwoList12() {
        List<Integer> list = mergeTwoList12();
        printList(list);
        assertEquals(Arrays.asList(1,2,3,4), list);
    }
}
