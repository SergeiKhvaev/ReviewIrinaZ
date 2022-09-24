package day44_abstraction_polimorphism2.animal;

public class Wild {
    public static void main(String[] args) {

        // lizard object with all referenses

        Lizard lizard1 = new Lizard();// reserence of itselfe

        // reference of super class
        Reptile lizard2 = new Lizard();

        Animal lizard3 = new Lizard();


        // execution always happen on object site
        lizard1.eat();
        lizard2.eat();
        lizard3.eat();


    }
}
