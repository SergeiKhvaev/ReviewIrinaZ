package day39inharitance_encapsulation.employee;

public class Tester extends Employee {
    /*
    Create a class Tester
	- Tester class inherits Employee class
	- create additional variables:
		bugs found
	- create method:
		test()
			Example output: prints Running the regressio
     */

    String bugsFound;

    public Tester(String name, boolean isFullTime, double salary, String bugsFound){ // super() keyword to call Parent class constructor
        super(name, isFullTime, salary);
        this.bugsFound = bugsFound;
       // test();
    }

    public void test(){
        System.out.println("Running the regression");
    }

    public String toString() {
        return "Tester{" +
                "bugsFound='" + bugsFound + '\'' +
                ", name='" + name + '\'' +
                ", isFullTime=" + isFullTime +
                ", salary=" + salary +
                '}';
    }
}
