package com.example.jspiders2ndweek;

public class NumberCount {
    public static void main(String[] args) {
        int n=1234;
        countNumber(n);
    }
    public static void countNumber(int n)
    {
        int count=0;
        while (n>0)
        {
            int rem=n%10;
             count++;
             n=n/10;
        }
        if (count%2==0)
        {
            System.out.println("even");
        }
        else System.out.println("odd");

    }
}
