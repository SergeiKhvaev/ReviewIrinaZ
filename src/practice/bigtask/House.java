package practice.bigtask;

public class House extends Building implements HasBackyard {

    int numberOfResedents;

    public House(String location, double price, int numberOfResedents){
       super(location, price);
        this.numberOfResedents = numberOfResedents;

    }

    @Override
    public void pay(){
        System.out.println("Pay for house");
    }

    @Override
    public void mowLawn(){
        System.out.println("Going to backyard");
    }

    public String toString(){
        return super.toString() + ", number of house resedents =" + numberOfResedents;
    }




}
