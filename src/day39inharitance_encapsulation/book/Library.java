package day39inharitance_encapsulation.book;

public class Library {
    public static void main(String[] args) {

        BookSuperClass book1 = new AudioBookSubClass();
        book1.author = "James Clear";
        book1.title = "Atomic habits";
        // has access to 6 variables


        AudioBookSubClass book2 = new AudioBookSubClass();
        book2.duration = 45;
        book2.narrator = "Sergei Star";
        book2.hasMovie = false;
        book2.genre = "Horror";
        book1.title = "The it";
        // has access to 8 variables (6 from Parent class + 2 own variables



        Ebook book3 = new Ebook();
        book3.onKindle = true;
        book3.size = 68;
        // has access to 8 variables (6 from Parent class + 2 own variables


    }
}
