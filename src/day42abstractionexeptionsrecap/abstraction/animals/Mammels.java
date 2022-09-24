package day42abstractionexeptionsrecap.abstraction.animals;

public abstract class Mammels extends Creature{// that is abstract as well, it will stop to comlaining when will build constructor

    String color;

    public Mammels(String type, int age, char gender, String color) {
        super(type, age, gender);
    this.color = color;
    }

    public abstract String drinkMilk(int amountOfmilk);


    public String toString(){
        return super.toString() + type + " color " + color;// called super class constractor + own variable color
    }



}
