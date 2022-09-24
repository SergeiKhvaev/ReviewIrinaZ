package day44_abstraction_polimorphism2.tounderstending;

import java.util.ArrayList;
import java.util.Arrays;

public class Run {

    public static void main(String[] args) {

        Shape squerFromShape = new Squere(3.2, 3.5, "green", "squer");

        System.out.println(squerFromShape.area());
    //object1.width = ;
    //object1.length; - not accessible by reference that because those variable not exists in Super class
        squerFromShape.color = "green"; // can call by that reference, because that variable declared in Super class
        System.out.println(squerFromShape.area()); // return area() overryden in sub class, no metter is there any implementatuon of that method in super class
        System.out.println(squerFromShape);

        Squere squereFromSquer = new Squere(2, 3, "red", "Squer");
        System.out.println(squereFromSquer.area());
        Squere object2 = new Squere(2, 5, "yellow", "Squere");

        Shape circleFromShape = new Circle("Black", 3, "Circle");
        System.out.println(circleFromShape);

        Circle circleFromCircle = new Circle("green", 5, "Circul");
        System.out.println(circleFromCircle);

        System.out.println("====================");
        // put all objects to data structure

        ArrayList<Shape> allObjects = new ArrayList<>();

        allObjects.addAll(Arrays.asList(squerFromShape, squereFromSquer, circleFromShape, circleFromCircle));
        System.out.println(allObjects);
        System.out.println("=========================");
        for(Shape eachElement : allObjects){

                System.out.println(eachElement.name + " " + eachElement.color + " " +eachElement.area());
            }
        }




    }

