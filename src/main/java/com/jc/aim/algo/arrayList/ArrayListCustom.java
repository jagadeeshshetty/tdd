package com.jc.aim.algo.arrayList;

import java.util.Arrays;

class Run {
  public static void main(String[] args) {
    ArrayListCustom arrList = new ArrayListCustom();
    arrList.add(10);
    arrList.add(20);
    arrList.add(30);
    arrList.add(40);
    arrList.add(50);
    arrList.add(60);
    arrList.add(70);
    arrList.add(80);
    arrList.add(90);
    arrList.add(100);
    arrList.print();
  }
}

public class ArrayListCustom {

  int[] arr;
  int size = 4;
  int curIndex = 0;

  ArrayListCustom() {
    arr = new int[size];
  }

  void print() {
    System.out.println(Arrays.toString(arr));
  }

  void add(int number) {
    if (curIndex == size) {
      int[] backupArray = arr;
      size = size * 2;
      arr = new int[size];

      for (int i = 0; i < backupArray.length; i++) {
        arr[i] = backupArray[i];
      }
    }
    arr[curIndex] = number;
    curIndex++;
  }

}
