package com.example.dsa;

import java.util.Arrays;

public class SelectionSort {
    public static int[] sortedarray(int[] arr) {
        int temp = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            int min = i;
            for (int j = i; j <= arr.length - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
        return arr;
    }
}

