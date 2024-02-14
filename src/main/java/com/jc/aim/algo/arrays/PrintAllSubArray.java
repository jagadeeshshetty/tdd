package com.jc.aim.algo.arrays;

import java.util.Scanner;

public class PrintAllSubArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }

    if (N <= 0) {
      System.out.println(-1);
      return;
    }

    int totalSubArrays = 0;

    // int[] arr = { 1, 3, 1, 5, 8 };

    // start, end index approach
    for (int st = 0; st < N; st++) {
      for (int en = st; en < N; en++) {
        for (int i = st; i <= en; i++) {
          System.out.print(arr[i] + " ");
        }
        System.out.println();
        totalSubArrays++;
      }
    }
    System.out.println("Total Subarrays: " + totalSubArrays);
  }
}
