// Created by Dayu Wang (dwang@stchas.edu) on 2020-04-29

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-05-06


package hybrid.project_demo_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SudokuSolver {
    public static void main(String[] args) throws IOException {
        // Open the input and output file.
        FileInputStream inputFile = new FileInputStream("./src/hybrid/project_demo_2/input_files/puzzle.txt");
        Scanner scanner = new Scanner(inputFile);
        FileOutputStream outputFile = new FileOutputStream("./src/hybrid/project_demo_2/output_files/solution.txt");
        PrintWriter writer = new PrintWriter(outputFile);

        Sudoku puzzle = new Sudoku();  // Create a Sudoku puzzle.
        puzzle.loadData(scanner);  // Load the puzzle from the input file.
        puzzle.solve();  // Solve the puzzle.
        puzzle.printSolution(writer);  // Write the solution to the puzzle to the output file.

        // Close the input and output file.
        writer.close();
        outputFile.close();
        scanner.close();
        inputFile.close();
    }
}