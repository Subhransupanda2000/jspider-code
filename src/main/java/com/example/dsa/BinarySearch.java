package com.example.dsa;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int key = 5;
        int result = binarySearchOfArray(arr, key);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int binarySearchOfArray(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            // Calculate mid to avoid potential overflow
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
