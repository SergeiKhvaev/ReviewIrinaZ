package day42abstractionexeptionsrecap.practice.car;

public class BMW extends Car{
    /*
    Create a concrete class BMW
    sub class of Car
    override the start method to print:
        pressing button to start

     */

    @Override
    public void start(){
        System.out.println("Pressing button to start");
    }
}
