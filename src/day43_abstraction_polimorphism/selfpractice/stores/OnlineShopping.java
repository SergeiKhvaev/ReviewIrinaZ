package day43_abstraction_polimorphism.selfpractice.stores;

public abstract class OnlineShopping extends Shopping implements Shipping{
    /*
    Create an abstract class OnlineShopping
    - Inherits Shopping and implements Shipping
    - Does not need to implement any abstract methods
    - Declare an abstract methods:
        viewCart()
     */
    public abstract void viewCart();


    // we also can override abstract methods from Shopping abstract class and from Shipping interface
}
