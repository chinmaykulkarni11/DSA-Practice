package com.dsa.practice.hashing.basics;

import java.util.Arrays;

public class CountFrequency {

    public static int[] countFrequency(int n, int x, int[] nums) {

        int[] hashedArray = new int[x];
        for (int i = 0; i < nums.length; i++) {
            int index = nums[i];
            hashedArray[index - 1] = hashedArray[index - 1] + 1;
        }
        return hashedArray;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 4;

        System.out.println(Arrays.toString(countFrequency(arr.length, 4, arr)));
    }

}
