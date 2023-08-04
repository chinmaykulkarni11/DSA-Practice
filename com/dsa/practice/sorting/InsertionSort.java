package com.dsa.practice.sorting;

import com.dsa.practice.utils.ArrayUtils;

import java.util.Arrays;

//keep comparing every element with left elements , keep swapping until left is greater

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 3;
        arr[3] = 2;
        arr[4] = 1;
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int index = i;
            while (index > 0 && arr[index] < arr[index - 1]) {
                ArrayUtils.swap(arr, index, index - 1);
                index--;
            }
        }
    }

}
