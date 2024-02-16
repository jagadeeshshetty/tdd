package com.jc.aim.algo.arrays;

import java.util.Arrays;

public class MultiDimensionalArray {
  public static void main(String[] args) {
    int[][] arr = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 }
    };
    System.out.println(arr);
    System.out.println(Arrays.toString(arr));
    for (int i = 0; i < arr.length; i++) {
      System.out.println(Arrays.toString(arr[i]));
    }
  }
}
