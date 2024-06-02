package com.example.jspiderjava;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MyThread extends Thread {
    static ConcurrentHashMap ch = new ConcurrentHashMap<>();

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        System.out.println("child thread updating");
        ch.putIfAbsent(1, "john");
    }


    public static void main(String[] args) throws InterruptedException {
        ch.putIfAbsent(2, "max");
        MyThread t1 = new MyThread();
        t1.start();
        Set s = ch.keySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            Integer i1 = (Integer) itr.next();
            System.out.println("main thread iterating");
            Thread.sleep(3000);
        }
        ch.putIfAbsent(3, "sm");
        System.out.println(ch);
    }
}
