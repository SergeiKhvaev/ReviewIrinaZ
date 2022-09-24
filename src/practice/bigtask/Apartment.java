package practice.bigtask;

public class Apartment extends Building implements HasBalcony{

    int monthsOfLease;

    public Apartment(String location, double price, int monthsOfLease){
        super(location, price);
        this.monthsOfLease = monthsOfLease;

    }
    @Override
    public void pay(){
        System.out.println("Pay for apartment");
    }

    @Override
    public void openBalcony(){
        System.out.println("Open balcony in apartment");
    }

    public String toString(){
        return super.toString() + ", months of lease = " + monthsOfLease;
    }


}
