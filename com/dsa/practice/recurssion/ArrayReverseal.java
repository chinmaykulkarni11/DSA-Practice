package com.dsa.practice.recurssion;

import java.util.Arrays;

public class ArrayReverseal {

    public static int[] reverseArray(int n, int[] array) {
        reverseInPlaceRecursive(array, 0, n - 1);
        return array;
    }

    private static void reverseInPlaceRecursive(int[] array, int start, int end) {
        if (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            reverseInPlaceRecursive(array, start + 1, end - 1);
        }
    }


    public static int[] reverseUsingExtraSpace(int[] array, int[] newArr, int flag) {
        if (flag == array.length) return newArr;
        newArr[flag] = array[array.length - flag - 1];
        return reverseUsingExtraSpace(array, newArr, flag + 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(reverseArray(arr.length, arr)));
    }
}