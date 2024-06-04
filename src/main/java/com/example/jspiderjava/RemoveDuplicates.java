package com.example.jspiderjava;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] sortedArray = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 9};
        int length = removeDuplicateElement(sortedArray);
        int[] arr = Arrays.copyOf(sortedArray, length);
        System.out.println(Arrays.toString(arr));
    }

    private static int removeDuplicateElement(int sortedArray[]) {
        int n = sortedArray.length;
        int j = 1;
        for (int i = 1; i < n; i++) {

            if (sortedArray[i] != sortedArray[i - 1]) {
                sortedArray[j] = sortedArray[i];
                j++;
            }
        }
        return j;
    }
}
