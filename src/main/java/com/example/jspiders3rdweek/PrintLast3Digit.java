package com.example.jspiders3rdweek;

public class PrintLast3Digit {
    public static void main(String[] args) {
        int n = 123456;
        findLast3Digit(n);
    }

    private static void findLast3Digit(int n) {
        int number = n;
        int x = 1;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            count++;
            n = n / 10;
        }
        for (int i = 1; i <= (count / 2); i++) {
            x = x * 10;
        }
        int result = number / x;
        System.out.println(result);


    }

}
