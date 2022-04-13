// Created by Dayu Wang (dwang@stchas.edu) on 2022-04-13

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-04-13


package evening.lecture_8;

public interface ItemComparator<T> {
    /** Compares two objects
        @param obj1: first object to compare
        @param obj2: second object to compare
        @return: a negative integer if the first object is smaller than the second object;
                 a positive integer if the first object is greater than the second object;
                 {0} if the two objects are equal
    */
    int compare(T obj1, T obj2);
}