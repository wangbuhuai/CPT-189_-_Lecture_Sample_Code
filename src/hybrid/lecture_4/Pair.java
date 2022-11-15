// Created by Dayu Wang (dwang@stchas.edu) on 2021-04-17

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-11-10


package hybrid.lecture_4;

/** A pair of an integer and a string */
public class Pair {
    // Data fields
    private int first;  // Stores the integer (first value) in the pair
    private String second;  // Stores the string (second value) in the pair
    
    // Constructors
    
    public Pair() { second = ""; }  // Default constructor
    
    public Pair(int first, String second) {
        setFirst(first);
        setSecond(second);
    }
    
    // Getters

    /** Returns the first value (integer) in the pair.
        @return: first value (integer) in the pair
    */
    public int getFirst() { return first; }

    /** Returns the second value (string) in the pair.
        @return: second value (string) in the pair
    */
    public String getSecond() { return second; }
    
    // Setters

    /** Updates the first value (integer) in the pair.
        @param first: updated first value (integer) in the pair
    */
    public void setFirst(int first) { this.first = first; }

    /** Updates the second value (string) in the pair.
        @param second: updated second value (string) in the pair
    */
    public void setSecond(String second) { this.second = second; }
    
    // Methods

    /** Customizes the output format of the pair.
        @return: a string representing the output format of the pair
    */
    @Override
    public String toString() { return String.format("(%d, %s)", first, second); }
    
    /** Creates a Pair object from an integer and a string.
        @param first: first value (integer) in the pair
        @param second: second value (string) in the pair
        @return: a Pair object formed by the first and second values
    */
    public static Pair makePair(int first, String second) { return new Pair(first, second); }
}