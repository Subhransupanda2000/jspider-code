package com.example.jspiderjava;

public class ReverseString {
    public static void main(String[] args) {
        String string="hello";
        StringBuffer sb=new StringBuffer(string);
        sb.reverse();
        System.out.println(sb);

    }
}
