// Created by Dayu Wang (dwang@stchas.edu) on 2022-02-20

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-02-20


package evening.lecture_2;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        // Let the user enter three integers.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first integer: ");
        int x1 = scanner.nextInt();
        System.out.print("Please enter the second integer: ");
        int x2 = scanner.nextInt();
        System.out.print("Please enter the third integer: ");
        int x3 = scanner.nextInt();

        // Find the max of the three integers.
        int maxVal;
        if (x1 >= x2 && x1 >= x3) { maxVal = x1; }
        else if (x2 >= x1 && x2 >= x3) { maxVal = x2; }
        else { maxVal = x3; }

        // Show the result to the user.
        System.out.println("Max: " + maxVal);

        scanner.close();
    }
}