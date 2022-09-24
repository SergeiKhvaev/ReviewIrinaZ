package adamofficehours.day9.students;

import java.time.LocalDate;

public class CustomClass {



    String name;
    long id;
    int age;
    char gender;
    LocalDate dateOfBirth; // date class imported from java.time.LocalDate;


  static String schoolName; // if that info should be same for all students make it static

    public void setInfo(long id, String name, char gender, LocalDate dateOfBirth, String schoolName){// method to set values to our variable// this is method to assigning values to objects == constructor
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;

        //            08.31.         2022          01.01.    1989
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear(); // we calculate age myself
        this.schoolName = schoolName; // put static variable to assigh it througth that method


    }
// Generate (for MAC) command + N


    @Override
    public String toString() {
        return "CustomClass{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth + "schoolName = " + schoolName +
                '}';
    }
}

