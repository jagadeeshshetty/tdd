package src.udemy.numbers;

import org.junit.Assert;
import org.junit.Test;

public class BiggerAndSmallerTest {

    @Test
    public void numbersInIncreasingOrder() {
        BiggerAndSmaller algorithm = new BiggerAndSmaller();
        algorithm.find(new int[]{2, 3, 4});

        Assert.assertEquals(4, algorithm.getBigger());
        Assert.assertEquals(2, algorithm.getSmaller());
    }

    @Test
    public void numbersInDecreasingOrder() {
        BiggerAndSmaller algorithm = new BiggerAndSmaller();
        algorithm.find(new int[]{4, 3, 2});

        Assert.assertEquals(4, algorithm.getBigger());
        Assert.assertEquals(2, algorithm.getSmaller());
    }

    @Test
    public void numbersInAnyOrder() {
        BiggerAndSmaller algorithm = new BiggerAndSmaller();
        algorithm.find(new int[]{15, 9, 2, 27, 4, 28});

        Assert.assertEquals(28, algorithm.getBigger());
        Assert.assertEquals(2, algorithm.getSmaller());
    }

    @Test
    public void onlyOneNumber() {
        BiggerAndSmaller algorithm = new BiggerAndSmaller();
        algorithm.find(new int[]{48});

        Assert.assertEquals(48, algorithm.getBigger());
        Assert.assertEquals(48, algorithm.getSmaller());
    }

    @Test
    public void repeatedNumbers() {
        BiggerAndSmaller algorithm = new BiggerAndSmaller();
        algorithm.find(new int[]{8, 16, 2, 1, 5, 28, 44, 44});

        Assert.assertEquals(44, algorithm.getBigger());
        Assert.assertEquals(1, algorithm.getSmaller());
    }

    @Test
    public void emptyArray() {
        BiggerAndSmaller algorithm = new BiggerAndSmaller();
        algorithm.find(new int[]{});

        Assert.assertTrue(algorithm.isEmptyArray());
    }
}
