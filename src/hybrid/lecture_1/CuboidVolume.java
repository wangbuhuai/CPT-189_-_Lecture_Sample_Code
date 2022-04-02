// Created by Dayu Wang (dwang@stchas.edu) on 2022-04-01

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-04-01


package hybrid.lecture_1;

import java.util.Scanner;

public class CuboidVolume {
    public static void main(String[] args) {
        // Create a scanner.
        Scanner scanner = new Scanner(System.in);

        // Let the user input required information.
        System.out.print("Please enter the length of the cuboid: ");
        int length = scanner.nextInt();
        System.out.print("Please enter the width of the cuboid: ");
        int width = scanner.nextInt();
        System.out.print("Please enter the height of the cuboid: ");
        int height = scanner.nextInt();

        // Calculate the volume of the cuboid based on the user input data.
        int volume = length * width * height;

        // Write the result to the standard console.
        System.out.println("Volume: " + volume);

        // Close the scanner.
        scanner.close();
    }
}