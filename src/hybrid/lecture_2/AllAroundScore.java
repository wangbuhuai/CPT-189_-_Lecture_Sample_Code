// Created by Dayu Wang (dwang@stchas.edu) on 2021-03-26

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-10-28


package hybrid.lecture_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AllAroundScore {
    public static void main(String[] args) throws IOException {
        // Open input and output file.
        FileInputStream inputFile = new FileInputStream("src/hybrid/lecture_2/inputFiles/fourDisciplineScores.txt");
        Scanner scanner = new Scanner(inputFile);
        FileOutputStream outputFile = new FileOutputStream("src/hybrid/lecture_2/outputFiles/allAroundScore.txt");
        PrintWriter writer = new PrintWriter(outputFile);

        // Read the name of the player from the input file.
        String name = scanner.nextLine();

        // Read the 4 discipline scores of the player from the input file.
        double vault = scanner.nextDouble();
        double bars = scanner.nextDouble();
        double beam = scanner.nextDouble();
        double floor = scanner.nextDouble();

        // Calculate the all-around score.
        double allAround = vault + bars + beam + floor;

        // Write the name and all-around score to the output file.
        writer.println(name);
        writer.println(allAround);

        // Close the input and output file.
        writer.close();
        outputFile.close();
        scanner.close();
        inputFile.close();
    }
}