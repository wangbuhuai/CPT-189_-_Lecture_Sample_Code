// Created by Dayu Wang (dwang@stchas.edu) on 2021-12-11

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-04-27


package evening.lecture_10;

import java.util.Arrays;

public class Sorting {
    // Selection sort
    public static void selectionSort(int[] arr) {
        for (int cur = 0; cur < arr.length; cur++) {  // {cur} means the current position.
            int min = cur;  // Initialize the index of the minimum value in the rest of the array.
            // Find the minimum value in the rest of the array.
            for (int j = cur + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) { min = j; }
            }
            if (min != cur) {
                // Swap arr[cur] with arr[min].
                int temp = arr[cur];
                arr[cur] = arr[min];
                arr[min] = temp;
            }
        }
    }

    // Bubble sort (original)
    public static void bubbleSort_1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]) {
                    // Swap arr[j - 1] with arr[j].
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Bubble sort (improved)
    public static void bubbleSort_2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;  // Use a boolean to check whether swap happened in this round.
            for (int j = 1; j < arr.length - i; j++) {  // Skip the largest elements already correctly placed at the end of the array.
                if (arr[j - 1] > arr[j]) {
                    // Swap arr[j - 1] with arr[j].
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;  // Change the boolean to true since swap happened.
                }
            }
            // If in this round, swap never happened, then the array is already sorted.
            if (!swapped) { break; }
        }
    }

    // Insertion sort
    public static void insertionSort(int[] arr) {
        for (int mark = 1; mark < arr.length; mark++) {
            int key = arr[mark], j;
            for (j = mark - 1; j >= 0 && arr[j] > key; j--) { arr[j + 1] = arr[j]; }  // Data shift
            arr[j + 1] = key;
        }
    }

    // Merge
    private static void merge(int[] input_1, int[] input_2, int[] output) {
        int i = 0, j = 0, k = 0;
        while (i < input_1.length && j < input_2.length) {
            if (input_1[i] <= input_2[j]) { output[k++] = input_1[i++]; }
            else { output[k++] = input_2[j++]; }
        }
        while (i < input_1.length) { output[k++] = input_1[i++]; }
        while (j < input_2.length) { output[k++] = input_2[j++]; }
    }

    // Mergesort
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) { return; }  // Base case
        int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);  // Copy the left half of the array.
        int[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);  // Copy the right half of the array.
        // Recursion
        mergeSort(left);
        mergeSort(right);
        // Merge
        merge(left, right, arr);
    }
}