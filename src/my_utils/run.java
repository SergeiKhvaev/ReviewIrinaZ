package my_utils;

import practice.squiz.SuperClass;

public class run extends SuperClass {
    public static void main(String[] args) {
        System.out.println(num1);
       // System.out.println(num2);because private access modifier of variable defined in Super class
        System.out.println(num3);
       // System.out.println(num4); because default access modifier of variable defined in Super class and we called that variable from another package
    }
}
