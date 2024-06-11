package com.example.jspiders3rdweek;

public class SmallstNumber {
    public static void main(String[] args) {
        int n=12345;
        findSmallestNumber(n);
    }
    private static void findSmallestNumber(int n)
    {
        int smallest=9;
        while(n>0)
        {
            int rem=n%10;
            if(rem<smallest)
            {
                smallest=rem;
            }
            n=n/10;
        }
        System.out.println(smallest);
    }
}
