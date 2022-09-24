package day45_casting_collections.building;

public class OfficeBuilding extends Building implements HasElevator{

    int numberOfFloors;

    public OfficeBuilding(String location, double price, int numberOfFloors) {
        super(location, price);
        this.numberOfFloors = numberOfFloors;


    }

    @Override
    public void pay() {
        System.out.println("Paying rant for office spase");

    }

    @Override
    public void elevator(int floor) {
        System.out.println("We are goint to floor" + floor);

    }

    public String toString(){
        return super.toString() + "number of floors " + numberOfFloors;
    }
}
