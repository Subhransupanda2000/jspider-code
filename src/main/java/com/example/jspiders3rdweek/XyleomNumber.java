package com.example.jspiders3rdweek;

public class XyleomNumber {
    public static void main(String[] args) {
        int n = 121;
        isxyleomNumber(n);
    }

    private static void isxyleomNumber(int n) {

        int rem = n % 10;
        n = n / 10;
        int sum = 0;
        while (n > 9) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        if (sum == (n + rem)) {
            System.out.println("Xyleom number");
        } else {
            System.out.println("phloem number");
        }
    }
}
