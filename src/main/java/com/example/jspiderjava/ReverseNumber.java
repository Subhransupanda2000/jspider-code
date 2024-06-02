package com.example.jspiderjava;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 123456789;
        int result = reverseNumber(number);
        System.out.println(result);
    }

    public static int reverseNumber(int number) {
        int reverse = 0;
        int remainder;
        while (number > 0) {
            remainder = number % 10;
            number = number / 10;
            reverse = reverse * 10 + remainder;
        }
        return reverse;
    }
}
