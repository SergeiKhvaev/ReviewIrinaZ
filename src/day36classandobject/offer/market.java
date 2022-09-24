package day36classandobject.offer;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;

public class market {

    public static void main(String[] args) {

        // remember custom class we can consider luke custom type -> custom object

        ArrayList<offer> allOffers = new ArrayList<>();
        allOffers.add(new offer("Amazon", "San Diego", 120000, true, 15));
        allOffers.add(new offer("Chase", "Chicago", 125000, true, 15));
        allOffers.add(new offer("Google", "Seattle", 170000, false, 0));
        allOffers.add(new offer("Accenture", "San Diego", 110000, false, 5));
        allOffers.add(new offer("Walmart", "San Diego", 125000, true, 0));
        allOffers.add(new offer("Meta", "Seattle", 130000, true, 12));
        allOffers.add(new offer("Deloitte", "Seattle", 130000, true, 12));
      //  System.out.println(allOffers);


        //write a program that can only keep the offers from local area
        ArrayList<offer> localOffers = new ArrayList<>(allOffers);
      //  System.out.println(localOffers);
        localOffers.removeIf(offer ->!offer.location.equals("Chicago"));
    System.out.println(localOffers); // Найти ошибку, почему не печатает

        // ручная ольтернатива

        for(offer each : allOffers){
            if(each.location.equals("Chicago")){
                System.out.println(each);// Найти ошибку, почему не печатает
            }
        }

        System.out.println("=========================");
        // fine only full time
        ArrayList<offer> onlyFullTime = new ArrayList<>(allOffers);
        onlyFullTime.removeIf(p -> !p.isFullTime);
        onlyFullTime.forEach(each -> System.out.println(each));

        System.out.println("=========================");
        // finde salary less thet 130K
        ArrayList<offer> minSalary = new ArrayList<>(allOffers);
        minSalary.removeIf(p-> p.salary <130000);
        System.out.println(minSalary);

        System.out.println("=========================================");
// Find the biggest and lowest salary Offers and print the whole object
ArrayList<offer> smallestSalary = new ArrayList<>(allOffers);

double smallestSal = allOffers.get(0).salary;
double biggestSal = allOffers.get(0).salary;
offer maxOffer = allOffers.get(0);
offer minOffer = allOffers.get(0);

for(offer each : allOffers){
    if(each.salary < smallestSal){
        smallestSal = each.salary;
        minOffer = each;
    }
    if(each.salary  > biggestSal){
        biggestSal = each.salary;
        maxOffer = each;

    }
}
        System.out.println("biggest salary: " + biggestSal);
        System.out.println("Max obj " + maxOffer);
        System.out.println("Smallest salary: " + smallestSal);
        System.out.println("Min obj " + minOffer);

    }
}
