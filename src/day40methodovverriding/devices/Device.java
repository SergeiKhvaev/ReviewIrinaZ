package day40methodovverriding.devices;

public class Device {
   /* Create a class called device:
            - attributes: brand, model, price, wireless
- methods: toString(), useDevice()
    Create a class called TV:
            - attributes: brand, model, price, wireless
- methods: toString(),
    useDevice(): Override to print Using TV
    Create a class called Phone:
            - attributes: brand, model, price, wireless
- methods: toString(),
    useDevice(): Override to print Using Phone
    Create a class UseDevice
	create an object of TV and Phone and verify if constructor,
    toString(), and useDevice() are working properly for each class
    List the is a relations of all the classes
    */

    String brand;
    String model;
    double price;
    boolean isWireless;

    public Device(String brand, String model, double price, boolean isWireless){ // constructor wirth parameters
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.isWireless = isWireless;
    }

    public String UseDevice(){ // method for future overriding
        return "";
    }



    public String toString() { // regular toString method to help us print info about object
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isWireless=" + isWireless +
                '}';
    }
}
