// Created by Dayu Wang (dwang@stchas.edu) on 2022-04-30

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-05-06


package hybrid.lecture_5;

public class Cube implements GeometricSolid {
    // Data field
    private double edgeLength;  // Stores the edge length of the cube.

    // Constructors

    public Cube() {}  // Default constructor

    public Cube(double edgeLength) { setEdgeLength(edgeLength); }

    // Getter

    /** Returns the edge length of the cube.
        @return: edge length of the cube
    */
    public double getEdgeLength() { return edgeLength; }

    // Setter

    /** Updates the edge length of the cube.
        @param edgeLength: updated edge length of the cube
    */
    public void setEdgeLength(double edgeLength) { this.edgeLength = edgeLength; }

    // Methods

    /** Calculates the volume of the cube.
        @return: calculated volume of the cube
    */
    @Override
    public double volume() { return Math.pow(getEdgeLength(), 3); }

    /** Calculates the surface area of the cube.
        @return: calculated surface area of the cube
    */
    @Override
    public double surfaceArea() { return 6 * Math.pow(getEdgeLength(), 2); }
}