// Created by Dayu Wang (dwang@stchas.edu) on 2021-04-24

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-03-29


package evening.lecture_6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        // Open the input and output file.
        FileInputStream inputFile = new FileInputStream("./src/evening/lecture_6/input_file/input.txt");
        Scanner scanner = new Scanner(inputFile);
        FileOutputStream outputFile = new FileOutputStream("./src/evening/lecture_6/output_file/output.txt");
        PrintWriter writer = new PrintWriter(outputFile);

        // Create a GenericItem object.
        GenericItem item = null;

        // Read the input file and process each item in it.
        while (scanner.hasNext()) {
            String type = scanner.next();

            if (type.equals("Generic")) { item = new GenericItem(scanner.next(), scanner.nextInt()); }

            if (type.equals("Produce")) { item = new ProduceItem(scanner.next(), scanner.nextInt(), scanner.next()); }

            if (type.equals("Fruit")) {
                item = new FruitProduce(scanner.next(), scanner.nextInt(), scanner.next(), scanner.nextBoolean());
            }

            if (type.equals("Book")) { item = new BookItem(scanner.next(), scanner.nextInt(), scanner.next()); }

            if (item != null) {
                writer.println(item.convertToString());
                item = null;
            }
        }

        // Close the input and output file.
        writer.close();
        outputFile.close();
        scanner.close();
        inputFile.close();
    }
}