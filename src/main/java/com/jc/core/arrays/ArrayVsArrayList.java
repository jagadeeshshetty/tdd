package com.jc.core.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {

    public static void main(String[] args) {
        // 1. Initialize Array and ArrayList objects.
        String[] carsArray = {"Toyota", "Tata", "Honda", "Hyundai"};
        ArrayList<String> carsArrayList = new ArrayList<>(Arrays.asList("Toyota", "Tata", "Honda", "Hyundai"));

        // 2. Print the array object.
        System.out.println("carsArray " + carsArray);
        System.out.println("carsArrayList " + carsArrayList);

        // 3. Print the array elements.
        // Array
        for (String name : carsArray) {
            System.out.println(name);
        }

        // ArrayList
        for (String name : carsArrayList) {
            System.out.println(name);
        }
        // ArrayList using the lambda expression
        carsArrayList.forEach(name -> System.out.println(name));

        // 4. Number of elements
        System.out.println(carsArray.length);
        System.out.println(carsArrayList.size());

        // 5. Add elements.
        // Unable to add elements to Array. The length is fixed.
        carsArrayList.add("Audi");
        System.out.println(carsArrayList);

        // Update an element.
        carsArray[0] = "Maruthi Suzuki";
        carsArrayList.add(0, "Maruthi Suzuki");
        for (String name : carsArray) {
            System.out.println(name);
        }
        System.out.println(carsArrayList);

        // Remove an element.
        // Array is immutable.
        carsArrayList.remove("Honda");
        System.out.println("Removed 'Honda'" + carsArrayList);
    }

}
