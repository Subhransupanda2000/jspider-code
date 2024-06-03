package com.example.jspiderjava;

public class LeapYear {
    public static void main(String[] args) {
        int leapYear = 2000;
        if ((leapYear % 400 == 0 )|| (leapYear % 100 != 0 && leapYear % 4 == 0 )){
            System.out.println("Yes bro, this is a leap year");
        } else {
            System.out.println("Sorry bro!! this is not a leap year");
        }
    }
}
