package com.example.dsa;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={1,3,8,5,9};
        int element=5;
        int result=findElement(arr,element);
        System.out.println(result);
    }
    public static int findElement(int[]arr,int element)
    {
        int result = 0;
        for (int i=0;i<= arr.length-1;i++)
        {
            if (element==arr[i])
            {
                result=i;
                return i;
            }
        }
        return result;
        
    }
}
