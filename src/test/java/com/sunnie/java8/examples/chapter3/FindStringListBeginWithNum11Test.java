package com.sunnie.java8.examples.chapter3;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.sunnie.java8.examples.chapter3.FindStringListBeginWithNum11.findStringListBeginWithNum11;
import static com.sunnie.java8.examples.common.Print.printList;
import static org.testng.Assert.assertEquals;

public class FindStringListBeginWithNum11Test {
    @Test
    public void testFindStringListBeginWithNum11() {
        List<String> stringListBeginWithNum = findStringListBeginWithNum11("a","bCC","1cCC");
        printList(stringListBeginWithNum);
        assertEquals(Arrays.asList("1cCC"), stringListBeginWithNum);
    }
}
