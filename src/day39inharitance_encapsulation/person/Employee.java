package day39inharitance_encapsulation.person;

public class Employee extends Person {

    double salary;

    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee(String name, int age, double salary){
        super(name, age);// we call Parent constructor;
        this.salary = salary; // that part initialaze own Employee class variable (or we can initialize own variable in separate constructor)




}

}
