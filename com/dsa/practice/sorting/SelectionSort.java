package com.dsa.practice.sorting;

import java.util.Arrays;


/**
 * goal is with each iteration put smaller element in correct position.
 * example for  5 4  3 2
 * solution will be
 * 2 4 3 5
 * 2 3 4 5
 * Remember - find the minimal and swap
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 3;
        arr[3] = 2;
        arr[4] = 1;
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    int temp = min;
                    arr[i] = min = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
