package com.jc.core.inheritance.animal;

public class Animal {
    private String name;
    private String color;
    private String look;

    public void setLook(String look) {
        this.look = look;
    }

    public String getLook() {
        return look;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method eligible for override in subclasses.
    public String makeSound() {
        return "Each animals make unique sound.";
    }

}
