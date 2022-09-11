package com.jc.core.getterAndSetter;

public class Main {
  public static void main(String[] args) {
    GetterAndSetter account = new GetterAndSetter();
    account.deposit(10);
    System.out.println(account.getBalance()); // 10
    account.deposit(5);
    System.out.println(account.getBalance()); // 15
    account.withdraw(5);
    System.out.println(account.getBalance()); // 10
  }
}
