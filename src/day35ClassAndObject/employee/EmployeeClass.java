package day35ClassAndObject.employee;

public class EmployeeClass {
    /*
    create a class called Employee
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
     */

    String name;
    String jobTitle;
    int id;
    double salary;

    @Override
    public String toString() {
        return "EmployeeClass{" +
                "name = '" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id = " + id +
                ", salary = $" + salary +
                '}';
    }

    public EmployeeClass(String name, String jobTitle, int id, double salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;

    }

    public void goToMeeting(){
        System.out.println(name + " is going to meeting");

    }
}
