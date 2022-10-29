// Created by Dayu Wang (dwang@stchas.edu) on 2021-03-26

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-10-28


package hybrid.lecture_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) throws IOException {
        // Open input and output file.
        FileInputStream inputFile = new FileInputStream("src/hybrid/lecture_2/inputFiles/rectangles.txt");
        Scanner scanner = new Scanner(inputFile);
        FileOutputStream outputFile = new FileOutputStream("src/hybrid/lecture_2/outputFiles/areas.txt");
        PrintWriter writer = new PrintWriter(outputFile);

        // Read the rectangles one-by-one from the input file.
        while (scanner.hasNextInt()) {
            // Read the width and height of the next rectangle.
            int width = scanner.nextInt(), height = scanner.nextInt();
            // Calculate the area of the rectangle.
            int area = width * height;
            // Write the area to the output file.
            writer.println(area);
        }

        // Close the input and output file.
        writer.close();
        outputFile.close();
        scanner.close();
        inputFile.close();
    }
}