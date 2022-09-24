package day36classandobject.food;

public class FoodClass {
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

    public FoodClass(String name) {
        this.name = name;
    }

    public FoodClass(String name, int quantity) {
       this(name); // We chain it - this.name = name;
        this.quantity = quantity;
    }

    public FoodClass(String name, int quantity, double unitPrice) {
      this(name, quantity);  // we chain it - this.name = name;
                            // we chain it - this.quantity = quantity;
        this.unitPrice = unitPrice;
        calculatePrice();
    }

    public boolean calculatePrice(){
        if(quantity <= 0|| unitPrice <= 0){
            return false;
        }
        totalPrice = quantity * unitPrice;
        return true;
    }


    public String toString() {
        String str = "Name: " + name;
        if (quantity != 0){
            str+= ", quantaty: " + quantity;
        }
        if (unitPrice != 0){
            str+= ", unitPrice: " + unitPrice;
        }
        if(totalPrice != 0){
            str+= ", total price: " + totalPrice;
        }
       return  str;

    }
}
