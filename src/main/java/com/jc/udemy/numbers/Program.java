package com.jc.udemy.numbers;

public class Program {
    public static void main(String[] args) {
        BiggerAndSmaller algorithm = new BiggerAndSmaller();
        algorithm.find(new int[]{2, 3, 4});

        System.out.println(algorithm.getBigger() == 4);
        System.out.println(algorithm.getSmaller() == 2);
    }
}
