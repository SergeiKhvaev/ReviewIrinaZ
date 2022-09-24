package day45_casting_collections.building;

public class House extends Building implements HasBackyard{
    int numberOfResidents;

    public House(String location, int price, int numberOfResidents){
        super(location, price);
        this.numberOfResidents = numberOfResidents;
    }

    @Override
    public void pay() {
        System.out.println("Paying mortgage");

    }

    @Override
    public void mowLawn() {
        System.out.println("Mowing the lawn on backyard");

    }

    public String toString(){
        return super.toString() + "number of residents" + numberOfResidents;

    }

}
