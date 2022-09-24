package day40methodovverriding.lyft;

public class Lux extends Lyft{
    /*
    Create a class Lux
	child class of Lyft
	declare a method calculateRate(miles)
		return the cost of the ride: base rate of Lyft ride + 20%
     */
    public Lux(double miles){
        super("Lux", miles);
    }

    public double calculateRate(){
        return super.calculateRate() + (miles * 0.2);
    }

    @Override
    public String toString() {
        return super.toString() + "Lux rate = " + " " + calculateRate();
    }
}
