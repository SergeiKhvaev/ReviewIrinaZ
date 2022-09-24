package day42abstractionexeptionsrecap.abstraction.animals;

public class Tiger extends Mammels {// concrete class, because that is first non abstract dlass in hierarchy


    public Tiger(int age, char gender, String color){
        super ("tiger", age, gender, color);
    }
    //we must implement all abstract methods here
    @Override
    public String eat(){
        return type + " Eat meat"; // from Creature super class
    }

    @Override
    public String drinkMilk(int amountOfmilk){
            return "Drink milk " + amountOfmilk + " liters everyday";
        }



    }

