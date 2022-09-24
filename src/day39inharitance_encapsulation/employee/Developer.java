package day39inharitance_encapsulation.employee;

public class Developer extends Employee{
    /*
    Create a class Developer
	- Developer class inherits Employee class
	- create additional variables:
		features created
	- create method:
		develop()
			Example output: prints Creating more features
     */

    String featuresCteated;

    public Developer(String name, boolean isFullTime, double salary, String featuresCteated){
        super(name, isFullTime, salary);
        this.featuresCteated = featuresCteated;
    }

    public void develop(){
        System.out.println("Creating more features");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "featuresCteated='" + featuresCteated + '\'' +
                ", name='" + name + '\'' +
                ", isFullTime=" + isFullTime +
                ", salary=" + salary +
                '}';
    }
}
