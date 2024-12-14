package com.csc;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Calculator {

    public static int maximumUsingForLoop(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int minimumUsingForLoop(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int sumUsingForLoop(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static double averageUsingForLoop(int[] nums) {
        return (double) sumUsingForLoop(nums) / nums.length;
    }

    public static int maximumUsingStream(int[] nums) {
        return java.util.Arrays.stream(nums).max().getAsInt();
      }
    
      public static int minimumUsingStream(int[] nums) {
        return java.util.Arrays.stream(nums).min().getAsInt();
      }
    
      public static int sumUsingStream(int[] nums) {
        return java.util.Arrays.stream(nums).sum();
      }
    
      public static double averageUsingStream(int[] nums) {
        return java.util.Arrays.stream(nums).average().getAsDouble();
      }

      public static int[] evensonly(int[] nums) {
        return IntStream.of(nums).filter(num -> num % 2 == 0).toArray();
      }

      public static int[] oddsonly(int[] nums) {
        return IntStream.of(nums).filter(num -> num % 2 != 0).toArray();
      }

      public static int[] incrementfive(int[] nums) {
        return IntStream.of(nums).map(num -> num + 5).toArray();
    }

    public static int[] incrementsquared(int[] nums) {
        return IntStream.of(nums).map(num -> num*num).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        System.out.println("Using For Loop:");
        System.out.println("Maximum: " + maximumUsingForLoop(nums));
        System.out.println("Minimum: " + minimumUsingForLoop(nums));
        System.out.println("Sum: " + sumUsingForLoop(nums));
        System.out.println("Average: " + averageUsingForLoop(nums));

        System.out.println("\nUsing Stream API:");
        System.out.println("Maximum: " + maximumUsingStream(nums));
        System.out.println("Minimum: " + minimumUsingStream(nums));
        System.out.println("Sum: " + sumUsingStream(nums));
        System.out.println("Average: " + averageUsingStream(nums));

        int[] filtereeven = evensonly(nums);
        System.out.println("Filtered Even Numbers: " + java.util.Arrays.toString(filtereeven));
        int[] filterodd = oddsonly(nums);
        System.out.println("Filtered Odd Numbers: " + java.util.Arrays.toString(filterodd));
        int[] five = incrementfive(nums);
        System.out.println("Incremented Numbers: " + Arrays.toString(five));
        int[] squared = incrementsquared(nums);
        System.out.println("Incremented Numbers: " + Arrays.toString(squared));
    }
}
