// Created by Dayu Wang (dwang@stchas.edu) on 2022-04-20

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-04-20


package evening.lecture_9;

public class Recursion {
    /** Calculates {x} ^ {y}.
        @param x: base
        @param y: exponent
        @return: result of {x} ^ {y}
    */
    public static int power(int x, int y) {
        if (y == 0) { return 1; }  // Base case
        return power(x, y - 1) * x;  // Recurrence relation
    }

    /** Finds the index of a target value in a segment of an array.
        @param arr: a sorted array
        @param target: target value to search in the array
        @param start: beginning index (inclusive) of the segment
        @param end: end index (inclusive) of the segment
        @return: index of the target value in the array; or {-1} if target value does not appear in the array
    */
    private static int search(int[] arr, int target, int start, int end) {
        if (start > end) { return -1; }  // Base case
        int mid = (start + end) / 2;
        if (target < arr[mid]) {
            return search(arr, target, start, mid - 1);
        } else if (target > arr[mid]) {
            return search(arr, target, mid + 1, end);
        } else { return mid; }
    }

    // Wrapper method
    public static int search(int[] arr, int target) {
        return search(arr, target, 0, arr.length - 1);
    }

    /** Finds the n-th Fibonacci number.
        @param n: index in the Fibonacci sequence
        @return: n-th element in the Fibonacci sequence
    */
    public static int fib(int n) {
        if (n <= 1) { return n; }
        return fib(n - 2) + fib(n - 1);
    }

    /** Finds the maximum reward in a square grid.
        @param grid: a square grid containing a reward (non-negative integer) in each cell.
        @param i: row index of the cell to end the game
        @param j: column index of the cell to end the game
        @return: calculated maximum reward
    */
    private static int maxReward(int[][] grid, int i, int j) {
        if (i == 0 && j == 0) { return grid[i][j]; }  // Base case
        if (i == 0) { return maxReward(grid, i, j - 1) + grid[i][j]; }
        if (j == 0) { return maxReward(grid, i - 1, j) + grid[i][j]; }
        return Math.max(maxReward(grid, i - 1, j), maxReward(grid, i, j - 1)) + grid[i][j];
    }

    // Wrapper method
    public static int maxReward(int[][] grid) {
        return maxReward(grid, grid.length - 1, grid.length - 1);
    }
}