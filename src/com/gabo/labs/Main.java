package com.gabo.labs;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Person gabo = new Person()
                .setName("Gabo")
                .setAge(30);

        Function<Person, Integer> function = person -> person.getAge();
        Function<Person, Integer> functionMethodReference = Person::getAge;

        System.out.println(function.apply(gabo));
        System.out.println(functionMethodReference.apply(gabo));


        BinaryOperator<Integer> binaryOperator = Integer::sum;
        System.out.println(binaryOperator.apply(15,10));

        BiFunction<Integer, Integer, String> biFunction = (x,y) -> x + y + "";
        System.out.println(biFunction.apply(15,302));

        Consumer<String> consumer = System.out::println;
        consumer.accept("Que onda Bato");





    }
}
