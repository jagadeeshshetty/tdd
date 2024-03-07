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
    int N = sc.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();

    // int[] arr = { 4, 5, 2, 1, 3 };

    // return -1 if only single element in array.
    if (arr.length <= 1) {
      System.out.println(-1);
      return;
    }

    int element = arr[0];
    boolean isAllElementsAreSame = true;

    // return -1 if all elements in array are same.
    for (int i : arr) {
      if (i != element) {
        isAllElementsAreSame = false;
        break;
      }
    }

    if (isAllElementsAreSame) {
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
