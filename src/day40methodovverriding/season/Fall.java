package day40methodovverriding.season;

public class Fall extends Season {

    int numOfYellowLeafs;

    public Fall(double highestTemp, double lowestTemp, int numOfYellowLeafs){
        super("Fall", highestTemp, lowestTemp);
        this.numOfYellowLeafs = numOfYellowLeafs;
    }

    @Override
    public String activity(){
        return "We wrapping in cozzy blanket whole Fall and reading book";
    }

    public String toString(){
        return super.toString() + ", numbers of yellow leafs  = " + numOfYellowLeafs +
                "}";
    }

}
