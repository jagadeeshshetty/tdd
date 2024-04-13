package com.jc.aim.algo.for_loop;

public class UglyNum {
  public static void main(String[] args) {
    // int num = 1;
    int num = 6;
    // int num = 14;
    System.out.println(isUgly(num));
  }

  static boolean isUgly(int num) {
    boolean result = false;

    if (num <= 0)
      return false;

    if (num == 1)
      return true;

    while(num/2 > 0) {
      // num
    }

    return result;
  }
}
