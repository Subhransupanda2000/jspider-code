package com.example.jspiderjava;

public class EvenOrOdd {
    public static void main(String[] args) {
        int n = 12345;
        sumOfNumber(n);
    }

    private static void sumOfNumber(int n) {
        int sum = 0;
        while (n > 0) {

            int remainder = n % 10;
            sum = sum + remainder;
            n = n / 10;

        }
        if (sum % 2 == 0) {
            System.out.println("number is even");

        } else {
            System.out.println("number is odd");
        }
    }
}
