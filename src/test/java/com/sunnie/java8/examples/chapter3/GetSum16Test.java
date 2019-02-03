package com.sunnie.java8.examples.chapter3;

import org.junit.Test;

import static com.sunnie.java8.examples.chapter3.GetSum16.getSum16;
import static com.sunnie.java8.examples.chapter3.GetSum16.getSum17;
import static org.testng.AssertJUnit.assertEquals;

public class GetSum16Test {
    @Test
    public void testGetSum16(){
        int count = getSum16(1, 2, 3);
        System.out.println(count);
        assertEquals(6, count);
        System.out.println("===");
        int count2 = getSum17();
        System.out.println(count2);
        assertEquals(6, count2);
    }
}
