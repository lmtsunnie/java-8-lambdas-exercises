package com.sunnie.java8.answers.chapter3;

import org.junit.Test;

import static com.sunnie.java8.answers.chapter3.Question6.countLowerCaseLetters;
import static org.testng.AssertJUnit.assertEquals;

public class Question6Test {
    @Test
    public void testCountLowerCaseLetters() {
        assertEquals(0, countLowerCaseLetters(""));
        assertEquals(3, countLowerCaseLetters("aBcDeF"));
        assertEquals(0, countLowerCaseLetters("ABCDEF"));
    }
}
