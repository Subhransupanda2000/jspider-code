package com.example.jspiderjava;
public class CountOcuurance  {
    public static int count(int n, int occurrence) {
        int count = 0;
        while (n > 0) {
            if (n % 10 == occurrence) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }
}