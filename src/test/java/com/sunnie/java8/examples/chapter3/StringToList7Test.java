package com.sunnie.java8.examples.chapter3;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.sunnie.java8.examples.chapter3.StringToList7.stringToList7;
import static com.sunnie.java8.examples.common.Print.printList;
import static org.testng.AssertJUnit.assertEquals;

public class StringToList7Test {
    @Test
    public void testStringToList7(){
        List<String> stringList = stringToList7("a","b","c");
        printList(stringList);
        assertEquals(Arrays.asList("a","b","c"), stringList);
    }
}
