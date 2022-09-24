package day36classandobject.employee;

public class Employee {
   /* create a class called Employee
        - data:
    name, id, job title, salary
        - constructor
            - create a constructor that creates an Employee
    object with the name, id, job title, and salary
        - method:
    goToMeeting()
    when this method is called print:
    $name is going to a meeting
    toString()
    print all the employees information
    Create a separate class to create and test the Employee objects

    greate constructors for each instance field + (overloaded constructors

    */

    String name;
    long id;
    String jobTitle;
    double salary;

    public Employee(String name, long id, String jobTitle, double salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public Employee(String name, long id, String jobTitle) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
    }

    public void meeting(){
        System.out.println(name + " is going to a meeting");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
