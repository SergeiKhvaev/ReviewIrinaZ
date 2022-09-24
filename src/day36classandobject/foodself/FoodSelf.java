package day36classandobject.foodself;

public class FoodSelf {
/*
    create a class called Food
        - data:
            name, quantity, unit price, total price
        - constructor
            - create a constructor that creates a Food object with the name
            - create a constructor that creates a Food object with the name and quantity
            - create a constructor that creates a Food object with the name,
quantity, and unit price
            	-> call calculatePrice() method here
        - method:
        	- calculatePrice(): multiple the quantity by unit price and
assign the value to the total price
            - toString()
                print all the Food information
    Create a separate class to create and test the Food objects
    	try making an array of Food objects
    	find all the Food objects that start with 'a' and print the whole information
    	find all the Food objects that have a total price over 20 and print the name of the food
 */
   String name;
   int quantity;
   double unitPrice;
   double totalPrice;

   public FoodSelf(String name){
       this.name = name;
   }
   public FoodSelf(String name, int quantity){
       this (name); // chaining
       this.quantity = quantity;
   }
   public FoodSelf(String name, int quantity, double unitPrice){
       this(name, quantity);
       this.unitPrice = unitPrice;
       getTotalPrice();
   }

   public double getTotalPrice(){

       return  totalPrice = unitPrice * quantity;
   }

    public String toString() {
       String str = "name = " + name;
       if(quantity != 0){
           str+= ", quantity = " + quantity;
       }
       if(unitPrice != 0.0){
           str+= ", unit price = " + unitPrice;
       }
       if(totalPrice != 0.0){
           str+= ", toralprice = " + totalPrice;
       }

        return str;
    }
}
