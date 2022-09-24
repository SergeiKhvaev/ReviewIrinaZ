package practice;

import practice.Test;

public class Test2 {

    String name;

    public Test2 (String name, int age, double salary){
this.name = "Eva";
        }



    public static void main(String[] args) {
        Test2 personOne = new Test2("Sergei",39, 150000);
    //   personOne.name = "Sergei";
        System.out.println(personOne.name);

    }
    }

