package day43_abstraction_polimorphism.interfaceIntro;

public class Run {
    public static void main(String[] args) {

       // Language obj = new Language() { // cannot create of interface

        English obj1 = new English();
        obj1.hello();
        obj1.bye();


        Spanish obj2 = new Spanish();
            obj2.hello();
            obj2.bye();

    }
}
