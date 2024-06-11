package com.example.jspiders2ndweek;

public class FirstDigitOfNumber {
    public static void main(String[] args) {
        int n = 12345;
        int result = firstdigitOfNumber(n);
        System.out.println(result);
    }
    public static int firstdigitOfNumber(int n) {
        int rem = n % 10;
        int result = rem;
        n = n / 10;
        return result;
    }

}
