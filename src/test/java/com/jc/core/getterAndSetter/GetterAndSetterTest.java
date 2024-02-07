package com.jc.core.getterAndSetter;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GetterAndSetterTest {
  GetterAndSetter account;

  @BeforeClass
  public void setUp() {
    account = new GetterAndSetter();
  }

  @Test
  public void initialBalanceShouldBeZero() {
    Assert.assertEquals(0, account.getBalance());
  }

  // @Test
  // public void depositOneDollar() {
  // account.deposit(1);
  // Assert.assertEquals(1, account.getBalance());
  // }

  // @Test
  // public void depositTwoDollar() {
  // account.deposit(2);
  // Assert.assertEquals(2, account.getBalance());
  // }

  // @Test
  // public void depositOneDollarTwice() {
  // account.deposit(1);
  // account.deposit(1);
  // Assert.assertEquals(2, account.getBalance());
  // }

  // @Test
  // public void depositOneAndWithdrawOneDollar() {
  // account.deposit(1);
  // account.withdraw(1);
  // Assert.assertEquals(0, account.getBalance());
  // }

  // @Test
  // public void depositTwoAndWithdrawOneDollar() {
  // account.deposit(2);
  // account.withdraw(1);
  // Assert.assertEquals(1, account.getBalance());
  // }

  // @Test(expectedExceptions = IllegalArgumentException.class)
  // public void depositTwoAndWithdrawThreeDollar() {
  // account.deposit(2);
  // account.withdraw(3);
  // }

  // @Test
  // public void tryToWithdrawWithZeroBalance() {
  // account.withdraw(1);
  // Assert.assertEquals(0, account.getBalance());
  // }

  // @Test(expectedExceptions = IllegalArgumentException.class)
  // public void balanceShouldNotBeZero() {
  // account.deposit(0);
  // }

  // @Test(expectedExceptions = IllegalArgumentException.class)
  // public void balanceShouldBePositiveNumber() {
  // account.deposit(-1);
  // }

}
