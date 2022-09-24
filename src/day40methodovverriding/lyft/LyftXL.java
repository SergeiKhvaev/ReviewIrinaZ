package day40methodovverriding.lyft;

public class LyftXL extends Lyft {


    public LyftXL( double miles){
        super("LyftLX", miles);
    }

    @Override
    public double calculateRate(){
        return super.calculateRate() + (miles * 0.1);
    }

    public String toString(){
        return super.toString() + ", LyftLX rate = " + " " + calculateRate();
    }


}
