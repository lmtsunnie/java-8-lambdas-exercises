package com.sunnie.java8.answers.chapter3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Question7 {
    /**
     * 在一个字符串列表中，找出包含最多小写字母的字符串。对于空列表，返回 Optional<String> 对象。
     */
    public static Optional<String> mostLowercaseString(List<String> strings) {
        return strings.stream()
                .max(Comparator.comparing(Question6::countLowercaseLetters));
    }
}
