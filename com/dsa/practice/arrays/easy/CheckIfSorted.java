package com.dsa.practice.arrays.easy;

public class CheckIfSorted {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 3;
        arr[3] = 2;
        arr[4] = 1;

        System.out.println(checkIfSorted(arr));

    }

    private static boolean checkIfSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] <= a[i + 1]) {

            } else {
                return false;
            }
        }
        return true;
    }

}
