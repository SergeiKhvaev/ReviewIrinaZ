package day40methodovverriding.devices;

public class Iphone extends Device {
    /*
    Create a class called Phone:
            - attributes: brand, model, price, wireless
- methods: toString(),
    useDevice(): Override to print Using Phone
     */
    double cameraPix;

    public Iphone(String brand, String model, double price, boolean isWireless, double cameraPix){
        super(brand, model, price, isWireless);
        this.cameraPix = cameraPix;
    }
    public String UseDevice(){
        return "Using Phone";
    }

    public String toString(){
        return super.toString() + "'\'pixels of camera  " + cameraPix + "}"; // built toString method in sub class using key word "super" to call super class toString method + own sub class variable
    }




}
