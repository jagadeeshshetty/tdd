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
public class SmallestAndSecondSmallest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int[] arr = new int[len];
    for (int index = 0; index < len; index++) {
      arr[index] = sc.nextInt();
    }
    sc.close();

    if (arr.length <= 1) {
      System.out.println("-1");
      return;
    }

    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (min > arr[i])
        min = arr[i];
    }
    System.out.println(min);

    int secMin = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != min) // Skip the min integer
        if (arr[i] < secMin)
          secMin = arr[i];
    }
    System.out.println(secMin);
  }
}
