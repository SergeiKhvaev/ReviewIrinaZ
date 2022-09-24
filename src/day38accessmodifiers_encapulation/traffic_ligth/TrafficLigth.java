package day38accessmodifiers_encapulation.traffic_ligth;

public class TrafficLigth {

   private String color;// incapsulated// value is null by default // direct access to color only in this class

    public TrafficLigth(String color){ // constructor
        setColor(color); // we put setter to constructor
    }


    public String getColor() {
        return color;
    }
// setter provide us control under assugn and reassign values to private variables


    public void setColor(String color) { // setter allows us control what callor user can put in value color
        if(color.equals("green") || color.equals("yellow") || color.equals("red")){
        this.color = color;}

    }// if this boolean is false(not valod color) then nothoing is assighn to the color variable
}
