// Created by Dayu Wang (dwang@stchas.edu) on 2022-03-16

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-03-16


package evening.lecture_5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RectangleAreaCalculator {
    public static void main(String[] args) throws IOException {
        // Open the input and output files.
        FileInputStream inputFile = new FileInputStream("./src/evening/lecture_5/input_files/rectangles.txt");
        Scanner scanner = new Scanner(inputFile);
        FileOutputStream outputFile = new FileOutputStream("./src/evening/lecture_5/output_files/areas.txt");
        PrintWriter writer = new PrintWriter(outputFile);

        // Read in the rectangles stored in the input file one-by-one.
        while (scanner.hasNextInt()) {
            // Read in the width and height of the rectangle.
            int width = scanner.nextInt(), height = scanner.nextInt();

            // Create a rectangle based on the width and height read in.
            Rectangle rect = new Rectangle(width, height);

            // Calculate the area of the rectangle.
            int area = rect.area();

            // Write the calculated area to the output file.
            writer.println(area);
        }

        // Close the input and output files.
        writer.close();
        outputFile.close();
        scanner.close();
        inputFile.close();
    }
}