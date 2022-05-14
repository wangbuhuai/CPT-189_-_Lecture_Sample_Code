// Created by Dayu Wang (dwang@stchas.edu) on 2022-05-13

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-05-13


package hybrid.lecture_7;

import java.util.Arrays;

public class Sorting {
    // Selection sort
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Stores the index of the min value in the rest of the array.
            int min = i;

            // Find the min value in the rest of the array.
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) { min = j; }
            }

            // Swap arr[min] with arr[i] if they are not the same.
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    // Bubble sort
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Stores whether a swap occurs in this iteration.
            boolean swapped = false;

            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            // If no swap occurred in this iteration, then the array is already sorted.
            if (!swapped) { return; }
        }
    }

    // Insertion sort
    public static void insertionSort(int[] arr) {
        for (int mark = 1; mark < arr.length; mark++) {
            int key = arr[mark], j;
            for (j = mark - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
    }

    // Merge sort
    public static void mergeSort(int[] arr) {
        // Base case
        if (arr.length < 2) { return; }

        // Copy the left half of the array into another array.
        int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);

        // Copy the right half of the array into another array.
        int[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

        // Sort "left" and "right" recursively.
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted left half and right half.
        merge(left, right, arr);
    }

    /** Merges two sorted arrays into a single sorted array.
        @param arr_1: first sorted array to merge
        @param arr_2: second sorted array to merge
        @param out: single output sorted array
    */
    private static void merge(int[] arr_1, int[] arr_2, int[] out) {
        int i = 0, j = 0, k = 0;
        while (i < arr_1.length && j < arr_2.length) {
            if (arr_1[i] <= arr_2[j]) { out[k++] = arr_1[i++]; }
            else { out[k++] = arr_2[j++]; }
        }
        while (i < arr_1.length) { out[k++] = arr_1[i++]; }
        while (j < arr_2.length) { out[k++] = arr_2[j++]; }
    }
}