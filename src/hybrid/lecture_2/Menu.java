// Created by Dayu Wang (dwang@stchas.edu) on 2021-03-26

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-10-28


package hybrid.lecture_2;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        // Show the main menu to the user.
        System.out.println("Today's lecture_2.Menu");
        System.out.println("1) Appetizer");
        System.out.println("2) Entree");
        System.out.println("3) Dessert");

        // Let the user make a selection.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please make a selection (1-3): ");
        int selection = scanner.nextInt();

        // Based on the user selection, show different messages to the user.
        switch (selection) {
            case 1:
                System.out.println("Today's appetizer is Grilled Shrimp Skewers.");
                break;
            case 2:
                System.out.println("Today's entree is 12-oz Ribeye with Asparagus.");
                break;
            case 3:
                System.out.println("Today's dessert is Carrot Cake.");
                break;
            default:
                System.out.println("Error: invalid selection");
        }

        // Close the scanner.
        scanner.close();
    }
}