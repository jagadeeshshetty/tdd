package com.jc.core.getterAndSetter;

public class GetterAndSetter {

  private int balance;

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {

    // Advantage of setter
    // We can validate incoming data.
    if (balance <= 0)
      throw new IllegalArgumentException();

    this.balance = this.balance + balance;
  }

}
