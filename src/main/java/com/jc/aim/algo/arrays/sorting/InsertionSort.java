package com.jc.aim.algo.arrays.sorting;

import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    // int[] arr = { 4, 1, 3, 9, 7 };
    int[] arr = { 24101381, 24098998, 24098336, 24098337 };
    System.out.println("Before Sort: " + Arrays.toString(arr));
    for (int i = 1; i < arr.length; i++) {
      // target is to accommodate arr[i] to arr[0 ... i-1]
      // so that it remains sorted.
      int curNum = arr[i];
      int j = i - 1;
      // Find the right place
      // Keep shifting as well
      while (j >= 0 && arr[j] > curNum) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = curNum;
    }

    System.out.println("After Sort:  " + Arrays.toString(arr));
  }
}
