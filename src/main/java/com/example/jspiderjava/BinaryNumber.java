package com.example.jspiderjava;

public class BinaryNumber {
    public static void main(String[] args) {
        int n = 10110;
        boolean result = isABinaryNumber(n);
        System.out.println(result);
    }

    public static boolean isABinaryNumber(int n) {
        while (n != 0) {
            if (n % 10 > 1) {
                return false;
            }
            n = n / 10;
        }
        return true;
    }
}
