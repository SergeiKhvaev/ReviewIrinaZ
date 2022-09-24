package day38accessmodifiers_encapulation.traffic_ligth;

public class ligth {
    public static void main(String[] args) {


        TrafficLigth Driving = new TrafficLigth("green");
        System.out.println(Driving.getColor());// need to use inderect access
     Driving.setColor("blue");// didnt reassign, because our setter not allow to do it it statment there is false
        System.out.println(Driving.getColor());// still RED color


        Driving.setColor("yellow"); //setter allows as to reassign color variable because if statment in setter is TRUE
        System.out.println(Driving.getColor());
    }

}
