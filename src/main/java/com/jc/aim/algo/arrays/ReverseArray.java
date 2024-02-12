package com.jc.aim.algo.arrays;

import java.util.Scanner;

public class ReverseArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arrLen = sc.nextInt();
    int[] arr = new int[arrLen];
    for (int index = 0; index < arrLen; index++) {
      arr[index] = sc.nextInt();
    }
    sc.close();

    // int[] arr = { 4, 5, 2, 1, 3 };
    int forw = 0;
    int backw = arr.length - 1;

    while (forw < backw) {
      int tmp = arr[forw];
      arr[forw] = arr[backw];
      arr[backw] = tmp;
      forw++;
      backw--;
    }

    for (int value : arr)
      System.out.print(value + " ");
  }
}
