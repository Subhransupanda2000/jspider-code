package org.example;

import com.example.jspiders2ndweek.MaxElementInArray;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestMaxElementInArray {
    @Test
    public void TestMaxElement() {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 22};
        int[] actual = MaxElementInArray.findMaxElement(arr);
        int[] expect = {22, 9};
        assertArrayEquals(expect, actual);
    }


}
