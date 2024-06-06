package com.example.jspiderjava;

public class PalindromeNumber {
    public static void main(String[] args) {
        String string = "abdba";
        boolean result = isPalindromeNumber(string);
        System.out.println(result);
    }

    private static boolean isPalindromeNumber(String string) {
        char[] arr = string.toCharArray();
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }
}
