package com.example.jspiders2ndweek;

public class SumOfEvenDigit {
    public static void main(String[] args) {
        int n = 12345;
        int result = findSum(n);
        System.out.println(result);
    }

    public static int findSum(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem % 2 != 0) {
                sum = sum + rem;
            }
            n = n / 10;

        }
        return sum;
    }
}
