package day37staticvariablesandmethod.car;

public class Car {

    String model;
    Driver driver; // made reference to Driver class we did it to create object type, we uses custom class as instance variable in another class, SO WE CAN HAVE OBJECT AS INSTANCE VARIABLE


    //when i call the Car constructor? the cjde inside is calling Driver constructor
    public Car(String model, String name, long licenceNum, char licenceType){ //оложили все instance variables как из данного класса так и из другого класса, который относится к описанию водителя (Driver)
        this.model = model;
        driver = new Driver(name, licenceNum, licenceType); // we call another constructor inside constructor, creating A Driver object(we create it inside constructer car), we need it in order to have an accesse to instance variables of another class, which describe driver(Driver class)
    }
public Car(String model, Driver driver) {
    this.model = model;
    this.driver = driver;
}



    }



