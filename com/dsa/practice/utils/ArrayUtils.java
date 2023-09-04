package com.dsa.practice.utils;

public class ArrayUtils {

    public static void swap(int[] arr, int index, int index2) {
        int temp = arr[index];
        arr[index] = arr[index2];
        arr[index2] = temp;
    }

    public static int[] getUnsortedArray() {
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 3;
        arr[3] = 2;
        arr[4] = 1;
        return arr;
    }


    public static int[] getArrayWithMissingElement() {
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 2;
        arr[4] = 1;
        return arr;
    }


}
