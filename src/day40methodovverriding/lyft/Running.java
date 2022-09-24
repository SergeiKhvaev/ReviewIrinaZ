package day40methodovverriding.lyft;

public class Running {
    public static void main(String[] args) {
        Lyft regularRide = new Lyft("Lyft", 10);
        System.out.println(regularRide);
        System.out.println(regularRide.calculateRate());

        System.out.println("==========================");

        LyftXL lxRide = new LyftXL( 10);

        System.out.println(lxRide);
        System.out.println(lxRide.calculateRate());

        System.out.println("=========================");
        Lux luxRide = new Lux(10);
        System.out.println(luxRide);
        System.out.println(luxRide.calculateRate());





    }
}
