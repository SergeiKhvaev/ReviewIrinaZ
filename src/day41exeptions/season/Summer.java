package day41exeptions.season;

public class Summer extends Season{

    public Summer(double higestTemp, double lowestTemp) {
        super("Summer", higestTemp, lowestTemp);
    }

    @Override
    public void activity() {
        System.out.println("walk outside, drink lemonade");
    }
}
