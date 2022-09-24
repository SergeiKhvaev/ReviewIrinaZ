package day38accessmodifiers_encapulation.pizza;

public class Pizza {
    /*
create a class called Pizza
        - data:
            size (String), number of toppings
        - constructor
            - create a constructor that creates a Pizza object with the
length and the width
            	call setters here
        - encapsulate the Pizza class
        	- setter condition:
        		size can only be:
        			small, medium, or large
        		number of toppings must be a positive number
        - other methods methods:
            - calculatePrice()
            		calculate the price of the pizza based on:
            			small base: $4
            			medium base: $6
            			large base: $8
            			each topping adds $0.75 to the price
            			calculate the total price and return the cost
            - toString()
                print the size, number of toppings, and cost of the pizza
    Create a separate class to create and test the Pizza objects
     */


    private String size;
    private int numOfToppings;

    public Pizza(String size, int numOfToppings) { // constructor
        setSize(size);
        setNumOfToppings(numOfToppings);
    }

    public String getSize() {
        return size;
    }


    public void setSize(String size) {
        if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")) {
            this.size = size;
        } else {
            System.out.println("Invalid pizza size");
        }
    }

    public int getNumOfToppings() {
        return numOfToppings;
    }

    public void setNumOfToppings(int numOfToppings) {
        if (numOfToppings > 0) {
            this.numOfToppings = numOfToppings;
        } else {
            System.out.println("Need define at least one topping");
        }
    }


    public double calculatePrice() {
        double totalPrice = 0;
        if (size.equalsIgnoreCase("small")) {
            totalPrice = 4 + (numOfToppings * 0.75);

        } else if (size.equalsIgnoreCase("medium")) {
            totalPrice = 6 + (numOfToppings * 0.75);
        } else if (size.equalsIgnoreCase("large")) {
            totalPrice = 8 + (numOfToppings * 0.75);
        }
        return totalPrice;
    }

        public String toString () {
            return "Pizza{" +
                    "size='" + size + '\'' +
                    ", numOfToppings=" + numOfToppings +
                    '}';
        }
    }
