package org.example;
import com.example.jspiderjava.ArmstrongNumber;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestArmstrongNumber {
     @Test
        public void testArmstrongNumber() {
            int n = 153;
            int actual= ArmstrongNumber.armstrongNumber(n);
            int expected=153 ;
            assertEquals(expected,actual);
        }
    }



