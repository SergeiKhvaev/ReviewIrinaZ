package day40methodovverriding.devices;

public class TV extends Device{
    /*
    Create a class called TV:
            - attributes: brand, model, price, wireless
- methods: toString(),
    useDevice(): Override to print Using TV
     */

    int diagonal; // instance variable for instance TC class

    public TV(String brand, String model, double price, boolean isWireless, int diagonal){ // created subclass constructor with called Super class constructor + one own variable
        super(brand, model, price, isWireless);
        this.diagonal = diagonal;
    }

    @Override
    public String UseDevice(){ // another implementation of Super class method
        return "Using TV";
    }


    public String toString(){
       return super.toString() + "'\'diagonal " + diagonal + "}";// built toString method in sub class using key word "super" to call super class toString method + own sub class variable new
    }

}
