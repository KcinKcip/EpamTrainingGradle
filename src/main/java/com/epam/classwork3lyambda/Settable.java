package com.epam.classwork3lyambda;

@FunctionalInterface
public interface Settable<C> {

    void set(C entity, String name, int age);
}
