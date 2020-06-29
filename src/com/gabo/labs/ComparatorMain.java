package com.gabo.labs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {
    public static void main(String[] args) {

        Person gabo = new Person(30, "Gabo");
        Person roman = new Person(15, "Roman");
        Person eli = new Person(45, "Eli");
        Person beatriz = new Person(45, "Beatriz");

        List<Person> persons = new ArrayList<>();

        persons.add(gabo);
        persons.add(roman);
        persons.add(eli);
        persons.add(beatriz);

        Comparator<Person> comparatorByName = Comparator.comparing(Person::getName);
        Comparator<Person> comparatorByAge = Comparator.comparingInt(Person::getAge);
        Comparator<Person> comparatorByAgeThenByName = Comparator.comparingInt(Person::getAge)
                .thenComparing(Person::getName);

        persons.sort(comparatorByAge);

        System.out.println(persons);

        persons.sort(comparatorByAgeThenByName);

        System.out.println(persons);


    }
}
