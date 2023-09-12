package com.dsa.practice.sorting;

import com.dsa.practice.utils.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {

        int[] array = ArrayUtils.getUnsortedArray();
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }

    private static void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        List<Integer> temp = new ArrayList<>();

        while (left <= mid && right <= high) {

            if (array[left] <= array[right]) {
                temp.add(array[left]);
                left++;
            } else {
                temp.add(array[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(array[left]);
            left++;
        }
        while (right <= high) {
            temp.add(array[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            array[i] = temp.get(i - low);
        }


    }

}

