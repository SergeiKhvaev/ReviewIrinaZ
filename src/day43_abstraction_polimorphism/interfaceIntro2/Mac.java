package day43_abstraction_polimorphism.interfaceIntro2;

public interface Mac {
    public static final String brand = "Apple";//public static final key word do not need to use it

    String OS = "IOS"; // public static final by default in interface

    // instance(not static) variables is not allowed in interface

    // methods^ in interface defined dy default abstract methods

    void turnOn(); // public abstract void turnOn() by default in interface -> we can not have any code block in methods

    public static void getBrand(){ // public static methods can be in interface, that method must have code body? public by default that is why public is grey
        System.out.println("Apple");
    }

    // default method

    public default void typing(){

        System.out.println("Typing an apple keyboard");

    }// this is default method us create a method with implementation in the interface.It is not default access modifier. This is an instance method for class that implements




}
