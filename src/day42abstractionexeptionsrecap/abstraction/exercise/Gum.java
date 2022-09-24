package day42abstractionexeptionsrecap.abstraction.exercise;

public class Gum {
    public static void main(String[] args) {

        //Exercise obj = new Exercise(); // can mace obj cause Exercise is abstract class

        run obj2 = new run();
        obj2.perform();
        obj2.getCaloriesBurned(30);

       // Lifting obj3 = new Lifting() Lifting is abstract -> we can instatiet it

        Bench obj4 = new Bench();
        obj4.perform();
        obj4.rackWeights();
        obj4.getCaloriesBurned(15);


    }
}
