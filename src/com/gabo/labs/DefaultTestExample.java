package com.gabo.labs;

public interface DefaultTestExample {
    default Integer sum(Integer i, Integer y){
        return i+y;
    }

    default Integer odd(Integer i, Integer y){
        return i+y;
    }
}
