package day39inharitance_encapsulation.person;

public class Person {
    String name;
    int age;

    public Person(String name, int age) { // Parent constructor
        // super() - this key word call for us Parent constructor in Child class
        this.name = name;
        this.age = age;
    }
}
