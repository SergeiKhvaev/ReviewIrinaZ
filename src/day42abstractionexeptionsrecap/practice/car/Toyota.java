package day42abstractionexeptionsrecap.practice.car;

public class Toyota extends Car {
    /*
    Create a concrete class Toyota
    sub class of Car
    override the start method to print:
        turning key to start

     */
    @Override
    public void start(){
        System.out.println("Turn the key to start");
    }

    @Override
    public String toString() {
        return "Toyota{}";
    }
}
