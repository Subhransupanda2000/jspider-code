package org.example;

import com.example.dsa.BubbleSort;
import com.example.dsa.SelectionSort;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestSelectionTest {
    @Test
    public void testArray() {
        int[] arr = {1, 2, 7, 3, 8,};
        int[] expected = {1, 2, 3, 7, 8};
        int[] actual = SelectionSort.sortedarray(arr);
        assertArrayEquals(expected, actual);
    }
}
