package com.jc.core.constructor;

public class Main {
  public static void main(String[] args) {

    Dog dog = new Dog();
    Dog superDog = new Dog(8);

    System.out.println("Normal Dog legs: " + dog.getNumberOfLegs());
    System.out.println("Super Dog legs: " + superDog.getNumberOfLegs());

  }
}
