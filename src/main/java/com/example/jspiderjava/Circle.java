package com.example.jspiderjava;

public class Circle {
    public static void main(String[] args) {
        int radious = 5;
        int diameter = diameterOfCircle(radious);
        System.out.println(diameter);
        double circumferenceOfCircle = circumferenceOfCircle(radious);
        System.out.println(circumferenceOfCircle);
    }

    public static int diameterOfCircle(int radious) {
        int result = 2 * radious;
        return result;
    }

    public static double circumferenceOfCircle(int radious) {
        double result = 2 * Math.PI * radious;
        return result;
    }
}
