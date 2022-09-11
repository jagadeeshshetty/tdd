package com.jc.core.getterAndSetter;

public class Main {
  public static void main(String[] args) {
    GetterAndSetter account = new GetterAndSetter();
    account.setBalance(1);
    System.out.println(account.getBalance()); // 1
    account.setBalance(1);
    System.out.println(account.getBalance()); // 2
  }
}
