package day45_casting_collections.building;

public class Apartment extends Building implements HasBalcony {

    int monthsOfLease;

    public Apartment(String location, double price, int monthsOfLease){
        super(location, price);
        this.monthsOfLease = monthsOfLease;
    }

    @Override
    public void pay() {
        System.out.println("Paying for apartment rent");

    }

    @Override
    public void openBalcony() {
        System.out.println("Opening dor for balcony");


    }
    @Override
    public String toString(){
        return super.toString() + " month of lease " + monthsOfLease;
    }
}
