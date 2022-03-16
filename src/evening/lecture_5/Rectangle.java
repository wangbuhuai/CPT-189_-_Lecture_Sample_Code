// Created by Dayu Wang (dwang@stchas.edu) on 2022-03-16

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-03-16


package evening.lecture_5;

/** A geometric rectangle */
public class Rectangle {
    // Data fields
    private int width;  // Width of the rectangle
    private int height;  // Height of the rectangle

    // Constructors

    public Rectangle() {}  // Default constructor

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Getters

    public int getWidth() { return width; }

    public int getHeight() { return height; }

    // Setters

    public void setWidth(int width) { this.width = width; }

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
    public String toString() { return String.format("width = %d\nheight = %d", width, height); }

    /** Tests whether the current rectangle is smaller than another rectangle.
        @param other: a rectangle to compare with
        @return: {true} if the current rectangle has smaller area than the other one; {false} otherwise
    */
    public boolean isSmallerThan(Rectangle other) { return this.area() < other.area(); }
}