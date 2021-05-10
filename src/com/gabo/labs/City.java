package com.gabo.labs;

public class City {
    private String name;

    public City(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public City setName(String name) {
        this.name = name;
        return this;
    }

    public String toString() {
        return "City{Name: " + this.getName()+"}";
    }
}
