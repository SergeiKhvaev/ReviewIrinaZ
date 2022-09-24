package adamofficehours.day10.studentclassfirstapproach;

public class Student {

    String name;
    int age;
    char gender;
    long id;

    public Student(String name, int age, char gender, long id){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

    public String toString(){
        return "Student name = " + name + ". Age " +  age + " years. Gender = " + gender + ". ID = " + id;
    }

}
