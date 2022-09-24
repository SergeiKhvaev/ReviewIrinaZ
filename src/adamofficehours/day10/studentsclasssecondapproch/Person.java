package adamofficehours.day10.studentsclasssecondapproch;

public class Person {
    String name;
    int age;
    long id;

    public Person(String name, int age, long id){
        this.name = name;
        this.age = age;
        this.id = id;

    }



    public String toString(){
        return "name = " + name + ". Age = " + age + ". ID = " + id;
    }


}
