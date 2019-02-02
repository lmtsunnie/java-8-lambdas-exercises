package com.sunnie.java8.examples.chapter2;

public class forFormat {
    public static void main(String[] args) {
        int count = 0;
        int[] nums = {1, 2, 3, 4, 5};
        for (int num : nums) {
            num = 0;
        }
        System.out.println(nums[0]);
    }
}
