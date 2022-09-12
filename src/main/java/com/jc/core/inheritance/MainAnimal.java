package com.jc.core.inheritance;

import com.jc.core.inheritance.animal.Animal;
import com.jc.core.inheritance.animal.Dog;

public class MainAnimal {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound();

        Dog dog = new Dog();
        dog.setName("Tim");
        dog.setColor("Light Brown");
        dog.setLook("🐶");
        System.out.println(dog.getLook() + ": Call me " + dog.getName() + ". I'm " + dog.getColor()
                + " in color and I can make " + dog.makeSound() + " sound.");

        Dog newDog = new Dog();
        newDog.setName("Jim");
        newDog.setColor("Brown");
        newDog.setLook("🐕");
        System.out.println(newDog.getLook() + ": Call me " + newDog.getName() + ". I'm " + newDog.getColor()
                + " in color and I can make " + newDog.makeSound() + " sound.");
    }
}
