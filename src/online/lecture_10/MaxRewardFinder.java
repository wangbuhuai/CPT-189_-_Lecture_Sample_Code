// Created by Dayu Wang (dwang@stchas.edu) on 2022-04-20

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-05-06


package online.lecture_10;

public class MaxRewardFinder {
    public static void main(String[] args) throws Exception {
        int[][] grid = new int[][] {
                {5, 3, 20, 4},
                {9, 1,  2, 2},
                {0, 5, 11, 6},
                {4, 2,  8, 3}
        };
        System.out.println(Recursion.maxReward(grid));
    }
}