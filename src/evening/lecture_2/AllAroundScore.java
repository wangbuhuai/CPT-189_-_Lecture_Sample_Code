// Created by Dayu Wang (dwang@stchas.edu) on 2022-02-20

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-02-20


package evening.lecture_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AllAroundScore {
    public static void main(String[] args) throws IOException {
        // Open the input and output files.
        FileInputStream inputFile = new FileInputStream("./src/evening/lecture_2/input_1.txt");
        Scanner scanner = new Scanner(inputFile);
        FileOutputStream outputFile = new FileOutputStream("./src/evening/lecture_2/output_1.txt");
        PrintWriter writer = new PrintWriter(outputFile);

        // Read the input file.
        String name = scanner.nextLine();
        double vault = scanner.nextDouble();
        double bars = scanner.nextDouble();
        double beam = scanner.nextDouble();
        double floor = scanner.nextDouble();

        // Calculate the all-around score.
        double allAround = vault + bars + beam + floor;

        // Write the name and all-around score to the output file.
        writer.println(name);
        writer.println(allAround);

        // Close the input and output files.
        writer.close();
        outputFile.close();
        scanner.close();
        inputFile.close();
    }
}