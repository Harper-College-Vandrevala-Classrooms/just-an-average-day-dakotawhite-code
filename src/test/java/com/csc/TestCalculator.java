package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {

  Calculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new Calculator();
  }

  @Test
  void itWorks() {
    assertEquals(true, true);
  }

  @Test
    public void testMaximumUsingForLoop() {
        int[] nums = {1, 2, 3, 4, 5};
        int expected = 5;
        int actual = Calculator.maximumUsingForLoop(nums);
        assertEquals(expected, actual, "maximum value is 5.");
    }

    @Test
    public void testminUsingForLoop() {
        int[] nums = {1, 2, 3, 4, 5};
        int expected = 1;
        int actual = Calculator.minimumUsingForLoop(nums);
        assertEquals(expected, actual, "minimum value is 1.");
    }

    @Test
    public void testsumUsingForLoop() {
        int[] nums = {1, 2, 3, 4, 5};
        int expected = 15;
        int actual = Calculator.sumUsingForLoop(nums);
        assertEquals(expected, actual, "the sum is 15.");
    }

    @Test
    public void testavgUsingForLoop() {
        int[] nums = {1, 2, 3, 4, 5};
        double expected = 3.0;
        double actual = Calculator.averageUsingForLoop(nums);
        assertEquals(expected, actual, "the average is 3.0.");
    }

    @Test
    public void testmaxUsingStream() {
        int[] nums = {1, 2, 3, 4, 5};
        int expected = 5;
        int actual = Calculator.maximumUsingStream(nums);
        assertEquals(expected, actual, "maximum value is 5.");
    }

    @Test
    public void testminUsingStream() {
        int[] nums = {1, 2, 3, 4, 5};
        int expected = 1;
        int actual = Calculator.minimumUsingStream(nums);
        assertEquals(expected, actual, "minimum value is 1.");
    }

    @Test
    public void testsumUsingStream() {
        int[] nums = {1, 2, 3, 4, 5};
        int expected = 15;
        int actual = Calculator.sumUsingStream(nums);
        assertEquals(expected, actual, "the sum is 15.");
    }

    @Test
    public void testavgUsingStream() {
        int[] nums = {1, 2, 3, 4, 5};
        double expected = 3.0;
        double actual = Calculator.averageUsingStream(nums);
        assertEquals(expected, actual, "the average is 3.0.");
    }
}
