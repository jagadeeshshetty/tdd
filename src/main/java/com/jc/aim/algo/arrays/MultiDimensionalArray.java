package com.jc.aim.algo.arrays;

import java.util.Arrays;

public class MultiDimensionalArray {
  public static void main(String[] args) {
    // 2x3 array
    int[][] arr = {
        { 1, 2, 3 },
        { 4, 5, 6 }
    };

    for (int i = 0; i < arr.length; i++) {
      System.out.println(Arrays.toString(arr[i]));
    }

    // row traverse using forEach loop
    for (int row = 0; row < arr.length; row++) {
      for (int val : arr[row]) {
        System.out.print(val + " ");
      }
      System.out.println();
    }

    // row traverse using for loop
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        System.out.print(arr[row][col] + " ");
      }
      System.out.println();
    }

  }
}
