package com.dsa.practice.arrays.easy;

import com.dsa.practice.utils.ArrayUtils;

import java.util.HashMap;
import java.util.Map;

public class MissingNumber {

    public static int missingNumber(int[] nums) {

        Map<Integer, Integer> numsMap = new HashMap<>();
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            numsMap.putIfAbsent(nums[i], nums[i]);
            if (nums[i] < low) {
                low = nums[i];
            }
            if (nums[i] > high) {
                high = nums[i];
            }

        }

        for (int i = low; i < high; i++) {
            if (numsMap.containsKey(i)) {

            } else return i;
        }
        return -1;
    }


    public static void main(String[] args) {

        System.out.println(missingNumber(ArrayUtils.getArrayWithMissingElement()));
        System.out.println(missingNumber(new int[]{0, -1}));

    }

}