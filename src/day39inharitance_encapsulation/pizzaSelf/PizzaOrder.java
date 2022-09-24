package day39inharitance_encapsulation.pizzaSelf;

public class PizzaOrder {
    public static void main(String[] args) {
        PizzaClass twoMeat = new PizzaClass("medium", 2);
        System.out.println(twoMeat);

        PizzaClass pepperonni = new PizzaClass("large", -3);
        System.out.println(pepperonni.getSize());
        System.out.println(pepperonni.getNumberOfToppings());

        System.out.println("=======================");
        PizzaClass pizza3 = new PizzaClass("ככהכ", 3);
        System.out.println(pizza3.getNumberOfToppings());
        System.out.println(pizza3.getSize());

        pizza3.setSize("large");
        System.out.println(pizza3.getSize());

        PizzaClass [] pizzas = {twoMeat, pepperonni, pizza3};// put all pizass in arr

        for(PizzaClass eachElement : pizzas){
            System.out.println(eachElement.getSize()); // trough loop we displayed  size of each pizza
        }


    }

}
