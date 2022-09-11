package com.jc.core.arrays;

public class Program {
    public static void main(String[] args) {
        // Without array.
        String car1 = "Toyota";
        String car2 = "TATA";
        String car3 = "Kia";
        String car4 = "GM";

        // With array(When we don't know the values).
        String[] cars = new String[4]; // Array length is fixed.
        cars[0] = "Toyota";
        cars[1] = "TATA";
        cars[2] = "Kia";
        cars[3] = "GM";

        // With array(When we know the values).
        String[] carsNew = {"Toyota", "TATA", "Kia", "GM"};

        // Access any single element.
        System.out.println(cars[2]);

        // Classic way - Access all elements starting from the first index.
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // Access all elements starting from the last index.
        for (int i = cars.length - 1; i >= 0; i--) {
            System.out.println(cars[i]);
        }

        // Modern way - Using for each loop.
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
