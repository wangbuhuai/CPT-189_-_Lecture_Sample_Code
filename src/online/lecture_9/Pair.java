// Created by Dayu Wang (dwang@stchas.edu) on 2022-04-13

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-05-06


package online.lecture_9;

public class Pair<T1 extends ComparableType<T1>, T2 extends ComparableType<T2>> implements ComparableType<Pair<T1, T2>> {
    // Data fields
    private T1 first;  // First value in the pair
    private T2 second;  // Second value in the pair

    // Constructors

    public Pair() {}  // Default constructor

    public Pair(T1 first, T2 second) {
        setFirst(first);
        setSecond(second);
    }

    public Pair(Pair<T1, T2> other) {  // Copy constructor
        setFirst(other.first);
        setSecond(other.second);
    }

    // Getters

    /** Returns the first value in the pair.
        @return: first value in the pair
    */
    public T1 getFirst() { return first; }

    /** Returns the second value in the pair.
        @return: second value in the pair
    */
    public T2 getSecond() { return second; }

    // Setters

    /** Updates the first value in the pair.
        @param first: updated first value in the pair
    */
    public void setFirst(T1 first) { this.first = first; }

    /** Updates the second value in the pair.
        @param second: updated second value in the pair
    */
    public void setSecond(T2 second) { this.second = second; }

    // Methods

    /** Customizes the output format of the pair.
        @return: a string representing the output format of the pair
    */
    @Override
    public String toString() { return String.format("(%s, %s)", first, second); }

    /** Compares this pair with another pair.
        @param other: another pair to compare with
        @return: a negative integer if this pair is smaller than the other pair;
                 a positive integer if this pair is greater than the other pair;
                 {0} if the two pairs are equal
    */
    @Override
    public int compareTo(Pair<T1, T2> other) {
        if (first.compareTo(other.first) < 0) { return -1; }
        else if (first.compareTo(other.first) > 0) { return 1; }
        else { return second.compareTo(other.second); }
    }

    /** Compares this pair with another pair using user-specified compare method.
        @param other: another pair to compare with
        @param compare: a comparator that specifies the compare method
        @return: a negative integer if this pair is smaller than the other pair;
                 a positive integer if this pair is greater than the other pair;
                 {0} if the two pairs are equal
    */
    @Override
    public int compareTo(Pair<T1, T2> other, ItemComparator<Pair<T1, T2>> compare) {
        return compare.compare(this, other);
    }
}