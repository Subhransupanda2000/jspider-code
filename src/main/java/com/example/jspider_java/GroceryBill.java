package com.example.jspider_java;

public class GroceryBill {
    public static void main(String[] args) {
        int totalAmount=1000;
        double discountPercentage=25;
        double finalBill=totalAmount-(discountPercentage/100*totalAmount);
        System.out.println(finalBill);
    }
}
