package day45_casting_collections.building;

import java.util.ArrayList;

public class BuildingMarket {
    public static void main(String[] args) {
        ArrayList <Building> listOfBuilding = new ArrayList<>();// can holld objects of House, Apartament, OfficeBuilding

        listOfBuilding.add(new House("New York", 400_000, 4));
        listOfBuilding.add(new Apartment("Texas", 3_000_000, 6));
        listOfBuilding.add(new OfficeBuilding("Virginia", 20_000_000, 6));
        listOfBuilding.add(Running.search("Mclean")); // define object to add by method, which return appropriate object
        listOfBuilding.add(Running.search("Fairfax"));
        listOfBuilding.add(Running.search("Great Falls"));

        // most expensive building

        Building mostExpensive = listOfBuilding.get(0); //first index object in Array is most expensve by default

        for(Building eachElement : listOfBuilding){
            if(eachElement.price > mostExpensive.price){
                mostExpensive = eachElement;
            }
        }
        System.out.println(mostExpensive);

// downcasting examle
       // mostExpensive.numberOfFloors; // can find numbers of floor, because mostExpensive object use Building (super class) reference), where we do not have numbersOfFloors variable(that variables appeared in sublcass OfficeBuilding, so in that situation need down casting of reference type
        System.out.println(((OfficeBuilding)mostExpensive).numberOfFloors);


        // Filler by price range

        ArrayList<Building> filteredList = new ArrayList<>(listOfBuilding);

        filteredList.removeIf(p -> p.price >= 2_000_000 || p.price <= 300_000);
        System.out.println(filteredList);









    }
}
