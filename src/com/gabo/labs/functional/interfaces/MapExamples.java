package com.gabo.labs.functional.interfaces;

import com.gabo.labs.City;
import com.gabo.labs.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExamples {
    public static void main(String[] args) {
        Person p1 = new Person(30, "Gabo");
        Person p2 = new Person(15, "Roman");
        Person p3 = new Person(45, "Eli");
        Person p4 = new Person(45, "Beatriz");
        Person p5 = new Person(15, "Gustavo");
        Person p6 = new Person(15, "Jose");

        City paris = new City("Paris");
        City tokyo = new City("tokyo");
        City germany = new City("germany");

        Map<City, List<Person>> map1 = new HashMap<>();
        Map<City, List<Person>> map2 = new HashMap<>();

        map1.computeIfAbsent(paris, city -> new ArrayList<>()).add(p1);
        map1.computeIfAbsent(paris, city -> new ArrayList<>()).add(p2);
        map1.computeIfAbsent(tokyo, city -> new ArrayList<>()).add(p3);

        map2.computeIfAbsent(tokyo, city -> new ArrayList<>()).add(p4);
        map2.computeIfAbsent(germany, city -> new ArrayList<>()).add(p5);
        map2.computeIfAbsent(germany, city -> new ArrayList<>()).add(p6);

        System.out.println("Map1");
        map1.forEach((city, persons) -> System.out.println(city + " = " + persons));

        System.out.println("\nMap2");
        map2.forEach((city, persons) -> System.out.println(city + " = " + persons));

        map2.forEach(
                (city, persons) ->
                        map1.merge(city, persons, (personsFromMap1, personsFromMap2) -> {
                                    personsFromMap1.addAll(personsFromMap2);
                                    return personsFromMap1;
                                }
                        )
        );

        System.out.println("\nMerged Map1");
        map1.forEach((city, persons) -> System.out.println(city + " = " + persons));

    }
}
