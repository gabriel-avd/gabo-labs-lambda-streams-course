package com.gabo.labs.functional.interfaces;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> pred1 = s -> s.length() < 20;
        Predicate<String> pred2 = s -> s.length() > 5;
        System.out.println(pred1.test("Hola mundossssssssssssssssss"));

        Predicate<String> pred3 =  pred1.and(pred2);
        Predicate<String> pred4 =  pred1.or(pred2);
        System.out.println("\nPred 3: Hola mundo -"+pred3.test("Hola mundo"));
        System.out.println("Pred 3: Hol -"+pred3.test("Hol"));

        System.out.println("\nPred 4: Hola mundossssssssssssssssss -"+pred4.test("Hola mundossssssssssssssssss"));
        System.out.println("Pred 4: Hol -"+pred4.test("Hol"));

        BiPredicate <Integer, Integer> biPredicate = (x,y) -> (x + y ) > 50;

        System.out.println("\nBiPredicate : "+biPredicate.test(15,50));

        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.accept("Hola Mundo");

        BiConsumer<String, String> biConsumer = (x,y) -> System.out.println(x +" - " + y);
        biConsumer.accept("Hola", "Panchito");
    }
}
