package com.jc.core.getterAndSetter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GetterAndSetterTest {
  GetterAndSetter account;

  @Before
  public void setUp() {
    account = new GetterAndSetter();
  }

  @Test
  public void initialBalanceShouldBeZero() {
    Assert.assertEquals(0, account.getBalance());
  }

  @Test
  public void depositOneDollar() {
    account.setBalance(1);
    Assert.assertEquals(1, account.getBalance());
  }

  @Test
  public void depositOneDollarTwice() {
    account.setBalance(1);
    account.setBalance(1);
    Assert.assertEquals(2, account.getBalance());
  }

  @Test(expected = IllegalArgumentException.class)
  public void balanceShouldNotBeZero() {
    account.setBalance(0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void balanceShouldBePositiveNumber() {
    account.setBalance(-1);
  }

}
