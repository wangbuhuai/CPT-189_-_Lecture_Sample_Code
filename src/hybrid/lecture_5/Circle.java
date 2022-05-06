// Created by Dayu Wang (dwang@stchas.edu) on 2022-04-30

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-05-06


package hybrid.lecture_5;

public class Circle extends Shape {
    // Data field
    private double radius;  // Stores the radius of the circle.

    // Constructor

    public Circle() {}  // Default constructor

    public Circle(double x, double y, double radius) {
        setX(x);
        setY(y);
        setRadius(radius);
    }

    // Getter

    /** Returns the radius of the circle.
        @return: radius of the circle
    */
    public double getRadius() { return radius; }

    // Setter

    /** Updates the radius of the circle.
        @param radius: updated radius of the circle
    */
    public void setRadius(double radius) { this.radius = radius; }

    // Methods

    /** Calculates the area of the circle.
        @return: calculated area of the circle
    */
    @Override
    public double area() { return Math.PI * Math.pow(getRadius(), 2); }

    /** Calculates the perimeter of the circle.
        @return: calculated perimeter of the circle
    */
    @Override
    public double perimeter() { return 2 * Math.PI * getRadius(); }
}