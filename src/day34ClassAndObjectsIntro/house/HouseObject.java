package day34ClassAndObjectsIntro.house;

public class HouseObject {
    public static void main(String[] args) {
        House houseOne = new House();
        System.out.println(houseOne);// default information
        houseOne.type = "Singl Family";
        houseOne.numberOfStoreys = 3;
        houseOne.squarFeet = 2500;
        houseOne.numberOfBedrooms = 4;
        houseOne.isCity = true;
        houseOne.hasGarage = true;
        System.out.println(houseOne);// dont need call toString, called automatically, because we created (generated) that method in class? and defined what and how we want to see, when call toString method

        System.out.println(houseOne.calculateMorgage());

    }
}
