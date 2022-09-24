package day39inharitance_encapsulation.access.c;

import day39inharitance_encapsulation.access.a.House;

public class toUnderstan extends House{
    public static void main(String[] args) {


        condoObject newhouse = new condoObject(); // Sub class from Parent Class - House
        //newhouse.city = "woodbridge";
        toUnderstan newDom = new toUnderstan();

        newDom.city = "Woodbridge";

    }
}
