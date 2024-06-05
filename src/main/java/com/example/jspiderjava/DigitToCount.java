package com.example.jspiderjava;

public class DigitToCount {

    public static int digitToCount(int n) {
        int count = 0;
        n = n * n * n;
        int ouccurance = 0;
        while (n > 0) {
            if (n % 10 == ouccurance) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }
}
