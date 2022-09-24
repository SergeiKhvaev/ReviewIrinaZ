package day37staticvariablesandmethod.computer;

public class ComputerStrore {
    public static void main(String[] args) {
        Computer.commonCompInfo(); // static method called by static method
        System.out.println(Computer.hasBattary);// // static variable called by class name
        System.out.println(Computer.hasMemory);// static variable called by class name
        System.out.println(Computer.hasScreen);// static method called static method without object
        System.out.println("====================");
        Computer AMD = new Computer(5000, "Predator", "Black");
        System.out.println(AMD.color);// called instance variables by object name
        System.out.println(AMD.name);
        System.out.println(AMD.price);
    }
}
