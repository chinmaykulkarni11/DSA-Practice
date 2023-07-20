package com.dsa.practice.hashing.basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HighLowFrequency {

    public static int[] getFrequencies(int[] inputArray) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int[] arr = new int[2];
        Arrays.fill(arr, -1);
        for (int i : inputArray) {

            if (!frequencyMap.containsKey(i)) {
                frequencyMap.put(i, 1);
            } else {
                frequencyMap.put(i, frequencyMap.get(i) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int index = entry.getKey();
            int value = entry.getValue();

            if (arr[0] == -1) {
                arr[0] = index;
                arr[1] = index;
            } else {
                if (value >= frequencyMap.get(arr[0])) {
                    if (value == frequencyMap.get(arr[0])) {
                        if (index > arr[0]) {
                            arr[0] = index;
                        }
                    } else arr[0] = index;
                }
                //for min
                if (value <= frequencyMap.get(arr[1])) {
                    if (value == frequencyMap.get(arr[1])) {
                        if (index < arr[1]) {
                            arr[1] = index;
                        }
                    } else arr[1] = index;

                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 4;
        arr[4] = 1;
        System.out.println(Arrays.toString(getFrequencies(arr)));
    }

}
