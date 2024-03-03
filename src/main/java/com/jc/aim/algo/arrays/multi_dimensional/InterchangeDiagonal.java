package com.jc.aim.algo.arrays.multi_dimensional;

import java.util.Scanner;

public class InterchangeDiagonal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] arr = new int[N][N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    // swap array elements
    for (int i = 0, j = N - 1; i < N; i++, j--)
      swap(arr, i, j);

    // print an array
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++)
        System.out.print(arr[i][j] + " ");
      System.out.println();
    }
  }

  static void swap(int[][] arr, int i, int j) {
    int tmp = arr[i][j];
    arr[i][j] = arr[i][i];
    arr[i][i] = tmp;
  }
}
