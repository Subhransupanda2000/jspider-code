package com.example.jspiderjava;

public class AreaOfCircle {
    public static void main(String[] args) {
        double radious = 5;
        double result = areaOfcircle(radious);
        System.out.println(result);
    }

    public static double areaOfcircle(double radious) {
        double result = Math.PI * radious * radious;
        return result;
    }
}
