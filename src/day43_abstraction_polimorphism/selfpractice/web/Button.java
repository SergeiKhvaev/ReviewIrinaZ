package day43_abstraction_polimorphism.selfpractice.web;

public class Button implements WebElement, Clickable{
    /*
    create a class Button
    implement the WebElement & Clickable interface
    override all abstract methods
     */
    @Override
    public void getText(){
        System.out.println("Get text from Button");
    } // abstract method overriden from interface WebElement

    @Override
    public void click(){
        System.out.println("Click button");// abstract method overriden from interface Clickable
    }

}
