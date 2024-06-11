package com.example.jspiders3rdweek;

public class NthlargestDigit {
    public static void main(String[] args) {
        int n = 1234895;
        findnthlargestDigit(n);
    }

    private static void findnthlargestDigit(int n) {
        int count = 0;
        for (int i = 9; i >= 0; i--) {
            int t = n;

            while (t > 0) {
                int rem = t % 10;
                if (rem == i) {
                    count++;
                    break;

                }
                t = t / 10;

            }
            if (count == 3) {
                System.out.println(i);
            }

        }

    }
}
