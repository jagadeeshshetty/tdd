package com.jc.aim.algo.arrays.multi_dimensional;

import java.util.Scanner;

public class PrintDiagonal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] arr = new int[N][N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    // print main diagonal
    for (int i = 0; i < N; i++)
      System.out.print(arr[i][i] + " ");

    System.out.println();

    // print secondary diagonal
    int j = N - 1;
    for (int i = 0; i < N; i++) {
      System.out.print(arr[i][j] + " ");
      j--;
    }

  }
}
