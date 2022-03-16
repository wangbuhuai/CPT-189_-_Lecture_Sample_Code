// Created by Dayu Wang (dwang@stchas.edu) on 2022-03-16

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-03-16


package evening.lecture_5;

public class IntegerStringPair {
    // Data fields
    private int first;  // First value in the pair
    private String second;  // Second value in the pair

    // Constructors

    public IntegerStringPair() { second = ""; }  // Default constructor

    public IntegerStringPair(int first, String second) {
        this.first = first;
        this.second = second;
    }

    // Getters

    public int getFirst() { return first; }

    public String getSecond() { return second; }

    // Setters

    public void setFirst(int first) { this.first = first; }

    public void setSecond(String second) { this.second = second; }

    // Methods

    /** Customizes the output format of the pair.
        @return: a string representing the output format of the pair
    */
    @Override
    public String toString() { return String.format("(%d, %s)", first, second); }

    /** Creates a pair by grouping an integer and a string.
        @param first: integer in the pair
        @param second: string in the pair
        @return: a pair formed by grouping the first and second value
    */
    public static IntegerStringPair makePair(int first, String second) { return new IntegerStringPair(first, second); }
}