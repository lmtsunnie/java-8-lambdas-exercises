package com.sunnie.java8.answers.chapter3;

public class Question6 {
    /**
     * 计算一个字符串中小写字母的个数（提示：参阅 String 对象的 chars 方法）
     */
    public static int countLowerCaseLetters(String string) {
        return (int) string.chars()
                .filter(Character::isLowerCase)
                .count();
    }
}
