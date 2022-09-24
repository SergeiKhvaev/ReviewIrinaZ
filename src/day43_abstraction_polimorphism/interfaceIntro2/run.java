package day43_abstraction_polimorphism.interfaceIntro2;

public class run {
    public static void main(String[] args) {
// every thing  I can access from interface because those variables and methods are static
        System.out.println(Mac.brand); // because it static variable
        System.out.println(Mac.OS);// because it static variable
      Mac.getBrand();// because it static method
    }
}


