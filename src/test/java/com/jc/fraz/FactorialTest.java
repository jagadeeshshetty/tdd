package com.jc.fraz;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void factorialOfNumber4() {
        Factorial factorial = new Factorial();
        Assert.assertEquals(24, factorial.find(4));
    }

    @Test
    public void factorialOfNumber10() {
        Factorial factorial = new Factorial();
        Assert.assertEquals(3628800, factorial.find(10));
    }

    @Test
    public void factorialOfNumber100() {
        Factorial factorial = new Factorial();
        Assert.assertEquals(3628800, factorial.find(21));
    }
}
