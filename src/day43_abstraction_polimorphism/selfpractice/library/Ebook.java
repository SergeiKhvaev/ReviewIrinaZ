package day43_abstraction_polimorphism.selfpractice.library;

public abstract class Ebook extends Book implements DownLoadable{
    /*
    Create an abstract class EBook
    - Inherits Book and implements Downloadable
    - Declare a size variable
    - Declare an abstract methods:
        open()
     */

    double size; // declare instance variable in abstract class
    public abstract void open();// created abstract method




}
