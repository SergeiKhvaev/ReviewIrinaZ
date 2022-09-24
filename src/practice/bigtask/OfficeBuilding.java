package practice.bigtask;

public class OfficeBuilding extends Building implements HasElevator{

    int numberOfFloor;

    public OfficeBuilding(String location, double price, int numberOfFloor){
        super(location, price);
        this.numberOfFloor = numberOfFloor;

    }
    @Override
    public void pay(){
        System.out.println("Pay for office");
    }

@Override
    public void elevator() {
    System.out.println("Use office building elevator");
}


    @Override
    public String toString(){
        return super.toString() + ", office building elevator = " + numberOfFloor;
    }

}


