package com.jeethink.system.service.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Test_0825 {

    public static void main(String[] args) {
        int[] nums = {2, 8, 10, 25, 9, 3, 8, 21};  // 2 3 8 8 9 10 21 25
        sort(nums);
        System.out.println(nums.length % 2 + " " + nums.length / 2);
        if (nums.length % 2 != 0) {
            System.out.println("中位数为：" + nums[nums.length / 2]);
        } else {
            System.out.println(nums.length / 2 + " " + (nums.length / 2 - 1) + "aa" + (nums[nums.length / 2]) + "bb" + (nums[nums.length / 2 - 1]));
            System.out.println("中位数为1：" + (double)((nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2.0));
        }
    }

    private static void sort(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

}
