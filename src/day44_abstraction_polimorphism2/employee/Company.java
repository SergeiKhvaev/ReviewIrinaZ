package day44_abstraction_polimorphism2.employee;

import practice.Test;

import java.util.ArrayList;

public class Company {
    public static void main(String[] args) {

        ArrayList<Employee> allEmployees = new ArrayList<>();

        allEmployees.add(new Tester("Eva1", "SDET1", 90000));
        allEmployees.add(new Tester("Saim", "SDET2", 100000));
        allEmployees.add(new Tester("Eva1", "SDET1", 90000));
        allEmployees.add(new Developer("Kyty", "developer", 250000));
        allEmployees.add(new Developer("JAmes", "Lead developer", 290000));
        allEmployees.add(new Developer("Anatolyi", "developer2", 220000));

        // reference

        double biggestSalary = allEmployees.get(0).salary;// default salary - salary of first employee
        for(Employee each : allEmployees){
            if(each.salary > biggestSalary){
                biggestSalary = each.salary;
            }
        }

        System.out.println(biggestSalary);


        ArrayList<Tester> allTester = new ArrayList<>();

        ArrayList<Developer> allDevelopers = new ArrayList<>();

        for (Employee each : allEmployees){
            if(each instanceof Tester){
                allTester.add((Tester)each); // need casting here
            } else if(each instanceof Developer){
                allDevelopers.add((Developer)each);// need casting here
            }
        }
        System.out.println(allTester);
        System.out.println(allDevelopers); //fix
    }
}
