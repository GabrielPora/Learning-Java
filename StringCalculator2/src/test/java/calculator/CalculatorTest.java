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

    @Test
    public void calculator_testOnlyOneNumber_returnNumber() {
        Assert.assertEquals(CALCULATOR.add("1"), 1);
    }

    @Test
    public void calculator_testTwoNumbersSeperatedByComma() {
        Assert.assertEquals(CALCULATOR.add("1,2"), 3);
    }

    @Test
    public void calculator_testAddUnknownAmountOfNumbers() {
        Assert.assertEquals(CALCULATOR.add("1,2,3"), 6);
    }

    @Test
    public void calculator_testAddWithNewlineSeperator() {
        Assert.assertEquals(CALCULATOR.add("1\n2,3"), 6);
    }

}