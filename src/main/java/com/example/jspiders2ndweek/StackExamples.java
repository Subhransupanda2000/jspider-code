package com.example.jspiders2ndweek;

public class StackExamples {
    public static void main(String[] args) {
        Stack stack=new Stack(10);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.pop();
        stack.isEmpty();
        stack.isFull();
    }
}
