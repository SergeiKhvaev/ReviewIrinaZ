package day43_abstraction_polimorphism.selfpractice.stores;

public final class Amazon extends OnlineShopping{
    /*
    Create a concrete class Amazon
    - Make the class final
    - Inherit OnlineShopping and implement all abstract methods
     */
    // final class can not to be Parent class, can not be inheriten in any sub class

    @Override
    public void viewCart(){
        System.out.println("Check my cart");
    } // abstract method overriden from OnlineShopping abstract class

    @Override
    public void buyItem(){
        System.out.println("Buy item we choosen");// abstract method overriden from Shopping abstract class
    }
    @Override
    public void returnItem(){
        System.out.println("Return item we choosen, because it has defect");// abstract method overriden from Shopping abstract class
    }

    @Override
    public void payForShipping(){
        System.out.println("Pay for shipping need"); //abstract method overriden from Shipping interface
    }


}
