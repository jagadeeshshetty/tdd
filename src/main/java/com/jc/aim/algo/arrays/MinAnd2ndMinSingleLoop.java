package com.jc.aim.algo.arrays;

import java.util.Scanner;

/**
 * Input :
 * 5
 * 2 4 3 5 6
 * Output :
 * 2 3
 *
 * Explanation:
 * 2 and 3 are respectively the smallest
 * and second smallest elements in the array.
 */
public class MinAnd2ndMinSingleLoop {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arrLen = sc.nextInt();
    int[] arr = new int[arrLen];
    for (int index = 0; index < arrLen; index++) {
      arr[index] = sc.nextInt();
    }
    sc.close();

    // int[] arr = { 4, 5, 2, 1, 3 };

    if (arr.length <= 1) {
      System.out.println(-1);
      return;
    }

    int element = arr[0];
    boolean isIdenticalElement = true;

    for (int i : arr) {
      if (i != element) {
        isIdenticalElement = false;
        break;
      }
    }

    if (isIdenticalElement) {
      System.out.println(-1);
      return;
    }

    int min = Integer.MAX_VALUE;
    int secMin = Integer.MAX_VALUE;

    for (int value : arr) {

      if (value < min) {
        secMin = min;
        min = value;
      } else if (value != min && value < secMin) {
        secMin = value;
      }
    }

    System.out.println(min + " " + secMin);
  }
}
