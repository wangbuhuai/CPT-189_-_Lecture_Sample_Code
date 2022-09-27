// Created by Dayu Wang (dwang@stchas.edu) on 2022-09-27

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-09-27


package online.lecture_5;

import java.util.Scanner;

public class TwoDimensionalArrays {
    /** Finds the maximum value in a 2-dimensional array of integers.
        @param arr: a non-empty 2-dimensional array of integers
        @return: maximum value in the 2-dimensional array
    */
    public static int maxValue(int[][] arr) {
        int maxVal = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) { maxVal = Math.max(maxVal, arr[row][col]); }
        }
        return maxVal;
    }

    /** Finds the maximum and second maximum values in a 2-dimensional array of integers.
        @param arr: a non-empty 2-dimensional array of integers that has at least two elements
        @return: an array containing the maximum and second maximum value (in that order) in the 2-dimensional array
    */
    public static int[] maxMax(int[][] arr) {
        int maxVal = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > maxVal) {
                    // Old maxVal is now the secondMax.
                    secondMax = maxVal;
                    // Update the maxVal.
                    maxVal = arr[row][col];
                } else if (arr[row][col] > secondMax) { secondMax = arr[row][col]; }
            }
        }
        return new int[] { maxVal, secondMax };
    }

    /** Finds the maximum and strict second maximum values in a 2-dimensional array of integers.
        @param arr: a non-empty 2-dimensional array of integers that has at least two elements with distinct values.
        @return: an array containing the max and strict second max value (in that order) in the 2-dimensional array
    */
    public static int[] maxStrictMax(int[][] arr) {
        int maxVal = Integer.MIN_VALUE, strictSecondMax = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > maxVal) {
                    // Old maxVal is now the strictSecondMax.
                    strictSecondMax = maxVal;
                    // Update the maxVal.
                    maxVal = arr[row][col];
                } else if (arr[row][col] == maxVal) { continue; }
                else if (arr[row][col] > strictSecondMax) { strictSecondMax = arr[row][col]; }
            }
        }
        return new int[] { maxVal, strictSecondMax };
    }

    /** Reads data from a scanner and save to a 2-dimensional array in row-major order.
        @param scanner: a scanner that is guaranteed to have sufficient data
        @param arr: a 2-dimensional array to save the data read from the scanner in row-major order
    */
    public static void loadData(Scanner scanner, int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) { arr[row][col] = scanner.nextInt(); }
        }
    }
}