// Created by Dayu Wang (dwang@stchas.edu) on 2022-04-06

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-04-06


package evening.lecture_7;

public class Cube implements GeometricSolid {
    // Data field
    private double edgeLength;  // Edge length of the cube

    // Constructors

    public Cube() {}  // Default constructor

    public Cube(double edgeLength) { setEdgeLength(edgeLength); }

    // Getter

    public double getEdgeLength() { return edgeLength; }

    // Setter

    public void setEdgeLength(double edgeLength) { this.edgeLength = edgeLength; }

    // Methods

    @Override
    public double volume() { return Math.pow(getEdgeLength(), 3); }

    @Override
    public double surfaceArea() { return 6 * Math.pow(getEdgeLength(), 2); }
}