// Created by Dayu Wang (dwang@stchas.edu) on 2022-04-13

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-05-06


package hybrid.lecture_6;

public interface ComparableType<T> {
    /** Compares this object with another object.
        @param other: another object to compare with this object
        @return: a negative integer if this object is smaller;
                 a positive integer if this object is greater;
                 {0} if the two objects are equal
    */
    int compareTo(T other);

    /** Compares this object with another object using user-specified compare method.
        @param other: another object to compare with this object
        @param compare: a comparator that specifies the compare method
        @return: a negative integer if this object is smaller;
                 a positive integer if this object is greater;
                 {0} if the two objects are equal
    */
    int compareTo(T other, ItemComparator<T> compare);
}