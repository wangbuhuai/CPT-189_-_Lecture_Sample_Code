// Created by Dayu Wang (dwang@stchas.edu) on 2022-04-30

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-05-06


package hybrid.lecture_5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        // Open the input and output file.
        FileInputStream inputFile = new FileInputStream("./src/hybrid/lecture_5/input_file/inventory.txt");
        Scanner scanner = new Scanner(inputFile);
        FileOutputStream outputFile = new FileOutputStream("./src/hybrid/lecture_5/output_file/items.txt");
        PrintWriter writer = new PrintWriter(outputFile);

        // Create a single GenericItem object.
        GenericItem item = null;

        // Process the input file.
        while (scanner.hasNext()) {
            // Read in the type, name, and quantity of the item.
            String type = scanner.next();
            String name = scanner.next();
            int quantity = scanner.nextInt();

            if (type.equals("Generic")) {
                item = new GenericItem(name, quantity);
            }

            if (type.equals("Produce")) {
                String expirationDate = scanner.next();
                item = new ProduceItem(name, quantity, expirationDate);
            }

            if (type.equals("Fruit")) {
                String expirationDate = scanner.next();
                boolean hasSeed = scanner.nextBoolean();
                item = new FruitProduce(name, quantity, expirationDate, hasSeed);
            }

            if (type.equals("Book")) {
                String isbn = scanner.next();
                item = new BookItem(name, quantity, isbn);
            }

            if (item != null) {
                writer.printf("%s\n\n", item.convertToString());
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