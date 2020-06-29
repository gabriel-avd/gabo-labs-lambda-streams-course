package com.gabo.labs.functional.interfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> pred = s -> s.length() < 20;
        System.out.println(pred.test("Hola mundossssssssssssssssss"));

        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.accept("Hola Mundo");

        BiConsumer<String, String> biConsumer = (x,y) -> System.out.println(x +" - " + y);
        biConsumer.accept("Hola", "Panchito");
    }
}
