package com.epam.classwork3lyambda;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();

        System.out.println(cat);

        Settable<Cat> settable = (obj, name, age) -> {
            obj.setName(name);
            obj.setAge(age);
        };

        changeEntity(cat, settable);

        System.out.println(cat);
    }

    private static <T> void changeEntity(T entity, Settable<T> s) {
        s.set(entity, "Tomas", 3);
    }
}
