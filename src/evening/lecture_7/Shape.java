// Created by Dayu Wang (dwang@stchas.edu) on 2022-04-06

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-04-06


package evening.lecture_7;

public abstract class Shape {
    // Data fields
    private double x;  // x-coordinate of the center of the shape
    private double y;  // y-coordinate of the center of the shape

    // Getters

    public double getX() { return x; }

    public double getY() { return y; }

    // Setters

    public void setX(double x) { this.x = x; }

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