package calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private static final Calculator CALCULATOR = new Calculator();

    @Test
    public void calculator_testEmptyString_returnZero() {
        Assert.assertEquals(0, CALCULATOR.add(""));
    }

    @Test
    public void calculator_testOnlyOneNumber_returnNumber() {
        Assert.assertEquals(1, CALCULATOR.add("1"));
    }

    @Test
    public void calculator_testTwoNumbersSeperatedByComma() {
        Assert.assertEquals(3, CALCULATOR.add("1,2"));
    }

    @Test
    public void calculator_testAddUnknownAmountOfNumbers() {
        Assert.assertEquals(6, CALCULATOR.add("1,2,3"));
    }

    @Test
    public void calculator_testAddWithNewlineSeperator() {
        Assert.assertEquals(6 ,CALCULATOR.add("1\n2,3"));
    }


    @Test
    public void calculator_testAddSupportDiffDelimiters() {
        Assert.assertEquals(6, CALCULATOR.add("//#\n1#2#3"));
    }

}