package com.example.jspiderjava;

public class ArmstrongNumber {
    public static int armstrongNumber(int n)
    {
        int sum=0;
        while (n>0)
        {
            int remainder=n%10;
             sum=sum+(remainder*remainder*remainder);
            n=n/10;
        }
        return sum;
    }
}
