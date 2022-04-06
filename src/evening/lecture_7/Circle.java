// Created by Dayu Wang (dwang@stchas.edu) on 2022-04-06

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-04-06


package evening.lecture_7;

public class Circle extends Shape {
    // Data fields
    private double radius;  // Radius of the circle

    // Constructors

    public Circle() {}  // Default constructor

    public Circle(double x, double y, double radius) {
        setX(x);
        setY(y);
        setRadius(radius);
    }

    // Getter

    public double getRadius() { return radius; }

    // Setter

    public void setRadius(double radius) { this.radius = radius; }

    // Methods

    @Override
    public double area() { return Math.PI * Math.pow(getRadius(), 2); }

    @Override
    public double perimeter() { return 2 * Math.PI * getRadius(); }
}