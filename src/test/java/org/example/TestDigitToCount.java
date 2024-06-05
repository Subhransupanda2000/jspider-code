package org.example;
import com.example.jspiderjava.DigitToCount;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
public class TestDigitToCount {
    @Test
    public void testDigitTocount() {
        int n = 10;
        int actual=DigitToCount.digitToCount(n);
        int expected=3 ;
        assertEquals(expected,actual);
    }
}

