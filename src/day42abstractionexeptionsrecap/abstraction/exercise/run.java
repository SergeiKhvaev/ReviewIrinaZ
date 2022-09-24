package day42abstractionexeptionsrecap.abstraction.exercise;

public class run extends Exercise{
    @Override
    public void perform(){
        System.out.println("We are running");
    }

    @Override
    public void getCaloriesBurned(int minutes){
        System.out.println(minutes * 0.55);
    }// 0,55 define amount of calories per minutes

    // Run is an Exercise class
    // Run is non abstract class (normal class)
    // Run is first non abstruct class it is first the concrete class

    //concrete classe must implement(override)  all abstract method
}
