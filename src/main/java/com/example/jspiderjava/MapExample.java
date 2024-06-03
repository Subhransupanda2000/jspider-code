package com.example.jspiderjava;

import java.util.concurrent.ConcurrentHashMap;

public class MapExample {
    public static void main(String[] args) {
        ConcurrentHashMap ch=new ConcurrentHashMap<>();
        ch.putIfAbsent(1,"john");
        ch.putIfAbsent(2,"max");
        ch.putIfAbsent(3,"smith");
        ch.putIfAbsent(3,"cummins");
        ch.remove(3,"cummins");
        System.out.println(ch);
        ch.replace(3,"smith","cummins");
        System.out.println(ch);

    }
}
