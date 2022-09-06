// Created by Dayu Wang (dwang@stchas.edu) on 2022-02-20

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-09-06


package online.lecture_3;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        // Show the menu to the user.
        System.out.println("Today's Menu: ");
        System.out.println("1) Appetizer");
        System.out.println("2) Entree");
        System.out.println("3) Dessert");

        // Let the user make a choice.
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPlease make a selection (1 - 3): ");
        int choice = scanner.nextInt();

        // Show the dish based on the user selection.
        switch (choice) {
            case 1:
                System.out.println("Appetizer: Chilled cucumber soup");
                break;
            case 2:
                System.out.println("Entree: Grilled halibut with asparagus");
                break;
            case 3:
                System.out.println("Dessert: Carrot cake");
                break;
            default:
                System.out.println("Invalid selection");
        }

        scanner.close();
    }
}