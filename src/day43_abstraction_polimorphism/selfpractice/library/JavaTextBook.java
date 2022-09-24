package day43_abstraction_polimorphism.selfpractice.library;

public class JavaTextBook extends Ebook {
    /*
    Create a concrete class JavaTextbook
    - Inherits EBook
    - Declare a fun variable
    - Override all abstract methods
     */
    String fun;// created instance variable


    @Override
    public void open(){
        System.out.println("Open book");// overriden abstract method from abstract class Ebook

    }
    @Override
    public void read(){
        System.out.println("Read book"); // overriden abstract method from abstract class Book
    }

    @Override
    public void downLoad(){
        System.out.println("Down load VAva text book"); //overriden abstract method from Interface DownLoadable
    }


}
