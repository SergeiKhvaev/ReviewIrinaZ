package day37staticvariablesandmethod.bestbuy;

public class BestBuyStores {
    public static void main(String[] args) {

        //Static variable examples


StaticIntroBestBuy store1 = new StaticIntroBestBuy();
store1.location = "FairFax";
        System.out.println(store1.location); // instance variable - like normal flow, Wu use name Object name to access to variable

        System.out.println(StaticIntroBestBuy.headquaters);// this is a static variable so we used CLASS name to acces it
        System.out.println(store1.headquaters);//  valid syntax, we have access to static variable, by object, but in general we should use class name to access static variable

        System.out.println("===========================");

        // other static members
        System.out.println(Math.PI); // example of static variable (access by class
       // Arrays.sort();// example by class name so it is static method from Arrays class

        System.out.println((Integer.MAX_VALUE)); // example of static variable from Integer class




    }

}