package com.example.jspiderjava;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 13;
        boolean result = isPrimeNumber(n);
        System.out.println("Is " + n + " a prime number? " + result);
    }

    public static boolean isPrimeNumber(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
