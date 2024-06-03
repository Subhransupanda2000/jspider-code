package com.example.jspiderjava;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 12345;
        int result = sumOfDigits(n);
        System.out.println(result);
    }

    public static int sumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            int remainder = n % 10;
            n = n / 10;
            sum = sum + remainder;
        }
        return sum;

    }

}
