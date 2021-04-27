import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {
    private CustomCalculator customCalculator;

    //add test
    @Test
    public void addTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10, 10);

        assertTrue(result == 20);
        //assertFalse(result == 19);
    }

    @Test
    public void subTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(10,5);
        assertTrue(result == 5);
    }

}