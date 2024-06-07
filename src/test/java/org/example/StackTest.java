package org.example;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

class StackTest {

    @Test
    void testPushAndPop() {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertEquals(30, stack.pop());
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
    }
}

