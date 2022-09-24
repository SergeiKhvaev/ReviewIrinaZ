package day43_abstraction_polimorphism.selfpractice.library;

public class Run {
    public static void main(String[] args) {

        JavaTextBook myBook = new JavaTextBook();
        System.out.println(myBook.fun = "Very funny book"); // called variable declared in JavaTextBook class
        // myBook - object of JavaTextBook class, what extended by Ebook, Ebook extended by Book and has implements from interface DownLoadable
        System.out.println(myBook.name = "Predator VS Alien"); // called variable declered in abstract class book
        System.out.println(myBook.size = 2.2); // variable declared in Ebook class

        System.out.println("=================");
        myBook.downLoad(); // method overriden in javaTextBook, declerade in Interface DownLoadable

        myBook.read();//method overriden in javaTextBook, declerade in  abstract class book
        myBook.open(); //method overriden in javaTextBook, declerade in  abstract class Ebook

    }
}
