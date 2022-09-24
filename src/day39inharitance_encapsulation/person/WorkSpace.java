package day39inharitance_encapsulation.person;

public class WorkSpace {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Sergei", 39, 150000);
        System.out.println(worker1); //need to make toString in original class - Employee, because we need to print all variables, as variables belong to Super class, and variable belongs to Sub class

    }
}
