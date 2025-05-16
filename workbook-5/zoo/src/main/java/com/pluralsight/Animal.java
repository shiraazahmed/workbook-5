package com.pluralsight;

public class Animal {
    private String name;
    private String color;

    public Animal(){}

    public Animal(String name, String color) {
        System.out.println("I'm not called");
        this.name = name;
        this.color = color;
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
}
