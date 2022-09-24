package day43_abstraction_polimorphism.selfpractice.web;

public class Link implements Clickable, WebElement{
    /*
    create a class Link
    implement the WebElement & Clickable interface
    override all abstract methods
     */
    @Override
    public void click(){
        System.out.println("Click link"); //
        // abstract method overriden from interface Clickable
    }
    public void getText(){
        System.out.println("Get text fo, link"); // abstract method overriden from interface Clickable
    }

}
