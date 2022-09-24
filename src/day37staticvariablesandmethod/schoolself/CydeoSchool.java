package day37staticvariablesandmethod.schoolself;

import java.util.ArrayList;
import java.util.Arrays;

public class CydeoSchool {
    // instance variables
    String name;
    char gender;
    int age;
    int group;
    Sudwich myOwnSundwich;

// static variables the all simalar for all objects from class
    static String school;
    static int butchNum;
    static ArrayList<String> instructors;


    static {// static block execute once when this class load first time
        school ="Cydeo";
        butchNum = 27;
        instructors = new ArrayList<>(Arrays.asList("Adam", "Asia", "Saim"));
        System.out.println(school + " " + butchNum + " " + instructors);

    }

        public CydeoSchool (String name, char gender, int age, int group){ // created regular constructor
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.group = group;
        myOwnSundwich = new Sudwich(5);// we called constructor for Sundwich class in constructor of that class and defined it value

        }

        public void eat(){
        myOwnSundwich.sundwichesLeft -= 2;
        }

        public void goToMeting (){ // created regular void method
            System.out.println(name + " go to meeting at " + school);
        }

        public static void SchoolInfo(){ // created static method , with static variables
            System.out.println("Name of the school " + school + " lacated in Reston Virginia");
            System.out.println("Instrucrors of butch " + butchNum + " are " + instructors);
          //  System.out.println(age + name); // we can t use here instance variables
        }


    public String toString() {
        return "CydeoSchool{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
             ", age=" + age +
               ", group=" + group +
            '}';
 }
}
