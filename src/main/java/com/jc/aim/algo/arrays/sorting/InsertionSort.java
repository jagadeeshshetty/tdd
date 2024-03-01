package com.jc.aim.algo.arrays.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }

    // Initialize an array
    // int[] arr = { 4, 3, 1, 9, 7 };

    // Print the array before sorting
    // System.out.println("Before Sort: " + Arrays.toString(arr));

    // Iterate through the array starting from the second element
    for (int i = 1; i < arr.length; i++) {

      // Save the current element in a variable
      int key = arr[i];

      // Initialize a variable for comparison
      int j = i - 1;

      // Find the correct position for key in the sorted part
      // of the array and shift elements to the right
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }

      // Insert key into the correct position
      arr[j + 1] = key;
    }

    // Print the array after sorting
    // System.out.println("After Sort: " + Arrays.toString(arr));

    for (int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");
  }
}
