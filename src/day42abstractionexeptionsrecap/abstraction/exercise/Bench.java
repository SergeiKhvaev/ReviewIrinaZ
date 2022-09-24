package day42abstractionexeptionsrecap.abstraction.exercise;

public class Bench extends Lifting{ // is my conrete class



    @Override
    public void perform() {
        System.out.println("Bench press");

    }

    @Override
    public void getCaloriesBurned(int minutes) {
        System.out.println(1000 * minutes);// 1000 - define amount of calories per minutes

    }

    @Override
    public void rackWeights() {
        System.out.println("Putting bench back on the rack");

    }
}
