package com.gabo.labs.iterable.collections;

import com.gabo.labs.Person;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Person gabo = new Person(30, "Gabo");
        Person roman = new Person(15, "Roman");
        Person eli = new Person(45, "Eli");
        Person beatriz = new Person(45, "Beatriz");

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(30, "Gabo"));
        personList.add(new Person(15, "Roman"));
        personList.add(new Person(45, "Eli"));
        personList.add(new Person(45, "Beatriz"));

        personList.forEach(System.out::println);
        personList.removeIf(p -> p.getAge() < 30);

        System.out.println("");

        //personList.forEach(System.out::println);
        personList.replaceAll(p -> p.setName(p.getName().toUpperCase()));

        System.out.println("");

        personList.sort(Comparator.comparing(Person::getName));
        personList.forEach(System.out::println);


        //MAP
/*
        System.out.println("");

        Map<String, List<Person> >map = new HashMap<>();
        map.put("Ciudad Obregon", Arrays.asList(gabo));
        map.put("Ensenada", Arrays.asList(roman));
        map.put("Guadalajara", Arrays.asList(beatriz));

        map.forEach((x,y)-> System.out.println(x + " - "+ y));

        System.out.println("");
        System.out.println(map.getOrDefault("Ensenada", null));


        System.out.println("\nPut if absent part");
        map.putIfAbsent("Boston", new ArrayList<>());

        map.forEach((x,y)-> System.out.println(x + " - "+ y));
*/
    }
}
