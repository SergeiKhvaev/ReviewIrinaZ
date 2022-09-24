package day39inharitance_encapsulation.access.b;


import day39inharitance_encapsulation.access.a.House;

public class Runnerb {
    public static void main(String[] args) {
        // what does tounhouse inherite from House (locaten in another packege)

TownHouse house = new TownHouse();
house.address = "11232 road";// public
//house.city = "New York";// protected not acceceble outside of packedge
        //house.state // defaulte, not accasible in another class
        //   house.zipCode private, not accasible in another class




    }


}
