package day43_abstraction_polimorphism.selfpractice.stores;

public final class Ebay extends OnlineShopping implements AllowUserToSell{
    /*
    Create a concrete class Ebay
    - Make the class final
    - Inherit OnlineShopping and implements interface AllowUsersToSell interface
    - Implement all abstract methods
     */
    @Override
    public void viewCart(){
        System.out.println("Check your cart");// abstract method overriden from abstract class OnlineShopping
    }
    @Override
    public void buyItem(){
        System.out.println("Buy item we took");
    }// abstract method overriden from abstract class Shopping

    @Override
    public void returnItem(){
        System.out.println("Return broken item  we bought");// abstract method overriden from abstract class Shopping
    }

    @Override
    public void payForShipping(){
        System.out.println("Pay for delivery");
    } //abstract method overriden from Shipping interface

    @Override
    public void uploadProduct(){
        System.out.println("Sell out goods");
            } // //abstract method overriden from AllowUserToSell interface

}
