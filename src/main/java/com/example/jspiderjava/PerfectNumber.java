package com.example.jspiderjava;
public class PerfectNumber {
    public static void main(String[] args) {
        int digit=28;
        int sum=0;
        for (int i=1;i<=digit/2;i++)
        {
            if ( digit%i==0)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
        if (sum==digit)
        {
            System.out.println("perfectnumber");
        }
        else
        {
            System.out.println("not a perfect number");
        }
    }
}
