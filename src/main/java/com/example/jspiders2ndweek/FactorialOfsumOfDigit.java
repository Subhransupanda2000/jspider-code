package com.example.jspiders2ndweek;

public class FactorialOfsumOfDigit {
    public static void main(String[] args) {
        int n = 123;
        int sum = 0;
        int fact = 1;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println(sum);
        for (int i = 1; i <= sum; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

    }
}
