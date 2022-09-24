package day41exeptions.season;

public class Winter extends Season {

    public Winter(double higestTemp, double lowestTemp) {
        super("Winter", higestTemp, lowestTemp);
    }

    @Override
    public void activity() {
        System.out.println("Use the fireplace");
        System.out.println("Code java");
    }
}
