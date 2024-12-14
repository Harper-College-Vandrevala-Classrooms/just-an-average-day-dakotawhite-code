package com.csc;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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
        assertEquals(expected, actual, "Maximum value is 5.");
    }

    @Test
    public void testMinimumUsingForLoop() {
        int[] nums = {1, 2, 3, 4, 5};
        int expected = 1;
        int actual = Calculator.minimumUsingForLoop(nums);
        assertEquals(expected, actual, "Minimum value is 1.");
    }

    @Test
    public void testSumUsingForLoop() {
        int[] nums = {1, 2, 3, 4, 5};
        int expected = 15;
        int actual = Calculator.sumUsingForLoop(nums);
        assertEquals(expected, actual, "The sum is 15.");
    }

    @Test
    public void testAverageUsingForLoop() {
        int[] nums = {1, 2, 3, 4, 5};
        double expected = 3.0;
        double actual = Calculator.averageUsingForLoop(nums);
        assertEquals(expected, actual, 0.0001, "The average is 3.0."); // Using a delta for floating-point comparisons
    }

    @Test
    public void testMaximumUsingStream() {
        int[] nums = {1, 2, 3, 4, 5};
        int expected = 5;
        int actual = Calculator.maximumUsingStream(nums);
        assertEquals(expected, actual, "Maximum value is 5.");
    }

    @Test
    public void testMinimumUsingStream() {
        int[] nums = {1, 2, 3, 4, 5};
        int expected = 1;
        int actual = Calculator.minimumUsingStream(nums);
        assertEquals(expected, actual, "Minimum value is 1.");
    }

    @Test
    public void testSumUsingStream() {
        int[] nums = {1, 2, 3, 4, 5};
        int expected = 15;
        int actual = Calculator.sumUsingStream(nums);
        assertEquals(expected, actual, "The sum is 15.");
    }

    @Test
    public void testAverageUsingStream() {
        int[] nums = {1, 2, 3, 4, 5};
        double expected = 3.0;
        double actual = Calculator.averageUsingStream(nums);
        assertEquals(expected, actual, 0.0001, "The average is 3.0.");
    }

    @Test
    public void testEvensOnly() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {2, 4};
        int[] result = Calculator.evensonly(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testOddsOnly() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 3, 5};
        int[] result = Calculator.oddsonly(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testIncrementFive() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {6, 7, 8, 9, 10};
        int[] result = Calculator.incrementfive(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testIncrementSquared() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 4, 9, 16, 25};
        int[] result = Calculator.incrementsquared(input);
        assertArrayEquals(expected, result);
    }
}
