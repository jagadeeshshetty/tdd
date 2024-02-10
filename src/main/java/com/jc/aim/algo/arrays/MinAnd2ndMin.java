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
public class MinAnd2ndMin {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arrLen = sc.nextInt();
    int[] arr = new int[arrLen];
    for (int index = 0; index < arrLen; index++) {
      arr[index] = sc.nextInt();
    }
    sc.close();

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
    for (int i = 0; i < arr.length; i++) {
      if (min > arr[i])
        min = arr[i];
    }

    int secMin = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != min) // Skip the min integer
        if (arr[i] < secMin)
          secMin = arr[i];
    }

    System.out.println(min);
    System.out.println(secMin);
  }
}
