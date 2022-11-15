// Created by Dayu Wang (dwang@stchas.edu) on 2021-04-17

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-11-10


package hybrid.lecture_4;

/** A geometric rectangle */
public class Rectangle {
    // Data fields
    private int width;  // Stores the width of the rectangle.
    private int height;  // Stores the height of the rectangle.

    // Constructors

    public Rectangle() {}  // Default constructor

    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    // Getters

    /** Returns the width of the rectangle.
        @return: width of the rectangle
    */
    public int getWidth() { return width; }

    /** Returns the height of the rectangle.
        @return: height of the rectangle
    */
    public int getHeight() { return height; }

    // Setters

    /** Updates the width of the rectangle.
        @param width: updated width of the rectangle
    */
    public void setWidth(int width) { this.width = width; }

    /** Updates the height of the rectangle.
        @param height: updated height of the rectangle
    */
    public void setHeight(int height) { this.height = height; }

    // Methods

    /** Calculates the area of the rectangle.
        @return: calculated area of the rectangle
    */
    public int area() { return width * height; }

    /** Calculates the perimeter of the rectangle.
        @return: calculated perimeter of the rectangle
    */
    public int perimeter() { return 2 * (width + height); }

    /** Customizes the output format of the rectangle.
        @return: a string representing the output format of the rectangle
    */
    @Override
    public String toString() { return String.format("{width: %d, height: %d}", width, height); }

    /** Tests whether this rectangle is smaller than another rectangle.
        @param other: another rectangle to compare with this rectangle
        @return: {true} if this rectangle has smaller area than the other rectangle; {false} otherwise
    */
    public boolean isSmallerThan(Rectangle other) { return this.area() < other.area(); }
}