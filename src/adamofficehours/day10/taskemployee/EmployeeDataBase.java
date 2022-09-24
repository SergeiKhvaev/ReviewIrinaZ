package adamofficehours.day10.taskemployee;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeDataBase {

    static ArrayList<Employee> employees = new ArrayList<>();

    static {

        Employee employee1 = new Employee("Baz", 1);
        Employee employee2 = new Employee("Sergei", 2);
        Employee employee3 = new Employee("Olesia", 3);
        Employee employee4 = new Employee("Eva", 4);
        Employee employee5 = new Employee("Anatoly", 5);
        Employee employee6 = new Employee("Katy", 6);

        employees.addAll(Arrays.asList(employee1, employee2, employee3, employee4, employee5,employee6 )); // in order to inisialy fill arrrayList we created static block witn objects from Employee class and addAll to ArrayList
    }




    public void addEmployee (Employee employee){ // Employee class object we define as parameter
        employees.add(employee); // add new Object to arraylist

    }

    public void deleteEmployee (long id){// method to delete Element from ArrayList based on given id
        employees.removeIf(emp->emp.id == id);
    }

    // get all employes from data base

    public ArrayList<Employee> getAllEmployees(){

        return employees;
    }


    // get specific employee from database


    public Employee getEmployeeWithId(long id){
        Employee result = null;
        for(Employee employee : employees){
            if(employee.id == id){

            }
        }

        return result;
    }
}
