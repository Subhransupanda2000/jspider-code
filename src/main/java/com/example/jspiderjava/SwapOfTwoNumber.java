package com.example.jspiderjava;

public class SwapOfTwoNumber {
    public static int[] swapOfTwoNumber(int n1, int n2)
    {
        int temp = n1 + n2;
        n1 = temp - n1;
        n2 = temp - n2;
        return new int[]{n1, n2};
    }
}
