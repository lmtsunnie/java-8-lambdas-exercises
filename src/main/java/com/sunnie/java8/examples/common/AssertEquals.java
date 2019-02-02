package com.sunnie.java8.examples.common;

import java.lang.annotation.Target;
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

    public static <T> boolean assertEquals(T t1, T t2) {
        if (t1.equals(t2)) {
            return true;
        }
        return false;
    }
}
