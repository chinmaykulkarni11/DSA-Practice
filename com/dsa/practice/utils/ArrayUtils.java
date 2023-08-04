package com.dsa.practice.utils;

public class ArrayUtils {

    public static void swap(int[] arr, int index, int index2) {
        int temp = arr[index];
        arr[index] = arr[index2];
        arr[index2] = temp;
    }
}
