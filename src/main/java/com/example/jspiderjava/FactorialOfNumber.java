package com.example.jspiderjava;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int n = 4;
        int result = factorialOfNumber(n);
        System.out.println(result);
    }

    private static int factorialOfNumber(int n) {
        int fact = 1;

        while (n > 0) {
            fact = fact * n;
            n--;
        }
        return fact;


    }
}
