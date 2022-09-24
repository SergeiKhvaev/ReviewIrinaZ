package day35ClassAndObject.traffic;

public class Road {
    public static void main(String[] args) {

        TrafficClassLight light = new TrafficClassLight("green");
       // light.color ="red";  введя метод конструктор и назначения variable по одному, я использую этот метод для определения variable - аргумент в момент создания объекта и это быстрее, чем назначать variable one by one
        System.out.println(light.color);


        // code good, but invalid result (color cant be BLUE)
        TrafficClassLight light2 = new TrafficClassLight("white");
        System.out.println(light2.color);
// конструктор дает возможность контролировать ввод при ссоздании объекта из соответствующего класса
    }

}
