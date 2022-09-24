package day37staticvariablesandmethod.car;

public class Street {
    public static void main(String[] args) {
        Car bmw = new Car("X5", "James", 232233, 'C');
        System.out.println(bmw.model);
        System.out.println(bmw.driver);
        System.out.println(bmw.driver.name);
        System.out.println(bmw.driver.licenceNum);

        //


    }
}
