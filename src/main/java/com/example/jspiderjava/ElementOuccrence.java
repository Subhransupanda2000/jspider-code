package com.example.jspiderjava;

public class ElementOuccrence {
    public static void main(String[] args) {
        int n = 10;
        int result = ouccuranceOfelements(n);
        System.out.println(result);
    }
    private static int ouccuranceOfelements(int n) {
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
