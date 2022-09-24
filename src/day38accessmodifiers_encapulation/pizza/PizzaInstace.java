package day38accessmodifiers_encapulation.pizza;

public class PizzaInstace {
    public static void main(String[] args) {
        Pizza pizzaOne = new Pizza("Medium", 3);
        System.out.println(pizzaOne);
        System.out.println(pizzaOne.getSize());
        System.out.println(pizzaOne.getNumOfToppings());

        System.out.println(pizzaOne.calculatePrice()); // 8.25
        pizzaOne.setSize("Large");
        System.out.println(pizzaOne.calculatePrice());//10.25
        pizzaOne.setSize("xx");



    }
}
