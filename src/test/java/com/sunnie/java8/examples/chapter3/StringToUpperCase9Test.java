package com.sunnie.java8.examples.chapter3;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.sunnie.java8.examples.chapter3.StringToUpperCase9.stringToUpperCase9;
import static com.sunnie.java8.examples.common.Print.printList;
import static org.testng.AssertJUnit.assertEquals;

public class StringToUpperCase9Test {
    @Test
    public void testStringToUpperCase9() {
        List<String> upperCaseStringList = stringToUpperCase9("a", "b", "Hello");
        printList(upperCaseStringList);
        assertEquals(Arrays.asList("A", "B", "HELLO"), upperCaseStringList);
    }
}
