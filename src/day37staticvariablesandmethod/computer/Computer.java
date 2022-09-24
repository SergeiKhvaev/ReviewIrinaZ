package day37staticvariablesandmethod.computer;

public class Computer {
    /*
    Computer - static
    class name: computer:
        instance variables:
            price, brand, color, ...
        static variables: hasScreen, hasBattery, hasMemory
        make objects of the class in a main method and access
both instance and static members from proper references
     */
    // instance variables
    double price;
    String name;
    String color;

    //static variables
    static String hasScreen; // we declare static variable
    static String hasBattary;// we declare static variable
    static String hasMemory;// we declare static variable


    static { // static code block we use to assign values to static variables
        hasMemory = "Yes"; //we  assign values to static variables
        hasBattary = "by default"; //we assign values to static variables
        hasScreen = "Yes it has it";//we  assign values to static variables
    }

    static void commonCompInfo (){ // we use static method to print static values
        System.out.println("Computer has memory " + hasMemory);
        System.out.println("Computers has battary "  + hasBattary);
        System.out.println("Computers has battary Screen " + hasScreen);
    }

    public Computer (double price, String name, String color){
        this.price = price;
        this.name = name;
        this.color =color;
    }

    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
