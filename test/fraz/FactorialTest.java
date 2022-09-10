package test.fraz;

import org.junit.Assert;
import org.junit.Test;
import src.fraz.Factorial;

public class FactorialTest {

    @Test
    public void factorialOfPositiveNumber() {
        Factorial factorial = new Factorial();
        Assert.assertEquals(24, factorial.find(4));
    }
}
