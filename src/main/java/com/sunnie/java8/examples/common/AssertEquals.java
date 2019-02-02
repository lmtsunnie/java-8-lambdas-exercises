package com.sunnie.java8.examples.common;

import java.util.List;

public class AssertEquals {
    public static <T> boolean assertEquals(List<T> assertComparator, List<T> res) {
        for (int i = 0; i < assertComparator.size(); i ++) {
            if (!assertComparator.get(i).equals(res.get(i))) {
                return false;
            }
        }
        return true;
    }
}
