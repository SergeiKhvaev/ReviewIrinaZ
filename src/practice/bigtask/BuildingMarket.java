package practice.bigtask;

import practice.bigtask.Apartment;
import practice.bigtask.Building;
import practice.bigtask.House;
import practice.bigtask.OfficeBuilding;

import java.util.ArrayList;
import java.util.Arrays;

public class BuildingMarket {
    public static void main(String[] args) {

        House houseOne = new House("Mclean", 350_000, 8);
        Apartment apartmentOne = new Apartment("Orlando", 550_000, 9);
        OfficeBuilding officeOne = new OfficeBuilding("Washington D.C.", 2000_000, 13);
        House houseTwo = new House("Miami", 150_000, 5);
        Apartment apartmentTwo = new Apartment("Reston", 752_000, 6);
        OfficeBuilding officeTwo = new OfficeBuilding("Palm Coast", 700_000, 4);
        House houseThree = new House("Clear Water", 675_000, 7);
        Apartment apartmentThree = new Apartment("Miami", 1250_000, 5);
        OfficeBuilding officeThree = new OfficeBuilding("Houston", 1_500_000, 19);

        ArrayList < Building> marketList = new ArrayList<>();
        marketList.addAll(Arrays.asList( houseOne, apartmentOne, officeOne,houseTwo, apartmentTwo, officeTwo, houseThree, apartmentThree, officeThree));
        System.out.println(marketList);

        System.out.println("==============================");
        //find most expensive Building

      double mostExpensivePrice = Double.MIN_VALUE;
      Building mostExpensiveOnbject = marketList.get(0);
        for(Building eachElement : marketList){
          if(eachElement.price > mostExpensivePrice){
              mostExpensivePrice = eachElement.price;
              mostExpensiveOnbject = eachElement;
           }
       }
        System.out.println(mostExpensiveOnbject);

        System.out.println("==============================");
        // find least expensive price

double smallestPrice = Double.MAX_VALUE;
Building leastExpensiveObject = marketList.get(0);
for(Building eachElement : marketList){
    if(eachElement.price < smallestPrice){
        smallestPrice = eachElement.price;
        leastExpensiveObject = eachElement;
    }
}
        System.out.println(leastExpensiveObject);

        System.out.println("===========================");
        // filter objects by Location(Miami)

        for(Building eachElement : marketList){
            if(eachElement.location.equalsIgnoreCase("Miami")){
                System.out.println(eachElement);
            }
        }
        System.out.println("==========================");
        // filter all objects by praice range (500_000 - 770_000)

        for (Building eachElement : marketList){
            if(eachElement.price > 500_000 && eachElement.price < 770_000){
                System.out.println(eachElement);
            }
        }





    }
}
