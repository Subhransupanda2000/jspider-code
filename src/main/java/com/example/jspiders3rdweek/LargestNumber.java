package com.example.jspiders3rdweek;

public class LargestNumber {
    public static void main(String[] args) {
        int n=12345;
        int result=findLargestNumber(n);
        System.out.println(result);
    }
    private static int findLargestNumber(int n)
    {
        int largest=0;
        while (n>0)
        {
            int rem=n%10;
            if (rem>largest)
            {
                largest=rem;
            }
            n=n/10;
        }
        return largest;
    }
}
