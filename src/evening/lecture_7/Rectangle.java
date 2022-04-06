// Created by Dayu Wang (dwang@stchas.edu) on 2022-04-06

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-04-06


package evening.lecture_7;

public class Rectangle extends Shape {
    // Data fields
    private double width;  // Width of the rectangle
    private double height;  // Height of the rectangle

    // Constructors

    public Rectangle() {}  // Default constructor

    public Rectangle(double x, double y, double width, double height) {
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
    }

    // Getters

    public double getWidth() { return width; }

    public double getHeight() { return height; }

    // Setters

    public void setWidth(double width) { this.width = width; }

    public void setHeight(double height) { this.height = height; }

    // Methods

    @Override
    public double area() { return getWidth() * getHeight(); }

    @Override
    public double perimeter() { return 2 * (getWidth() + getHeight()); }
}