package com.dsa.practice.sorting;

import com.dsa.practice.utils.ArrayUtils;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 3;
        arr[3] = 2;
        arr[4] = 1;
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int partition = partition(arr, start, end);
            quickSort(arr, start, partition - 1);
            quickSort(arr, partition + 1, end);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {

            while (arr[i] <= pivot && i < high ) {
                i++;
            }
            while (arr[j] >= pivot && j > low ) {
                j--;
            }
            if (i < j) {
                ArrayUtils.swap(arr, i, j);
            }
        }
        ArrayUtils.swap(arr, low, j);
        return j;
    }

}
