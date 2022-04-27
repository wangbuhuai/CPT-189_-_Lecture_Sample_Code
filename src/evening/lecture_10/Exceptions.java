// Created by Dayu Wang (dwang@stchas.edu) on 2021-12-11

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-04-27


package evening.lecture_10;

import java.util.ArrayList;

public class Exceptions {
    public static void main(String[] args) throws Exception {
        try {
            ArrayList<Double> list = new ArrayList<>();
            System.out.println(average(list));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /** Calculates the average of the values in an array list.
        @param list: an array list of float-point values
        @return: average of the values in the array list
        @throws Exception: array list is empty.
    */
    public static double average(ArrayList<Double> list) throws Exception {
        // If the list is empty, we "generate" an exception for the error.
        if (list.isEmpty()) { throw new Exception("Accessing empty list"); }
        // Otherwise, calculate and return the average.
        double sum = 0;
        for (double value : list) { sum += value; }
        return sum / list.size();
    }
}