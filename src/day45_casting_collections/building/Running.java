package day45_casting_collections.building;

import java.util.ArrayList;

public class Running {
    public static void main(String[] args) {
        // referens to itself
        House house1 = new House("Paris", 100_000_000, 10);
        // full access


        // reference by Superclass
        Building house2 = new House("New York", 2_000_000, 4); // execution on object (house) site, so we can create object at least+ releatet variables


        // reference by interface

        HasBackyard house3 = new House("Seattle", 3_000_000, 5);
        house3.mowLawn(); // only access have to
        // other featurese no access, because HasInterface see only nowLawn method, nothing else (but we can do casting);

        System.out.println(rent(house1));
        System.out.println(rent(house2));
        System.out.println(rent(new OfficeBuilding("Texas", 15_000_000, 6)));
        System.out.println(rent(new Apartment("Nevada", 800_000, 8)));
       // System.out.println(rent(house3));// because reference not to Building, but by interface


        System.out.println(search("Fairfax"));
        System.out.println(search("Mclean"));
        System.out.println("Great Falls");
        System.out.println(search("Alexandria"));






    }

    public static double rent(Building object) {
        if (object instanceof House) {
            return 1500;
        } else if (object instanceof Apartment) {
            return 800;
        } else if (object instanceof OfficeBuilding) {
            return 2000;
        } else {
            return -1; // or we can throw an exception with explanation
        }
    }

public static Building search(String location){// we can have returning type interface too // so Building returning type it is reference!!!!!! (just type of non-primitive type)

        if(location.equalsIgnoreCase(("Great Falls"))){
            return new House("Great Falls", 500_000, 4);
        }else if (location.equalsIgnoreCase("Fairfax")){
            return new Apartment("Fairfax", 250_000, 6);
        }else if (location.equalsIgnoreCase("Mclean")){
            return new OfficeBuilding("Mclean", 2_000_000, 9);
        }
    return null;

}







}