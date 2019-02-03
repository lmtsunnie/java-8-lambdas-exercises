package com.sunnie.java8.answers.chapter3;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

import static com.sunnie.java8.answers.chapter3.Question7.mostLowerCaseString;
import static org.junit.Assert.assertFalse;
import static org.testng.AssertJUnit.assertEquals;

public class Question7Test {
    @Test
    public void testMostLowercaseString(){
            assertFalse(mostLowerCaseString(Collections.emptyList()).isPresent());

            Optional<String> result = mostLowerCaseString(Arrays.asList("a", "abc", "ABCde"));
            assertEquals(Optional.of("abc"), result);
    }
}
