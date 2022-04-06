// Created by Dayu Wang (dwang@stchas.edu) on 2022-04-06

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-04-06


package evening.lecture_7;

public class Sphere implements GeometricSolid {
    // Data field
    private double radius;  // Radius of the sphere

    // Constructors

    public Sphere() {}  // Default constructor

    public Sphere(double radius) { setRadius(radius); }

    // Getter

    public double getRadius() { return radius; }

    // Setter

    public void setRadius(double radius) { this.radius = radius; }

    // Methods

    @Override
    public double volume() { return (4.0 / 3) * Math.PI * Math.pow(getRadius(), 3); }

    @Override
    public double surfaceArea() { return 4 * Math.PI * Math.pow(getRadius(), 2); }
}