package com.sunnie.java8.examples.common;

import java.util.List;

public class AssertEquals {
    public static <T> void assertEquals(List<T> assertComparator, List<T> res) {
        for (int i = 0; i < assertComparator.size(); i ++) {
            if (!assertComparator.get(i).equals(res.get(i))) {
                System.out.println("assertEquals" + false);
            }
        }
        System.out.println("assertEquals" + true);
    }
}
