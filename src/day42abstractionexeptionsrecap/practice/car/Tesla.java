package day42abstractionexeptionsrecap.practice.car;

public class Tesla extends ElectroCar {
    /*
    reate a concrete class Tesla
     sub class of ElectricCar
    override the start method to print:
        key card near by, starting car
    override the charge method to print:
        at tesla charging station
     */
    @Override
    public void start(){
        System.out.println("Use card to start");
    }
    @Override
    public void charge(){
        System.out.println("At tesla charging station");
    }
}
