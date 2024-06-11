package com.example.jspiders2ndweek;

public class LastDigit {
    public static void main(String[] args) {
        int n = 12345;
        int result = lastdigit(n);
        System.out.println(result);
    }

    public static int lastdigit(int n) {
        int result = 0;
        while (n > 0) {
            int rem = n % 10;
            result = rem;
            n = n / 10;
        }
        return result;
    }
}
