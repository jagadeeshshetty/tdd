package com.jc.core.constructor;

public class Dog {

  private int numberOfLegs;

  // Default empty constructor
  public Dog() {
    this.numberOfLegs = 4;
  }

  // Constructor overloading
  public Dog(int numOfLegs) {
    this.numberOfLegs = numOfLegs;
  }

  // Getter method to access class field.
  public int getNumberOfLegs() {
    return numberOfLegs;
  }
}
