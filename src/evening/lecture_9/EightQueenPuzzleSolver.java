// Created by Dayu Wang (dwang@stchas.edu) on 2022-04-20

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-04-20


package evening.lecture_9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class EightQueenPuzzleSolver {
    public static void main(String[] args) throws IOException {
        // Open the output file.
        FileOutputStream outputFile = new FileOutputStream("./src/evening/lecture_9/output_file/solutions.txt");
        PrintWriter writer = new PrintWriter(outputFile);

        // Create an EightQueenPuzzle.
        EightQueenPuzzle puzzle = new EightQueenPuzzle();

        // Solve the puzzle and write all solutions to the output file.
        puzzle.solve(writer);

        // Close the output file.
        writer.close();
        outputFile.close();
    }
}