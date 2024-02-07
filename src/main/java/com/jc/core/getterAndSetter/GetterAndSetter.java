package com.jc.core.getterAndSetter;

/**
 * A class representing a simple bank account with getter and setter methods for
 * managing the balance.
 */
public class GetterAndSetter {

  private int balance;

  /**
   * Gets the current balance of the account.
   *
   * @return The current balance.
   */
  int getBalance() {
    return balance;
  }

  /**
   * Sets the balance of the account after validating the incoming data.
   * <p>
   * Advantage of using a setter:
   * We can validate the incoming data before setting it.
   *
   * @param balance The balance to set.
   * @throws IllegalArgumentException If the incoming balance is less than or
   *                                  equal to 0.
   */
  private void setBalance(int balance) {
    if (balance <= 0)
      throw new IllegalArgumentException();

    this.balance = this.balance + balance;
  }

  /**
   * Deposits the specified amount into the account.
   *
   * @param amount The amount to deposit.
   */
  void deposit(int amount) {
    this.setBalance(amount);
  }

  /**
   * Withdraws the specified amount from the account.
   *
   * @param amount The amount to withdraw.
   * @return The remaining balance after withdrawal.
   * @throws IllegalArgumentException If the account balance is 0 or if the
   *                                  withdrawal amount is greater than the
   *                                  balance.
   */
  int withdraw(int amount) {
    if (this.getBalance() == 0)
      return 0;

    if (amount > this.getBalance())
      throw new IllegalArgumentException();

    return this.balance = this.getBalance() - amount;
  }

}
