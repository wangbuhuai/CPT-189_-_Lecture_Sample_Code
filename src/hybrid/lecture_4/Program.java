// Created by Dayu Wang (dwang@stchas.edu) on 2021-04-17

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-11-10


package hybrid.lecture_4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        // Open the input and output file.
        FileInputStream inputFile = new FileInputStream("src/hybrid/lecture_4/inputFile/rectangles.txt");
        Scanner scanner = new Scanner(inputFile);
        FileOutputStream outputFile = new FileOutputStream("src/hybrid/lecture_4/outputFile/areas.txt");
        PrintWriter writer = new PrintWriter(outputFile);
        
        // Read in the rectangles stored in the input file one-by-one.
        while (scanner.hasNextInt()) {
            int width = scanner.nextInt();  // Read the width of the rectangle.
            int height = scanner.nextInt();  // Read the height of the rectangle.

            // Create a Rectangle object using the width and height read in.
            Rectangle rect = new Rectangle(width, height);

            // Write the area of the rectangle to the output file.
            writer.println(rect.area());
        }
        
        // Close the input and output file.
        writer.close();
        outputFile.close();
        scanner.close();
        inputFile.close();
    }
}