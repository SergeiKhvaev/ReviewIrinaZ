package day41exeptions.season;

public class Season {

/*
Create a class Season
	instance variables
		- name (String)
		- highest average temperature
		- lowest average temperature
	constructor:
		- initialize all fields
	methods:
		- activity(), toString()

		override activity in sub classes
Create a class Winter
	child class of Season
	constructor: set values to variables
	methods:
		activity(): Print Use Fireplace
Create a class Summer
	child class of Season
	constructor: set values to variables
	methods:
		activity(): Drink Lemonade
Create a class Fall
	child class of Season
	constructor: set values to variables
	methods:
		activity(): Read A Book
Create a class Spring
	child class of Season
	constructor: set values to variables
	methods:
		activity(): Go Outside
Create a class CheckSeason
	create an object of Winter, Summer, Fall and Spring and verify if
constructor, toString(), and activity() are working properly for each class
	List the is a relations of all the classes
     */

    String name;
    double higestTemp;
    double lowestTemp;


    public Season(String name, double higestTemp, double lowestTemp) {
        this.name = name;
        this.higestTemp = higestTemp;
        this.lowestTemp = lowestTemp;
    }

    public void activity(){
        System.out.println("GENERIC SEASON");
    }

    public String toString(){
        return name + " season with higest temp of " + higestTemp + " and lowest temperature " + lowestTemp;
    }

}
