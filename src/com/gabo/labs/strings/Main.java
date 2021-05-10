package com.gabo.labs.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String panda = "   Panda";
        String fish = "   fish   ";
        String horse = "Horse   ";
        String cat = "   CAT";
        String nothing = "   ";

        List<String> animals = Arrays.asList(panda, fish, horse, cat, nothing);
        animals
                .stream()
                .forEach(s -> System.out.println(s));

       List<String> normalizedAnimals = animals
                .stream()
                .map(s -> s.trim())
                .map(s -> s.toLowerCase())
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        System.out.println("Not Normalized animals: " + animals);
        System.out.println("Normalized animals: " + normalizedAnimals);
    }
}
