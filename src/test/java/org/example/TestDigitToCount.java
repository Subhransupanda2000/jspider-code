package org.example;
import com.example.jspiderjava.CountOcuurance;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestDigitToCount {
    @Test
    public void testDigitTocount() {
        int n = 112233;
        int ouccerance=1;
        int actual= CountOcuurance.count(n,ouccerance);
        int expected=2 ;
        assertEquals(expected,actual);
    }
}

