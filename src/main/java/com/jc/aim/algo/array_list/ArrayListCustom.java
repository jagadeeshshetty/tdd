package com.jc.aim.algo.array_list;

import java.util.Arrays;

public class ArrayListCustom {

  String[] arr;
  int curIndex = 0;

  ArrayListCustom() {
    arr = new String[4];
  }

  public static void main(String[] args) {
    ArrayListCustom arrList = new ArrayListCustom();
    arrList.add("one");
    arrList.print();
  }

  private void print() {
    System.out.println(Arrays.toString(arr));
  }

  private void add(String string) {
    arr[0] = string;
    curIndex++;
  }

}
