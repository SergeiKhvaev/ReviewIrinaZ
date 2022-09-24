package day43_abstraction_polimorphism.selfpractice.stores;

public class Target extends Shopping{
    /*
    Create a concrete class Target
    - Make the class final
    - Inherit Shopping and implement all abstract methods
     */

    public void buyItem(){
        System.out.println("buy items we need"); // // abstract method overriden from abstract class Shopping
    }

    public void returnItem(){
        System.out.println("return defect item"); // // abstract method overriden from abstract class Shopping
    }

}
