package com.gabo.labs;

public class Person {
    private String name;
    private Integer age;

    public Person(){}

    public Person(Integer age, String name){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Person setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String toString(){
        return "\nName: "+this.getName() + " Age: "+this.getAge();
    }
}
