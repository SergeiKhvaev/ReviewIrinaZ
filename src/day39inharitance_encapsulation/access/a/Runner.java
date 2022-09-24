package day39inharitance_encapsulation.access.a;

public class Runner {
    public static void main(String[] args) {

        House house = new House(); // no inharitance
        house.city = "Washington";// no inharitance, but we have access to protected variable because Class and insctance os that class in the same pakege
        System.out.println(house.city);



        // what did we inherite here
        Condo condo = new Condo();// Condo extended by House
        condo.address = "12233 L"; // public
        condo.city = "Orlando"; // we have access to protected variable because this is Sub class from Parent class - House (with OOP inharitance we have acces to object from Sub class
        condo.state = "FL";// same pakage
      //  condo.zipCode = 112122 // private, we can not inherite at all

    }
}
