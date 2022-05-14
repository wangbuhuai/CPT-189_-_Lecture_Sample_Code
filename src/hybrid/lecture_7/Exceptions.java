// Created by Dayu Wang (dwang@stchas.edu) on 2022-05-13

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-05-13


package hybrid.lecture_7;

import java.util.ArrayList;

public class Exceptions {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(2.5);
        list.add(7.5);
        try {
            double avg = average(list);
            System.out.printf("Average: %.2f\n", avg);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /** Calculates the average of the values in an array list.
        @param li: an array list to calculate the average
        @return: calculated average
        @throws IllegalArgumentException: array list is empty.
    */
    private static double average(ArrayList<Double> li) {
        if (li.isEmpty()) { throw new IllegalArgumentException("Accessing empty list"); }
        double sum = 0;
        for (double val : li) { sum += val; }
        return sum / li.size();
    }
}