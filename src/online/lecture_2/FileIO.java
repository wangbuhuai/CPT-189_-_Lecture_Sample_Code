// Created by Dayu Wang (dwang@stchas.edu) on 2022-08-28

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-08-28


package online.lecture_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) throws IOException {  // Add "throws" statement on the main() method.
        // Open the input and output files.
        FileInputStream inputFile = new FileInputStream("./src/online/lecture_2/inputFiles/input_1.txt");
        Scanner scanner = new Scanner(inputFile);
        FileOutputStream outputFile = new FileOutputStream("./src/online/lecture_2/outputFiles/output_1.txt");
        PrintWriter writer = new PrintWriter(outputFile);

        // Read the input file.
        String row_1 = scanner.nextLine();  // Reads in the entire next row (including whitespaces).
        double val_3 = scanner.nextDouble();  // Reads in the next value (whitespaces automatically ignored).
        double val_4 = scanner.nextDouble();  // Reads in the next value (whitespaces automatically ignored).

        // Write values to the output file.
        writer.println(row_1);
        writer.println(val_3);
        writer.println(val_4);

        // Close the input and output files (a must step).
        writer.close();
        outputFile.close();
        scanner.close();
        inputFile.close();
    }
}