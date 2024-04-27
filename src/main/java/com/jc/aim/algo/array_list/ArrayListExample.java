package com.jc.aim.algo.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Apple");
    list.add("Banana");
    list.add("Orange");

    List<String> fruits = Arrays.asList("Apple", "Orange");
    boolean containsAllFruits = list.containsAll(fruits); // Check if ArrayList contains all fruits
    System.out.println("ArrayList contains all fruits? " + containsAllFruits);
  }
}
// ArrayList contains all fruits? true
