package day43_abstraction_polimorphism.selfpractice.web;

public class Run {
    public static void main(String[] args) {

       InputFields obj1 = new InputFields();
       obj1.getText();// impleneted methods from InputFields class
        obj1.click();// impleneted methods from InputFields class

        System.out.println("===============");
        Link obj2 = new Link();
        obj2.click();// impleneted methods from click class
        obj2.getText();// impleneted methods from click class

        System.out.println("=====================");
        Button obj3 = new Button();

        obj3.getText();// impleneted methods from click Button
        obj3.click();// impleneted methods from click Batton


    }
}
