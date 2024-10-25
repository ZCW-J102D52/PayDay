package rocks.zipcode;

// USE JUNIT 5.  
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PayDayTest {
    @Test
    public void test1grossPay() {
        PayDay payDay1 = new PayDay();
        double actual = payDay1.grossPay(10.00, 10.0);
        assertEquals(100.00, actual, 0.001);
    }
    @Test
    public void test2grossPay() {
        PayDay payDay1 = new PayDay();
        double actual = payDay1.grossPay(2.00, 10.0);
        assertEquals(20.00, actual, 0.001);
    }
    @Test
    public void test1deductTax() {
        PayDay payDay1 = new PayDay();
        double actual = payDay1.deductTax(100.00, 0.25);
        assertEquals(25.00, actual, 0.001);
    }
    @Test
    public void test2deductTax() {
        PayDay payDay1 = new PayDay();
        double actual = payDay1.deductTax(50.00, 0.25);
        assertEquals(12.50, actual, 0.001);
    }

    @Test
    public void test1netPay() {
        PayDay payDay1 = new PayDay();
        double actual = payDay1.netPay(100.00, 25.00);
        assertEquals(75.00, actual, 0.001);
    }
    @Test
    public void test2netPay() {
        PayDay payDay1 = new PayDay();
        double actual = payDay1.netPay(50.00, 5.00);
        assertEquals(45.00, actual, 0.001);
    }

    @Test
    public void test1formatDollars() {
        PayDay payDay1 = new PayDay();
        String actual = payDay1.formatDollars(100);
        assertEquals("100.00", actual);
    }
    @Test
    public void test2formatDollars() {
        PayDay payDay1 = new PayDay();
        String actual = payDay1.formatDollars(0);
        assertEquals("0.00", actual);
    }

    @Test
    public void test1pay() {
        PayDay payDay1 = new PayDay();
        java.lang.String string1 = payDay1.pay("Kris", 21.5, 10.0, 0.05);
        assertEquals("Kris 215.00 10.75 204.25", string1);
    }
    @Test
    public void test2pay() {
        PayDay payDay1 = new PayDay();
        java.lang.String string1 = payDay1.pay("Dolio", 23.0, 15.0, 0.05);
        assertEquals("Dolio 345.00 17.25 327.75", string1);
    }
    @Test
    public void test3pay() {
        PayDay payDay1 = new PayDay();
        java.lang.String string1 = payDay1.pay("Karen", 22.0, 17.0, 0.05);
        assertEquals("Karen 374.00 18.70 355.30", string1);
    }
    @Test
    public void test14pay() {
        PayDay payDay1 = new PayDay();
        java.lang.String string1 = payDay1.pay("Kris", 23.6, 0.0, 0.05);
        assertEquals("Kris 0.00 0.00 0.00", string1);
    }
    @Test
    public void test5pay() {
        PayDay payDay1 = new PayDay();
        java.lang.String string1 = payDay1.pay("Dolio", 23.0, 0, 0.05);
        assertEquals("Dolio 0.00 0.00 0.00", string1);
    }
    @Test
    public void test6pay() {
        PayDay payDay1 = new PayDay();
        java.lang.String string1 = payDay1.pay("Karen", 22.0, 0, 0.05);
        assertEquals("Karen 0.00 0.00 0.00", string1);
    }
}
