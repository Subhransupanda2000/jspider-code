package com.example.jspiders3rdweek;

public class NthSmallestNumber {
    public static void main(String[] args) {
        int n = 97836;
        findNthSmallestNumber(n);
    }
    private static void findNthSmallestNumber(int n) {
        int count = 0;
        for (int i = 0;i<=9;i++) {
            int t = n;

            while (t > 0) {
                int rem = t % 10;
                if (i == rem) {
                    count++;
                    break;
                }
                t = t / 10;
            }
            if (count == 4) {
                System.out.println(i);
            }
        }
    }
}
