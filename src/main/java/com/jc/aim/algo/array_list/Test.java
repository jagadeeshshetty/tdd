package com.jc.aim.algo.array_list;

import java.util.ArrayList;

public class Test {

  public static void main(String[] args) {

    // create ArrayList
    ArrayList<String> lang = new ArrayList<>();

    // Add elements to ArrayList
    lang.add("Java");
    lang.add("JavaScript");
    lang.add("Python");
    System.out.println(lang + "->" + lang.size());

    lang.add(0, "C");
    System.out.println(lang + "->" + lang.size());

    lang.remove(0);
    System.out.println(lang + "->" + lang.size());

    lang.set(0, "C++");
    System.out.println(lang + "->" + lang.size());
   }

}
