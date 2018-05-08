package calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private static final Calculator CALCULATOR = new Calculator();

    @Test
    public void calculator_testEmptyString_returnZero() {
        Assert.assertEquals(CALCULATOR.add(""), 0);
    }

}