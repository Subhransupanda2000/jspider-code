package com.example.jspiders2ndweek;

public class MaxElementInArray {
    public static int[] findMaxElement(int[] arr) {
        int max1 = 0;
        int max2 = 0;
        int[] arr2 = new int[2];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }
        }
        arr2[0] = max1;
        arr2[1] = max2;
        return arr2;

    }
}
