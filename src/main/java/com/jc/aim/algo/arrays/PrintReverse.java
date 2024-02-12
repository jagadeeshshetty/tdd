package com.jc.aim.algo.arrays;

import java.util.Scanner;

public class PrintReverse {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arrLen = sc.nextInt();
    int[] arr = new int[arrLen];
    for (int index = 0; index < arrLen; index++) {
      arr[index] = sc.nextInt();
    }
    sc.close();

    // int[] arr = { 4, 5, 2, 1, 3 };
    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }
  }
}
