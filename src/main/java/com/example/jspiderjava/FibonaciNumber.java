package com.example.jspiderjava;

public class FibonaciNumber {

    public static void main(String[] args) {
        int n = 10;
        int result = fibonaciNumber(n);
        System.out.println(result);
    }

    public static int fibonaciNumber(int n) {
        int first = 0;
        int second = 1;
        for (int i = 0; i < n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }

}
