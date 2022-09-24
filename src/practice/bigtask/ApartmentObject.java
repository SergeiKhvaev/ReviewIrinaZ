package practice.bigtask;

public class ApartmentObject {
    public static void main(String[] args) {

        // direct to object reference
        Apartment apt1 = new Apartment("IL", 100, 1300);
        System.out.println(apt1);
        System.out.println(apt1.location);// we have access to all variablec because of inheritance
        System.out.println(apt1.price);
        System.out.println(apt1.price);
        apt1.pay();
        apt1.openBalcony();// have access because implemented Interface openBalcony and overryden from there

        System.out.println("================");

        // indirect reference by Parent class reference

        Building apt2 = new Apartment("CR", 90, 1000);
        System.out.println(apt2);
        System.out.println(apt2.location); // access because that variables presents in Parent class
        System.out.println(apt2.price);// access because that variables presents in Parent class
       // System.out.println(apt2.monthsOfLease);// no access because variable not belong to PArent class
        apt2.pay();// has access because that method created in Parent class and overidden in object class Apartment
        //apt2.openBalcony // no access because method not belong Parent class which reference we use

        System.out.println("================");

        // indirect reference by implemented Interface class reference

        HasBalcony apt3 = new Apartment("MD", 1650, 110);
        System.out.println(apt3);
        apt3.openBalcony();
      // apt3.pay(); // cant call because method not belong to Interface


    }

}
