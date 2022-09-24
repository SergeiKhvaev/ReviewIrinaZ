package day40methodovverriding.season;

public class Summer extends Season{
    /*
    Create a class Summer
	child class of Season
	constructor: set values to variables
	methods:
		activity(): Drink Lemonade
     */
    final int flowersBunch;

    public Summer(double highestTemp, double lowestTemp, int flowersBanch){
        super("Summer", highestTemp, lowestTemp);
      this.flowersBunch = flowersBanch;
    }
    @Override
    public String activity(){
        return "We biking whole summer and drinking Lemonade";
    }
    public String toString(){
        return super.toString() +                ", flowers banch  = " + flowersBunch +
                "}";
    }

}
