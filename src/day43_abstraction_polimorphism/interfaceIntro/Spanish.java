package day43_abstraction_polimorphism.interfaceIntro;

public class Spanish implements Language {
// we inherit abstract methods from interface and here we must implement abstract methods from interface Language - Parent by default Object class

    @Override
    public void hello() {
        System.out.println("Hola");

    }

    @Override
    public void bye() {
        System.out.println("Adios");

    }
}
