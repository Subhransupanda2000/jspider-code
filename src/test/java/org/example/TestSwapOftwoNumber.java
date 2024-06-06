package org.example;

import com.example.jspiderjava.ArmstrongNumber;
import com.example.jspiderjava.SwapOfTwoNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSwapOftwoNumber {
    @Test
    public void testSwapOfTwoNumber() {
        int[] result = SwapOfTwoNumber.swapOfTwoNumber(1, 2);
        assertEquals(2, result[0]);
        assertEquals(1, result[1]);
    }
    }

