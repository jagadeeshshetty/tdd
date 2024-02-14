package com.jc.aim.algo.arrays;

public class PrintAllSubArray {
  public static void main(String[] args) {
    int N = 5;
    int[] arr = { 1, 3, 1, 5, 8 };
    int totalSubArrays = 0;

    // start, end index approach
    for (int start = 0; start < N; start++) {
      for (int end = start; end < N; end++) {
        printArray(arr, start, end);
        System.out.print(", ");
        totalSubArrays++;
      }
      System.out.println();
    }
    System.out.println("Total Subarrays: " + totalSubArrays);
  }

  static void printArray(int[] arr, int start, int end) {
    for (int i = start; i <= end; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
