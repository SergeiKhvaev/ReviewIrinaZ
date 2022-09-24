package day40methodovverriding.season;

public class Spring extends Season{
    int greenGrass;

    public Spring(double highestTemp, double lowestTemp, int greenGrass){
        super("Spring", highestTemp, lowestTemp);
        this.greenGrass = greenGrass;
    }
    @Override
    public String activity(){
        return "Go outside and running everywhere";
    }

    public String toString (){
        return super.toString() + ", green grass  = " + greenGrass +
                "}";
    }

}
