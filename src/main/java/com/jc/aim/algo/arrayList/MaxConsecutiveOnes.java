package com.jc.aim.algo.arrayList;

public class MaxConsecutiveOnes {

  public static void main(String[] args) {
    int[] nums = { 1, 1, 0, 1, 1, 1 };
    int result = findMaxConsecutiveOnes(nums);
    System.out.println(result);
  }

  public static int findMaxConsecutiveOnes(int[] nums) {
    int count = 0;
    int result = count;

    for (int num : nums) {
      if (num == 1)
        count++;
      if (num == 0) {
        if (count > result)
          result = count;
        count = 0;
      }
    }
    if (count > result)
      result = count;

    return result;
  }
}
