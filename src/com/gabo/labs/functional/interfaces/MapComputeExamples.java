package com.gabo.labs.functional.interfaces;

import com.gabo.labs.Person;

import java.util.*;

public class MapComputeExamples {
    public static void main(String[] args) {
        Person gabo = new Person(30, "Gabo");
        Person roman = new Person(15, "Roman");
        Person eli = new Person(45, "Eli");
        Person beatriz = new Person(45, "Beatriz");
        Person gustavo = new Person(15, "Gustavo");
        Person jose = new Person(15, "Jose");

        Map<String, List<Person>> stringListMap = new HashMap<>();

        stringListMap.put("one", new ArrayList<Person>());
        stringListMap.get("one").add(gabo);

        stringListMap.put("dos", new ArrayList<Person>());
        stringListMap.get("dos").add(roman);
        stringListMap.get("dos").add(eli);

        stringListMap.forEach((x, y) -> System.out.println(x + " - " + y));

        stringListMap.computeIfAbsent("tres", key -> new ArrayList<>()).add(gustavo);

        System.out.println("");
        stringListMap.forEach((x, y) -> System.out.println(x + " - " + y));

        System.out.println("");
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("Uno", 1);
        stringIntegerMap.put("Dos", 2);
        stringIntegerMap.put("Tres", 3);


        stringIntegerMap.computeIfPresent("Tres", (s, integer) -> {
            System.out.println("key del map: " + s);
            return integer + 5;
        });
        stringIntegerMap.forEach((x, y) -> System.out.println(x + " - " + y));

        System.out.println("");
        stringIntegerMap.computeIfAbsent("Cuatro", s ->4);
        stringIntegerMap.forEach((x, y) -> System.out.println(x + " - " + y));


    }
}
