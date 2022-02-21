// Created by Dayu Wang (dwang@stchas.edu) on 2022-02-20

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-02-20


package evening.lecture_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) throws IOException {
        // Open the input and output files.
        FileInputStream inputFile = new FileInputStream("./src/evening/lecture_2/rectangles.txt");
        Scanner scanner = new Scanner(inputFile);
        FileOutputStream outputFile = new FileOutputStream("./src/evening/lecture_2/areas.txt");
        PrintWriter writer = new PrintWriter(outputFile);

        // Parse each rectangle in the input file.
        while (scanner.hasNextInt()) {
            // Read the width and height of the next rectangle.
            int width = scanner.nextInt(), height = scanner.nextInt();

            // Calculate the area of the rectangle.
            int area = width * height;

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