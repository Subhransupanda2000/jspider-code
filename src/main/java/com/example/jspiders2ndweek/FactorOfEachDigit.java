package com.example.jspiders2ndweek;

public class FactorOfEachDigit {
    public static void main(String[] args) {
        int n = 12345;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            for (int i = 1; i <= rem; i++) {
                if (rem % i == 0) {
                    System.out.println(i);
                }
            }
            System.out.println(" ");
        }

    }
}

