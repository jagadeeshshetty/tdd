package com.jc.udemy.numbers;

public class BiggerAndSmaller {

    private int bigger = Integer.MIN_VALUE; // -2147483648
    private int smaller = Integer.MAX_VALUE; // 2147483647
    private boolean isEmptyArray = false;

    public int getBigger() {
        return bigger;
    }

    public int getSmaller() {
        return smaller;
    }

    public boolean isEmptyArray() {
        return isEmptyArray;
    }

    public void find(int[] numbers) {
        if (numbers.length == 0) isEmptyArray = true;
        for (int n : numbers) {
            if (n > bigger) bigger = n;
            if (n < smaller) smaller = n;
        }
    }

}
