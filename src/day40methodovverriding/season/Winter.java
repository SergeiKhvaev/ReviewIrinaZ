package day40methodovverriding.season;

public class Winter extends Season {
    /*
    Create a class Winter
	child class of Season
	constructor: set values to variables
	methods:
		activity(): Print Use Fireplace
     */

    double amountOfSnow;

    public Winter(double highestTemp, double lowestTemp, double amountOfSnow){ // constructor called constructor from super class + one own variable
        super("Winter",highestTemp, lowestTemp);
        this.amountOfSnow = amountOfSnow;
    }

    @Override
    public String activity(){
        return "We ckiing all winter, then use Fireplace";
    }

    @Override
    public String toString() {
        return super.toString() +                 ", amountOfSnow = " + amountOfSnow +
                '}';
    }
}
