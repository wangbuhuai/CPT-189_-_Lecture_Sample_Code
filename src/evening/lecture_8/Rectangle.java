// Created by Dayu Wang (dwang@stchas.edu) on 2022-04-13

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-04-13


package evening.lecture_8;

public class Rectangle implements ComparableType<Rectangle> {
    // Data fields
    private int width;  // Width of the rectangle
    private int height;  // Height of the rectangle

    // Constructors

    public Rectangle() {}  // Default constructor

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle other) {  // Copy constructor
        width = other.width;
        height = other.height;
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

    /** Compares the size of this rectangle with another rectangle.
        @param other: another rectangle to compare with
        @return: a negative integer if this rectangle has smaller area than the other rectangle;
                 a positive integer if this rectangle has greater area than the other rectangle;
                 {0} if this rectangle has the same area as the other rectangle
    */
    @Override
    public int compareTo(Rectangle other) { return area() - other.area(); }

    /** Compares the size of this rectangle with another rectangle using user-specified compare method.
        @param other: another rectangle to compare with
        @param compare: a comparator that specifies the compare method
        @return: a negative integer if this rectangle has smaller area than the other rectangle;
                 a positive integer if this rectangle has greater area than the other rectangle;
                 {0} if this rectangle has the same area as the other rectangle
    */
    @Override
    public int compareTo(Rectangle other, ItemComparator<Rectangle> compare) { return compare.compare(this, other); }
}