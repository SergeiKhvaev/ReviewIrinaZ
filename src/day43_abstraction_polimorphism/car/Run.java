package day43_abstraction_polimorphism.car;

public class Run {
    public static void main(String[] args) {

        Toyota toyota = new Toyota();
        toyota.Start();

        BMW bmw = new BMW();
        bmw.Start();

        Tesla tesla = new Tesla();
        tesla.charge();
        tesla.Start();
        tesla.closeDoor();
    }
}
