package com.example.patternProgramming;;

public class Pattern5 {
    public static void main(String[] args) {
        for (int r = 1; r <= 5; r++) {
            for (int c = 1; c <= 5; c++) {
                if (c<=r) {
                    System.out.print("*");
                } else System.out.print(" ");

            }
            System.out.println(" ");
        }
    }
}
