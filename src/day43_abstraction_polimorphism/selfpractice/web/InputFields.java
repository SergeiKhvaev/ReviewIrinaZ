package day43_abstraction_polimorphism.selfpractice.web;

public class InputFields implements Clickable, WebElement{
    /*
    create a class InputField
    implement the Webelement & Clickable & Input interfaces
    override all abstract methods
     */
    @Override
    public void click(){
        System.out.println("Click Input fields"); //
        // abstract method overriden from interface Clickable
    }
    public void getText(){
        System.out.println("Get text from input fields"); // abstract method overriden from interface Clickable
    }

}
