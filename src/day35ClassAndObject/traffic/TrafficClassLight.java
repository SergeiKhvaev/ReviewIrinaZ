package day35ClassAndObject.traffic;

public class TrafficClassLight {

    String color;

public TrafficClassLight(String inputColor) { // конструктор с параметрами
    boolean isValid = inputColor.equalsIgnoreCase("yellow") || inputColor.equalsIgnoreCase("red") || inputColor.equalsIgnoreCase("green");
    if (isValid) {
        color = inputColor;

    }
}
}
