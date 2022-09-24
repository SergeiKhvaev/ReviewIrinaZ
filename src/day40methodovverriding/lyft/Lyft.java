package day40methodovverriding.lyft;

public class Lyft {
    /*
Create a class Lyft for ride sharing
	declare a method calculateRate(miles)
		return the cost of the ride: miles * 1.5
Create a class LyftXL
	child class of Lyft
	declare a method calculateRate(miles)
		return the cost of the ride: base rate of Lyft ride + 10%
Create a class Lux
	child class of Lyft
	declare a method calculateRate(miles)
		return the cost of the ride: base rate of Lyft ride + 20%
     */

    double miles;
    String name;

    public Lyft(String name, double miles){
        this.miles = miles;
       this.name = name;

    }

    public double calculateRate(){
        return miles * 1.5;
    }

    @Override
    public String toString() {
        return "Lyft{" +
                "miles=" + miles +
                ", name='" + name + '\'' + "base price = " + calculateRate();

    }
}

