// Created by Dayu Wang (dwang@stchas.edu) on 2022-04-30

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-10-20


package online.lecture_8;

public abstract class Shape {
    // Data fields
    private double x;  // Stores the x-coordinate of the center of the shape.
    private double y;  // Stores the y-coordinate of the center of the shape.

    // Getters

    /** Returns the x-coordinate of the center of the shape.
        @return: x-coordinate of the center of the shape
    */
    public double getX() { return x; }

    /** Returns the y-coordinate of the center of the shape.
        @return: y-coordinate of the center of the shape
    */
    public double getY() { return y; }

    // Setters

    /** Updates the x-coordinate of the center of the shape.
        @param x: updated x-coordinate of the center of the shape
    */
    public void setX(double x) { this.x = x; }

    /** Updates the y-coordinate of the center of the shape.
        @param y: updated y-coordinate of the center of the shape
    */
    public void setY(double y) { this.y = y; }

    // Methods

    /** Calculates the area of the shape.
        @return: calculated area of the shape
    */
    public abstract double area();

    /** Calculates the perimeter of the shape.
        @return: calculated perimeter of the shape
    */
    public abstract double perimeter();
}