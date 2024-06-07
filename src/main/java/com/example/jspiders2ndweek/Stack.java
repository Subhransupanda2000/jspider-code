package com.example.jspiders2ndweek;

class StackEmptyException extends RuntimeException {
    public StackEmptyException(String message) {
        super(message);
    }

    public StackEmptyException() {
        super();
    }
}

class StackFullException extends RuntimeException {
    public StackFullException(String message) {
        super(message);
    }

    public StackFullException() {
        super();
    }
}


public class Stack {
    int size;
    int[] stackAr;
    int top;

    public Stack(int size) {
        this.size = size;
        stackAr = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            throw new StackFullException("stack is full");
        }
        stackAr[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new StackEmptyException("stack is empty");
        }
        return stackAr[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return top == size - 1;
    }
}
