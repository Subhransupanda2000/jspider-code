package com.example.jspiderjava;

public class ReverseStringMethod2 {
    public static void main(String[] args) {
        String st = "hello";
        char[] arr = st.toCharArray();
        String result = reverseString(arr);
        System.out.println(result);

    }

    public static String reverseString(char[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}
