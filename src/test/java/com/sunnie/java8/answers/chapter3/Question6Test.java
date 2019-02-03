package com.sunnie.java8.answers.chapter3;

import org.junit.Test;

import static com.sunnie.java8.answers.chapter3.Question6.countLowercaseLetters;
import static org.testng.AssertJUnit.assertEquals;

public class Question6Test {
    @Test
    public void testCountLowercaseLetters() {
        assertEquals(0, countLowercaseLetters(""));
        assertEquals(3, countLowercaseLetters("aBcDeF"));
        assertEquals(0, countLowercaseLetters("ABCDEF"));
    }
}
