// Created by Dayu Wang (dwang@stchas.edu) on 2022-04-13

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-04-13


package evening.lecture_8;

public class GenericMethod {
    /** Prints a pair of values to the console.
        @param x1: first value to print
        @param x2: second value to print
        @param <T1>: any Object type
        @param <T2>: any Object type
    */
    public static <T1, T2> void printPair(T1 x1, T2 x2) {
        System.out.print('(');
        System.out.print(x1);
        System.out.print(", ");
        System.out.print(x2);
        System.out.println(')');
    }
}