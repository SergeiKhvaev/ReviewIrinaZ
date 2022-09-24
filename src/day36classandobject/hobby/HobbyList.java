package day36classandobject.hobby;

import java.util.ArrayList;

public class HobbyList {
    public static void main(String[] args) {
     /*
      Create a separate class to create and test the Hobby objects
        - create an ArrayList of Hobby objects
        - create and add a couple Hobby objects
        - iterate through the ArrayList and execute the doIt() method on each Hobby object
        - create a copy ArrayList and remove all outdoors Hobbies
        - create a copy ArrayList and remove all hobbies requiring other people
        - create a copy ArrayList and remove all hobbies that cost more than $500 annually
      */
        ArrayList<Hobby> myHobbies =new ArrayList<>();
        myHobbies.add(new Hobby("Golf", 1000, true, false));
        myHobbies.add(new Hobby("Puzzles", 50, false, false));
        myHobbies.add(new Hobby("Basketball", 2500, true,true));
        myHobbies.add(new Hobby("Online games", 550, false, true));
        myHobbies.add(new Hobby("Traiding", 450, false, false));
        System.out.println(myHobbies);//печатаем весь arrayList

        System.out.println("===============================");
      //  - iterate through the ArrayList and execute the doIt() method on each Hobby object

        ArrayList <Hobby> doItForAllHobbies = new ArrayList<>(myHobbies);

        for(Hobby eachElement : doItForAllHobbies){
            System.out.println(eachElement.name + " = " + " " + eachElement.doIt());
        }

        System.out.println("=================================");
        // - create a copy ArrayList and remove all outdoors Hobbies
        ArrayList<Hobby> withoutOutDoors = new ArrayList<>(myHobbies);

        withoutOutDoors.removeIf(n -> n.isOutDoor);
        System.out.println(withoutOutDoors);

        System.out.println("==================================");
      //  - create a copy ArrayList and remove all hobbies requiring other people
        ArrayList<Hobby> playAlong = new ArrayList<>(myHobbies);

        for(Hobby eachElement : playAlong){
            if(!eachElement.isOtherPeopleReq){
                System.out.println(eachElement);
            }
        }
playAlong.removeIf(p -> p.isOtherPeopleReq);
        System.out.println(playAlong);

        System.out.println("==================================");
//        - create a copy ArrayList and remove all hobbies that cost more than $500 annually
        ArrayList<Hobby> expensiveHobbies = new ArrayList<>(myHobbies);
        expensiveHobbies.removeIf(n -> n.annualCoast > 500);
        System.out.println(expensiveHobbies);
    }
}
