package com.jc.core.getterAndSetter;

public class GetterAndSetter {

  private int balance;

  int getBalance() {
    return balance;
  }

  private void setBalance(int balance) {

    // Advantage of setter
    // We can validate the incoming data.
    if (balance <= 0)
      throw new IllegalArgumentException();

    this.balance = this.balance + balance;
  }

  void deposit(int amount) {
    this.setBalance(amount);
  }

  int withdraw(int amount) {
    if (this.getBalance() == 0)
      return 0;

    if (amount > this.getBalance())
      throw new IllegalArgumentException();

    return this.balance = this.getBalance() - amount;
  }

}
