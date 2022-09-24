package practice.bigtask;

public class HouseObject {
    public static void main(String[] args) {

        // regular reference by object class, full access
        House house1 = new House("VA", 150, 4);
        System.out.println(house1);
        System.out.println(house1.location);
        System.out.println(house1.location);
        System.out.println(house1.numberOfResedents);
        house1.pay();
        house1.mowLawn();

        System.out.println("=====================================");

        // reference by Parent
        Building house2 = new House("FL", 200, 5);
        System.out.println(house2);
        // we have access to variables which present only in Parent class
        System.out.println(house2.location);// belong to Parent class
        System.out.println(house2.price);// belong to Parent class
       // System.out.println(house2.numberOfResedents); //not belong to Parent class, which referance we use to create that object
      // System.out.println(house2.numberOfResedents);// do not have access, because that variable not declared in Parent building class
        house2.pay(); // can call it because that method created in Parent class and overriden to object class House
       // house2.mowLawn();// not belong to Parent class


        System.out.println("=====================================");

        // reference by Interface with one abstract method
        HasBackyard house3 = new House("D.C.", 500, 7);
        System.out.println(house3);
      house3.mowLawn();// can call because that method created in implemented interface and overriden in object class House
        //System.out.println(house3.location); no acceess to those variablese because variables not belong to Interface, they were created in another classes
        //System.out.println(house3.price);
        //System.out.println(house3.numberOfResedents);




    }

}
